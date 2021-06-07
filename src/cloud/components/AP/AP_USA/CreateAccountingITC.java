package cloud.components.AP.AP_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreateAccountingITC extends BaseTest{


	public static String Ledger;
	public static String SubledgerApplication;

	
	

	private static void run() throws Exception  {
		Thread.sleep(1000);
//		clickElement(By.xpath("//span[contains(text(),'Invoices')]")); //Invoices
		clickElement(By.linkText("Invoices")); 
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Accounting")); //Create Accounting link
		clickElement(By.xpath("//*[contains(@id,'SubledgerApplicationAttr::content')]"));
		clickElement(By.xpath("//option[contains(text(),'Payables')]")); //Payables
		setElementText(By.xpath("//*[contains(@id,'LedgerAttr::content')]"), Ledger); //ITC USA PL
		browser.findElement(By.xpath("//*[contains(@id,'LedgerAttr::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id,'requestBtns:submitButton')]"));
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreateAccountingITC.class);
			run();
		}
	}

}
