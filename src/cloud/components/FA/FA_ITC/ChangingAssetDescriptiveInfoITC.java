package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ChangingAssetDescriptiveInfoITC extends BaseTest{
	
	public static String TAG_Number;
	
	private static void run(){
		
//	    clickElement(By.id("pt1:_UISmmLink::icon"));
//		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl14"));
	   	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:0:AP1:q1:value30::content"))).selectByVisibleText("Capitalized");
	   
	    
	    clickElement(By.cssSelector("option[title=\"Capitalized\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:0:AP1:q1::search"));
	    
	    clickElement(By.cssSelector("td.xu5"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:0:AP1:FindAssetsQueryResultId:_ATp:cb1"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:1:AP1:inputText5::content"), TAG_Number);

	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:1:AP1:selectOneChoice6::content"))).selectByVisibleText("New");
	    
	    clickElement(By.cssSelector("option[title=\"New\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:1:AP1:commandButton1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:r1:0:AP1:done"));
	    
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ChangingAssetDescriptiveInfoITC.class);
			run();
		}
	}

}
