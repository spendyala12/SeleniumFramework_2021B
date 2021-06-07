package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class PlacingAManualHoldOnAnInvoiceITC extends BaseTest{

	public static String Supplier;
	public static String Invoice_Group;
	public static String InvoiceNumber;
	public static String Amount;
	public static String Number;
	public static String Amount2;

	private static void run(){

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Invoice"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]"),Supplier);    	
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::su0')]"));
//		clickElement(By.cssSelector("td.x18y"));
//		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[5]')]"));		
//		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::lovDialogId::ok"));
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),Invoice_Group);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),InvoiceNumber);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),Amount);    
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:i26::content"));
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:i26::content"),Number);    
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:i26::content"),Amount2);    
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm4']/td[2]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r6:1:at1:_ATp:create::icon"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r6:1:at1:_ATp:ta1:0:so1::content"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r6:1:at1:_ATp:ta1:0:so1::content"));
		clickElement(By.cssSelector("option[title=\"Invalid PO\"]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:cb9"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:ct5']/a/span"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PlacingAManualHoldOnAnInvoiceITC.class);
			run();
		}
	}

}
