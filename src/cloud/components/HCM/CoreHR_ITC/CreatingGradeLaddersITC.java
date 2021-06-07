package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingGradeLaddersITC extends BaseTest{

	public static String Date;
	public static String GradeladderName;
	public static String GradeName;
	public static String GradeStepsRateName;
	public static String GradeValue;
	public static String GradeValue1;
	public static String GradeValue2;
	public static String GradeValue3;
	public static String GradeValue4;
	


	private static void run() throws InterruptedException{
		Thread.sleep(2000);
		clickElement(By.id("pt1:_UISmmLink::icon")); // Navigator
		Thread.sleep(2000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));// Workforce Mgt link
		Thread.sleep(6000);		
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:3:ll02Pce:ll01Lv:1:ll01Pse:ll01Cl\']")); //Manage Grade Ladders
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP5:pc1:_ATp:commandToolbarButton1"));// Create button
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:esd::content"),Date);//Date
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:GradeLadderName::content"),GradeladderName);// Grade ladder Name
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:selectOneChoice2::drop\']"));
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:selectOneChoice2::pop\']/li[4]"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next"));
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'value10::content')]"),GradeName);// Grades Name					  
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'q1::search')]"));
				
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'pc1:_ATp:t1::db')]"));
		Thread.sleep(2000);						
		clickElement(By.xpath("//*[text()='Add to Grade Ladder']")); //Add to gradeladder
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:Grade1:0:pc1:_ATp:t1::db']/table/tbody/tr[2]/td[1]"));//Selct 2nd row
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'addToGradeLadder')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:Grade1:0:selectOneRadio1::content\']/fieldset/div[2]/span/label"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:Grade1:0:dialog1::ok"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:next\']/a"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:AP3:soc1::content\']"));
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:AP3:soc1::pop\']/li[7]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:AP3:pc2:_ATp:AddStepRateButton\']/a/span")); // Add row
		setElementText(By.xpath("//*[contains(@id,'t1:0:it2::content')]"),GradeStepsRateName);
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'t2:1:it3::content')]"),GradeValue);
		Thread.sleep(2000);			
		setElementText(By.xpath("//*[contains(@id,'t2:2:it3::content')]"),GradeValue2);
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'t2:3:it3::content')]"),GradeValue3);
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'t2:4:it3::content')]"),GradeValue4);
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:4:AP3:tt1:next')]"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:AP4:tt1:submit")); // Submit
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:AP4:tt1:okWarningDialog")); //Yes
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:AP4:tt1:okConfirmationDialog"));// OK
		
			}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradeLaddersITC.class);
			run();
		}
	}

}
