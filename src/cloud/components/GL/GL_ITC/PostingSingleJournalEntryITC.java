package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PostingSingleJournalEntryITC extends BaseTest{
	
	public static String Journal;
	public static String Journal_batch;
	public static String Accounting_Period;
	public static String Batch_Status;
	
	private static void run() throws InterruptedException{
		
		
		clickElement(By.xpath("//img[@title='Tasks']")); //task
		clickElement(By.linkText("Manage Journals")); //manage journal	
		
		setElementText(By.xpath("//*[contains(@id,'queryP:value00::content')]"),Journal);
		setElementText(By.xpath("//*[contains(@id,'queryP:value10::content')]"),Journal_batch);
		setElementText(By.xpath("//*[contains(@id,'queryP:value20::content')]"),Accounting_Period);
		clickElement(By.xpath("//*[contains(@id,'queryP:value50::content')]"));
		new Select(browser.findElement(By.xpath("//*[contains(@id,'queryP:value50::content')] "))).selectByVisibleText(Batch_Status);
		clickElement(By.xpath("//*[contains(@id,'queryP::search')]"));
		
		clickElement(By.xpath(""));   //select the journal to be posted 
		clickElement(By.xpath("//span[contains(text(),'Post')]"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PostingSingleJournalEntryITC.class);
			run();
		}
	}

}
