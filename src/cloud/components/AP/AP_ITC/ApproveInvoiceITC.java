package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ApproveInvoiceITC extends BaseTest{

	public static String Business_Unit;
	public static String Number;
	public static String Amount;
	public static String Item;
	public static String LineAmount;

	private static void run() throws Exception  {
		
		clickElement(By.xpath("//img[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsdiPrcPozSuppliersDashboard__FndTasksList::icon']"));
		clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1']")); //create inv
		setElementText(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic2']//td[@class='xz0']"),Business_Unit);
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:ic3']//td[@class='xz0']")); //supplier
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content']"),Number);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content']"),Amount);
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so1::content"]/option[3]
		clickElement(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:so1::content']")); //Type
		clickElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:create::icon']")); //add row
		setElementText(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:so12::content']"),Item);  
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:ta2:0:i26::content']"),LineAmount);
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:mb1::oc']//table[@class='x2rq']")); //action drop down
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:ct5']//a[@class='xx3']"));
		clickElement(By.xpath("//td[contains(text(),'Validate')]"));	
		
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']"));	
		

	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApproveInvoiceITC.class);
			run();
		}
	}
}