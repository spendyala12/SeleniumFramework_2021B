package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class VoidingAPaymentITC extends BaseTest{
	
	public static String  Party_Name;
	//public static String  Taxpayer_ID;
	public static String Search_Supplier;
	//public static String Payment_Number;
	public static String Search_Payment_Num;
	
	
	public static void run() throws Exception{
		
	Thread.sleep(30000);
		
	clickElement(By.id("pt1:_UISmmLink::icon"));
	clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
	//clickElement(By.id("pt1:nv_itemNode_payables_payables_payments"));
	clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_payables_payables_payments"));
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5")); //Click on manage payments
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::content"));
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::lovIconId")); //drop-down list
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::dropdownPopup::popupsearch")); //Click search
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::_afrLovInternalQueryId:criterion0"));
	Thread.sleep(2000);
	setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::_afrLovInternalQueryId:value00::content"),Party_Name); //4833
	//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value20::content"), Payment_Number;);
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::_afrLovInternalQueryId::search"));
	Thread.sleep(2000);
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::lovDialogId::ok"));
	//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::content"));
	setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1:value00::content"), Search_Supplier);
	
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1::search"));
	Thread.sleep(2000);
	clickElement(By.linkText("Actions"));
	Thread.sleep(2000);
	
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:commandMenuItem1"));
	//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:invoiceAction::content"))).selectByVisibleText("Cancel Invoice");//It is not taking default date
	// clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:dialog1::cancel"));
	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:dialog1::ok"));  //submit btn
	//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:SPb"));       //Done
	
	
	
	
   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl5"));
   
    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value00::content"));
    
   //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value00::content"), Search_Supplier);
   
   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value20::content"), Search_Payment_Num);
    
    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value60::content"));
  
    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1:value60::content"))).selectByVisibleText("Negotiable");
  
  // clickElement(By.cssSelector("option[title=\"Negotiable\"]"));
  
//    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:q1::search"));
//  
//    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1"));
//  
//    clickElement(By.linkText("Actions"));
//  
//    clickElement(By.cssSelector("td.x1h8"));
//  
//    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:dialog1::ok"));
//  
//    clickElement(By.cssSelector("div.xii"));
//  
//    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:APb"));

}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(VoidingAPaymentITC.class);
			run();
		}
	}
}
