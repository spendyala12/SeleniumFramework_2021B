package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CancelingAnInvoiceITC extends BaseTest{
	
	public static String Invoice_Amount;
	public static String Supplier_Or_Party;
		
	public static void run() throws Exception{
			
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		//clickElement(By.linkText("Create Invoice")); //create inv
		
	
		//clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_payables_payables_invoices')]"));
		
		clickElement(By.xpath("//*[contains(@id,'0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon')]"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl4')]"));
	    
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"));
	    
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"),Invoice_Amount);
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1:value40::content')]"));
	    
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1:value40::content')]"),Supplier_Or_Party); 
	    
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1::search')]"));
	    
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1:0:cl1')]"));
		
	    clickElement(By.linkText("Actions"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r7:1:cm8']/td[2]"));
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r7:1:cb40')]"));
	   
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CancelingAnInvoiceITC.class);
			run();
		}
	}
}
