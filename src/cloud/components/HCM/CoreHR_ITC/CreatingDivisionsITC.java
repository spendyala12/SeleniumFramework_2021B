//package cloud.components.CoreHR;
//
//import org.openqa.selenium.By;
//
//import itc.framework.BaseTest;
//
//public class CreatingDivisionsITC extends BaseTest{
//
//    public static String Name;
//    public static String ReportingName;
//    public static String ManagerValue;
//
//    private static void run() throws InterruptedException
//    
//    {        
//        clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures']")); //workforcestructures
//        Thread.sleep(3000);
//        clickElement(By.linkText("Manage Divisions")); //ManageDivisions
//        Thread.sleep(3000);
//        clickElement(By.xpath("//span[contains(text(),'Create')]")); //Create
//        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content"), Name); //name
//        clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next\"]/a")); //next
//        Thread.sleep(3000);
//        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"), ReportingName); //reportingName
//        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content"), ManagerValue); //Manager
//        Thread.sleep(3000);
//        clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:next\"]/a")); //next
//        clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:submit\"]/a"));
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:okWarningDialog"));
//        Thread.sleep(3000);
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:okConfirmationDialog"));
//        
//    }
//
//    public static void run(int iterations) throws Exception{
//        initComponent();
//        for(int i=0;i<iterations;i++)
//        {
//            iteration=i;
//            popluateParams(CreatingDivisionsITC.class);
//            run();
//        }
//    }
//
//
//		//clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MainAreaTab4::disAcr"));   //Manage Departments
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:0:AP1:AT1:_ATp:commandToolbarButton1")); //Create btn
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:inputText1::content"),Name);
//		                  
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::lovIconId"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::dropdownPopup::popupsearch"));
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::_afrLovInternalQueryId:value00::content"), LocationName);
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::_afrLovInternalQueryId::search"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id_afrLovInternalTableId::db"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::lovDialogId::ok"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:tt1:next")); //next
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"),ReportingName);   //Reporting Name
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::cntnrSpan")); //drop down
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::dropdownPopup::popupsearch"));
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::_afrLovInternalQueryId:value00::content"),ManagerValue);   //Manager Value
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::_afrLovInternalQueryId::search"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display_afrLovInternalTableId::db"));   //Selecting row
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::lovDialogId::ok"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:tt1:submit"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:tt1:okWarningDialog")); //yes
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:tt1:okConfirmationDialog")); //ok
//		
//		
//		
//		
// 		
//		
//		
//		
//		
//		
////		Thread.sleep(5000);
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl11"));
////		
////		Thread.sleep(3000);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP1:AT2:_ATp:commandToolbarButton12']/a/span"));
////
////		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText1::content"),DivisionName);
////
////	//	setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:locationCode1Id::content"),Location);
////		
////		Thread.sleep(3000);
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"));
////
////		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"),Address);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:tt1:next']/a/span"));
////		
////		Thread.sleep(2000);
////
////		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content"),ReportingManager);
////		
////		Thread.sleep(3000);
////
////		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"),ReportingName);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:tt1:next']/a/span/span"));
////		
////		Thread.sleep(3000);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:submit']/a/span"));
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okWarningDialog"));
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okConfirmationDialog"));
//
//	}*/
//	
//	
//	{
//		clickElement(By.id("pt1:_UISmmLink::icon']")); //navigator
//		
//		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures']")); //workforcestructures
//		
//		clickElement(By.linkText("Manage Divisions")); //ManageDivisions
//		
//		clickElement(By.id("//span[contains(text(),'Create')]")); //Create
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content']"), Name); //name
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next']//a[@class='xx3']")); //next
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content']"), ReportingName); //reportingName
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content']"), ManagerValue); //Manager
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:submit']"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:okWarningDialog']"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:okConfirmationDialog']"));
//		
//	}
//
//	public static void run(int iterations) throws Exception{
//		initComponent();
//		for(int i=0;i<iterations;i++)
//		{
//			iteration=i;
//			popluateParams(CreatingDivisionsITC.class);
//			run();
//		}
//	}
//
//}
//=======
//		//clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MainAreaTab4::disAcr"));   //Manage Departments
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:0:AP1:AT1:_ATp:commandToolbarButton1")); //Create btn
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:inputText1::content"),Name);
//		                  
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::lovIconId"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::dropdownPopup::popupsearch"));
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::_afrLovInternalQueryId:value00::content"), LocationName);
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::_afrLovInternalQueryId::search"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id_afrLovInternalTableId::db"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:locationCode1Id::lovDialogId::ok"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:1:AP1:tt1:next")); //next
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"),ReportingName);   //Reporting Name
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::cntnrSpan")); //drop down
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::dropdownPopup::popupsearch"));
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::_afrLovInternalQueryId:value00::content"),ManagerValue);   //Manager Value
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::_afrLovInternalQueryId::search"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display_afrLovInternalTableId::db"));   //Selecting row
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::lovDialogId::ok"));
//		Thread.sleep(2000);
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:tt1:submit"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:tt1:okWarningDialog")); //yes
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt4:2:AP2:tt1:okConfirmationDialog")); //ok
//		
//		
//		
//		
// 		
//		
//		
//		
//		
//		
////		Thread.sleep(5000);
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl11"));
////		
////		Thread.sleep(3000);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP1:AT2:_ATp:commandToolbarButton12']/a/span"));
////
////		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText1::content"),DivisionName);
////
////	//	setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:locationCode1Id::content"),Location);
////		
////		Thread.sleep(3000);
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"));
////
////		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"),Address);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:tt1:next']/a/span"));
////		
////		Thread.sleep(2000);
////
////		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content"),ReportingManager);
////		
////		Thread.sleep(3000);
////
////		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"),ReportingName);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:tt1:next']/a/span/span"));
////		
////		Thread.sleep(3000);
////
////		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:submit']/a/span"));
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okWarningDialog"));
////
////		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okConfirmationDialog"));
//
//	}*/
//	
//	
//	{
//		clickElement(By.id("pt1:_UISmmLink::icon']")); //navigator
//		
//		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures']")); //workforcestructures
//		
//		clickElement(By.linkText("Manage Divisions")); //ManageDivisions
//		
//		clickElement(By.id("//span[contains(text(),'Create')]")); //Create
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content']"), Name); //name
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next']//a[@class='xx3']")); //next
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content']"), ReportingName); //reportingName
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content']"), ManagerValue); //Manager
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:submit']"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:okWarningDialog']"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:okConfirmationDialog']"));
//		
//	}
//
//	public static void run(int iterations) throws Exception{
//		initComponent();
//		for(int i=0;i<iterations;i++)
//		{
//			iteration=i;
//			popluateParams(CreatingDivisionsITC.class);
//			run();
//		}
//	}
//
//}
//>>>>>>> .r329
