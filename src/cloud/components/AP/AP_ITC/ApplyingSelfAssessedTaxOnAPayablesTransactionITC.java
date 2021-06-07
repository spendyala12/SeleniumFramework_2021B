package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ApplyingSelfAssessedTaxOnAPayablesTransactionITC extends BaseTest{
	
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


		Thread.sleep(10000);
		
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

		Thread.sleep(10000);
		
		clickElement(By.linkText("Invoice Actions"));
		
		Thread.sleep(10000);

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm2']/td[2]"));


		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r12:1:at1:_ATp:ta1::db']/table/tbody/tr/td"));

		Thread.sleep(10000);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r12:1:at1:_ATp:ta1:0:id1::content"),"11/28/17");

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r12:1:at1:_ATp:cb1"));
		
		Thread.sleep(5000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb19"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:sh1::_afrStr"));
		
		Thread.sleep(5000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:11:so12::content"));

		clickElement(By.linkText("Invoice Actions"));
		
		Thread.sleep(10000);

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm1']/td[2]"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb14']/a/span"));


	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApplyingSelfAssessedTaxOnAPayablesTransactionITC.class);
			run();
		}
	}

}
