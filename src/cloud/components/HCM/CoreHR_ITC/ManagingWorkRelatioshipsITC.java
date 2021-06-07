package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ManagingWorkRelatioshipsITC extends BaseTest{
	
	public static String PersonName;
	public static String SeniorityDate;
	
	
	private static void run() throws InterruptedException
	
	{
		
		Thread.sleep(4000);
		setElementText(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content']"), PersonName); //Name
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
		Thread.sleep(4000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:cil1']")); // Actions
	    Thread.sleep(4000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dcm1']/td[2]")); //PersonalandEmployement
	    Thread.sleep(4000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dci1:13:dccmi1']/td[2]")); //Manageworkrelationship
	    Thread.sleep(4000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:pt1:SP1:edit::popEl']")); //actions
	    Thread.sleep(4000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:pt1:SP1:edtBtn']/td[2]")); //edit
	    Thread.sleep(4000);
	    setElementText(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:pt1:SP1:r2:0:id3::content']"), SeniorityDate); //SenirityDate
	    Thread.sleep(4000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:pt1:SP1:tt1:submit']/a")); //submit
	    Thread.sleep(4000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:pt1:SP1:tt1:okWarningDialog"));  //yes
	    Thread.sleep(4000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:pt1:SP1:tt1:okConfirmationDialog")); //ok
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingWorkRelatioshipsITC.class);
			run();
		}
	}

}
