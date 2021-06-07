package cloud.components.GL.GL_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class OpeningPeriodsITC extends BaseTest{

	public static String InvoiceNumber;


	private static void run() throws Exception  {
		Thread.sleep(5000);
		clickElement(By.linkText("Period Close"));  //period close
		clickElement(By.xpath("//img[@title='General Ledger']")); //general ledger
		clickElement(By.xpath("//*[contains(@id, 'ap1:AT1:_ATp:selectStatus::content')]"));  
		clickElement(By.xpath("//option[contains(text(), 'Closed')]")); 
		clickElement(By.xpath("//*[contains(@id, '_FOTsr1:0:pt1:r1:1:ap1:AT1:_ATp:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));//select row
		clickElement(By.xpath("//span[contains(text(),'Open Period')]")); //click Open Period button
			
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(OpeningPeriodsITC.class);
			run();
		}
	}
}