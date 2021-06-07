package cloud.components.GL.GL_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import itc.framework.BaseTest;

public class RunningaTrialBalanceUsingFRCITC extends BaseTest{

	public static String EnterSearchTerms;
	public static String DataAccessSet;

	private static void run() throws Exception  {
		Thread.sleep(5000);
		clickElement(By.linkText("Financial Reporting Center"));
		clickElement(By.xpath("//*[contains(@id,'_FOTsr1:0:SP1:cl6::icon')]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'_FOTsr1:0:SP1:s12:it3::content')]"),EnterSearchTerms);
		clickElement(By.xpath("//*[contains(@id,'FOTsr1:0:SP1:s12:cil1::icon')]")); //search
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:SP1:t1:0:gil1')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOTsr1:1:SP2:goLink1::icon')]"));

		Thread.sleep(5000);

		browser.switchTo().frame(3);               

		WebElement ele1 = browser.findElement(By.xpath("//*[contains(@id,'r1:0:r1:requestBtns:submitButton')]")); 

		String text = ele1.getText();
		System.out.println(text);

		browser.findElement(By.xpath("//*[contains(@id,'r1:0:r1:requestBtns:submitButton')]")).click();//text() = 'Submit'
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));

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