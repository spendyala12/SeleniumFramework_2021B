package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ChangingFinancialDetailsITC extends BaseTest{

	public static String book;
	public static String Assetname;
	public static String cost;
	public static String asset_number;
	public static String tag_number;

	private static void run(){


		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl4"));
		clickElement(By.cssSelector("option[title=\"US CORP\"]"));    

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value30::content"))).selectByVisibleText("Capitalized");

		clickElement(By.cssSelector("option[title=\"Capitalized\"]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1::search"));
		clickElement(By.cssSelector("td.p_AFFocused.xu5"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:tbl1:_ATp:chgFinDetBtn"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP2:inputText25::content"), "changing the cost");

//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP2:AmortizeFlagId::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP2:CostId::content"), "4123456");

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP2:commandButton1"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:done"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ChangingFinancialDetailsITC.class);
			run();
		}
	}

}
