package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingAnInvoiceFromAScannedImageITC extends BaseTest{

	public static String Scanned_Invoice;
	public static String Invoice_Group;
	public static String Description;
	public static String PO_Num;

	public static void run() throws Exception{
		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_payables_payables_invoices"));

		clickElement(By.xpath("//table[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsr1:0:pm1:r1:0:r1:0:ITPdc2:ITPsh0:0:pt1:i1:2:fca2:dc_pgl1']/tbody/tr/td/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsr1:0:pm1:r1:0:r1:0:ITPdtl:0:AT2:_ATp:_qbeTbr::icon"));

		clickElement(By.id("_afrFilter_FOpt1_afr__FOr1_afr_0_afr__FOSritemNode_payables_payables_invoices_afr_0_afr__FOTsr1_afr_0_afr_pm1_afr_r1_afr_0_afr_r1_afr_0_afr_ITPdtl_afr_0_afr_AT2_afr__ATp_afr_ATt2_afr_c34::content"));
		
		setElementText(By.id("_afrFilter_FOpt1_afr__FOr1_afr_0_afr__FOSritemNode_payables_payables_invoices_afr_0_afr__FOTsr1_afr_0_afr_pm1_afr_r1_afr_0_afr_r1_afr_0_afr_ITPdtl_afr_0_afr_AT2_afr__ATp_afr_ATt2_afr_c34::content"), Scanned_Invoice);
		
		Thread.sleep(3000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsr1:0:pm1:r1:0:r1:0:ITPdtl:0:AT2:_ATp:ATt2:6:cl2"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i1::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i1::content"), Invoice_Group);

		clickElement(By.id("_FOd1::msgDlg::cancel"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i4::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i4::content"), Description);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cg1::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:q1::_afrDscl"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:q1:criterion1']/td"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:q1::search"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:q1:value10::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:q1:value10::content"), PO_Num);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:q1::search"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r11:1:at1:_ATp:ta1:0:sb1::content"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb2"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb17"));

		clickElement(By.linkText("Invoice Actions"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cmi1']/td[2]"));

		clickElement(By.linkText("Invoice Actions"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cm1']/td[2]"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:cb14']/a/span"));
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAnInvoiceFromAScannedImageITC.class);
			run();
		}
	}

}

