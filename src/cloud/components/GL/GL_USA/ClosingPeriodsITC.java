package cloud.components.GL.GL_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ClosingPeriodsITC extends BaseTest{

	public static String InvoiceNumber;

	private static void run() throws Exception  {
		
		clickElement(By.linkText("Period Close"));
		clickElement(By.xpath("//img[@title='General Ledger']")); //general ledger
		clickElement(By.xpath("//*[contains(@id, 'ap1:AT1:_ATp:selectStatus::content')]"));  
		clickElement(By.xpath("//option[contains(text(), 'Open')]"));
		clickElement(By.xpath("//*[contains(@id, '_FOTsr1:0:pt1:r1:1:ap1:AT1:_ATp:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));//select row
		clickElement(By.xpath("//span[contains(text(),'Close Period')]")); //click Close Period button
		clickElement(By.xpath("//*[contains(@id,'yes')]")); //click yes button
			
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ClosingPeriodsITC.class);
			run();
		}
	}
}