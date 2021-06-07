package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;
//import itc.framework.Browser;

public class CapitalizingCIPAssetsITC extends BaseTest{
	
	public static String book;
	public static String Assetname;
	public static String AssetNumber;
	public static String SetDateField;
	
	
	private static void run() throws InterruptedException{
		
//		if(browser.findElement(By.xpath("//div[@class='shortcuts-popup-wrapper ng-scope']")).isDisplayed())
//			browser.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")).click();
		
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));   //Show more
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_fixed_assets_additions"));  //click on Assets
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl6"));  //click on Capitalize CIP Assets
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:q1:value00::content"));  //Book
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:q1:value20::content"),AssetNumber);  //	111861,111870,111873,111874,111149,
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:q1:value40::content"))).selectByVisibleText("CIP");
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:q1::search"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:tbl1:_ATp:t1::db"));  //Selecting row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:tbl1:_ATp:commandButton1"));  //Capitalize
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:cb1"));  //ok
		clickElement(By.id("_FOd1::msgDlg::cancel")); //ok
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:SrchTF:0:AP1:commandButton2"));   //Done
		
		
		
		
		
		
		
		
	    
//	    clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl6"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:q1:value10::content"), AssetNumber);
//	    	   
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:q1:value30::content"))).selectByVisibleText("CIP");
//	   
//	    clickElement(By.cssSelector("option[title=\"CIP\"]"));
//	    
//	    if(browser.findElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ctb1")).isEnabled())
//	    	clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ctb1"));
	    
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:q1::search"));
	    
   //	clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:tbl1:_ATp:t1::db']/table/tbody/tr/td[1]"));
  //	    clickElement(By.cssSelector("td.p_AFFocused.xu5"));
//	    clickElement(By.cssSelector("td.xe7"));
	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:tbl1:_ATp:commandButton1"));	   
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:dpis::content"), SetDateField);
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:cb1"));  
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:SrchTF:0:AP1:commandButton2"));
//	   
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CapitalizingCIPAssetsITC.class);
			run();
		}
	}

}
