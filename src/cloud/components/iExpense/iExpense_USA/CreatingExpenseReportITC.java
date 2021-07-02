package cloud.components.iExpense.iExpense_USA;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cloud.components.iExpense.iExpense_USA.CreatingExpenseReportITC;
import itc.framework.BaseTest;

public class CreatingExpenseReportITC extends BaseTest {
	
	public static String Purpose,Employer_pays_you;
	public static String Date,Template,Type,Amount,Amount1;
	public static String Description,ProjectNumber,TaskNumber,ConversionRate,ReportNumber;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);
		clickElement(By.linkText("Expenses"));	//expenses
		clickElement(By.linkText("See All"));	//see all 
		clickElement(By.xpath("//*[contains(@id, 'createReportButton')]")); //Create Report		
		setElementText(By.xpath("//*[contains(@id,'it1::content')]"), Purpose);  //purpose
		browser.findElement(By.xpath("//*[contains(@id,'it1::content')]")).sendKeys(Keys.TAB);
		browser.findElement(By.xpath("//*[contains(@id,'ReceiptCurrencyCodeClientLov:sis1:is1::content')]")).click();
		setElementText(By.xpath("//*[contains(@id,'ReceiptCurrencyCodeClientLov:sis1:is1::content')]"), Employer_pays_you); //Employer pays you
				
		Thread.sleep(5000);
		clickElement(By.xpath("//span[contains(text(),'Create Item')]")); //+ 
		setElementText(By.xpath("//*[contains(@id,'it1::content')]"), Date);  //date
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'ExpenseTemplateId::content')]")); //template
		clickElement(By.xpath("//option[contains(text(), '"+Template+"')]")); 
		clickElement(By.xpath("//*[contains(@id, 'ExpenseTypeId::content')]")); //type
		clickElement(By.xpath("//option[contains(text(), '"+Type+"')]"));  
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'is1::content')]"), Amount);   //USD US Dollar
		setElementText(By.xpath("//*[contains(@id,'AP1:ReceiptAmount::content')]"), Amount1);   
		browser.findElement(By.xpath("//*[contains(@id,'AP1:ReceiptAmount::content')]")).sendKeys(Keys.TAB);

		if(browser.findElement(By.xpath("//*[contains(@id,'ExchangeRate::content')]")).isDisplayed()) {
			browser.findElement(By.xpath("//*[contains(@id,'ExchangeRate::content')]")).sendKeys(ConversionRate);   //conversion rate
			}
		Thread.sleep(5000);
		browser.findElement(By.xpath("//*[contains(@id,'Description::content')]")).sendKeys(Description);
		browser.findElement(By.xpath("//*[contains(@id,'Description::content')]")).sendKeys(Keys.TAB);

		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'pjcdff_PJCDFFVOIterator_PROJECT_ID_DisplayEXM_Expense_Report_Line::content')]"), ProjectNumber);   //project number
		setElementText(By.xpath("//*[contains(@id,'pjcdff_PJCDFFVOIterator_TASK_ID_DisplayEXM_Expense_Report_Line::content')]"), TaskNumber);   //task number
		Thread.sleep(5000);
		clickElement(By.xpath("//span[contains(text(),'Save and Close')]"));   //save and close
		clickElement(By.xpath("//*[@accesskey='m']"));    //submmit
		Thread.sleep(5000);
		ReportNumber = browser.findElement(By.xpath("//*[contains(@id,'_ATp:t1:0:expenseReportLink')]")).getText();
		System.out.println(ReportNumber);

	}

public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingExpenseReportITC.class);
		run();
	}
}

}

