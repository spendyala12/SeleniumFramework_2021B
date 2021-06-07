package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class TerminatingWorkRelationshipsITC extends BaseTest{

	public static String Search_Name;
	public static String Dates;


	

	private static void run() throws InterruptedException
	
	
	
	
	{
		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		Thread.sleep(4000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_person_management")); // Person Management
		Thread.sleep(4000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), Search_Name); //Name
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search")); //Search
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:gl1")); //Click the name link
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:_FOTsdiHcmIntWaTasksId::icon")); //Tasks
		Thread.sleep(4000);
		clickElement(By.linkText("Manage Work Relationship")); //Manageworkrelationships
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:0:pt1:r1:0:pt1:SP1:edit::popEl")); //Actions
		Thread.sleep(4000);
		clickElement(By.xpath("//td[contains(text(),'Terminate')]")); //Terminate
		Thread.sleep(4000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:0:pt1:ap1:Termi1:0:TerminationDate::content"), Dates); //TerminationDate
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:0:pt1:ap1:tt1:cb1")); //Review
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:1:pt1:sp1:tt1:submit']/a")); //submit
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:1:pt1:sp1:tt1:dc1:selectOneRadio1::content']/fieldset/div[2]/span/label")); //Deferred
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:1:pt1:sp1:tt1:okWarningDialog")); //yes
		Thread.sleep(4000);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:1:pt1:sp1:tt1:dc1:deferredCommitDate::content"), Dates); //ProcesschangesDate
		Thread.sleep(4000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:1:pt1:sp1:tt1:okWarningDialog")); //yes
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:r1:0:r1:1:pt1:sp1:tt1:okConfirmationDialog")); //ok
		
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TerminatingWorkRelationshipsITC.class);
			run();
		}
	}

}




