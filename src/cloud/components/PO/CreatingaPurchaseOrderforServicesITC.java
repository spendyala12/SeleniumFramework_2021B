package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingaPurchaseOrderforServicesITC extends BaseTest{
	
	public static String Style;
	public static String Procurement_BU;
	public static String Supplier;
	public static String Description;
	public static String Category;
	//public static String Quantity;
	public static String Price;
	//public static String UoM;
	public static String Project_Number;
	public static String Task_Number;
	public static String Expenditure_Item_Date;
	public static String Expenditure_Type;
	public static String Expenditure_Organization;
	
	
	private static void run() throws InterruptedException{

		Thread.sleep(4000);//_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon")); // Task Icon
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon
		//clickElement(By.xpath("//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"]));"
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"));// Create Order
		//_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:StyleName::content"), Style); // Style (Deliverables Services PO)
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:Supplier::content"), Supplier); //Supplier
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:commandButton1")); // Create button
		Thread.sleep(3000);
							//_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:commandButton1
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:create"));// + button
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:ItemDescription::content"), Description);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:Category::content"), Category);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:Lines:0:AmountAsPrice::content"), Price);// 120
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:AT1:_ATp:edit::icon")); //Edit icon
		Thread.sleep(3000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:LPan:PjcLineDff_PJCDFFVOIterator_PROJECT_ID_DisplayPO_Purchase_Order_Line::content')]"), Project_Number);//Project number(PI20034)
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:LPan:PjcLineDff_PJCDFFVOIterator_TASK_ID_DisplayPO_Purchase_Order_Line::content"), Task_Number);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:LPan:PjcLineDff_PJCDFFVOIterator_EXPENDITURE_ITEM_DATEPO_Purchase_Order_Line::content"), Expenditure_Item_Date); //7/25/19
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:LPan:PjcLineDff_PJCDFFVOIterator_EXPENDITURE_TYPE_ID_DisplayPO_Purchase_Order_Line::content"), Expenditure_Type); // Furniture
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:LPan:PjcLineDff_PJCDFFVOIterator_ORGANIZATION_ID_DisplayPO_Purchase_Order_Line::content"), Expenditure_Organization); //Applications and Services
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:1:LPan:SPsb2")); // OK button
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:SPsb2")); // Submit button
		//clickElement(By.id("_FOd1::msgDlg::cancel"));//OK
		
		
//	    clickElement(By.xpath("(//a[contains(text(),'Actions')])[2]"));
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:AT12:_ATp:createMenuItem']/td[2]"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:StyleName::content"), Style);//"Consignment Order"
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:ProcurementBu::content"))).selectByVisibleText(Procurement_BU);//"US1 Business Unit"
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:Supplier::content"), Supplier);//"ABC Consulting"
//	    clickElement(By.xpath("//button[contains(text(), 'Create')]"));
//	    clickElement(By.xpath("//*[contains(@id, 'ATp:create::icon')]"));
//	    setElementText(By.xpath("//*[contains(@id, 'ItemDescription::content')]"), Description);//"Hardware Installation"
//	    
//	    setElementText(By.xpath("//*[contains(@id, 'Category::content')]"), Category);//"miscellaneous"
//	    setElementText(By.xpath("//*[contains(@id, 'Quantity::content')]"), Quantity);//"1"
//	    setElementText(By.xpath("//*[contains(@id, 'UnitPrice::content')]"), Price);//"120.00"
//
//	    setElementText(By.xpath("//*[contains(@id, 'Uom::content')]"),UoM);//"Dz"
//	    
//	    clickElement(By.xpath("//*[contains(@id, 'edit::icon')]"));
//	    setElementText(By.xpath("//input[contains(@id, 'PjcLineDff_PJCDFFVOIterator_PROJECT_ID_DisplayPO_Purchase_Order_Line::content')]"), Project_Number);//"11700050"
//
//	    setElementText(By.xpath("//input[contains(@id, 'TASK_ID_DisplayPO_Purchase_Order_Line::content')]"), Task_Number);//"1.0"
//	    
//	    setElementText(By.xpath("//*[contains(@id, 'PjcLineDff_PJCDFFVOIterator_EXPENDITURE_ITEM_DATEPO_Purchase_Order_Line::content')]"), Expenditure_Item_Date);//"03/01/17"
//	    
//	    setElementText(By.xpath("EXPENDITURE_TYPE_ID_DisplayPO_Purchase_Order_Line::content"), "");
//	    setElementText(By.xpath("ORGANIZATION_ID_DisplayPO_Purchase_Order_Line::content"), Expenditure_Organization);//"Applications and Services"
//
//	    clickElement(By.xpath("//button[contains(@id, 'LPan:APsb2')]"));
//	    
//	    
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaPurchaseOrderforServicesITC.class);
			run();
		}
	}

}
