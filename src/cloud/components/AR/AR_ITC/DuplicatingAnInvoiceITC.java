package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class DuplicatingAnInvoiceITC extends BaseTest{

	public static String Transaction_Number;
	public static String Transaction_Source;
	public static String Line_Quantity;

	private static void run() throws InterruptedException{
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		
		clickElement(By.id("_FOpt1:nv_itemNode_receivables_billing"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl3")); // Manage Transactions
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content"), Transaction_Number);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:0:ap1:q1::search"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:0:ap1:AT2:_ATp:table2:0:cl1"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:m1\"]/div/table/tbody/tr/td[2] "));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:cmi5"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:batchSourceId::content"), Transaction_Source);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content"), Line_Quantity);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:dupTrx1\"]/table/tbody/tr/td[1]/a "));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:saveMenu\"]/table/tbody/tr/td[1]/a/span")); // Save
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:dupTrx1"]/table/tbody/tr/td[1]/a
		
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:m1"]/div/table/tbody/tr/td[2]
		//clickElement(By.xpath("//div[contains(@title, 'Tasks')]"));
		
		//clickElement(By.linkText("Manage Transactions"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:1:_FOTRaT:0:RAtl3"));
	    
		
		
	   // new Select(browser.findElement(By.xpath("//select[contains(@id, 'operator4')]"))).selectByVisibleText("Equals");
	    
	    //clickElement(By.xpath("//select[contains(@id, 'operator4')]"));
	    
	    //Thread.sleep(2000);
	    
	    //clickElement(By.xpath("//span[contains(@id,'value40')]"));
	    
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content"));
	    
	   // Thread.sleep(9000);
    
	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content"), Transaction_Number);
	    
	   // clickElement(By.xpath("//button[contains(@id, 'search')]"));
	    
	    //Thread.sleep(3000);
	    
	   // clickElement(By.xpath("//td[contains(@class, 'xe9')]//*[contains(@id, '_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:AT2:_ATp:table2:0:cl1')]"));
	    
	  //  Thread.sleep(5000);    
	    
	   // clickElement(By.cssSelector("div.xj9"));
	    
	    //clickElement(By.xpath("//tr[contains(@id, 'cmi5')]"));
	    
	    //Thread.sleep(6000);    
	    
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:1:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:batchSourceId::content"));
	    //clickElement(By.xpath("//tr[contains(@id, 'pla202')]//input[contains(@id,'_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:batchSourceId::content')]")); 
	    
	    //setElementText(By.xpath("//tr[contains(@id, 'pla202')]//input[contains(@id,'_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:batchSourceId::content')]"), Transaction_Source);
	    
	   // Thread.sleep(5000);    

	    //clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:1:MAnt2:1:pt1:MTF1:2:pt1:TCF:0:ap1:dupTrx1']/table/tbody/tr/td/a/span"));
	    
	    //clickElement(By.xpath("//*[contains(text(),'Complete and Review')]"));
	    
	   // Thread.sleep(3000);
	    
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:1:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:saveMenu::popEl"));
	    
	    //clickElement(By.xpath("//span[contains(text(),'Save')]"));
	   // clickElement(By.xpath("//tr[contains(@id,'cmi10')]"));
	    
	    //Thread.sleep(3000);    
	    
	    //clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:1:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:cmi10']/td[2]"));
	    
	   // Thread.sleep(3000);
	    
	   // clickElement(By.id("_FOd1::msgDlg::cancel"));
	    
	    //Thread.sleep(3000);
	    
	    //clickElement(By.xpath("//button[contains(@id,'_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:cb1')]"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(DuplicatingAnInvoiceITC.class);
			run();
		}
	}

}




