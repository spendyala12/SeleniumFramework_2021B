package cloud.components.HCM.OTL_ITC;
import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageTimeBalanceDimensionsITC extends BaseTest{

	public static String Role;
	public static String name;
	public static String DimensionLevel;
	public static String PeriodType;
	
private static void run() throws InterruptedException	
	
	{
	clickElement(By.xpath("//*[contains(@id, 'UIScmil2u::icon')]")); //user account
	
	clickElement(By.linkText("Setup and Maintenance")); //set up and maintenance
	
	clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //task
	
	clickElement(By.linkText("Search")); //search			
	
	clickElement(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']")); 
			
	setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']"), Role); //define time and labor
			
	clickElement(By.xpath("//div[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']//a[@class='xx3']")); //search
		
	clickElement(By.linkText("Define Time and Labor")); //define time and labor link
				
	//clickElement(By.linkText("Manage Time Balance Dimensions")); //Manage Time Balance Dimensions link
	clickElement(By.xpath("//*[@id='pt1:r1:0:r0:2:AP1:t1:19:cl4']")); 			
	
	clickElement(By.xpath("//*[contains(@id, '_ATp:create::icon')]")); //create
			
	clickElement(By.xpath("//*[contains(@id, 'it2::content')]")); //name
		
	setElementText(By.xpath("//*[contains(@id, 'it2::content')]"), name); //work Hours person_ITC		
		
	clickElement(By.xpath("//label[contains(text(),'"+DimensionLevel+"')]")); //dimension level
	
	clickElement(By.xpath("//label[contains(text(),'"+PeriodType+"')]")); //period type	
	
	clickElement(By.xpath("//span[contains(text(),'ave and Close')]")); //save and close
	
	clickElement(By.xpath("//span[contains(text(),'OK')]")); //ok
	
}

public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeBalanceDimensionsITC.class);
		run();
	}
}
}