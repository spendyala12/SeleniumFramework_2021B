package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CalculatingAndViewingRecoverableTaxesITC extends BaseTest{
	public static String Supplier;
	public static String InvoiceGroup;
	public static String InvoiceNumber;
	public static String Amount;
	public static String LinesAmount;

	private static void run() throws Exception  {

		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_payables_payables_invoices"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl1"));

		Thread.sleep(10000);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content"),Supplier);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i1::content"));
		
        Thread.sleep(20000);
        
       	setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i1::content"),InvoiceGroup);

		Thread.sleep(10000);
		
		if (browser.findElement(By.id("_FOd1::msgDlg::_ttxt")).isDisplayed())
		{
			browser.findElement(By.id("_FOd1::msgDlg::cancel")).click();
		}
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content"),InvoiceNumber);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content"),Amount);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i4::content"),"test invoice creation");

		Thread.sleep(5000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon"));

		Thread.sleep(10000);
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:i26::content"));

		clickElement(By.cssSelector("td.xx2"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:i26::content"),LinesAmount);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:so13::content"));

		Thread.sleep(10000);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:10:so13::content"),"Advertising (Full)");

		clickElement(By.linkText("Invoice Actions"));
		
		Thread.sleep(10000);

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cmi1']/td[2]"));

		Thread.sleep(10000);
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ctb3']/a/span"));

		Thread.sleep(10000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb11"));
		
		Thread.sleep(10000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:_ATp:cb37"));
		
		Thread.sleep(10000);
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:cb29']/a/span"));

		Thread.sleep(10000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb14"));
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CalculatingAndViewingRecoverableTaxesITC.class);
			run();
		}
	}

}
