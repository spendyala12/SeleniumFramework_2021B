package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageInvoiceHoldsITC extends BaseTest{

	public static String InvoiceNumber;
	public static String Keywords;

	private static void run() throws Exception  {
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Invoices"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:q1:value10::content')]"),InvoiceNumber); 
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:q1::search')]")); 
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1::db']/table/tbody/tr[1]/td[1]")); 
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ct1::icon')]")); //edit
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:sh2::_afrDscl')]"));
		clickElement(By.linkText("Invoice Actions")); 
		clickElement(By.xpath("//td[contains(text(),'Manage Holds')]"));//manage holds
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:pm1:r1:0:ap1:cb9')]")); //save and continue
		clickElement(By.linkText("Invoice Actions")); 
		clickElement(By.xpath("//td[contains(text(),'Validate')]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:me1']"));
		clickElement(By.xpath("//td[contains(text(),'Manage Holds')]"));
		clickElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:r6:1:at1:_ATp:create::icon']"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:r6:1:at1:_ATp:ct2']"));
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:cb9']"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:cb14']//a[@class='xx3']")); //save and continue
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']"));
		clickElement(By.xpath("//span[contains(text(),'Suppliers')]"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Suppliers")); //manage supplier
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:q1:value00::content')]"),Keywords); //keywords
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:AT1:_ATp:Table:0:cl1')]"));
		clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:ap1:sitesTab::disAcr']"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:cb14']//a[@class='xx3']")); //save and continue


	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageInvoiceHoldsITC.class);
			run();
		}
	}
}