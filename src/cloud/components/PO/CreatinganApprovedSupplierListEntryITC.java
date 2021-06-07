package cloud.components.PO;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatinganApprovedSupplierListEntryITC extends BaseTest{
	
	public static String Procurement_BU;
	public static String Item;
	public static String Supplier;
	public static String Supplier_site;
	public static String Ship_to_Organization;
	public static String UoM;
	public static String CountryofOrigin;
	public static String Min_order_Quantity;
	public static String Fixed_Lot_Multiple;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_procurement_PurchaseOrders"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon")); // Task Icon
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl17")); //select the task list
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl17
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl17
		
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:0:AP1:AT2:_ATp:ATm"));// Actions
							//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:0:AP1:AT2:_ATp:ATm
							
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:0:AP1:AT2:_ATp:createMenuItem"));// cREATE
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:prcBuId::content"))).selectByVisibleText(Procurement_BU); //US1 Business Unit
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:Item::content"), Item); //AS00100
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:Supplier::content"), Supplier); //ABC Consulting
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:Supplier::su0"));
		
		
		
		Thread.sleep(4000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:vendorSiteCodeId::content"), Supplier_site); //ABC US1
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:vendorSiteCodeId::content
						   	  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:vendorSiteCodeId::content
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:vendorSiteCodeId::content
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:ATm")); // Actions
		
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:createMenuItem")); // Add row
							//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:createMenuItem
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:AttrShipToOrg::content"), Ship_to_Organization);//"Manchester"
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:AttrShipToOrg::content
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:unitOfMeasureId::content"), UoM);//"Dz"
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:territoryShortNameId::content"), CountryofOrigin);//"Afghanistan"
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:it1::content"), Min_order_Quantity);//"200"
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:it2::content"), Fixed_Lot_Multiple);//"200"
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Manag1:1:AP1:ctb1")); //Save&Close
		clickElement(By.id("_FOd1::msgDlg::cancel")); // OK
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl17"));
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:0:AP1:AT2:_ATp:create::icon"));
	   // new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:prcBuId::content"))).selectByVisibleText(Procurement_BU);//"US1 Business Unit"

	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:Supplier::content"), Supplier);//"ABC Consulting"
	    
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:Item::content"), Item);//"AS00107"
	    	   
	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:vendorSiteCodeId::content"), Supplier_site);//ABC US1
	    
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:AT1:_ATp:create::icon"));
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:AttrShipToOrg::content"), Ship_to_Organization);//"Manchester"
	    
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:unitOfMeasureId::content"), UoM);//"Dz"
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:territoryShortNameId::content"), CountryofOrigin);//"Afghanistan"
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:it1::content"), Min_order_Quantity);//"200"
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:AT1:_ATp:t1:2:it2::content"), Fixed_Lot_Multiple);//"200"
	    //clickElement(By.cssSelector("span.xpc"));
	   // clickElement(By.id("_FOd1::msgDlg::cancel"));
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatinganApprovedSupplierListEntryITC.class);
			run();
		}
	}

}
