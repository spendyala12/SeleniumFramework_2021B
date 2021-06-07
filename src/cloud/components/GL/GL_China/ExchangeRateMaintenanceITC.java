package cloud.components.GL.GL_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ExchangeRateMaintenanceITC extends BaseTest{


	private static void run() throws Exception  {
		
		clickElement(By.xpath("//*[contains(@id,'_FOTsdiPeriodCloseRegionalArea::icon')]"));
		clickElement(By.linkText("Manage Currency Rates"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:AP1:showDetailItem2::ti')]"));
		clickElement(By.xpath("//*[contains(@id,'Daily1:0:goButton1')]"));
		clickElement(By.xpath("//*[contains(@id,'q1:value00::content')]")); //from
		clickElement(By.xpath("//*[contains(@id,':q1:value10::content')]")); //to
		clickElement(By.xpath("//*[contains(@id,'1:0:q1:value30::content')]")); //Rate type
		
			
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