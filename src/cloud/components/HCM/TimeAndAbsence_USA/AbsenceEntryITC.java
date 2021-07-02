package cloud.components.HCM.TimeAndAbsence_USA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import itc.framework.BaseTest;

public class AbsenceEntryITC extends BaseTest{

	public static String Type;
	public static String StartDate;
	public static String EndDate;
	public static String Comments;
	public static String Details_Reason;
	public static String Text;
	public static List<WebElement> DisCheck;
	public static String ExpectedDateOfChildBirth;
	public static String ActualDateOfChildBirth;
	public static String PlannedStartDate;
	public static String PlannedEndDate;
	public static String ActualEndDate;
	
	private static void run() throws Exception  {
		
		clickElement(By.linkText("Time and Absences")); //Time and Absences
		clickElement(By.xpath("//span[contains(text(),'Add Absence')]")); //Add Absence
		//clickElement(By.xpath("//*[contains(@id, 'typSrh::btn')]")); //Click Type Dropdown
		//clickElement(By.xpath("//div[contains(text(),'+Template+')]")); //Leave Without Pay

		
		//setElementText(By.xpath("//*[contains(@id, 'typSis:typSrh::content')]"), Type); //Type
		clickElement(By.xpath("//*[contains(@id, 'typSrh::btn')]"));
		clickElement(By.xpath("//div[contains(text(),'"+Type+"')]"));
		browser.findElement(By.xpath("//*[contains(@id, 'typSis:typSrh::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		if(Type.equals("Maternity Leave Unpaid"))
		{
			System.out.println("Maternity Leave Unpaid");
			
			setElementText(By.xpath("//*[contains(@id, 'expChDt::content')]"), ExpectedDateOfChildBirth);
			setElementText(By.xpath("//*[contains(@id, 'actChDt::content')]"), ActualDateOfChildBirth);
			setElementText(By.xpath("//*[contains(@id, 'plnStDt::content')]"), PlannedStartDate); 
			setElementText(By.xpath("//*[contains(@id, 'plnEnDt::content')]"), PlannedEndDate); 
			setElementText(By.xpath("//*[contains(@id, 'actEdDt::content')]"), ActualEndDate);
			clickElement(By.xpath("//li[contains(text(),'"+Details_Reason+"')]"));
		}else
		{
		
		setElementText(By.xpath("//*[contains(@id, 'abSt1Dt::content')]"), StartDate); //StartDate
		setElementText(By.xpath("//*[contains(@id, 'abEd1Dt::content')]"), EndDate); //EndDate
		setElementText(By.xpath("//*[contains(@id, 'cmntInp::content')]"), Comments); //Comments
	
		
		//DisCheck = browser.findElements(By.xpath("//*[contains(@id, 'DtlsSh:rsnSel::content')]"));
		//System.out.println(DisCheck.size());
		
		
		
		if(Type.equals("Bereavement Leave") || Type.equals("Compensatory Days"))
		{
			System.out.println("Has Details Reason");
			
			clickElement(By.xpath("//*[contains(@id, 'DtlsSh:rsnSel::content')]"));
			clickElement(By.xpath("//li[contains(text(),'"+Details_Reason+"')]"));
		}
		
		}
		
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
