package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReviewingAccountingEntriesITC extends BaseTest{
	
	public static String Ledger;
	public static String Date;
	
	private static void run() throws Exception{
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl12"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q1:operator2::content"))).selectByVisibleText("Equals");
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q1:value00::content"), Ledger);//"China Primary Ledger"
	    
	    Thread.sleep(3000);
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q1:value20::content"), Date);//"9/30/16"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q1::search"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:sdi2::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:commandButton3"));
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:AP1:menu1']/div/table/tbody/tr/td[3]/div"));

	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:AP1:commandMenuItem1']/td[2]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:AP1:dialog2::ok"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:AP1:showDetailItem6::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:AP1:showDetailItem8::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:AP1:APb"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:showDetailItem2::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:commandButton2"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:2:xladr1:0:dynam1:0:pt1:AP2:table1:0:cl1"));
	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:2:xladr1:0:dynam1:1:pt0:AP1:AT1:d1::ok"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:2:xladr1:0:dynam1:1:pt0:AP1:APb"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:showDetailItem1::disAcr"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q2:value00::content"), Ledger);
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q2:operator2::content"))).selectByVisibleText("Equals");
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q2:value20::content"), Date);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:q2::search"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:AT1jel:_ATp:t4:2:cil1::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:AT1jel:_ATp:t4:2:d1jel::ok"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReviewingAccountingEntriesITC.class);
			run();
		}
	}

}
