package cloud.components.AP.AP_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

public class InitiatingAStopPaymentRequestITC extends BaseTest{
	
	//public static String DisbursementBankAccount;
	public static String Payment_Number;
	public static String Stop_Reason;
	
	private static void run() throws InterruptedException{
		
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Payments"));
	 	setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:q1:value20::content')]"),Payment_Number);
	 	clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:q1::search')]"));
	 	clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1')]"));
	 	clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:2:ap1:menu1')]"));
	 	clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:ap1:commandMenuItem2')]"));
	 	setElementText(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:2:ap1:it1::content')]"),Stop_Reason);
	 	Thread.sleep(10000);
	 	clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:dialog2::ok')]"));
	 	  
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(InitiatingAStopPaymentRequestITC.class);
			run();
		}
	}

}
