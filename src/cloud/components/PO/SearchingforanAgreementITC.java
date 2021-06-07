package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class SearchingforanAgreementITC extends BaseTest{
	
	public static String Agreement_Number;
	public static String Supplier;
	public static String Status;
	
	private static void run() throws Exception{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:nv_itemNode_procurement_PurchaseOrders"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__QuickSearch::icon")); // Search Icon
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_1:1:soc1::content"))).selectByVisibleText("Agreements");
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_1:1:s10:itl31::content"),Agreement_Number); //52200
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_1:1:cil1::icon")); // Search icon
		Thread.sleep(3000);
		clickElement(By.id("__FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:ViewA1:0:AP4:SPb")); //Done
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MainAreaTab2::ti"));// Manage agreements link
		
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:vPanel2
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::content')]"),Supplier); //Supplier
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value50::content')]"))).selectByVisibleText(Status);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1::search")); // Search button
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__QuickSearch::icon"));
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:soc1::content"))).selectByVisibleText("Agreements");
//	    Thread.sleep(200);
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:s10:itl1::content"), Agreement_Number);//"52232"
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:cil1::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:ViewA1:0:AP4:APb"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl8"));
//	    setElementText(By.xpath("//*[contains(@id, 'value10::content')]"),Supplier);//"ABC Consulting"
//	    new Select(browser.findElement(By.xpath("//*[contains(@id, 'value40::content')]"))).selectByVisibleText(Status);//"Incomplete"
//
//	    clickElement(By.xpath("//*[contains(@id, 'q1::search')]"));
//	    clickElement(By.linkText(Agreement_Number));
//	    clickElement(By.xpath("//button[contains(@id, 'AP4:APb')]"));
//	    clickElement(By.xpath("//button[contains(@id, 'AP1:APb')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(SearchingforanAgreementITC.class);
			run();
		}
	}

}
