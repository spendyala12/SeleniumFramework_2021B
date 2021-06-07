package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ChangingAnAssetCategoryITC extends BaseTest{

	public static String Book;
	public static String AssetType;
	public static String NewCategory;


	private static void run(){


		clickElement(By.id("pt1:_UISmmLink::icon")); 

		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl4"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value30::content"))).selectByVisibleText("Capitalized");

		clickElement(By.cssSelector("option[title=\"Capitalized\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1::search"));

		clickElement(By.cssSelector("td.p_AFFocused.xu5"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:tbl1:_ATp:chgCategoryBtn"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:inputText3::content"), "Changing Asset Category");

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:kf1CS::content"), NewCategory);		    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:commandButton2"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:done"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ChangingAnAssetCategoryITC.class);
			run();
		}
	}

}
