package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManageInvoicesAdjustandCancelITC extends BaseTest {
	
	public static String InvoiceNumber;
	 
	private static void run() throws Exception{

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Invoices"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"),InvoiceNumber); 
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:q1::search')]")); 
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1::db']/table/tbody/tr[1]/td[1]")); 
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ct1::icon')]")); //edit
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:sh2::_afrDscl')]")); 
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:at2:_ATp:ctb3')]")); 
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:1:ap1:cb11')]")); // save and continue
		clickElement(By.linkText("Invoice Actions")); 
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:cm14']/td[2]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:cb40')]")); 
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:cb14')]")); 

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageInvoicesAdjustandCancelITC.class);
			run();
		}
	}

}
