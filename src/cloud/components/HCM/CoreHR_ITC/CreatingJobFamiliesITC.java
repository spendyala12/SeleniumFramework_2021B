package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingJobFamiliesITC extends BaseTest{
	
	public static String Name;
	public static String Code;
	//public static String JobFamilyCode;
	
	private static void run() throws InterruptedException{
			
		                       	
		Thread.sleep(2000);
		clickElement(By.id("pt1:_UISmmLink::icon"));
		Thread.sleep(2000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));//work structures link
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:1:ll02Pce:ll01Lv:1:ll01Pse:ll01Cl")); //Job families link
		Thread.sleep(2000);	
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:jfSearchPnl:jfSrchResApplTbl:_ATp:createBtn"));//Create button
		Thread.sleep(2000);	
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP3:inputText1::content"),Name); // Name
		Thread.sleep(2000);	
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP3:it1::content"),Code);// Code
		Thread.sleep(2000);	
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP3:tt1:submit"));//Submit
		Thread.sleep(2000);	
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP3:tt1:okWarningDialog")); //Yes                  	
		Thread.sleep(2000);	
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP3:tt1:okConfirmationDialog")); //OK
				
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingJobFamiliesITC.class);
			run();
		}
	}

}
