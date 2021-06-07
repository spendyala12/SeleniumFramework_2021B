package cloud.components.HCM.OTL_ITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class ManageTimeEntryLayoutComponentITC extends BaseTest{

	public static String Role;
	public static String LayoutComponent;
	public static String Name;
	public static String TimeAttribute;
	public static String FilteredDataSource;
	public static String UnfilteredDataSource;
	public static String DisplayName;
	public static String DisplayType;
	public static String FilterVariable1;
	public static String InputAttribute1;
	public static String FilterVariable2;
	public static String InputAttribute2;
	
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
					
		clickElement(By.linkText("Manage Time Entry Layout Components")); //Manage Time Entry Layout Components link			
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:AT1:_ATp:create::icon')]")); //create
				
		clickElement(By.xpath("//label[contains(text(),'"+LayoutComponent+"')]")); 
		
		clickElement(By.xpath("//button[@accesskey='K']")); //ok
		
		clickElement(By.xpath("//*[contains(@id, 'it1::content')]")); //name
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"),Name); 
		
		clickElement(By.xpath("//*[contains(@id, 'attributeFieldNameId::content')]")); //time attribute
		
		setElementText(By.xpath("//*[contains(@id, 'attributeFieldNameId::content')]"),TimeAttribute); 
		
		clickElement(By.xpath("//*[contains(@id, 'userDataSourceId::content')]")); //filtered data source
		
		setElementText(By.xpath("//*[contains(@id, 'userDataSourceId::content')]"),FilteredDataSource); 
		
		clickElement(By.xpath("//*[contains(@id, 'adminDataSourceId::content')]")); //unfiltered data source
		
		setElementText(By.xpath("//*[contains(@id, 'adminDataSourceId::content')]"),UnfilteredDataSource); //
		
		browser.findElement(By.xpath("//*[contains(@id, 'adminDataSourceId::content')]")).sendKeys(Keys.TAB);
		
		clickElement(By.xpath("//button[@title='Configure filters that show only valid time card field values for the worker']")); //add filters
		
		clickElement(By.xpath("//*[contains(@id, 'soc7::content')]")); //filter variable
		
		clickElement(By.xpath("//ul[contains(@id,'soc7::pop')]//li[contains(text(), '"+FilterVariable1+"')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'attributeFieldNameForDep1Id::content')]")); //input attribute
		
		setElementText(By.xpath("//*[contains(@id, 'attributeFieldNameForDep1Id::content')]"),InputAttribute1); 
		
		clickElement(By.xpath("//*[contains(@id, 'soc1::content')]")); //filter variable
		
		clickElement(By.xpath("//ul[contains(@id,'soc1::pop')]//li[contains(text(), '"+FilterVariable2+"')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'attributeFieldNameForDep2Id::content')]")); //input attribute
		
		setElementText(By.xpath("//*[contains(@id, 'attributeFieldNameForDep2Id::content')]"),InputAttribute2); 
		
		browser.findElement(By.xpath("//*[contains(@id, 'attributeFieldNameForDep2Id::content')]")).sendKeys(Keys.TAB);
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:okbtn1')]")); //ok		
		
		clickElement(By.xpath("//*[contains(@id, 'soc2::content')]")); //display type
		
		clickElement(By.xpath("//li[contains(text(),'"+DisplayType+"')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'it3::content')]")); //display name
		
		setElementText(By.xpath("//*[contains(@id, 'it3::content')]"),DisplayName); 		
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:APnxb')]")); //next
		
		clickElement(By.xpath("//*[contains(@id, 'AP2:APnxb')]")); //next
		
		clickElement(By.xpath("//span[contains(text(),'ave and Close')]")); //save and close
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:3:AP3:cb3")); //ok		
		
	}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeEntryLayoutComponentITC.class);
		run();
	}
}
}