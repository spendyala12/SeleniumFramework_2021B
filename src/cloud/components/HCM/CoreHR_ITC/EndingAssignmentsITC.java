package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class EndingAssignmentsITC extends BaseTest{

	public static String Name;
	public static String Action;


	private static void run() throws InterruptedException
	
	
	{
		
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content']"));
		setElementText(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content']"), Name); //Name
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
		Thread.sleep(3000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:cil1']")); // Actions
	    Thread.sleep(3000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dcm1']/td[2]")); //PersonalandEmployement
	    Thread.sleep(3000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dci1:7:dccmi1']/td[2]"));// manageEmployment
	    Thread.sleep(3000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:edit']/table/tbody/tr/td[1]/a/span")); //Edit
	    
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:updBtn']/td[2]")); //Update
	    Thread.sleep(3000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::drop"));
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::pop']/li[12]"));
	   
	    Thread.sleep(3000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb10']")); //ok
	    Thread.sleep(3000);
	    
	
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:r:tt1:review']/a")); //Review
	    Thread.sleep(8000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:submit']/a")); //submit
	    Thread.sleep(3000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:okWarningDialog")); //yes
	    Thread.sleep(3000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:okConfirmationDialog")); //ok
	    Thread.sleep(3000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb7']")); //Done
	
	
	}
	

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(EndingAssignmentsITC.class);
			run();
		}
	}

}
