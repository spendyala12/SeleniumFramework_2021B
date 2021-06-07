package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDepartmentTreesITC extends BaseTest{

	public static String Tree_Name;
	public static String Tree_Code;
	public static String Name;
	public static String Description;
	public static String Tree_Name_1;
	public static String Tree_Name_2;
	public static String Tree_Name_3;
	public static String Start_Date;
	

	private static void run() throws InterruptedException
	
	{
		clickElement(By.id("pt1:_UISmmLink::icon']")); //Navigator
		
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures']")); //workforcestructure
		
		clickElement(By.linkText("Manage Department Trees")); //ManageDepartmentTrees
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon']")); //CreateTreeMenu
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefName_Create::content']"), Tree_Name); //Name
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefCode_Create::content']"), Tree_Code); //code
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:tbb1:1:cni2']"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:pt1:AP1:tbb1:1:cni2']"));
		
		
		
		
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:pt1:AP1:APsb']"));  //Submit
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId:2:i1']") ); //Select tree for which you want to create version
		
		clickElement(By.id("//a[contains(text(),'Actions')]")); //Actions
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandMenuItem3']//td[@class='xnw'][contains(text(),'Create Tree Version')]")); //CreateTreeVersion
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:TVName::content']"), Name);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:TVDesc::content']"), Description); //Description
		
		setElementText(By.id("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:inputStartDate::content']"), Start_Date); //EffectiveStartDate
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:pt1:AP1:tbb1:1:cni2']")); //next
		
		clickElement(By.id("//button[@id='_FOd1::msgDlg::cancel']")); //ok
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:hierCol:addBtn::icon']")); //add
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:cb1']")); //Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content']"), Tree_Name_1); //SearchName1
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1::search']")); //SearchButton
		
		clickElement(By.id("//span[contains(text(),'IT CONVERGENCE BRBR OPERATING UNIT')]")); // clicktheTree
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1']")); //AddTreeNode
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:hierCol:addBtn::icon']")); //add
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:cb1']")); //Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content']"), Tree_Name_2); //SearchName2
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1::search']")); //SearchButton
		
		clickElement(By.id("//span[contains(text(),'IT CONVERGENCE BRBR OPERATING UNIT')]")); // clicktheTree
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1']")); //AddTreeNode
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:hierCol:addBtn::icon']")); //add
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:cb1']")); //Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content']"), Tree_Name_3); //SearchName3
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1::search']")); //SearchButton
		
		clickElement(By.id("//span[contains(text(),'IT CONVERGENCE BRBR OPERATING UNIT')]")); // clicktheTree
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1']")); //AddTreeNode
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:APsb2']")); //submit
		
		clickElement(By.id("_FOd1::msgDlg::cancel']")); //ok
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDepartmentTreesITC.class);
			run();
		}
	}

}




