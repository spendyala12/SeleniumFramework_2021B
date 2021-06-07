package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAnOnAccountCreditMemoITC extends BaseTest{

	public static String Transaction_Type;
	public static String Bill_to_Name;
	public static String Ship_to_Site;
	public static String Item;
	public static String Quantity;
	public static String Unit_Price;
	
	



	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
	 	
	 	clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
	 	clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_billing"));//Bills Icon
	 	//_FOpt1:_UISnvr:0:nv_itemNode_receivables_billing
	 	
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon")); // Tasks Icon
		//_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1")); // Create Transaction
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:transactionClass::content"))).selectByVisibleText("Credit memo");
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:transactionTypeId::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:transactionTypeId::content"), Transaction_Type);
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:soc1::content"))).selectByVisibleText("Billing");
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:billToNameId::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:billToNameId::content"), Bill_to_Name);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:shipToNameId::content"));
	                    	//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:shipToNameId::content
		Thread.sleep(3000);
		
				setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:shipToSiteId::content"), Ship_to_Site);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"), Item);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:quantity::content"), Quantity);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:sellingPrice::content"), Unit_Price);
		
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:newTrx::popEl"));
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:cmi2")); // Complete and Review
		 Thread.sleep(5000);
		 
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:Trans1:0:ap110:saveMenu::popEl"));
		 
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:Trans1:0:ap110:cmi10"));
		 clickElement(By.id("_FOd1::msgDlg::cancel"));
		////*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:Trans1:0:ap110:cmi10"]
		////*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:1:ap1:cmi2"] //xpath
		 	//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
		   // clickElement(By.linkText("Create Transaction"));
		 	//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl1"));
		   // new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:transactionClass::content"))).selectByVisibleText("Credit memo");
		   // clickElement(By.cssSelector("option[title=\"Credit memo\"]"));
		    
		   // Thread.sleep(5000);
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:pl78::_afrStr"));
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:transactionTypeId::content"));
		    
		  // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:transactionTypeId::content"), Transaction_Type);

		    //clickElement(By.cssSelector("li.p_AFSelected.AFAutoSuggestItem"));

		    //new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:soc1::content"))).selectByVisibleText("Billing");
		   // clickElement(By.cssSelector("option[title=\"Billing\"]"));
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:billToNameId::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:billToNameId::content"), Bill_to_Name);
		  
		 
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"));
		   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"), Item);
		   
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"));
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:quantity::content"));
		   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:quantity::content"), Quantity);
		   
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:sellingPrice::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:AT1:_ATp:table1:0:sellingPrice::content"), Unit_Price);
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:newTrx::popEl"));
		    //clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:1:ap1:cmi2']/td[2]"));
		    
		    Thread.sleep(5000);
		  //  clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:saveMenu::popEl"));
		   // clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:cmi10']/td[2]"));
		   // clickElement(By.id("_FOd1::msgDlg::cancel"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAnOnAccountCreditMemoITC.class);
			run();
		}
	}

}




