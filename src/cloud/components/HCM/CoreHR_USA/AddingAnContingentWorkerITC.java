package cloud.components.HCM.CoreHR_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class AddingAnContingentWorkerITC extends BaseTest{


	public static String LegalEmployer;
	public static String LastName;
	public static String FirstName;
	public static String Address1;
	public static String Address2;
	public static String PostalCode;
	public static String BusinessUnit;
	public static String TimeCardReq;
	public static String Manager;
	public static String SalaryBasis;
	public static String SalaryAmt;

	private static void run() throws Exception  {

		
		clickElement(By.linkText("New Person")); //New Person
		clickElement(By.linkText("Add a Contingent Worker")); //Contingent Worker
		Thread.sleep(1000);
		setElementText(By.xpath("//*[contains(@id, 'SP1:selectOneChoice3::content')]"), LegalEmployer); //LegalEmployer
		browser.findElement(By.xpath("//*[contains(@id, 'SP1:selectOneChoice3::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'it20::content')]"), LastName);
		setElementText(By.xpath("//*[contains(@id, 'it60::content')]"), FirstName);
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		Thread.sleep(1000);
		setElementText(By.xpath("//*[contains(@id, 'inputText17::content')]"), Address1); //741 Park Evenue
		setElementText(By.xpath("//*[contains(@id, 'inputText18::content')]"), Address2); //Dallas
		setElementText(By.xpath("//*[contains(@id, 'inputComboboxListOfValues28::content')]"), PostalCode); //76621
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		Thread.sleep(1000);
		setElementText(By.xpath("//*[contains(@id, 'businessUnitId::content')]"), BusinessUnit); //BusinessUnit -IT Convergence USA
		browser.findElement(By.xpath("//*[contains(@id, 'businessUnitId::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:selectOneChoice3::content')]")); //Click Assignment Category drop down
		clickElement(By.xpath("//li[contains(text(),'Part-time regular')]"));
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:soc2::drop')]")); //Click Regular or temp drop down
		clickElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]/li[4]"));
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:soc1::drop')]")); //Click Regular or temp drop down
		clickElement(By.xpath("//li[contains(text(),'Part time')]"));
		setElementText(By.xpath("//*[contains(@id, 'JobDe1:0:df2_BaseWorkerAsgDFFIteratortimecardRequired_Display__FLEX_EMPTY::content')]"), TimeCardReq); //TimeCardReq
		setElementText(By.xpath("//*[contains(@id, 'ManagerNameId::content')]"), Manager); //Manager-Gustavo, Gutierrez
		browser.findElement(By.xpath("//*[contains(@id, 'ManagerNameId::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'AT1:_ATp:cil113::icon')]")); //click + Under Payroll details
		clickElement(By.xpath("//*[contains(@id, 'selectOneChoice1::lovIconId')]")); //Payroll drop down
		clickElement(By.xpath("//span[contains(text(),'US Bi-Weekly Payroll')]"));
		clickElement(By.xpath("//*[contains(@id, 'SP2:tt1:next')]")); //Next
		Thread.sleep(1000);
		setElementText(By.xpath("//*[contains(@id, 'icAsgLov::content')]"), SalaryBasis); //SalaryBasis-USA Weekly Basis
		setElementText(By.xpath("//*[contains(@id, 'itSA::content')]"), SalaryAmt); //SalaryAmt-10000
		browser.findElement(By.xpath("//*[contains(@id, 'itSA::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'pt1:AddCw1:3:AP2:tt1:next')]")); //Next
		Thread.sleep(1000);
		clickElement(By.xpath("//span[contains(text(),'Save')]")); //Save
		clickElement(By.xpath("//*[contains(@id, 'tt1:okConfirmationDialog')]")); //Confirmation Ok
		clickElement(By.xpath("//*[contains(@id, 'tt1:submit')]")); //Submit
		Thread.sleep(1000);
		clickElement(By.xpath("//*[contains(@id, 'okWarningDialog')]")); //Confirmation Yes
		clickElement(By.xpath("//*[contains(@id, 'tt1:okConfirmationDialog')]")); //Confirmation Ok
	
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingAnContingentWorkerITC.class);
			run();
		}
	}

}
