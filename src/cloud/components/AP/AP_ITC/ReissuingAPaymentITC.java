package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;


public class ReissuingAPaymentITC extends BaseTest{
	//public static String Payment_Date;
	public static String Payment_Number;

	private static void run() throws Exception{

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Payments"));
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:q1:value20::content')]"),Payment_Number);
		clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:AP1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1')]"));
		clickElement(By.linkText("Actions"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:menu1\"]/div/table/tbody/tr/td[2]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:dialog5::ok\"]"));


	}


	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReissuingAPaymentITC.class);
			run();
		}
	}

}
