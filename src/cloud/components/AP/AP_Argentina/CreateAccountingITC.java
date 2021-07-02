package cloud.components.AP.AP_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreateAccountingITC extends BaseTest{


	public static String Ledger;
	public static String SubledgerApplication;
	public static String ProcessCategory;
	public static String EndDate;
	public static String AccountingMode;
	public static String ProcessEvents;
	public static String ReportStyle;
	public static String TransferToGeneralLedger;
	public static String PostInGeneralLedger;
	public static String JournalBatch;
	public static String IncludeUserTransactionIndentifier;
	
	

	private static void run() throws Exception  {

		clickElement(By.xpath("//span[contains(text(),'Invoices')]")); //Invoices
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Accounting")); //Create Accounting link
		clickElement(By.xpath("//*[contains(@id,'SubledgerApplicationAttr::content')]"));
		clickElement(By.xpath("//option[contains(text(),'Payables')]")); //Payables
		setElementText(By.xpath("//*[contains(@id,'LedgerAttr::content')]"), Ledger); //ITC ARG PL
		browser.findElement(By.xpath("//*[contains(@id,'LedgerAttr::content')]")).sendKeys(Keys.TAB);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE5::content')]"), ProcessCategory); 
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE6::content')]"), EndDate);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE8::content')]"), AccountingMode);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE9::content')]"), ProcessEvents);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE10::content')]"), ReportStyle);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE11::content')]"), TransferToGeneralLedger);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE12::content')]"), PostInGeneralLedger);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE13::content')]"), JournalBatch);
		//setElementText(By.xpath("//*[contains(@id,'ATTRIBUTE15::content')]"), IncludeUserTransactionIndentifier);
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
