package cloud.components.HCM.OTL_ITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class ManageTimeRepositoryRuleITC extends BaseTest{

	public static String Role;
	public static String Name;
	public static String TemplateType;
	public static String RuleTemplateName;
	public static String MaxHours;
	public static String TimeCategory;
	public static String Output;
	
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
					
		clickElement(By.linkText("Manage Time Repository Rules")); //Manage Time Repository Rules link			
		
		clickElement(By.xpath("//img[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:create::icon']")); //create
		
		clickElement(By.xpath("//*[contains(@id, 'it1::content')]")); //name
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), Name);
		
		browser.findElement(By.xpath("//*[contains(@id, 'it1::content')]")).sendKeys(Keys.TAB);
			
		clickElement(By.xpath("//*[contains(@id, 'soc1::content')]")); //Template type
		
		clickElement(By.xpath("//ul[contains(@id,'soc1::pop')]/li[contains(text(), 'Time entry rule')]"));		
		
		clickElement(By.xpath("//*[contains(@id, 'templateNameId::content')]")); //Rule template name
		
		setElementText(By.xpath("//*[contains(@id, 'templateNameId::content')]"), RuleTemplateName); 
			
		clickElement(By.xpath("//button[@accesskey='u']")); //Continue
		
		clickElement(By.xpath("//*[contains(@id, '0:it10::content')]")); //maximum hours
		
		setElementText(By.xpath("//*[contains(@id, '0:it10::content')]"), MaxHours); 
		
		clickElement(By.xpath("//*[contains(@id, 't2:2:cbCcatNm1::content')]")); //time category
		
		setElementText(By.xpath("//*[contains(@id, 't2:2:cbCcatNm1::content')]"), TimeCategory); //
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:t3:0:soc1::content')]")); //output
		
		setElementText(By.xpath("//*[contains(@id, 'AP1:t3:0:soc1::content')]"), Output); 
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:cbsvcl')]")); //save and close
		
		clickElement(By.xpath("//button[@accesskey='K']")); //ok
		
}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeRepositoryRuleITC.class);
		run();
	}
}
}