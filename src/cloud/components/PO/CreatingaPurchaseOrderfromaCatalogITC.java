package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingaPurchaseOrderfromaCatalogITC extends BaseTest{
	
	public static String Procurement_BU;
	public static String Supplier;
	public static String Catalog;
	//public static String UnitPrice;
	//public static String NeedByDate;
	
	private static void run() throws InterruptedException{
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_procurement_PurchaseOrders"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon")); // Icon
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5")); //Create Order
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:ProcurementBu::content"))).selectByVisibleText(Procurement_BU);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:commandButton1")); // Create Button
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:AP1:ctb33 // Actions button
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:ATm")); // Actions
		
							
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:AddFromCatalog")); //Add from Catalog
							//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:AddFromCatalog
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt7:1:SP4:r1:0:pt1:sf4:it3::content // Search
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:psl1::c"), Catalog);//"laptop" // Search
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:SP4:r1:0:pt1:sf4:it3::content"), Catalog);//"laptop" // Search
							// "_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:SP4:r1:0:pt1:sf4:it3::content"
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:SP4:r1:0:pt1:sf4:cil2::icon"));// Search
						  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:SP4:r1:0:pt1:sf4:it3::content
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:SP4:r1:0:pt1:sf4:cil2::icon
							  
		
		//<div id="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:psl1::c" style="overflow:hidden"><span id="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:it3" class="x1u p_AFStretched"><input id="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:it3::content" name="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:it3" style="min-width:100%;" class="x25" type="text" placeholder="Search" value="laptop"><label for="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:it3::content" class="x9w">Search Catalog</label></span></div>
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:call2:CLL_ctb2::icon // icon
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r1:0:pt1:sf4:cil2// Search
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:call2:AT1:_ATp:cb11"] //Add to Document
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:call2:AT1:_ATp:t1::db\"]/table/tbody/tr[1]/td[1] "));	 
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:call2:AT1:_ATp:t1::db"]/table/tbody/tr[1]/td[1] // select row x path
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:call2:AT1:_ATp:cb11")); // Add to document
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt7:2:SP1:r9:0:pt1:commandButton8")); //Complete
		
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:AT12:_ATp:create::icon"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:ProcurementBu::content"));
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:ProcurementBu::content"))).selectByVisibleText(Procurement_BU);//"US1 Business Unit"
//
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:Supplier::content"), Supplier);//"ABC Consulting"
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:commandButton1"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:lineDetailItemId::disAcr"));
//	    clickElement(By.cssSelector("a.xg9"));
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:AddFromCatalog']/td[2]"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:2:pt1:Creat1:0:AP1:s4:it1::content"), Catalog);//"laptop"
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:2:pt1:Creat1:0:AP1:s4:commandImageLink1::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:2:pt1:Creat1:1:AP1:AT3:_ATp:t1:1:cil1::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:2:pt1:commandButton8"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:Lines:0:UnitPrice::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:Lines:0:UnitPrice::content"), UnitPrice);//"182"
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:showDetailItem3::disAcr"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT2:_ATp:Scheds:0:NeedByDt::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT2:_ATp:Scheds:0:NeedByDt::content"), NeedByDate);//"03/02/17"
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:APsb2"));
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaPurchaseOrderfromaCatalogITC.class);
			run();
		}
	}

}
