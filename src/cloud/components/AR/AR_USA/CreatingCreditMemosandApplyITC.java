package cloud.components.AR.AR_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import itc.framework.BaseTest;

public class CreatingCreditMemosandApplyITC extends BaseTest{

	public static String Number;
	public static String TransactionType;
	public static String AccountingDate;
	public static String CreditPercentage;
	
	
	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_receivables_billing')]")); //Billing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks		
		clickElement(By.linkText("Credit Transaction"));
		setElementText(By.xpath("//*[contains(@id, 'trxNumber1Id::content')]"), Number); // Number 
		browser.findElement(By.xpath("//*[contains(@id, 'trxNumber1Id::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'trxTypeId::content')]"), TransactionType); //TransactionType : Credit Memo
		setElementText(By.xpath("//*[contains(@id, 'id2::content')]"), AccountingDate); //AccountingDate : sysdate
		browser.findElement(By.xpath("//*[contains(@id, 'id2::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'table1:0:PercentageVCEvent::content')]"), CreditPercentage); //CreditPercentage
		
		clickElement(By.xpath("//*[contains(@id, 'saveMenu2::popEl')]")); // save and close dropdown
		clickElement(By.xpath("//td[contains(text(),'ave and Close')]")); // save and close		
		clickElement(By.xpath("//button[@id='_FOd1::msgDlg::cancel']")); //Conformationmessage
		
	}



public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingCreditMemosandApplyITC.class);
		run();
	}
}

}
