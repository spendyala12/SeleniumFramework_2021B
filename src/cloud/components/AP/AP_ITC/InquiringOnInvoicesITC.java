package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class InquiringOnInvoicesITC extends BaseTest{
	
	public static String Invoice_Number;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		
		clickElement(By.linkText("Manage Invoices"));
		
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"),Invoice_Number);
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1::search')]"));
		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1::db\"]/table/tbody/tr[1]/td[1]")); //Row Header
		
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:at1:_ATp:ta1:0:cl1')]"));//Clicking invoice number
		
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:r7:1:sm1::disAcr')]"));//Line
		
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:r7:1:sm2::disAcr')]"));//Hold and Approvals
		
		Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:r7:1:sm3::disAcr')]"));//payment
		
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:r7:1:sm4::disAcr')]"));//Installments
		
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'r1:0:ap1:np1:0:cn1::disclosureAnchor')]"));//Search Results
		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1::db\"]/table/tbody/tr[2]/td[1]"));//Row Header
		clickElement(By.xpath("//*[contains(@id,'r1:0:ap1:at1:_ATp:ta1:1:cl1')]")); //Clicking invoice number, row 2
		
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:ctb2\"]/a")); //Done
		
		
		
			
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(InquiringOnInvoicesITC.class);
			run();
		}
	}

}
