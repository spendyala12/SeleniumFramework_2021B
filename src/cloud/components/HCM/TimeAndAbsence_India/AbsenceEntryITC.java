package cloud.components.HCM.TimeAndAbsence_India;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class AbsenceEntryITC extends BaseTest{


	public static String Type;
	public static String StartDate;
	public static String EndDate;
	public static String Comments;

	
	

	private static void run() throws Exception  {

		
		clickElement(By.xpath("//span[contains(text(),'Time and Absences')]")); //Time and Absences
		clickElement(By.xpath("//span[contains(text(),'Add Absence')]")); //Add Absence
		clickElement(By.xpath("//*[contains(@id, 'typSrh::btn')]")); //Click Type Dropdown
		clickElement(By.xpath("//div[contains(text(),'Leave Without Pay')]")); //Leave Without Pay
		setElementText(By.xpath("//*[contains(@id, 'abSt1Dt::content')]"), StartDate); //StartDate
		setElementText(By.xpath("//*[contains(@id, 'abEd1Dt::content')]"), EndDate); //EndDate
		setElementText(By.xpath("//*[contains(@id, 'cmntInp::content')]"), Comments); //Comments
		clickElement(By.xpath("//*[contains(@id, 'SPsb2')]")); //Submit
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AbsenceEntryITC.class);
			run();
		}
	}

}
