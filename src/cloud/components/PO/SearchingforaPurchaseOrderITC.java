package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class SearchingforaPurchaseOrderITC extends BaseTest{
	
	public static String Order_Number;
	public static String Supplier;
	public static String Status;
	
	private static void run() throws Exception{
		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		//clickElement(By.id("pt1:nv_itemNode_procurement_PurchaseOrders"));
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__QuickSearch::ti"));
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__QuickSearch::icon
		
		Thread.sleep(5000);
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_1:1:soc1::content"))).selectByVisibleText("Orders"); // Orders
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_1:1:s10:itl31::content"),Order_Number);//163681
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_1:1:cil1::icon")); // Search Icon button
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:viewl1:0:AP2:SPb")); // Done
							
		
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl4")); // Manage Orders
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:Purch1:0:AP1:r1:0:q1:value20::content
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:Purch1:0:AP1:r1:0:q1:value20::content"),Supplier); // Supplier field
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:Purch1:0:AP1:r1:0:q1:value60::content"))).selectByVisibleText(Status); //Status
											  //_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:Purch1:0:AP1:r1:0:q1:value60::content
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt5:0:pt1:Purch1:0:AP1:r1:0:q1::search")); //Search 
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt5:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:table1::db"));//Select row
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt5:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:table1:0:cl3")); //Click link
		                    //_FOpt1:_FOr1:0:_FONSr2:0:MAt5:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:table1:0:cl3
							//_FOpt1:_FOr1:0:_FONSr2:0:MAt4:0:pt1:viewl1:0:AP2:SPb
		
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__QuickSearch::icon"));
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:soc1::content"))).selectByVisibleText("Orders");
//	    Thread.sleep(200);
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:s10:itl1::content"),Order_Number);//"162946"
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:cil1::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:viewl1:0:AP2:APb"));
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl4"));
//	    setElementText(By.xpath("//*[contains(@id, 'value10::content')]"),Supplier);//"ABC Consulting"
//	    new Select(browser.findElement(By.xpath("//*[contains(@id, 'value60::content')]"))).selectByVisibleText(Status);//"Incomplete"
//
//	    clickElement(By.xpath("//*[contains(@id, 'q1::search')]"));
//	    clickElement(By.linkText(Order_Number));
//	    clickElement(By.xpath("//button[contains(@id, 'AP2:APb')]"));
//	    clickElement(By.xpath("//button[contains(@id, 'AP1:APb')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(SearchingforaPurchaseOrderITC.class);
			run();
		}
	}

}
