package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingOrganizationTreesITC extends BaseTest{
	
	
	public static String TreeName;
	public static String TreeCode;
	public static String SearchTreeName;
	public static String TreeName1;
	public static String StartDate;
	public static String Name1;
	public static String Name2;
	
		
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink"));
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));// work structure
				
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiworkstructures::icon")); // Task
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl15")); // Manage Org tree
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon")); // Create icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:1:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon")); //Create icon
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefName_Create::content"), TreeName); // Tree Name
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefCode_Create::content"), TreeCode); // Tree Code
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:tbb1:1:cni2")); // Next
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:pt1:AP1:tbb1:1:cni2")); // Next
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:pt1:AP1:APsb")); // Submit
		
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:q2:value10::content"), SearchTreeName); //Tree Name
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:inputStartDate::content")); // Search
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db")); // Select row
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popArea")); //Drop down
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:cmp2")); //Create tree version
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:TVName::content"), TreeName1); // Tree Name
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:4:pt1:AP1:inputStartDate::content"), StartDate); // Start date
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:tbb1:1:cni2")); // Next
		
		clickElement(By.id("_FOd1::msgDlg::cancel")); //OK
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:hierCol:addBtn::icon")); //+ icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:cb1")); // Search
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Name1);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Name1); // Name vision Bistro OH
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1::search")); // Search button
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db")); // select row
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1")); // Add tree Node
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:hierCol:tt1::db"));// Select row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:hierCol:addBtn::icon")); // + button
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:cb1")); // Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::contentt"), Name2); // Name vision bistro PA
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1::search")); // Search button
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db")); // Select row
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1")); // Add tree Node
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:APsb2")); // Submit
		Thread.sleep(5000);
		clickElement(By.id("_FOd1::msgDlg::cancel")); //OK
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingOrganizationTreesITC.class);
			run();
		}
	}

}
