package cloud.components.AR.AR_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreatingCreditMemosandApplyITC extends BaseTest{

	public static String Number;
	public static String TransactionType;
	public static String AccountingDate;
	public static String CreditPercentage;
	
	
	private static void run() throws InterruptedException{
		
		clickElement(By.linkText("Billing"));
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Credit Transaction"));
		Thread.sleep(1000);
		
		clickElement(By.xpath("//*[contains(@id, 'ap1:trxNumber1Id::lovIconId')]")); //search
		setElementText(By.xpath("//*[contains(@id, 'ap1:trxNumber1Id::_afrLovInternalQueryId:value10::content')]"), Number); // Number 
		clickElement(By.xpath("//*[contains(@id, 'ap1:trxNumber1Id::_afrLovInternalQueryId:value30::content')]"));
		clickElement(By.xpath("//option[contains(text(), 'ARS - Argentine Peso')]")); //currency
		clickElement(By.xpath("//button[contains(text(),'Search')]")); //search	
		clickElement(By.xpath("//*[contains(@id, 'ap1:trxNumber1Id_afrLovInternalTableId::db')]")); //select row
		clickElement(By.xpath("//*[contains(@id, 'ap1:trxNumber1Id::lovDialogId::ok')]"));//ok
		
		setElementText(By.xpath("//*[contains(@id, 'trxTypeId::content')]"), TransactionType); //TransactionType : Credit Memo
		browser.findElement(By.xpath("//*[contains(@id, 'trxTypeId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'id2::content')]"), AccountingDate); //AccountingDate : sysdate
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
