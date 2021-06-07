package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingASinglePaymentITC extends BaseTest{
	        
	public static String InvoiceNumber;
	public static String PaymentProcessProfile;
	public static String SupplierorParty;
	public static String DisbursementBankAccount;
	public static String Create_PaymentProcessProfile;
	public static String PaymentDocument;
	public static String ManagePayments_SupplierorParty;
	public static String PaymentNumber;
	public static String ManagePayments_DisbursementBankAccount;
	
	private static void run() throws Exception  {
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Invoices"));
		setElementText(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:q1:value10::content')]"),InvoiceNumber); //162034inv
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:q1::search')]"));
		clickElement(By.xpath("//td[@class='x12z']"));
		//clickElement(By.linkText("Actions"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:cb17')]")); //Pay in full btn
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:r6:1:paymentProfileNameId::content']"),PaymentProcessProfile); //ANSI X12 820
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:pifbtn1")); //submit
		clickElement(By.id("_FOd1::msgDlg::cancel")); //ok
		
		clickElement(By.linkText("Actions"));
		clickElement(By.xpath("body.x1mg.p_AFMaximized:nth-child(2) form.x1ma:nth-child(2) div.AFZOrderLayerContainer:nth-child(4) div.AFZOrderLayer:nth-child(2) div.AFPopupMenuPopup div.AFPopupMenuContent table.x1ox div.x1py table.x2rr tbody:nth-child(1) tr.xuj.x1p1:nth-child(13) > td.xnx"));
		clickElement(By.xpath("body.x1mg.p_AFMaximized:nth-child(2) form.x1ma:nth-child(2) div.AFZOrderLayerContainer:nth-child(4) div.AFZOrderLayer:nth-child(2) div.AFPopupMenuPopup div.AFPopupMenuContent table.x1ox div.x1py table.x2rr tbody:nth-child(1) tr.xuj.x1p1:nth-child(12) > td.xnx"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_UISmmLink::icon')]")); //navigation
		clickElement(By.xpath("//span[contains(text(),'Payments')]"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Payment"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:payeeNameId::content')]"),SupplierorParty);//ABC Consulting
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:bankAccountNameId::content')]"),DisbursementBankAccount); //BofA-2869
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:paymentProfileUICompId::content')]"),Create_PaymentProcessProfile); //External Check
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:PaymentDocumentIdUi::content')]"),PaymentDocument); 
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:commandToolbarButton1::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:cb5')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_UISmmLink::icon')]"));
		clickElement(By.xpath("//span[contains(text(),'Payments')]"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Payments"));
		setElementText(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:2:AP1:q1:value00::content')]"),ManagePayments_SupplierorParty); //ABC Consulting
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1"));  
		clickElement(By.xpath("//tr[@class='xep p_AFSelected']//td//td[2]")); 
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:ATm"));
		clickElement(By.id("//td[contains(text(),'Account in Draft')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:cb1')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:dialo::ok')]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:ATm"));
		clickElement(By.id("//td[contains(text(),'Post to Ledger')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:cb1')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:dialo::ok')]"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingASinglePaymentITC.class);
			run();
		}
	}

}
