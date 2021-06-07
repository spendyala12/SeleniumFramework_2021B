package cloud.components.PO;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingaPurchaseOrderforGoodsITC extends BaseTest{
	
	public static String Supplier;
	public static String Item_Code;
	public static String Quantity;
	public static String UOM;
	public static String Price;
	
	private static void run() throws Exception{
		
		//_FOpt1:_UISmmLink
		//_FOpt1:_UISnvr:0:nvcl1
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		//pt1:_UISnvr:0:nvcl1
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		//pt1:_UISnvr:0:nvcl1
		clickElement(By.id("pt1:nv_itemNode_procurement_PurchaseOrders"));
							//pt1:_UISnvr:0:nv_itemNode_procurement_PurchaseOrders
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon")); // Task Icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5")); //Create Order
		Thread.sleep(3000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:Supplier::content"), Supplier);//Office Depot
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:commandButton1"));
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:ATm")); //Lines Action
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:createMenuItem")); // Add row
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:Item::content"), Item_Code);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:ItemDescription::content"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:s5:Quantity::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:s5:Quantity::content"), Quantity);
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:s5:Quantity::content
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:Uom::content"), UOM);
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:UnitPrice::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:UnitPrice::content"), Price);
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:UnitPrice::content
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:AP1:showDetailItem3::ti")); //Schedules tab
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:AP1:AT2:_ATp:Scheds:0:NeedByDt::content"), "7/23/19");
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:SPsb2")); 
		Thread.sleep(4000);
		clickElement(By.id("_FOd1::msgDlg::cancel"));
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:UnitPrice::content
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:UnitPrice::content"), Price);
		
		
							//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:s5:Quantity::content
						   
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:Item::content
		
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:AT12:_ATp:ATm"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:AT12:_ATp:createMenuItem"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:Supplier::content"), Supplier);//"Office Depot"
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:commandButton1"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:ATm"));
//	    clickElement(By.xpath("//tr[contains(@id, 'ATp:createMenuItem')]"));
//	    
//	    setElementText(By.xpath("//*[contains(@id, 'Item::content')]"), Item_Code);//"PP74521"
//	    setElementText(By.xpath("//*[contains(@id, 'Quantity::content')]"), Quantity);//"2"
//	    setElementText(By.xpath("//*[contains(@id, 'Uom::content')]"), UOM);//"Dz"
//	    setElementText(By.xpath("//*[contains(@id, 'UnitPrice::content')]"), Price);//"23"
//
//	    clickElement(By.xpath("//button[contains(@id, 'AP1:APsb2')]"));
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaPurchaseOrderforGoodsITC.class);
			run();
		}
	}

}
