package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ViewingAnInvoiceITC extends BaseTest{
	
	public static String Invoice_num;
		
	public static void run() throws Exception{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:nv_itemNode_payables_payables_invoices"));
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsdiRegionalSearch::icon"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaTj_id_1:1:q1:value00::content"), Invoice_num);
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaTj_id_1:1:q1::search"));
		 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1:0:cl1"));
	    	   
	    clickElement(By.linkText("Done"));
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ViewingAnInvoiceITC.class);
			run();
		}
	}
}
