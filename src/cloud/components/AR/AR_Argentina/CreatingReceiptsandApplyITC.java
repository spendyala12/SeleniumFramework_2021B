package cloud.components.AR.AR_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingReceiptsandApplyITC extends BaseTest{

	public static String BusinessUnit;
	public static String ReceiptMethod;
	public static String ReceiptNumber;
	public static String EnteredAmount;
	public static String Bank_Name;
	public static String Bank_Branch;
	public static String Bank_Account;
	public static String ReceiptDate;
	public static String AccountingDate;
	public static String CustomerAccountNum;
	public static String TransactionCustomerAccNum,Currency;
	
	
	private static void run() throws InterruptedException{
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_receivables_receivables_balances')]")); //Account Receivables
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks Button
		Thread.sleep(5000);
		clickElement(By.linkText("Create Receipt"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'is1::content')]"), BusinessUnit); //Business Unit 
		browser.findElement(By.xpath("//*[contains(@id, 'is1::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'receiptMethodId::content')]"), ReceiptMethod); //ReceiptMethod 
		browser.findElement(By.xpath("//*[contains(@id, 'receiptMethodId::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		setElementText(By.xpath("//*[contains(@id,'receiptNumberId::content')]"),ReceiptNumber); //ReceiptNumber
		browser.findElement(By.xpath("//*[contains(@id,'receiptNumberId::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
//		clickElement(By.xpath("//*[contains(@id, 'currencyCode4Id::content')]")); //Currency
//		setElementText(By.xpath("//*[contains(@id, 'ap1:ccyCLOV:sis1:is1::content')]"), Currency);  //currency	
//		browser.findElement(By.xpath("//*[contains(@id, 'ap1:ccyCLOV:sis1:is1::content')]")).sendKeys(Keys.TAB);		
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'amountId::content')]"), EnteredAmount); //EnteredAmount: 100
		browser.findElement(By.xpath("//input[contains(@id, 'amountId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'remittanceBankNameId::content')]"), Bank_Name); //bank name
		browser.findElement(By.xpath("//*[contains(@id, 'remittanceBankNameId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'remittanceBankBranchId::content')]"), Bank_Branch); //bank branch
		browser.findElement(By.xpath("//*[contains(@id, 'remittanceBankBranchId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'remitBankAcctNumberId::content')]"), Bank_Account); //bank account
		browser.findElement(By.xpath("//*[contains(@id, 'remitBankAcctNumberId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'customerAccountId::content')]"), CustomerAccountNum); //CustomerAccountNumber: 123641
		clickElement(By.xpath("//*[contains(@id, 'commandButton2::popEl')]")); 
		clickElement(By.xpath("//*[contains(@id, 'ap1:cmi2')]"));	//Submit and Apply Manually	
		clickElement(By.xpath("//button[@accesskey='Y']"));  //yes
		
		clickElement(By.xpath("//*[contains(@id, 'commandButton2')]")); //AddOpenReceivables
		setElementText(By.xpath("//*[contains(@id, 'value60::content')]"), TransactionCustomerAccNum); //TransactionCustomerAccNum : 123641
		clickElement(By.xpath("//*[contains(@id, 'q1::search')]")); //Search
		clickElement(By.xpath("//button[contains(text(),'Add')]")); //add
		clickElement(By.xpath("//button[@accesskey='o']")); //Done
		clickElement(By.xpath("//*[contains(@id, 'commandButton122')]")); //Saveandclose
				
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingReceiptsandApplyITC.class);
		run();
	}
}

}
