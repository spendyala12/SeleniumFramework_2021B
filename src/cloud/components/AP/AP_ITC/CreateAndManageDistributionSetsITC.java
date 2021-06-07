package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreateAndManageDistributionSetsITC extends BaseTest {

	public static String Name;
	public static String Supplier;
	public static String InvoiceNumber;
	public static String InvoiceGroup;
	public static String Amount;
	public static String LinesAmount;

	private static void run() throws Exception  {

		//clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.xpath("//a[@id='pt1:_UIScil1u']"));
		clickElement(By.xpath("//span[contains(text(),'Setup and Maintenance')]"));
		clickElement(By.xpath("//img[@id='pt1:r1:0:r0:0:r1:0:sdi10::icon']"));
		clickElement(By.xpath("//a[@id='pt1:r1:0:r0:0:r1:0:r10:0:i3:0:cl11']"));
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:resultAppPanel:q1:value00::content']"),Name);
		clickElement(By.xpath("//button[@id='pt1:r1:0:r0:1:resultAppPanel:q1::search']"));
		clickElement(By.xpath("//a[@id='pt1:r1:0:r0:1:resultAppPanel:implementationProjectAppTable1:_ATp:t1:31:ot1']"));
		
		
		clickElement(By.xpath("//a[@id='pt1:r1:0:r0:2:topAppPanel:applicationsTable1:_ATTp:table1:0::di']")); //"Financials");
		clickElement(By.xpath("//button[contains(text(),'Search')]"));
		clickElement(By.xpath("//div[@class='xkh xtn xkh']//table[1]//tbody[1]//tr[1]//td[2]//div[1]//table[1]//tbody[1]//tr[1]//td[1]//div[1]"));
		clickElement(By.xpath("//table[2]//tbody[1]//tr[3]//td[2]//div[1]//table[1]//tbody[1]//tr[1]//td[1]//div[1]"));  // click on Define Invoicing and Payments Configuration
		clickElement(By.xpath("//tr[@class='xep p_AFSelected']//td//div//table//tbody//tr//div[@class='x1gh']"));
		clickElement(By.xpath("//tr[8]//td[2]//div[1]//table[1]//tbody[1]//tr[1]//td[1]//div[1]")); //Define Invoicing and Payments Configuration 
		clickElement(By.xpath("//table[5]//tbody[1]//tr[5]//td[2]//div[1]//table[1]//tbody[1]//tr[1]//td[1]//div[1]")); //manage distribution sets
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApplyingAPrepaymentITC.class);
			run();
		}
	}

}
