package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreateACreditOrDebitMemoITC extends BaseTest {

	public static String Supplier;
	public static String Number;
	public static String Amount;
	public static String Type;
	public static String LineAmount;
	public static String NewAmount;


	private static void run() throws Exception{
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Invoice")); //create inv
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]"),Supplier);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::su0']"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),Number);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),Amount);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so1::content')]"),Type);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:sh2::_afrDscl')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon')]"));
		setElementText(By.xpath("//*[contains(@id,'ATp:ta2:5:i26::content')]"),LineAmount);
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//td[contains(text(),'Validate')]")); 
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),NewAmount);
		clickElement(By.linkText("Invoice Actions")); 
		clickElement(By.xpath("//td[contains(text(),'Validate')]")); 
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
			popluateParams(CreateACreditOrDebitMemoITC.class);
			run();
		}
	}
}