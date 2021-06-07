package cloud.components.AR.AR_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class ClosingARITC extends BaseTest{

	public static String Ledger;
	public static String Close_Period;
	public static String Open_Period;
	
	private static void run() throws InterruptedException{
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_receivables_receivables_balances')]")); //AccountReceivables
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage Accounting Periods"));
		//application = receivables
		clickElement(By.xpath("//*[contains(@id, 'SelectOneAppSelected::content')]")); //Application
		clickElement(By.xpath("//option[contains(text(),'Receivables')]")); //Receivables
		clickElement(By.xpath("//*[contains(text(), '"+Ledger+"')]")); //ledger
		//close period
		clickElement(By.xpath("//*[contains(@id, 'selectStatus::content')]")); //Status
		clickElement(By.xpath("//option[contains(text(),'Open')]")); //open
		clickElement(By.xpath("//*[contains(text(), '"+Close_Period+"')]")); //select a period to close
		Thread.sleep(1000);
		clickElement(By.xpath("//span[contains(text(), 'Close Period')]")); //Close period		
		//Open Period
		clickElement(By.xpath("//*[contains(@id, 'selectStatus::content')]")); //Status
		clickElement(By.xpath("//option[contains(text(),'Closed')]")); //Closed
		clickElement(By.xpath("//*[contains(text(), '"+Open_Period+"')]")); //select a period to open
		Thread.sleep(1000);
		clickElement(By.xpath("//span[contains(text(), 'Open Period')]")); //Open Period
				
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ClosingARITC.class);
		run();
	}
}

}
