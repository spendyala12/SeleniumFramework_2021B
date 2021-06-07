package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class InquiringOnATransactionITC extends BaseTest{
	
	public static String Book;
	public static String TransactionNumber;
	public static String FromAsset;
	public static String ToAsset;
	public static String TransactionType;
	
	
	private static void run(){
		
		
	    clickElement(By.id("pt1:_UISmmLink::icon"));
		
	    clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
	    
	    clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_fixed_assets_additions"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl21")); //Inquire Assets
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:sdi4::disAcr")); //Transaction
	    
	   setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:q1:value00::content"), Book); 			//book
	   setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:q1:value10::content"), TransactionNumber);  //Transaction Number
	   setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:q1:value20::content"),FromAsset);            //From Asset
	   setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:q1:value30::content"),ToAsset);             //To Asset
	   setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:q1:value40::content"), TransactionType); 
	   
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:q1::search")); //Search
	    
	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:AT1:_ATp:t1::db']/table/tbody/tr[1]")); //selecting row
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:AT1:_ATp:ctb1"));  //Viewing accounting
	                   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:AT1:d1::ok"));   //Done btn , full retirement = 153899  , transaction no.= 163001,5,1
	    

	    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:AT1:_ATp:t1::db']/table[2]/tbody/tr[7]")); //selecting row,	152917  ,  asset no. = 	112127
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:AT1:_ATp:ctb1"));  //Viewing accounting
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:r1:0:r1:0:AT1:d1::ok"));  //Done
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP4:cb1"));   //Done
	    
	    
	    
	   // clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1']/td[2]"));
	    
//	    clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
	    
	   
//	    browser.findElement(By.xpath("//button[@type='button']")).click();
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSsdiitemNode_fixed_assets_inquiry::icon"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:sdi4::disAcr"));
//	    
//	   setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:q1:value10::content"), TransactionNumber);
//	    
//	   setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:q1:value20::content"), FromAsset);
//	   
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:q1:value30::content"), ToAsset);
//	   
//	   	   
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:q1:value40::content"))).selectByVisibleText("Addition");
//	   
//	    clickElement(By.cssSelector("option[title=\"Addition\"]"));
//	    
//	   clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:q1::search"));
//	    
//	   clickElement(By.cssSelector("td.xu5"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:AT1:_ATp:ctb1"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r1:0:AT1:d1::ok"));
	   
	    		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(InquiringOnATransactionITC.class);
			run();
		}
	}

}
