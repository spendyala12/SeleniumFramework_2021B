package cloud.components.GL.GL_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class OpeningPeriodsITC extends BaseTest{

	public static String InvoiceNumber;
	public static String Status;

	private static void run() throws Exception  {
		Thread.sleep(5000);
		clickElement(By.linkText("Period Close"));
		clickElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:r1:0:ph1:r2:0:i1']")); //click on General Ledger
		new Select(browser.findElement(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:r1:1:ap1:AT1:_ATp:selectStatus::content']"))).selectByVisibleText("Closed"); //click the status drop down and select Closed.
		clickElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]"));//select row
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