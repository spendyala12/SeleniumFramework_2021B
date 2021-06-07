package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreatingPersonNameFormatsITC extends BaseTest{

	public static String Search_Tasks_Name;    
	public static String Country;
	public static String FormatType;
	public static String First_Name;
	public static String Last_Name;       
	public static String Honors,MilitaryRank;
	
	private static void run() throws InterruptedException{

		clickElement(By.xpath("//*[contains(@id, '_UISmmLink::icon')]"));//navigator
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_tools_setup_and_maintenance')]"));//setup maintenance
		clickElement(By.xpath("//*[contains(@id, 'sdi10::icon')]"));//task
		clickElement(By.xpath("//*[contains(@id, 'i3:6:cl11')]"));//search link
		clickElement(By.xpath("//*[contains(@id, 'AP1:s9:it1::content')]"));//click search textbox
		setElementText(By.xpath("//*[contains(@id, 'AP1:s9:it1::content')]"), Search_Tasks_Name);
		clickElement(By.xpath("//*[contains(@id, 'ctb1::icon')]"));//search
		clickElement(By.linkText("Manage Person Name Formats"));//manage person name format link
		clickElement(By.xpath("//span[contains(text(),'Create')]"));//create btn

		clickElement(By.xpath("//*[contains(@id, 'territoryShortNameId::content')]"));//country 
		setElementText(By.xpath("//*[contains(@id, 'territoryShortNameId::content')]"), Country);
		browser.findElement(By.xpath("//*[contains(@id, 'territoryShortNameId::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'AP2:soc1::drop\')]"));//format type
		clickElement(By.xpath("//li[contains(text(),'"+FormatType+"')]"));
		browser.findElement(By.xpath("//*[contains(@id, 'AP2:soc1::drop\')]")).sendKeys(Keys.TAB);

		clickElement(By.xpath("//span[@class='xmo'][contains(text(),'First Name')]"));//select first name
		clickElement(By.xpath("//*[contains(@id, 'AP2:button4::icon')]"));    //move 		
		clickElement(By.xpath("//span[@class='xmo'][contains(text(),'Last Name')]"));//select last name
		clickElement(By.xpath("//*[contains(@id, 'AP2:button4::icon')]"));    //move
		clickElement(By.xpath("//span[@class='xmo'][contains(text(),'Honors')]"));//select honors
		clickElement(By.xpath("//*[contains(@id, 'AP2:button4::icon')]"));    //move
		clickElement(By.xpath("//span[@class='xmo'][contains(text(),'Military Rank')]"));//select military rank
		clickElement(By.xpath("//*[contains(@id, 'AP2:button4::icon')]"));    //move

		clickElement(By.xpath("//*[contains(@id, 'table2:0:text1::content')]"));
		setElementText(By.xpath("//*[contains(@id, 'table2:0:text1::content')]"), First_Name);
		clickElement(By.xpath("//*[contains(@id, 'table2:1:text1::content')]"));
		setElementText(By.xpath("//*[contains(@id, 'table2:1:text1::content')]"), Last_Name);
		clickElement(By.xpath("//*[contains(@id, 'table2:2:text1::content')]"));
		setElementText(By.xpath("//*[contains(@id, 'table2:2:text1::content')]"), Honors);
		clickElement(By.xpath("//*[contains(@id, 'table2:3:text1::content')]"));
		setElementText(By.xpath("//*[contains(@id, 'table2:3:text1::content')]"), MilitaryRank);		
		
		clickElement(By.xpath("//*[contains(@id, 'AP2:ctb1')]"));	//save
		clickElement(By.xpath(""));	//ok
		clickElement(By.xpath("//span[contains(text(),'ave and Close')]"));    //save and close
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:ctb2::popEl"));  //ok

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPersonNameFormatsITC.class);
			run();
		}

	}
}

