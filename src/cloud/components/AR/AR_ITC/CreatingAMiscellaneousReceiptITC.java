package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAMiscellaneousReceiptITC extends BaseTest{

			
			public static String Receipt_Method;
			public static String Receivables_Activity;
			public static String Receipt_Number;
			public static String Entered_Amount;
			//public static String Comments;

	private static void run() throws InterruptedException{
		
			clickElement(By.id("pt1:_UISmmLink::icon"));
			//pt1:_UISmmLink::icon
			//_FOpt1:_UISmmLink
			clickElement(By.linkText("More..."));
	 	
			//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
			
			//clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_receivables_balances"));
			clickElement(By.id("_FOpt1:nv_itemNode_receivables_receivables_balances"));
			
			                      
			//clickElement(By.id("_FOpt1:_UISnvr:0:nv_itemNode_receivables_receivables_balances::icon"));
			clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));// Click Tasks
							    //_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon
			clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1")); // Create Receipt
		
			 new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RCF1:0:ap1:receiptType::content"))).selectByVisibleText("Miscellaneous");
			 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:receiptMethodNameId::content"));
			 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:receiptMethodNameId::content"), Receipt_Method);
			 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:it1::content"), Receipt_Number);
			 
			 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:activityId::content")); // Receivables Activity
			 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:activityId::content"), Receivables_Activity);
			 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:activityId::su0"));
			 
			 
			 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:amount::content"), Entered_Amount);
			 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:cbsave1"));
			// _FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:MiscR1:0:ap1:cbsave1
		  	//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		  	
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl1"));
		    
		   // new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:receiptType::content"))).selectByVisibleText("Miscellaneous");
		    //clickElement(By.cssSelector("option[title=\"Miscellaneous\"]"));
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:receiptMethodNameId::content"));
		    
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:receiptMethodNameId::content"), Receipt_Method);

		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:it1::content"));
		    
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:it1::content"), Receipt_Number);
		   
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:activityId::content"));
		    
		   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:activityId::content"), Receivables_Activity);
		    
			   
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:amount::content"));
		    
		   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:amount::content"), Entered_Amount);
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:it7::content"));
		    
		   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:MiscR1:0:ap1:it7::content"), Comments);
		  
		   // clickElement(By.cssSelector("td > a.xtk > span.xtn"));
		    
		    //clickElement(By.id("_FOd1::msgDlg::cancel"));
		

		   
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAMiscellaneousReceiptITC.class);
			run();
		}
	}

}




