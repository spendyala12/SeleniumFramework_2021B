package cloud.components.iExpense.iExpense_India;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cloud.components.iExpense.iExpense_India.GeneratingPayablesITC;
import itc.framework.BaseTest;

public class GeneratingPayablesITC extends BaseTest {
	
public static String BusinessUnit,Type,CommitCycle,DebugSwitch,Number,Date,Employee,Age,InvoiceNumber;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);
		clickElement(By.linkText("Auditing")); //auditing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Process Expense Reimbursements and Cash Advances"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'paramDynForm_ATTRIBUTE1_ATTRIBUTE1::content')]"));
		clickElement(By.xpath("//option[contains(text(), '"+BusinessUnit+"')]"));  //business unit
		clickElement(By.xpath("//*[contains(@id, 'basicReqBody:paramDynForm_ATTRIBUTE5_EXPENSE_REIMBURSEMENTS::content')]"));
		clickElement(By.xpath("//option[contains(text(), '"+Type+"')]"));  //type
		setElementText(By.xpath("//*[contains(@id, 'basicReqBody:paramDynForm_ATTRIBUTE2_ATTRIBUTE2::content')]"), CommitCycle);//commit cycle
		clickElement(By.xpath("//*[contains(@id, 'basicReqBody:paramDynForm_ATTRIBUTE3_ATTRIBUTE3::content')]"));
		clickElement(By.xpath("//option[contains(text(), '"+DebugSwitch+"')]"));  //debug switch
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@accesskey='m']")); //submit
		clickElement(By.xpath("//*[contains(@id, 'requestBtns:confirmationPopup:confirmSubmitDialog::ok')]")); //ok
		Thread.sleep(5000);
		clickElement(By.xpath("//a[contains(text(),'Actions')]"));	//actions
		clickElement(By.xpath("//td[contains(text(),'Review Payment Requests')]"));	//view payment requests
		Thread.sleep(5000);				
		setElementText(By.xpath("//*[contains(@id, 'pt1:AP2:q1:value00::content')]"), Number);//number
		setElementText(By.xpath("//*[contains(@id, 'pt1:AP2:q1:value10::content')]"), Date);//date
		setElementText(By.xpath("//*[contains(@id, 'pt1:AP2:q1:value30::content')]"), Employee);//employee
		setElementText(By.xpath("//*[contains(@id, 'pt1:AP2:q1:value40::content')]"), BusinessUnit); //business unit
		setElementText(By.xpath("//*[contains(@id, 'pt1:AP2:q1:value50::content')]"), Age);//age
		clickElement(By.xpath("//button[text()='Search']"));//search
		InvoiceNumber = browser.findElement(By.xpath("//*[contains(@id,'t1:1:commandLink')]")).getText();
		System.out.println(InvoiceNumber);
		clickElement(By.partialLinkText("ER00"));
//		clickElement(By.xpath("//*[contains(@id, '_UIShome::icon')]"));  //home
					
	}

public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(GeneratingPayablesITC.class);
		run();
	}
}

}
