package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class PayingAnInvoiceDuringInvoiceInquiryITC extends BaseTest{
	
	public static String Invoice_Number;
	public static String Supplier_Or_Party;
	public static String Bank_Account;
	public static String Payment_Document;
	
		
	public static void run() throws Exception{	
		
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Invoices"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"));
	    setElementText(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:q1:value10::content')]"),Invoice_Number);
	    clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:q1:value40::content')]"));
	    setElementText(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:q1:value40::content')]"),Supplier_Or_Party);
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1::search')]"));
	    clickElement(By.cssSelector("div.xin"));
	    clickElement(By.linkText("Actions"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:cmi1']/td[2]"));
	    clickElement(By.xpath("//*[contains(@id,'0:ap1:at1:r6:1:bankAccountNamePIFId::content')]"));
	    setElementText(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:at1:r6:1:bankAccountNamePIFId::content')]"),Bank_Account);
	    clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:at1:r6:1:paymentProfileNameId::content')]")); 
	    setElementText(By.xpath("//*[contains(@id,'0:ap1:at1:r6:1:paymentProfileNameId::content')]"),Payment_Document);
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at1:pifbtn1')]"));
	    
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PayingAnInvoiceDuringInvoiceInquiryITC.class);
			run();
		}
	}
}
