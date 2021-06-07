package cloud.components.AP.AP_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;

public class ModifyingInvoiceTaxDetailsITC extends BaseTest{
	
	public static String Purchase_Order;
	public static String Invoice_Group;
	public static String Number;
	public static String Amount;
	public static String Tax_Rate;
	
	private static void run() throws InterruptedException{
		
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Invoice"));
		
//		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
//		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_payables_payables_invoices')]"));
//		clickElement(By.xpath("//*[contains(@id,'_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon')]"));
//		clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl1')]"));
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:r2:0:ic1::lovIconId')]"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic1::_afrLovInternalQueryId:value00::content')]"),Purchase_Order);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic1::_afrLovInternalQueryId::search')]"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic1_afrLovInternalTableId::db']/table/tbody/tr[1]/td[1]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic1::lovDialogId::ok')]"));
		Thread.sleep(10000);
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"));
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),Number);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),Amount);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:cg1::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:cb17')]"));
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cmi1']/td[2]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:np1:cn8')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:np1:cn8')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:AT1:_ATp:cb37')]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:r19:0:AT1:_ATp:_vw']/div/table/tbody/tr/td[3]/div"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:r19:0:AT1:_ATp:_shwClmc13']/td/div"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:r19:0:AT1:_ATp:_vw']/div/table/tbody/tr/td[3]/div"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:r19:0:AT1:_ATp:_shwClmc13']/td/div"));
		clickElement(By.xpath("//*[contains(@id,'r1:0:ap1:AT1:r19:0:AT1:_ATp:create::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:inputText4::content')]"));
		setElementText(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:inputText4::content')]"),Tax_Rate);
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:taxRateNameId::lovIconId')]"));
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:taxRateNameId::dropdownPopup::popupsearch')]"));
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:taxRateNameId::_afrLovInternalQueryId::search')]"));
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:taxRateNameId::lovDialogId::cancel')]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:cb29']/a/span"));
		clickElement(By.cssSelector("td.xha"));
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:clearContentsEnaInEditId::icon')]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:cb29']/a/span"));
		clickElement(By.id("_FOd1::msgDlg::cancel"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:AT1:cb30']/a/span"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:ct5']/a/span"));
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm1']/td[2]"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ModifyingInvoiceTaxDetailsITC.class);
			run();
		}
	}

}
