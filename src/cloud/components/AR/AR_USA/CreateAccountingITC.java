package cloud.components.AR.AR_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreateAccountingITC extends BaseTest{

	public static String Ledger;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_receivables_billing')]")); //billing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Create Accounting"));
//		clickElement(By.xpath("//*[contains(@id, 'SubledgerApplicationAttr::content')]")); //Subledger application
//		clickElement(By.xpath("//option[contains(text(),'Receivables')]")); //Receivables
		setElementText(By.xpath("//*[contains(@id, 'paramDynForm_LedgerName::content')]"), Ledger); //Ledger 
		clickElement(By.xpath("//*[contains(@id, 'requestBtns:submitButton')]")); //Submit
		clickElement(By.xpath("//*[contains(@id, 'requestBtns:confirmationPopup:confirmSubmitDialog::ok')]")); //Conformation : OK
	
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
