package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingWorkRelationshipsITC extends BaseTest{
	
	
	public static String Name;
	public static String Legal_Employer;

	
	
	

	private static void run() throws InterruptedException
	
	
	
	{
		
		Thread.sleep(5000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), Name); //Name
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
		Thread.sleep(5000);
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:cil1']")); // Actions
	    Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dcm1']/td[2]")); //PersonalandEmployement
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dci1:3:dccmi1']/td[2]")); //CreateworkRelationship
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:SP1:action::content']"));// Action
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:SP1:action::pop']/li[4]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:SP1:legaEm::content']"), Legal_Employer); //LegalEmployer
		Thread.sleep(5000);
		
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:SP1:tt1:next']/a")); //Next
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:1:SP1:tt1:next']/a")); //next
		Thread.sleep(9000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:2:SP1:AddWo2:0:AddWo1:0:businessUnitId::lovIconId']")); //BusinessUnit
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:2:SP1:AddWo2:0:AddWo1:0:businessUnitId::dropdownPopup::dropDownContent::db']/table/tbody/tr[10]/td/span"));
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:2:SP1:tt1:next")); //next
		Thread.sleep(9000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:3:SP2:tt1:next']/a"));// next
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:4:SP3:tt1:submit']/a")); //submit
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:4:SP3:tt1:okWarningDialog")); //yes
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:4:SP3:tt1:okConfirmationDialog")); //ok
		                       
		}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingWorkRelationshipsITC.class);
			run();
		}
	}

}
