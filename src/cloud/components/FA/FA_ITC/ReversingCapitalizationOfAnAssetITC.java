package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ReversingCapitalizationOfAnAssetITC extends BaseTest{
	
	public static String book;
	public static String Assetname;
	public static String AssetNumber;
	public static String SetDateField;
	
	private static void run(){
		
//		if(browser.findElement(By.xpath("//div[@class='shortcuts-popup-wrapper ng-scope']")).isDisplayed())
//			browser.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")).click();
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl6"));
	    
	    clickElement(By.cssSelector("option[title=\"US CORP\"]"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:q1:value10::content"), AssetNumber);
	    
//	    if(browser.findElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ctb1")).isEnabled())
//	    	clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ctb1"));
	    
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:q1::search"));
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:tbl1:_ATp:t1::db']/table/tbody/tr/td[1]"));
        
//        clickElement(By.cssSelector("td.p_AFFocused.xu5"));
        
        clickElement(By.cssSelector("td.xe7"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:tbl1:_ATp:commton1"));
	    
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:cb3"));	    
	   
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:commandButton2"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReversingCapitalizationOfAnAssetITC.class);
			run();
		}
	}

}
