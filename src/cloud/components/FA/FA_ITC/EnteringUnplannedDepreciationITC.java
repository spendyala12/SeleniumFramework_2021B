package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class EnteringUnplannedDepreciationITC extends BaseTest{

	public static String AssertNumber;
	public static String Description;
	public static String DepreciationAmount;

	private static void run() throws InterruptedException{


		//clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
		Thread.sleep(4000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl4"));

		Thread.sleep(3000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value10::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value10::content"),AssertNumber);

		Thread.sleep(2000);

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value30::content"))).selectByVisibleText("Capitalized");

		clickElement(By.cssSelector("option[title=\"Capitalized\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1::search"));

		Thread.sleep(5000);
		
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:tbl1:_ATp:t1::db']/table/tbody/tr[1]/td[1]"));
		
		//clickElement(By.cssSelector("td.p_AFFocused.xzn"));
		
		Thread.sleep(3000);
		

		clickElement(By.linkText("Actions"));
		
		Thread.sleep(3000);

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:tbl1:_ATp:cmiunpDeprn']/td[2]"));
		
		Thread.sleep(3000);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:inputText4::content"),Description);

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:selectOneChoice1::content"))).selectByVisibleText("Initial code for unplanned depreciation");

		clickElement(By.cssSelector("option[title=\"Initial code for unplanned depreciation\"]"));
		
		Thread.sleep(3000);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:amount::content"),DepreciationAmount);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:commandButton1"));
		
		Thread.sleep(3000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:done"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(EnteringUnplannedDepreciationITC.class);
			run();
		}
	}

}
