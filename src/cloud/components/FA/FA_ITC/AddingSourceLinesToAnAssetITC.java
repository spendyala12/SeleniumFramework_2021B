package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class AddingSourceLinesToAnAssetITC extends BaseTest{

	public static String Search;
	public static String book;
	public static String Assetname;
	public static String cost;
	public static String asset_number;
	public static String tag_number;

	private static void run(){

		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl3"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl3"));	    

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:q1:value10::content"))).selectByVisibleText("New");

		clickElement(By.cssSelector("option[title=\"New\"]"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:q1:value20::content"), "AP-IN-011414- 01");

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:q1::search"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AT2:_ATp:table2:0:cilrd2::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AT2:_ATp:commandMenuItem1"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:AP3:q1::search"));
		clickElement(By.cssSelector("td.xu5"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:AP3:commandButton1"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:AP3:inputText8::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:AP3:inputText8::content"), "Adding Sourcelines to an asset");;

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:AP3:commandButton3"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:commandButton4"));

		clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdc2:ITPsh0:0:pt1:itInPro:2:cl1Missing']/span"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdtl:0:r1:0:AT2:_ATp:cb6"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdtl:0:r1:0:d44::ok"));
		clickElement(By.xpath("//table[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdc2:ITPsh0:0:pt1:itInPro:2:fca3:dc_pgl1']/tbody/tr/td/span"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingSourceLinesToAnAssetITC.class);
			run();
		}
	}

}
