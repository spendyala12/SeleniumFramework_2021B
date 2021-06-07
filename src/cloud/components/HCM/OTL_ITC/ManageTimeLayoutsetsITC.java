package cloud.components.HCM.OTL_ITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class ManageTimeLayoutsetsITC extends BaseTest{

	public static String Role;
	public static String Name;
	public static String Name1;
	public static String Name2,TimeEntryFormat,DecimalPlaces,BlankRows;
	
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
					
		clickElement(By.linkText("Manage Time Layout Sets")); //manage time layout sets link			
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:AT1:_ATp:create::icon')]")); //create
		
		clickElement(By.xpath("//span[contains(text(),'Generate Layout Set')]")); //generate layout set btn		
		
		clickElement(By.xpath("//*[contains(@id, 'it2::content')]")); 
		
		setElementText(By.xpath("//*[contains(@id, 'it2::content')]"), Name);
		//span[contains(text(),'Time Entry Layout')]
		clickElement(By.xpath("//*[contains(@id, '0:cl1::icon')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'AT2:_ATp:cb3')]")); //edit layout btn		
		
		clickElement(By.xpath("//*[contains(@id, '0:nameId::content')]")); 
		
		setElementText(By.xpath("//*[contains(@id, '0:nameId::content')]"), Name1);
		
		browser.findElement(By.xpath("//*[contains(@id, '0:nameId::content')]")).sendKeys(Keys.TAB);
		
		clickElement(By.xpath("//*[contains(@id, '1:nameId::content')]")); 
		
		setElementText(By.xpath("//*[contains(@id, '1:nameId::content')]"), Name2);
				
		clickElement(By.xpath("//*[contains(@id, 'sor2::content')]")); //time entry format
		
		clickElement(By.xpath("//li[contains(text(),'"+TimeEntryFormat+"')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'soc2::content')]")); //decimal places
		
		clickElement(By.xpath("//li[contains(text(),'"+DecimalPlaces+"')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'it1::content')]")); //blank rows
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), BlankRows);		
		
		clickElement(By.xpath("//button[@title='&Save and Close']")); //save and close
		
		clickElement(By.xpath("//*[contains(@id, 'AT2:cb1')]")); //yes
		
		clickElement(By.xpath("//*[contains(@id, 'copyWarning1::ok')]")); //ok		
		
}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeLayoutsetsITC.class);
		run();
	}
}
}