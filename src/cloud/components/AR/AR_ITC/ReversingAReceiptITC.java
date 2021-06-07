package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReversingAReceiptITC extends BaseTest{

	public static String Receipt_Number;

	private static void run() throws InterruptedException{
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		
		
		

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl5"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:operator1::content"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:operator1::content"))).selectByVisibleText("Equals");
	    clickElement(By.cssSelector("option[title=\"Equals\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"), Receipt_Number);
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:1:commandLink1"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:AP1:plam38']/td"));
	    
	    clickElement(By.cssSelector("div.xj9"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:AP1:commandMenuItem1']/td[2]"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:AP1:soc10::content"))).selectByVisibleText("Nonsufficient funds");
	    clickElement(By.cssSelector("option[title=\"Nonsufficient funds\"]"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:AP1:soc11::content"))).selectByVisibleText("Wrong invoice");
	    clickElement(By.cssSelector("option[title=\"Wrong invoice\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:AP1:cb1"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReversingAReceiptITC.class);
			run();
		}
	}

}




