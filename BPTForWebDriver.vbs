'On Error Resume Next
Set objExcel = CreateObject("Excel.Application")
Public excelSheetName
Public vFileName
Public MasterSheet
Public ParentFolder
Public compName
ParentFolder = BaseFolder()
MasterSheet = BaseFolder&"\MasterSheet.xlsx"
'MsgBox BaseFolder
scriptFolder = BrowseForFile()
'MsgBox scriptFolder
If Not scriptFolder = "" Then
	magicOut = TheMagic(scriptFolder)
	If Not magicOut = "Cancel" Then
		CallOATS scriptFolder
		Msgbox "Completed ...Please verify the file at "&vFileName
	Else
		Msgbox "The data generator is Cancelled"
	End If
Else
	Msgbox "The data generator is Cancelled"
End If
Set objExcel = Nothing
Function CallOATS(TheScriptFolder)
	'On Error Resume Next
	javaFile = TheScriptFolder
	Set objFSO = CreateObject("Scripting.FileSystemObject")
	Set objExcelBook = objExcel.Workbooks.Open(vFileName)
	Set objExcelSheet = objExcelBook.Worksheets(excelSheetName)
	ScriptNames = Split(TheScriptFolder,"\")
	'SearchExcelFileForTestCase ScriptNames(UBound(ScriptNames)),parentScript,vFileName,excelSheetName
	Set listFile = objFSO.OpenTextFile(javaFile,1)
	Dim allComps()
	iComp = -1
	Do Until listFile.AtEndOfStream
  		fName = Trim(listFile.ReadLine)
  		If Not Trim(fName) = "" Then
  			If Not StringEndsWith(Trim(fName),";") Then
  				myLine = myLine & Trim(fName)
  			Else
  				If myLine = "" Then
  					myLine = Trim(fName)
  				Else
  					myLine = myLine & Trim(fName)
  				End If
  				If inStrRegExp(myLine,"run",False) > 0 Then
					iComp = iComp+1
					'Msgbox "Component Iteration=="&iComp
					Redim Preserve allComps(iComp)
	  				allComps(iComp) = ExtractComponentName(myLine)
					'Msgbox allComps(iComp)
  				End If
  				myLine = ""
  			End If
  		End If
	Loop
	'Msgbox "ubound "&UBound(allComps)
	If iComp > -1 Then
		For i=0 to UBound(allComps)
			'Msgbox allComps(i)
			allParams = ParseComponent(allComps(i))
			UpdateExcel objExcelSheet,allComps(i),allParams
		Next
	End If
	objExcelBook.Save
	objExcelBook.Close
	Set objExcelBook = Nothing
	Set objExcelSheet = Nothing
	Set objExcel = Nothing
End Function
Public Function ParseComponent(thCompName)
	Set fso = CreateObject("Scripting.FileSystemObject")
	Set objFolder = fso.GetFolder(BaseFolder&"\src")
	'Msgbox "BaseFolder =="&BaseFolder
	compName = ""
	SearchForComponentFile objFolder,thCompName
	ComponentJavaFile = compName
	'Msgbox "Rgw dukw ua"&ComponentJavaFile
	'Get the excel Row 1 last column no with value
	'Add one to it = coln
	'Add component column to the excel file row 1 at coln
	'Read the file and extract the variables used in the component into an array
	Set objFSO1 = CreateObject("Scripting.FileSystemObject")
	Set listFile1 = objFSO1.OpenTextFile(ComponentJavaFile,1)
	iVar = -1
	Dim varArray()
	Do Until listFile1.AtEndOfStream
  		vName = Trim(listFile1.ReadLine)
  		If Not vName = "" Then
	  		If Not StringEndsWith(vName,";") Then
	  			myString = myString & vName
	  		Else
  				If myString = "" Then
  					myString = Trim(vName)
  				Else
  					myString = myLine & Trim(vName)
  				End If
  				'MsgBox myString
  				If InStr(LCase(myString),"public static string") > 0 Then
	  				varName = Replace(myString,"public static String","")
	  				varName = Replace(varName,";","")
	  				varName = AMTrim(varName)
	  				'MsgBox "The value befe"&myString
	  				iVar = iVar+1
	  				ReDim Preserve varArray(iVar)
	  				varArray(iVar) = varName
	  				'MsgBox varName
  				End If
  				myString = ""
  			End If
	  		If InStr(fName,"void run()") > 0 Then
	  			Exit Do
	  		End If
  		End If
  	Loop
	ParseComponent = varArray
End Function
Public Function StringStartsWith(strValue,CheckFor)
  lLen = Len(CheckFor)
  If lLen > Len(strValue) Then Exit Function
  sCompare = Left(strValue, lLen)
  StringStartsWith = StrComp(sCompare, CheckFor, CompareType) = 0
End Function

Public Function StringEndsWith(strValue,CheckFor)
  lLen = Len(CheckFor)
  If lLen > Len(strValue) Then Exit Function
  sCompare = Right(strValue, lLen)
  StringEndsWith = StrComp(sCompare, CheckFor, CompareType) = 0
End Function

Public Function inStrRegExp(sString, sPattern, bIgnoreCase)
  Dim oRegExp,aMatches, item, bFound, iPosition
  Set oRegExp = New RegExp
  oRegExp.IgnoreCase = bIgnoreCase
  oRegExp.Global = True
  oRegExp.Pattern = sPattern
  Set aMatches = oRegExp.Execute(sString)
  bFound = False

  For Each item In aMatches
    iPosition = item.FirstIndex
    bFound = True
    Exit For
  Next

  If bFound Then
    inStrRegExp = iPosition
  Else
    inStrRegExp = "-1"
  End If
End Function

Function TheMagic(TestPath)
	xlMrg = Msgbox("Do you want to merge with existing excel file?",3,"Choose Options")
	'Msgbox xlMrg
	If xlMrg = 6 Then
		'Msgbox "Yes"
		objExcel.Visible = True
		vFileName = objExcel.GetOpenFilename ("*.xls,*.xlsx")
		objExcel.Visible = False
		if Not vFileName = "" Then
			'Check if excel Sheet already exists
			'Yes take a back up and create a new sheet
			'No Then Add Sheet to the existing excel
			Set objExcelBook = objExcel.Application.Workbooks.Open(vFileName)
			excelSheetName = InputBox("Enter Sheet Name...")
			if excelSheetName = "" Then
				TheMagic = "Cancel"
				Exit Function
			End If
			CreateWorksheet excelSheetName,objExcelBook
			'objExcelBook.Close
		Else
			TheMagic = "Cancel"
			Exit Function
		End If
	ElseIf xlMrg = 7 Then
		xlFolderPath = fnShellBrowseForFolderVB("Select destination folder for excel file...")
		if xlFolderPath = "" Then
			TheMagic = "Cancel"
			Exit Function
		End If
		'Prompt for excel location
		excelName = InputBox("Enter Excel File Name...")
		if excelName = "" Then
			TheMagic = "Cancel"
			Exit Function
		End If
		vFileName =  xlFolderPath&"\"&excelName&".xlsx"
		'Once selected
		'Create Excel
		'create excel file and add sheet
		'MsgBox vFileName
		objExcel.Workbooks.Add.SaveAs vFileName
		Set objExcelBook = objExcel.Workbooks.Open(vFileName)
		'myWorkBook.SaveAs theExcelPath
		'Add Sheet
		excelSheetName = InputBox("Enter Sheet Name...")
		if excelSheetName = "" Then
			TheMagic = "Cancel"
			Exit Function
		End If
		CreateWorksheet excelSheetName,objExcelBook
		'objExcelBook.Close
	Else
		TheMagic = "Cancel"
		Exit Function
	End If
	objExcelBook.Save
	objExcelBook.Close
	Set objExcelBook = Nothing
End Function

Function SearchExcelFileForTestCase(testCaseName,scriptFolder,excelFileName,excelSheet)
	'On Error Resume Next
	testCaseColumnNo = 3
	foundRow = -1
	Set objExcelMasterBook = objExcel.Workbooks.Open(MasterSheet)
	Set objExcelMasterSheet = objExcelMasterBook.Worksheets(1)
	'Msgbox "testname = "&testCaseName&" script folder="&scriptFolder&" excel file="&excelFileName&" excel sheet ="&excelSheet
	For iRow=1 To objExcelMasterSheet.UsedRange.Rows.Count
		If objExcelMasterSheet.Cells(iRow,3) = testCaseName Then
			foundRow = iRow
			Exit For
		End If
	Next
	If foundRow <> -1 Then
		excelRowCount = foundRow
	Else
		excelRowCount = objExcelMasterSheet.UsedRange.Rows.Count+1
		objExcelMasterSheet.Cells(excelRowCount,1).value = objExcelMasterSheet.UsedRange.Rows.Count
	End If
	objExcelMasterSheet.Cells(excelRowCount,3).value = testCaseName
	objExcelMasterSheet.Cells(excelRowCount,5).value = Replace(scriptFolder,ParentFolder,"")
	objExcelMasterSheet.Cells(excelRowCount,6).value = Replace(excelFileName,ParentFolder,"")
	objExcelMasterSheet.Cells(excelRowCount,7).value = excelSheet
	objExcelMasterSheet.Cells(excelRowCount,2).value = "Y"
	objExcelMasterBook.Save
	objExcelMasterBook.Close
	Set objExcelMasterSheet = Nothing
	Set objExcelMasterBook = Nothing
	SearchExcelFileForTestCase = -1
End Function

Public Function ExtractValueByRegularExpression(sourceString,regEx)
	Set myRegExp = New RegExp
	myRegExp.IgnoreCase = True
	myRegExp.Global = True
	myRegExp.Pattern = regEx '"""(.*?)"""
	Set myMatches = myRegExp.Execute(sourceString)'theLine)
	theValue = ""
	For Each myMatch in myMatches
  		theValue = myMatch.Value ', 1, "Found Match"
  		'MsgBox theValue
  		If theValue <> "" Then
  			Exit For
  		End If
	Next
	ExtractValueByRegularExpression = theValue'Replace(theValue,"""","")
End Function
Function UpdateExcel(mySheet,ComponentName,paramCollection)
	'On Error Resume Next
	Dim SeperateLineWidth
	SeperateLineWidth = 0.5
	Dim SeperateLineColor
	SeperateLineColor = 42
	Dim ParamsColor
	ParamsColor = 19
	ComponentColor = 40
	Dim ExecuteColor
	ExecuteColor = 46
	If mySheet.UsedRange.Columns.Count = 1 Then
		StartColumn = 3
		mySheet.Cells(1,1).Value = "Execute"
		mySheet.Cells(1,1).Interior.ColorIndex = ExecuteColor
		mySheet.Cells(1,1).HorizontalAlignment = -4108
		mySheet.Columns(2).EntireColumn.Interior.ColorIndex = SeperateLineColor	
		mySheet.Columns(2).columnwidth = SeperateLineWidth
	Else
		StartColumn = mySheet.UsedRange.Columns.Count + 1
	End If
	'MsgBox StartColumn
	CompCol = StartColumn
	For iParam = 0 To UBound(paramCollection)
		val = paramCollection(iParam)
		mySheet.Cells(2,StartColumn).Value = val
		mySheet.Cells(2,StartColumn).HorizontalAlignment = -4108
		mySheet.Cells(2,StartColumn).Interior.ColorIndex = ParamsColor
		mySheet.Columns(StartColumn).columnwidth = 20
		i = i+1
		StartColumn = StartColumn + 1
	Next
	mySheet.Cells(1,CompCol).Value = ComponentName
	mySheet.Range(mySheet.Cells(1,CompCol), mySheet.Cells(1,StartColumn-1)).Merge
	mySheet.Cells(1,CompCol).Interior.ColorIndex = ComponentColor
	mySheet.Cells(1,CompCol).HorizontalAlignment = -4108
	'mySheet.Columns.AutoFit
	'insert end column with color
	mySheet.Columns(StartColumn).EntireColumn.Interior.ColorIndex = SeperateLineColor	
	mySheet.Columns(StartColumn).columnwidth = SeperateLineWidth
End Function
Function GetScriptLocation(ScriptActionLoc)
	GetScriptLocation = ChopLocation(ScriptActionLoc,1)
End Function
Function ChopLocation(loc,level)
	allLoc = Split(loc,"\")
	theFinalLoc = ""
	For i = 0 To UBound(allLoc)-level Step 1
		If theFinalLoc = "" Then
			theFinalLoc = allLoc(i)
		else
			theFinalLoc = theFinalLoc&"\"&allLoc(i)
		End If
	Next
	ChopLocation = theFinalLoc
End Function
Function fnShellBrowseForFolderVB(msg)
    dim objShell
    dim ssfWINDOWS
    dim objFolder
    ssfWINDOWS = BaseFolder
    set objShell = CreateObject("shell.application")
    set objFolder = objShell.BrowseForFolder(0, msg, 0,ssfWINDOWS)
        if (not objFolder is nothing) Then
        	'MsgBox "Running..."
            fnShellBrowseForFolderVB = objFolder.Self.Path
        end if
    set objFolder = nothing
    set objShell = nothing
End Function
'Bypasses IE7+ c:\fakepath\file.txt problem
Function BrowseForFile()
    With CreateObject("WScript.Shell")
        Dim fso : Set fso = CreateObject("Scripting.FileSystemObject")
        Dim tempFolder : Set tempFolder = fso.GetSpecialFolder(2)
        Dim tempName : tempName = fso.GetTempName() & ".hta"
        Dim path : path = "HKCU\Volatile Environment\MsgResp"
        With tempFolder.CreateTextFile(tempName)
            .Write "<input type=file name=f>" & _
            "<script>f.click();(new ActiveXObject('WScript.Shell'))" & _
            ".RegWrite('HKCU\\Volatile Environment\\MsgResp', f.value);" & _
            "close();</script>"
            .Close
        End With
        .Run tempFolder & "\" & tempName, 1, True
        BrowseForFile = .RegRead(path)
        .RegDelete path
        fso.DeleteFile tempFolder & "\" & tempName
    End With
End Function
Public Function BaseFolder
	'BaseFolder = "D:\Projects\HP_UFT12.5_EBSAccelerators"
	Dim WshShell, strCurDir
	Set WshShell = CreateObject("WScript.Shell")
	BaseFolder    = WshShell.CurrentDirectory
	Set WshShell = Nothing
End Function
Public Function CreateWorksheet(sheetName,excelWorkBook)
	'On Error Resume Next
	If Not IsSheetExists(sheetName,excelWorkBook) Then
		excelWorkBook.Worksheets.Add().Name = sheetName
	Else
		'take a backup and add new sheet and delet the the sheet
		'MsgBox "Exist"
		excelWorkBook.Worksheets(sheetName).Copy,excelWorkBook.Worksheets(sheetName)
		'Set objWorksheet = excelWorkBook.Worksheets(sheetName&" (2)")
		oExcel.DisplayAlerts = False
		excelWorkBook.Worksheets(sheetName).Select
		excelWorkBook.Worksheets(sheetName).Delete
		excelWorkBook.Worksheets.Add().Name = SheetName
		'excelWorkBook.Worksheets.Add().Name = sheetName
	End If
	excelWorkBook.Save
	'CreateWorksheet = excelWorkBook.Worksheet(sheetName)
End Function
Public Function IsSheetExists(extSheet,workBook)
	IsSheetExists = False
	For Each workSheet In  workBook.Worksheets
		If extSheet = workSheet.Name Then
			IsSheetExists = True
			Exit For
		End If
	Next
End Function
Function SearchForComponentFile(fFolder,expFileName)
	
	If Not compName = "" Then
		'MsgBox "+++++"&compName&"----"
		Exit Function
	End If
	Set objFSO = CreateObject("Scripting.FileSystemObject")
	Set objSuperFolder = objFSO.GetFolder(fFolder)
    Set objFolder = objFSO.GetFolder(fFolder.Path)
    Set colFiles = objFolder.Files
    For Each objFile in colFiles
        If UCase(objFile.Name) = UCase(expFileName&".java") Then
        	'MsgBox objFile.Path
            compName = objFile.Path
            Exit Function
        End If
    Next
    For Each Subfolder in fFolder.SubFolders
    	'MsgBox "Sub Folder in "&Subfolder.Name
        SearchForComponentFile Subfolder,expFileName
    Next
End Function
Public Function ExtractComponentName(DataValue)
	tOut = Replace(ExtractValueByRegularExpression(DataValue,"(.*?)\.run"),".run","")
	ExtractComponentName = AMTrim(tOut)
End Function
Function AMTrim(str)
	Dim l
	Dim r
	    l = Left(str, 1)
	    r = Right(str, 1)
	Do Until 0 = 7
	    If l = vbTab Or l = " " Then
	        str = Mid(str, 2)
	        l = Left(str, 1)
	    ElseIf r = vbTab Or r = " " Then
	        str = Left(str, Len(str) - 1)
	        r = Right(str, 1)
	    Else
	        Exit Do
	    End If
	Loop
	AMTrim = str
End Function