package cloud.components.AP.AP_ITC;

import itc.framework.BaseTest;
import org.openqa.selenium.By;

public class CreateInvoiceITC extends BaseTest{
	public static String Supplier;
	public static String Number;
	public static String Amount;
	public static String Type;
	public static String LineAmount;
	public static String DistributionSet;
	public static String NewAmount;

	private static void run() throws Exception  {

		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Invoice")); //create inv
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]"),Supplier);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::su0']"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),Number);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),Amount);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:sh2::_afrDscl')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon')]"));
		setElementText(By.xpath("//*[contains(@id,'ATp:ta2:5:i26::content')]"),LineAmount);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:5:so13::lovIconId')]"),DistributionSet);
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//td[contains(text(),'Validate')]")); 
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),NewAmount);
		clickElement(By.linkText("Invoice Actions")); 
		clickElement(By.xpath("//td[contains(text(),'Validate')]")); 
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:sdh1::_afrDscl')]")); //tax dropdown
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.xpath("//td[contains(text(),'Manage Holds')]"));
		clickElement(By.xpath("//tr[@class='p_AFSelected p_AFFocused xep']//td[1]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r6:1:at1:_ATp:ct2']//a[@class='xx3']")); //release holds
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r6:1:at1:_ATp:ct2']//a[@class='xx3']"));
		
		clickElement(By.linkText("Invoice Actions")); 
		clickElement(By.xpath("//td[contains(text(),'Account in Draft')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb42')]")); //view accounting
		clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb99')]")); //done
		clickElement(By.linkText("Invoice Actions"));  //invoice action
		clickElement(By.xpath("//td[contains(text(),'Post to Ledger')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb42')]")); //view accounting
		clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb99')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:cb14')]")); //save and continue
	
	}


	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreateInvoiceITC.class);
			run();
		}
	}

}