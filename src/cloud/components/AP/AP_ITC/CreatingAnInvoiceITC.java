package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingAnInvoiceITC extends BaseTest{
	
	public static String PO_Num;
	public static String Invoice_Num;
	public static String Amount;
	public static String Line_Amount;
	public static String Distribution_Set;
	public static String Invoice_Out;
	public static String Tax;
	public static String Validate_Status;
	public static String Final_Invoice_Amount;
	

	private static void run() throws Exception{
		
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
	   
	    clickElement(By.id("pt1:nv_itemNode_payables_payables_invoices"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic1::content"));
	    
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic1::content"), PO_Num);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content"), Invoice_Num );
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content"));
	   
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content"), Amount );
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:i26::content"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:i26::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:i26::content"), Line_Amount );
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so13::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so13::content"), Distribution_Set );
	    
	    clickElement(By.linkText("Invoice Actions"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm1']/td[2]"));
	    
	    Thread.sleep(10000);
	    
	    captureOutput(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content"), Invoice_Out);
	    captureOutput(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r3:1:ta1:0:p1"), Validate_Status);
	    captureOutput(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:p108"), Tax);
	    
	    Thread.sleep(5000);
	    
	    if (Validate_Status == ("Needs revalidation")) {
	    	
	    	Final_Invoice_Amount = Tax + Invoice_Num;
	    			
		} 
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content"), Final_Invoice_Amount);
	    
	    clickElement(By.linkText("Invoice Actions"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm1']/td[2]"));
	    
	    Thread.sleep(10000);
	        
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:ct5']/a/span"));
	    
		
	    
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAnInvoiceITC.class);
			run();
		}
	}

}
