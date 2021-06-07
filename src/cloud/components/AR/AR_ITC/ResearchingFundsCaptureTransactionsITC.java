package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ResearchingFundsCaptureTransactionsITC extends BaseTest{

	public static String Receipt_Method;
	public static String System_Order_Number;



	private static void run() throws InterruptedException{
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::content")); //Click on Receipt Method

		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::lovIconId"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::dropdownPopup::popupsearch"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::_afrLovInternalQueryId:value00::content"), Receipt_Method); //selecting Receipt Method field
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::_afrLovInternalQueryId::search"));
		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60_afrLovInternalTableId::db\"]/table/tbody/tr")); //Selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));
		                    		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1::db\"]/table/tbody/tr[1]")); //selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1")); //clicking on Receipt Number
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:showMore"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:sdi1::ti")); //Clicking on Payment Details  , ref no.1014242,  Account Number- 10060
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton133"));  //Cancel btn
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:commandButton1")); //Done btn
		
		clickElement(By.id("_FOpt1:_UISpgl53u")); //Click on navigator
		
		clickElement(By.id("_FOpt1:nv_itemNode_receivables_payment_settlements")); //Click on Fund Capture
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiFinPmtFCTxnDashboard_itemNode__FndTasksList::icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl2")); //Click on manage authorization
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:AP1:q1:value00::content"),System_Order_Number);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:AP1:q1::search"));
		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:AP1:AT1:_ATp:t1::db\"]/table/tbody/tr")); //Selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:AP1:AT1:_ATp:t1:0:commandLink1")); //click on order number link
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:1:AP1:SPb")); //Done btn
		
		
		
		
		
		//...........................
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
//		
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl5"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value50::content"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::content"));
//	    
	  //  setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::content"), Receipt_Method);

//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:2:commandLink1"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:showMore"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:sdi1::disAcr"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton133"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:commandButton1"));
//	    
//	    clickElement(By.id("_FOpt1:_UISmmLink::icon"));
//	    
//	    clickElement(By.id("_FOpt1:nv_itemNode_receivables_payment_settlements"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_payment_settlements:1:_FOTsdiFinPmtFCTxnDashboard_itemNode__FndTasksList::icon"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_payment_settlements:1:_FOTRaT:0:RAtl2"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_payment_settlements:1:MAnt2:1:pt1:pt_r1:0:AP1:q1:value00::content"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_payment_settlements:1:MAnt2:1:pt1:pt_r1:0:AP1:q1:value00::content"), System_Order_Number);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_payment_settlements:1:MAnt2:1:pt1:pt_r1:0:AP1:q1::search"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_payment_settlements:1:MAnt2:1:pt1:pt_r1:0:AP1:AT1:_ATp:t1:0:commandLink1"));
//	    
//	    clickElement(By.cssSelector("span.x1l5"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ResearchingFundsCaptureTransactionsITC.class);
			run();
		}
	}

}




