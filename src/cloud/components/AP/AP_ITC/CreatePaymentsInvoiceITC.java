package cloud.components.AP.AP_ITC;
import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatePaymentsInvoiceITC extends BaseTest {

		
		public static String Supplier;
		public static String Number;
		public static String Amount;
		public static String Type;
		public static String LinesAmount;
		public static String NewAmount;
		public static String BankAccount;
		public static String PaymentProcessProfile;
		public static String PaymentDocument;
		public static String InvoiceNumber;

		private static void run() throws Exception  {

			clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
			clickElement(By.linkText("Create Invoice")); //create inv
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]"),Supplier);
			clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::su0']"));
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),Number);
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),Amount);
			setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so1::content')]"),Type);
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cl1')]")); //show more
			clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:sh2::_afrDscl')]"));
			clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon')]"));
			setElementText(By.xpath("//*[contains(@id,'ATp:ta2:5:i26::content')]"),LinesAmount);
			clickElement(By.linkText("Invoice Actions")); //invoice action
			clickElement(By.xpath("//td[contains(text(),'Validate')]")); //validate
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),NewAmount);
			clickElement(By.linkText("Invoice Actions")); //invoice action
			clickElement(By.xpath("//td[contains(text(),'Validate')]")); //validate
			clickElement(By.linkText("Invoice Actions")); //invoice action
			clickElement(By.xpath("//td[contains(text(),'Account in Draft')]"));
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb42')]")); //view accounting
			clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb99')]")); //done
			clickElement(By.linkText("Invoice Actions"));  //invoice action
			clickElement(By.xpath("//td[contains(text(),'Post to Ledger')]"));
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb42')]")); //view accounting
			clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb99')]"));
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb14')]")); //save and continue
			clickElement(By.linkText("Invoice Actions")); //invoice action
			clickElement(By.xpath("//td[contains(text(),'Pay in Full')]"));	
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r9:1:bankAccountNamePIFId::content')]"),BankAccount);//BofA-2869
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r9:1:paymentProfileNameId::content')]"),PaymentProcessProfile);// ANSI X12 820
			setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r9:1:paymentDocumentNameId::content')]"),PaymentDocument);
			clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:pifbtn1')]")); //submit
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb14')]"));
			clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']")); //navigator
			clickElement(By.xpath("//span[contains(text(),'Invoices')]"));
			clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
			clickElement(By.linkText("Manage Invoices")); //manage inv
			setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"),InvoiceNumber);
			clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:q1::search')]"));
			clickElement(By.linkText("Actions")); //acions
			clickElement(By.xpath("//td[contains(text(),'Apply or Unapply Prepayments')]"));
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:ctb2')]"));//done
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:cb6')]")); //validate
			clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:pm1:r1:0:ap1:at1:_ATp:ctb4']")); //post
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:cmi9')]")); //post to ledger
			clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb42']"));
			clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb99']"));//done
			clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:cmi11')]")); //account in draft
			clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb42']"));
			clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb99']"));  //done
	
			clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:pm1:r1:0:ap1:ctb2']"));//done
			
		
		}

		public static void run(int iterations) throws Exception{
			initComponent();
			for(int i=0;i<iterations;i++)
			{
				iteration=i;
				popluateParams(CreatePaymentsInvoiceITC.class);
				run();
			}
		}

	}
