package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ViewingAPaymentITC extends BaseTest{
	
	public static String Payment_Number;
	public static String Disbursement_Bank_Account;
		
	public static void run() throws Exception{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
	    clickElement(By.id("pt1:nv_itemNode_payables_payables_payments"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl5"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value20::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value20::content"), Payment_Number);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value30::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value30::content"), Disbursement_Bank_Account);
	   
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1::search"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:APb"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:APb"));
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ViewingAPaymentITC.class);
			run();
		}
	}
}
