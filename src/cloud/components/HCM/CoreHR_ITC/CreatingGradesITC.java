package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingGradesITC extends BaseTest{

	public static String GradeName;
	public static String GradeCode;
	public static String STep1Txt;
	public static String STep2Txt;
	
	private static void run() throws InterruptedException{

		
		Thread.sleep(2000);
		clickElement(By.id("pt1:_UISmmLink::icon"));
		Thread.sleep(2000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));//work structures link
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:3:ll02Pce:ll01Lv:2:ll01Pse:ll01Cl")); //Manage grades link
		Thread.sleep(2000);


		clickElement(By.id("_FOpt1:_UISmmLink"));
		clickElement(By.id("_FOpt1:nv_itemNode_workforce_management_workforce_structures"));//work structures link
		clickElement(By.xpath("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:3:ll02Pce:ll01Lv:2:ll01Pse:ll01Cl']")); //Manage grades link


		
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_UISmmLink"));
		
		clickElement(By.id("_FOpt1:nv_itemNode_workforce_management_workforce_structures"));//work structures link
		clickElement(By.xpath("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:3:ll02Pce:ll01Lv:2:ll01Pse:ll01Cl']")); //Manage grades link


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP1:pc1:_ATp:commandButton1::icon")); // Create button
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText3::content"), GradeName); // Grade Name
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText2::content"), GradeCode); //Code
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next")); //Next
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:pc1:_ATp:addButton::icon")); //Add row
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:pc1:_ATp:table1:0:inputText2::content"), STep1Txt);//Step Name
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:pc1:_ATp:addButton::icon")); //Add row
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:pc1:_ATp:table1:1:inputText2::content"), STep2Txt);//Step Name
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:next"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:AP3:tt1:next")); // Grade rates Next
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:AP1:tt1:submit")); // Submit
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:AP1:tt1:okWarningDialog")); // Yes
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:AP1:tt1:okConfirmationDialog")); // OK
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradesITC.class);
			run();
		}
	}

}
