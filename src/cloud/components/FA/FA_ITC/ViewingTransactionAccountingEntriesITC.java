package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ViewingTransactionAccountingEntriesITC extends BaseTest{
	
	public static String TransactionNumber;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(2000);
        
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_fixed_assets_inquiry"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:sdi4::ti")); //Click on transaction
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1:value10::content"),TransactionNumber);  //Transaction Number
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1::search"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:t1::db")); //Selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:ctb1")); //view accounting
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:commandToolbarButton1")); //T-Account
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:dialog2::ok")); //Done
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:d1::ok"));  //Done
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:t1::ch::t"));        //click header
		//clickElement(By.id("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:t1::db\"]/table/tbody/tr[1]"));      //Click row
		                     //_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:d1::_fcc
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:d1::ok\"]"));  //Done
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1::_afrDscl"));  //Click on search  //Transaction no. 108087,   108088
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1:value10::content"));  //Transaction number
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1::search"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:t1::db")); //Selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:ctb1")); //view accounting
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:commandToolbarButton1")); //T-Account
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:dialog2::ok")); //Done
		clickElement(By.id("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:t1::ch\"]")); //Selecting header
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:d1::ok"));  //Done
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1::_afrDscl"));  //Click on search  //Transaction no. 108087,   108088
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1:value10::content"));  //Transaction number
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:q1::search"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:t1::db")); //Selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:ctb1")); //view accounting
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:commandToolbarButton1")); //T-Account
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:dialog2::ok")); //Done
		clickElement(By.id("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:t1::ch\"]")); //Selecting header
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r1:0:AT1:d1::ok"));  //Done
		
		
		
		
	                    	
		
		
		
		
		
//		Thread.sleep(4000);
//		
//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
//		
//		Thread.sleep(4000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl20"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:sdi4::disAcr"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:q1::search"));
		
		Thread.sleep(3000);
		
		clickElement(By.cssSelector("tr.p_AFSelected.xe8 > td.xzn"));
		
		Thread.sleep(3000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:_ATp:ctb1"));
		
		Thread.sleep(2000);
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:t1::db']/table/tbody/tr[2]/td"));
		
		Thread.sleep(2000);
	    
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:commandToolbarButton1']/a/span"));
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:ViewA1:0:dialog2::ok"));
		
		Thread.sleep(2000);
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:d1::ok"));
		
		Thread.sleep(2000);
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:q1::_afrDscl"));
	    
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:q1:value40::content"))).selectByVisibleText("Adjustment");
	    
		clickElement(By.cssSelector("option[title=\"Adjustment\"]"));
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:q1::search"));
		
		Thread.sleep(3000);
	    
		clickElement(By.cssSelector("tr.p_AFSelected.xe8 > td.xzn"));
		
		Thread.sleep(2000);
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:_ATp:ctb1"));
		
		Thread.sleep(2000);
	    
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:t1::db']/table/tbody/tr[2]/td"));
		
		Thread.sleep(2000);
	    
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:ViewA1:0:AT1:_ATp:commandToolbarButton1']/a/span"));
		
		Thread.sleep(2000);
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:ViewA1:0:dialog2::ok"));
	    
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r1:0:AT1:d1::ok"));
	    
		Thread.sleep(2000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:cb1"));
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ViewingTransactionAccountingEntriesITC.class);
			run();
		}
	}

}
