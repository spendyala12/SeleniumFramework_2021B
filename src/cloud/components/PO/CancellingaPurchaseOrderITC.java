package cloud.components.PO;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CancellingaPurchaseOrderITC extends BaseTest{
	
	public static String Supplier;
	public static String Reason;
//	public static String Search;
//	public static String Order_Number;
//	public static String Cancel_Reason;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_procurement_PurchaseOrders"));  //Purchase Order
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl4"));  //Manage order
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::lovIconId")); //Click on Supplier search
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::_afrLovInternalQueryId:value00::content"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::_afrLovInternalQueryId::search"));   
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::_afrLovInternalQueryId:value00::content"),Supplier);  //Supplier //order - 163631,163630,163629,163612
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::_afrLovInternalQueryId::search"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20_afrLovInternalTableId::db']/table/tbody/tr"));  //selecting row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1:value20::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:q1::search")); 
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:table1::db']/table/tbody/tr[2]"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:ATm"));
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:CA_HEADER_CANCEL_DOCUMENT"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:it3::content"), Reason);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:d4::ok"));
		clickElement(By.id("_FOd1::msgDlg::cancel"));  //ok
	                    	
		
		
		
		
		
		
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__QuickSearch::icon"));
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:soc1::content"))).selectByVisibleText(Search);
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:s10:itl1::content"), Order_Number);
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaTj_id_1:1:cil1::icon"));
//	    clickElement(By.xpath("//span[contains(text(), 'Actions')]"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:viewl1:0:AP2:CA_HEADER_CANCEL_DOCUMENT"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:viewl1:0:AP2:it4::content"), Cancel_Reason);
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:viewl1:0:AP2:d13::ok"));
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CancellingaPurchaseOrderITC.class);
			run();
		}
	}

}
