package cloud.components.AP.AP_Argentina;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class OpenClosePeriodsITC extends BaseTest{


	public static String Ledger;
	
	
	

	private static void run() throws Exception  {

		/*
		 * clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		 * clickElement(By.xpath("//a[@id='pt1:_UISnvr:0:nvcl1']")); //Show more
		 */
		clickElement(By.xpath("//span[contains(text(),'Invoices')]")); //Invoices
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Manage Accounting Periods")); //Manage Accounting Periods
		
		clickElement(By.xpath("//*[contains(@id,'ap1:SelectOneAppSelected::content')]"));
		clickElement(By.xpath("//option[contains(text(),'Payables')]")); //Payables
		clickElement(By.xpath("//*[contains(@id,'ATp:table1:1:ot9')]")); //Ledger ITC_USA_PL
		clickElement(By.xpath("//span[contains(text(),'APR-21')]"));
		clickElement(By.xpath("//span[contains(text(),'Close Period')]")); //Close Period
		clickElement(By.xpath("//span[contains(text(),'MAY-21')]"));
		clickElement(By.xpath("//span[contains(text(),'APR-21')]"));
		clickElement(By.xpath("//span[contains(text(),'Open Period')]")); //OpenPeriod
	
		
		
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(OpenClosePeriodsITC.class);
			run();
		}
	}

}
