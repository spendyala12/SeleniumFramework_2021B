package cloud.components.iExpense.iExpense_India;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cloud.components.iExpense.iExpense_India.AuditingExpenseReportITC;
import itc.framework.BaseTest;

public class AuditingExpenseReportITC extends BaseTest {
	
public static String SavedSearch,ReportNumber,ReportStatus,AuditType,BusinessUnit,Person;
public static String ReportSubmissionDate,ExpenseAuditor,AssignedToAuditor;
public static String Date;

	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);
		clickElement(By.linkText("Auditing")); //auditing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage Expense Reports"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'qryId0::saveSearch::content')]"));  
		clickElement(By.xpath("//option[contains(text(), '"+SavedSearch+"')]")); //saved search
		Thread.sleep(5000);
		
		if(SavedSearch.equals("Expense Reports Pending Approval")) {
		System.out.println("Expense Reports Pending Approval");
		setElementText(By.xpath("//*[contains(@id, 'qryId0:value00::content')]"), ReportNumber);//Report number
		clickElement(By.xpath("//*[contains(@id, 'qryId0:value10::content')]"));  
		clickElement(By.xpath("//option[contains(text(), '"+ReportStatus+"')]"));//Report status
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'qryId0:value20::content')]"));  //business unit
		clickElement(By.xpath("//option[contains(text(), '"+BusinessUnit+"')]")); 	
		setElementText(By.xpath("//*[contains(@id, 'value30::content')]"), Person);//Person
		setElementText(By.xpath("//*[contains(@id, 'value40::content')]"), ReportSubmissionDate);//Report submission date
		setElementText(By.xpath("//*[contains(@id, 'value50::content')]"), ExpenseAuditor);//Expense auditor
//		clickElement(By.xpath("//*[contains(@id, 'qryId0:value60::content')]"));  
//		clickElement(By.xpath("//option[contains(text(), '"+AssignedToAuditor+"')]")); 	//Assigned to auditor
		Thread.sleep(5000);
		}
		else if(SavedSearch.equals("No Receipts Required Pending Approval")) {
			System.out.println("No Receipts Required Pending Approval");
			setElementText(By.xpath("//*[contains(@id, 'qryId0:value00::content')]"), ReportNumber);//Report number
			clickElement(By.xpath("//*[contains(@id, 'qryId0:value10::content')]"));  //business unit
			clickElement(By.xpath("//option[contains(text(), '"+BusinessUnit+"')]")); 
		}
		else {
			System.out.println("else");
			setElementText(By.xpath("//*[contains(@id, 'qryId0:value00::content')]"), ReportNumber);//Report number
			clickElement(By.xpath("//*[contains(@id, 'qryId0:value10::content')]"));  
			clickElement(By.xpath("//option[contains(text(), '"+AuditType+"')]")); //audit type
			clickElement(By.xpath("//*[contains(@id, 'qryId0:value20::content')]"));  //business unit
			clickElement(By.xpath("//option[contains(text(), '"+BusinessUnit+"')]")); 
		}
			
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'qryId0::search')]")); //search
		Thread.sleep(5000);
//		clickElement(By.linkText(ReportNumber));   //report number
		clickElement(By.xpath("//*[contains(text(),'Audit Expense Report')]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'AppPanel:it1::content')]"), Date);  //date
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'allReceiptVerifiedFlag::Label0')]")); //verify
		Thread.sleep(5000);
		clickElement(By.xpath("//span[contains(text(),'Complete Audit')]")); //Complete Audit
		
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
