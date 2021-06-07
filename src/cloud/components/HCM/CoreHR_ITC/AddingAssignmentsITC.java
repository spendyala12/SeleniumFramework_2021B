package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class AddingAssignmentsITC extends BaseTest{

	public static String Name;
	public static String BusinessUnit;
	public static String Job;
	public static String SalaryBasis;
	public static String SalaryAmount;

	private static void run() throws InterruptedException{
		clickElement(By.id("pt1:_UISmmLink::icon"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[text()='Person Management']"));
		setElementText(By.xpath("//*[contains(@id,':value00::content')]"),Name);
		clickElement(By.xpath("//*[contains(@id,'search')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_UISpageCust::c')]"));
		clickElement(By.xpath("//*[contains(@id,'Perso1:0:SP3:table1:_ATp:table2:0:cil1')]"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dcm1']//td[@class='xnv'][contains(text(),'Personal and Employment')]"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dci1:7:dccmi1']//td[@class='xnw'][contains(text(),'Manage Employment')]"));
		clickElement(By.xpath("//span[contains(text(),'Edit')]"));
		clickElement(By.xpath("//td[contains(text(),'Update')]"));	
		clickElement(By.xpath("//*[contains(@id,'actionsName1::content')]"));
		clickElement(By.xpath("//li[contains(text(),'Add Assignment')]"));
		clickElement(By.xpath("//*[contains(@id,'Manag1:0:AP1:cb10')]"));
		setElementText(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:0:AP1:assig1:0:businessUnitId::content\']"),BusinessUnit);
		setElementText(By.xpath("//*[contains(@id,'jobId::content')]"),Job);
		clickElement(By.xpath("//*[contains(@id,'next')]"));
		//SalaryBasis
		setElementText(By.xpath("//*[contains(@id,'icAsgLov::content')]"),SalaryBasis);
		setElementText(By.xpath("//*[contains(@id,'itSA::content')]"),SalaryAmount);
		clickElement(By.xpath("//*[contains(@id,'next')]"));
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:2:AP1:tt1:next\']/a"));
		clickElement(By.xpath("//*[contains(@id,'submit')]"));//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:3:panel1a:tt1:submit"]/a
		clickElement(By.xpath("//*[contains(@id,'okWarningDialog')]"));
		clickElement(By.xpath("//*[contains(@id,'okConfirmationDialog')]"));
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(AddingAssignmentsITC.class);
		run();
	}
}

}
