package cloud.components.AR.AR_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreatingRegularInvoicesITC extends BaseTest{

	public static String BusinessUnit;
	public static String TransactionSource;
	public static String TransactionType;
	public static String TransactionNumber;
	public static String BIllToName;
	public static String PaymentTerms;
	public static String Description;
	public static String Quantity;
	public static String UnitPrice,Distribution;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);	
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_receivables_billing')]")); //Billing
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); // Tasks
		Thread.sleep(5000);
		clickElement(By.linkText("Create Transaction")); //Create Transaction 
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'transactionClass::content')]")); //transactionClass
		Thread.sleep(5000);
		clickElement(By.xpath("//option[contains(text(),'Invoice')]")); //Invoice
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'sis1:is1::content')]"), BusinessUnit); //BusinessUnit 
		browser.findElement(By.xpath("//*[contains(@id, 'sis1:is1::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'batchSourceId::content')]"), TransactionSource); //TransactionSource : ORA_HED Student Academic Period Fees
		Thread.sleep(5000);//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::lovIconId"]
		browser.findElement(By.xpath("//*[contains(@id, 'batchSourceId::content')]")).sendKeys(Keys.TAB);
		
		setElementText(By.xpath("//*[contains(@id, 'transactionTypeId::content')]"), TransactionType); //TransactionType : Invoice
		Thread.sleep(5000);
		browser.findElement(By.xpath("//*[contains(@id, 'transactionTypeId::content')]")).sendKeys(Keys.TAB);
		
		
		setElementText(By.xpath("//*[contains(@id, 'inputText2::content')]"), TransactionNumber); //TransactionNumber : 445566
		Thread.sleep(5000);
	//	clickElement(By.xpath("//*[contains(@id, 'invoiceCurrencyCodeId::content')]")); //Currency
	//	clickElement(By.xpath("//option[contains(text(),'ARS Argentine Peso')]")); 
		setElementText(By.xpath("//*[contains(@id, 'billToNameId::content')]"), BIllToName); //NCR ARGENTINA SRL
		setElementText(By.xpath("//*[contains(@id, 'paymentTermId::content')]"), PaymentTerms); // 30 Net
		setElementText(By.xpath("//*[contains(@id, 'table1:0:descriptionId::content')]"),Description); //
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'table1:0:quantity::content')]"), Quantity); //
		browser.findElement(By.xpath("//*[contains(@id, 'table1:0:quantity::content')]")).sendKeys(Keys.TAB);	
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'table1:0:sellingPrice::content')]"), UnitPrice);
		//setElementText(By.xpath("//*[contains(@id, 'table1:0:sellingPrice::content')]"), TaxClassification);
		clickElement(By.xpath("//*[contains(@id, 'pt1:TCF:0:ap1:saveMenu')]/table/tbody/tr/td[1]/a/span")); //save
		Thread.sleep(5000);
		
		clickElement(By.xpath("//a[contains(text(),'Actions')]")); //Actions
		Thread.sleep(5000);
		clickElement(By.xpath("//td[contains(text(),'Edit Distributions')]")); //edit transaction
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'MAnt2:2:pt1:Trans1:0:ap110:cb7')]")); //yes
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'table2:0:kf1CS::content')]"), Distribution); //distribution
		Thread.sleep(5000);
		clickElement(By.xpath("//button[@accesskey='S']")); //Saveandclose
		Thread.sleep(5000);
		clickElement(By.xpath("//button[contains(text(),'OK')]")); //ok
		Thread.sleep(5000);
//		clickElement(By.xpath("//*[contains(@id, 'newTrx::popEl')]"));
//		Thread.sleep(5000);
//		clickElement(By.xpath("//td[contains(text(),'Complete and Review')]"));
//		Thread.sleep(5000);
//		clickElement(By.xpath("//*[contains(@id, 'newTrx::popEl')]"));
//		Thread.sleep(5000);
//		clickElement(By.xpath("//td[contains(text(),'Complete and Close')]"));		
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'saveMenu::popEl')]"));
		Thread.sleep(5000);
		clickElement(By.xpath("//td[contains(text(),'ave and Close')]"));	  //save and close
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'msgDlg::cancel')]"));	//ok
		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingRegularInvoicesITC.class);
		run();
	}
}

}
