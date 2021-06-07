package cloud.components.iExpense.iExpense_Argentina;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cloud.components.iExpense.iExpense_Argentina.AuditingExpenseReportITC;
import itc.framework.BaseTest;

public class AuditingExpenseReportITC extends BaseTest {
	
public static String ReportNumber,BusinessUnit,Date;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);
		clickElement(By.linkText("Auditing")); //auditing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage Expense Reports"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'qryId0:value20::content')]"));  //business unit
		clickElement(By.xpath("//option[contains(text(), '"+BusinessUnit+"')]")); 		
		clickElement(By.xpath("//*[contains(@id, 'qryId0::search')]")); //search
		clickElement(By.linkText(ReportNumber));   //report number
		
		
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'AppPanel:it1::content')]"), Date);  //date
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'allReceiptVerifiedFlag::Label0')]")); //verify receipt checkbox
		Thread.sleep(5000);
		clickElement(By.xpath("//span[contains(text(),'Complete Audit')]")); //Complete Audit
		clickElement(By.xpath("//*[@accesskey='o']")); //Complete Audit
		
	}

public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(AuditingExpenseReportITC.class);
		run();
	}
}

}
