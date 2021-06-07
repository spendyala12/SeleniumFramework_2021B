package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreateAnAssetInvoiceITC extends BaseTest {
	public static String Supplier;
	public static String Number;
	public static String Amount;
	public static String LinesAmount;
	public static String DistributionCombination;
	public static String Book;
	public static String AssetCategory;
	
	private static void run() throws Exception{

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Invoice"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]"),Supplier);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::su0']"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"),Number);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"),Amount);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:sh2::_afrDscl')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon')]"));
		setElementText(By.xpath("//*[contains(@id,'ATp:ta2:5:i26::content')]"),LinesAmount);
		browser.findElement(By.xpath("//*[contains(@id,'ATp:ta2:5:i26::content')]")).sendKeys(Keys.TAB);
		browser.findElement(By.xpath("//*[contains(@id,'ap1:at2:_ATp:ta2:0:so13::content')]")).sendKeys(Keys.TAB);
		browser.findElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1CS::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:pm1:r1:0:ap1:at2:_ATp:ta2:0:kf1CS::content')]"),DistributionCombination);
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'ATp:ta2:0:so16::content')]")));
		dropdown.selectByIndex(2);
		setElementText(By.xpath("//*[contains(@id,'ATp:ta2:0:kf3CS::content')]"),AssetCategory); //Asset Category
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
		
}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreateAnAssetInvoiceITC.class);
			run();
		}
	}
}