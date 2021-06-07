package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingCalendarEventsITC extends BaseTest{
	
	public static String Responsibility;
	public static String Event_Name;
	public static String ShortCode;
	public static String StartDate;
	public static String EndDate;
	
	
	private static void run() throws InterruptedException 
	
	
	
	{
		
		//clickElement(By.id("pt1:_UISmmLink::icon")); //navigator
		//Thread.sleep(5000);
		//clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance")); //SetupandMaintenance
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop")); //setup
		Thread.sleep(5000);
		clickElement(By.xpath("//li[contains(text(),'Workforce Deployment')]")); //workforceDeployment
		Thread.sleep(5000);
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"), Responsibility); //taskname
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3']/a")); //search
		Thread.sleep(5000);
		clickElement(By.linkText("Manage Calendar Events")); //ManagecalendarEvents
		Thread.sleep(8000);
		clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:appspanel1:AT1:_ATp:commandToolbarButton11']")); //create
		Thread.sleep(5000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText1::content"), Event_Name); //Name
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:selectOneChoice1::content"));
		//new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:selectOneChoice1::content"))).selectByVisibleText("Public holiday");
		Thread.sleep(5000);
	    clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:selectOneChoice1::pop']/li[3]")); //public holiday
	    Thread.sleep(5000);
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate1::content"), StartDate); //StartDate
	    Thread.sleep(5000);
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate2::content"), EndDate); //Enddate
	    Thread.sleep(5000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText2::content"), ShortCode); //shortcode
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice1::content")); //hirerarchytype
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice1::pop']/li[3]"));
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice2::content"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice2::pop']/li[3]"));
	    Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:pc1:Tbut4']/a/span")); //Include
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:Tbut2']/a")); //Submit
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:confirmD::ok")); //ok
		


		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance']")); //SetupandMaintenance
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop']")); //setup
		
		clickElement(By.id("//li[contains(text(),'Workforce Deployment')]")); //workforceDeployment
		
		setElementText(By.id("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"), Responsibility); //taskname
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3']//a[@class='xx3']")); //search
		
		clickElement(By.linkText("Manage Calendar Events")); //ManagecalendarEvents
		
		clickElement(By.id("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:appspanel1:AT1:_ATp:commandToolbarButton11']")); //create
		 
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText1::content']"), Event_Name); //Name
		
		new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:selectOneChoice1::content']"))).selectByVisibleText("Public holiday");
	    
	    clickElement(By.cssSelector("option[title=\"Public holiday\"]")); 
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate1::content']"), StartDate); //StartDate
		
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate2::content']"), EndDate); //Enddate
		
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText2::content']"), ShortCode); //shortcode
		
		new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice1::content']"))).selectByVisibleText("Geographic"); //Hierarchy Type
	    
	    clickElement(By.cssSelector("option[title=\"Geographic\"]"));
	    
	    
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice2::content']"))).selectByVisibleText("ITC Global HCM Tree"); //Hierarchy
	    
	    clickElement(By.cssSelector("option[title=\"ITC Global HCM Tree\"]"));
		
		clickElement(By.id("//span[contains(text(),'Include')]")); //Include
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:Tbut2']//a[@class='xx3']")); //Submit
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:confirmD::ok']")); //ok
		

		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance']")); //SetupandMaintenance
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop']")); //setup
		
		clickElement(By.id("//li[contains(text(),'Workforce Deployment')]")); //workforceDeployment
		
		setElementText(By.id("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"), Responsibility); //taskname
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3']//a[@class='xx3']")); //search
		
		clickElement(By.linkText("Manage Calendar Events")); //ManagecalendarEvents
		
		clickElement(By.id("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:appspanel1:AT1:_ATp:commandToolbarButton11']")); //create
		 
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText1::content']"), Event_Name); //Name
		
		new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:selectOneChoice1::content']"))).selectByVisibleText("Public holiday");
	    
	    clickElement(By.cssSelector("option[title=\"Public holiday\"]")); 
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate1::content']"), StartDate); //StartDate
		
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate2::content']"), EndDate); //Enddate
		
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText2::content']"), ShortCode); //shortcode
		
		new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice1::content']"))).selectByVisibleText("Geographic"); //Hierarchy Type
	    
	    clickElement(By.cssSelector("option[title=\"Geographic\"]"));
	    
	    
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice2::content']"))).selectByVisibleText("ITC Global HCM Tree"); //Hierarchy
	    
	    clickElement(By.cssSelector("option[title=\"ITC Global HCM Tree\"]"));
		
		clickElement(By.id("//span[contains(text(),'Include')]")); //Include
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:Tbut2']//a[@class='xx3']")); //Submit
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:confirmD::ok']")); //ok
		

	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingCalendarEventsITC.class);
			run();
		}
	}

}
