package cloud.components.GL.GL_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ClosingPeriodsITC extends BaseTest{

	public static String Ledger,Period;

	private static void run() throws Exception  {
		
		clickElement(By.linkText("Period Close"));
		clickElement(By.xpath("//img[@title='General Ledger']")); //general ledger
		clickElement(By.xpath("//*[contains(@id, 'ap1:selectOneChoiceGL::content')]"));  
		clickElement(By.xpath("//option[contains(text(), '"+Ledger+"')]"));//ledger
		clickElement(By.xpath("//*[contains(@id, 'ap1:AT1:_ATp:selectStatus::content')]"));  
		clickElement(By.xpath("//option[contains(text(), 'Open')]"));
		clickElement(By.xpath("//*[contains(text(), '"+Period+"')]")); //select period
		clickElement(By.xpath("//span[contains(text(),'Close Period')]")); //click Close Period button
		clickElement(By.xpath("//*[@accesskey='o']"));
//		clickElement(By.xpath("//*[contains(@id,'yes')]")); //click yes button
			
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