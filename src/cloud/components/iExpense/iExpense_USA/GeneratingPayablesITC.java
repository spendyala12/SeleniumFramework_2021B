package cloud.components.iExpense.iExpense_USA;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cloud.components.iExpense.iExpense_USA.GeneratingPayablesITC;
import itc.framework.BaseTest;

public class GeneratingPayablesITC extends BaseTest {
	
	public static String BusinessUnit;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);
		clickElement(By.linkText("Auditing")); //auditing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Process Expense Reimbursements and Cash Advances"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'paramDynForm_ATTRIBUTE1_ATTRIBUTE1::content')]"));
		clickElement(By.xpath("//option[contains(text(), '"+BusinessUnit+"')]"));  //business unit
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@accesskey='m']")); //submit
		clickElement(By.xpath("//*[contains(@id, 'requestBtns:confirmationPopup:confirmSubmitDialog::ok')]")); //ok
		Thread.sleep(5000);
		clickElement(By.xpath("//a[contains(text(),'Actions')]"));	//actions
		clickElement(By.xpath("//td[contains(text(),'Review Payment Requests')]"));	//view payment requests
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, '_UIShome::icon')]"));  //home
		
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
