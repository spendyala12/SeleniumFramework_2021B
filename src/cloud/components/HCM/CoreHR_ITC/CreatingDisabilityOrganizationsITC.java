package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDisabilityOrganizationsITC extends BaseTest{

	public static String OrganisationName;
	
	private static void run() throws InterruptedException{

		clickElement(By.id("pt1:_UISmmLink::icon"));// Navigator
		Thread.sleep(2000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));// workforce structures
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:4:ll02Pce:ll01Lv:4:ll01Pse:ll01Cl"));//Manage Disability Organizations link
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP1:AT2:_ATp:commandToolbarButton12"));//Create button
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content"),OrganisationName);//Name
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next"));//Next
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:ap1:tt1:submit"));//Submit
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:ap1:tt1:okWarningDialog"));//Yes
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:ap1:tt1:okConfirmationDialog"));//Ok
			}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDisabilityOrganizationsITC.class);
			run();
		}
	}

}
