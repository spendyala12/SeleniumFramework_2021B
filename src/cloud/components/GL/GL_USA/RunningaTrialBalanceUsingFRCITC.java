package cloud.components.GL.GL_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import itc.framework.BaseTest;

public class RunningaTrialBalanceUsingFRCITC extends BaseTest{

	public static String EnterSearchTerms;
	public static String DataAccessSet;

	private static void run() throws Exception  {
				
		Thread.sleep(5000);
		clickElement(By.linkText("Financial Reporting Center"));
		clickElement(By.xpath("//*[text()='All']"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'_FOTsr1:0:SP1:s12:it3::content')]"),EnterSearchTerms);
		clickElement(By.xpath("//img[@title='Search']")); //search
		Thread.sleep(5000);
		clickElement(By.xpath("//a[@title='/Shared Folders/Financials/General Ledger/Trial Balances/Trial Balance Report']"));
		clickElement(By.xpath("//img[@title='Schedule']"));
		Thread.sleep(5000);
		//------parameters---
		//data access set
		//ledger set
		//ledger currency
		//currency type
		//acc period
		//amount type
		//summarrize by
		
		  browser.switchTo().frame("j_id40::f");
		  browser.findElement(By.xpath("//a[@accesskey='m']")).click();
//		  clickElement(By.xpath("//a[@accesskey='m']"));
		  browser.switchTo().defaultContent();
		  Thread.sleep(5000);
		 	
		
	}	

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(RunningaTrialBalanceUsingFRCITC.class);
			run();
		}
	}

}