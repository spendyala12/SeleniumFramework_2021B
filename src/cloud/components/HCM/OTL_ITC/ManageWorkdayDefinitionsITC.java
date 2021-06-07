package cloud.components.HCM.OTL_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageWorkdayDefinitionsITC extends BaseTest{

	public static String Role;
	public static String Name;
	public static String SpanningDaysRule;
	public static String Time;
	
private static void run() throws InterruptedException	
	
	{
	clickElement(By.id("pt1:_UIScmil2u::icon")); //user account//*[contains(@id, 'UIScmil2u::icon')]
	
	clickElement(By.linkText("Setup and Maintenance")); //set up and maintenance
	
	clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //task
	
	clickElement(By.linkText("Search")); //search			
	
	clickElement(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']")); //
			
	setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']"), Role); //define time and labor
			
	clickElement(By.xpath("//div[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']//a[@class='xx3']")); //search
		
	clickElement(By.linkText("Define Time and Labor")); //define time and labor link
				
	clickElement(By.linkText("Manage Work Day Definitions")); //Manage workday definitions link		
	
	clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:create::icon")); //create
		
	clickElement(By.xpath("//*[contains(@id, 'it2::content')]")); //name
	
	setElementText(By.xpath("//*[contains(@id, 'it2::content')]"), Name);
	
	clickElement(By.xpath("//*[contains(@id, 'soc22::content')]")); //spanning days rule
	
	clickElement(By.xpath("//li[contains(text(),'"+SpanningDaysRule+"')]")); //
	
	clickElement(By.xpath("//*[contains(@id, 'id1::content')]")); //day start time
	
	setElementText(By.xpath("//*[contains(@id, 'id1::content')]"), Time);
	
	clickElement(By.xpath("//label[contains(text(),'Current Day')]")); //current day
		
	clickElement(By.xpath("//span[contains(text(),'ave and Close')]")); //save and close
	
	clickElement(By.xpath("//*[contains(@id, 'SP2:cb1')]")); //ok	
	
}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageWorkdayDefinitionsITC.class);
			run();
		}
	
	}
}
