package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReviewingAndAccountingForAPaymentITC extends BaseTest{
	
	public static String Search_Supplier;
	public static String Search_Payment_Num;
	
	
	
	public static void run() throws Exception{
	
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_payables_payables_payments"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value20::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value20::content"), Search_Payment_Num);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1::search"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:showDetailItem1::disAcr"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:InPaid:0:AT1:_ATp:t1:0:inputText1::content"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:InPaid:0:AT1:cb2"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:menu1")); 
		clickElement(By.linkText("Actions"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:menu1\"]/div/table/tbody/tr/td[2]/a"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:commandMenuItem7\"]")); //post to ledger, 3034
		//clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:commandMenuItem9\"]/td[2]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:cb43")); //Ok btn
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:SPb"));
				
//	    clickElement(By.id("pt1:nv_itemNode_payables_payables_payments"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl5"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value20::content"));
	    
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value20::content"), Search_Payment_Num);
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1::search"));
//   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1"));
//	   
//	    clickElement(By.linkText("Actions"));
//	   
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:commandMenuItem7']/td[2]"));
//	   
//    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:cb43"));
		
	

}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReviewingAndAccountingForAPaymentITC.class);
			run();
		}
	}
}
