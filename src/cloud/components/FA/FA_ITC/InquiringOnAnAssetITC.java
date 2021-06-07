package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class InquiringOnAnAssetITC extends BaseTest{
	
	
	public static String book;
	public static String AssetNumber;
	
//	public static String cost;
//	public static String asset_number;
//	public static String tag_number;
	
	
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		    
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_fixed_assets_additions"));
		    
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl21")); //Click on assets
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:q1:value20::content"),AssetNumber);
	
		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:q1:value40::content"))).selectByVisibleText("CapitaliZed");   //Asset Type
				
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:q1::search"));
	
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:sdi3::disAcr"));     //Descriptive
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:sdi4::disAcr"));    //Source Line
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:sdi5::disAcr"));    //Assignments
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:sdi6::disAcr"));    //Cost History
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:sdi7::disAcr"));    //Depreciation
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r2:0:sdi8::disAcr"));    //Transactions
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:cb1"));  //Done
		
		
		
		
		
		
		
//	    clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon")); 
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl19"));
//	    	    
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:q1:value30::content"))).selectByVisibleText("Capitalized");
//	    
//	    clickElement(By.cssSelector("option[title=\"Capitalized\"]"));
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:q1::search"));
//	    
//	    clickElement(By.cssSelector("td.xu5"));
//	    
//	    clickElement(By.xpath("//th[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:AT1:_ATp:t2:column70']/div[2]/span"));
//	    
//	   clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi1::disAcr"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi3::disAcr"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi4::disAcr"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi5::disAcr"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi6::disAcr"));
//	    
//	   clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi7::disAcr"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi8::disAcr"));
//	    
//	    clickElement(By.xpath("//th[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:AT6:_ATp:table31:column21']/div[2]/span"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:cb1"));
//	    
	    
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(InquiringOnAnAssetITC.class);
			run();
		}
	}

}
