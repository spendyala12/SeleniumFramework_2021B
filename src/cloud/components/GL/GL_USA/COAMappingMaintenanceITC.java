package cloud.components.GL.GL_USA;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;
//import itc.framework.Browser;
public class COAMappingMaintenanceITC extends BaseTest{

	public static String Search;
	public static String MappingMethod;
	public static String TargetValue;
	public static String FromValue;
//	public static String SoureSegment;

	private static void run() throws Exception  {  
		
		//more>>Setup and Maintenance

		clickElement(By.linkText("Setup and Maintenance"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'pt1:r1:0:r0:0:r1:0:sdi10::icon')]"));
		Thread.sleep(5000);
		clickElement(By.linkText("Search"));
		setElementText(By.xpath("//*[contains(@id,'AP1:s9:it1::content')]"),Search);
		clickElement(By.xpath("//*[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']/a")); //click search icon
		clickElement(By.linkText("Manage Chart of Accounts Mappings"));
		clickElement(By.linkText("ITC ARGENTINA COA MAPPING"));	
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:segAppTb:_ATp:segTb::db']/table/tbody/tr[3]/td[1]"));
		clickElement(By.xpath("//*[contains(@id,'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:segAppTb:_ATp:segTb:2:mapTypeSel::content')]"));
		new Select(browser.findElement(By.xpath("//*[contains(@id,'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:segAppTb:_ATp:segTb:2:mapTypeSel::content')]"))).selectByIndex(0);//selectByVisibleText("Use rollup rules"); //select value from drop down.
		browser.findElement(By.xpath("//*[contains(@id,'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:segAppTb:_ATp:segTb:2:mapTypeSel::content')]")).sendKeys(Keys.TAB);
		new Select(browser.findElement(By.xpath("//*[contains(@id, 'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:segAppTb:_ATp:segTb:2:fromSegCd::content')]"))).selectByVisibleText("COMPANY"); //select value from drop down.
		
		clickElement(By.xpath("//*[contains(@id,'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:AT1:_ATp:create::icon')]"));
		setElementText(By.xpath("//*[contains(@id, 'AT1:_ATp:table1:1:toFlexValueId::content')]"),TargetValue); //131500
		new Select(browser.findElement(By.xpath("//*[contains(@id, 'AT1:_ATp:table1:1:soc1::content')]"))).selectByVisibleText("Equal to"); //condition
		setElementText(By.xpath("//*[contains(@id,'AT1:_ATp:table1:1:srcValueId::content')]"),FromValue);//01
		//browser.findElement(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:srcValueId::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id,'dynamicRegion1:1:defPanel:APsca1')]")); //Save
		
		
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(COAMappingMaintenanceITC.class);
			run();
		}
	}
}