package cloud.components.GL.GL_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class OpeningPeriodsITC extends BaseTest{

	public static String Ledger,Period;


	private static void run() throws Exception  {
		Thread.sleep(5000);		
		clickElement(By.linkText("Period Close"));
		clickElement(By.xpath("//img[@title='General Ledger']")); //general ledger
		clickElement(By.xpath("//*[contains(@id, 'ap1:selectOneChoiceGL::content')]"));  
		clickElement(By.xpath("//option[contains(text(), '"+Ledger+"')]"));//ledger
		clickElement(By.xpath("//*[contains(@id, 'ap1:AT1:_ATp:selectStatus::content')]"));  
		clickElement(By.xpath("//option[contains(text(), 'Close')]"));
		clickElement(By.xpath("//*[contains(text(), '"+Period+"')]")); //select period
		clickElement(By.xpath("//span[contains(text(),'Open Period')]")); //click Close Period button
		clickElement(By.xpath("//*[@accesskey='o']"));
		
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