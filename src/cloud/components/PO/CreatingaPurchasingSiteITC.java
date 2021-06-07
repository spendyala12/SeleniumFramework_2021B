package cloud.components.PO;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingaPurchasingSiteITC extends BaseTest{
	
	public static String Supplier;
	public static String Address_Name;
	public static String Country;
	public static String Postal_Code;
	public static String Address_Line_1;
	public static String City;
	
	private static void run() throws InterruptedException{
		clickElement(By.id("pt1:_UISmmLink::icon"));
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:nv_itemNode_procurement_PurchaseOrders"));
	//	pt1:nv_itemNode_procurement_PurchaseOrders
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon")); // Click Task Icon
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl16")); // Manage Suppliers
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:q1:value00::content"), Supplier); //Advantage Corp
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:q1::search")); //Search
		Thread.sleep(4000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:AT1:_ATp:Table::db")); //Select row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:AT1:_ATp:edit::icon")); // Edit 
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:ap1:addressesTab::disAcr")); // Address Tab
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:ap1:r4:0:AT1:_ATp:create"));// Create Icon
		Thread.sleep(4000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:it25::content"), Address_Name); // Advantage Corp SW Pay
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:soc8::content"), Country); //Country
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:i1:0:it3::content"), Address_Line_1); // Address Line1
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:i1:2:geographyElement4Id::content"), City); //City
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:i1:4:geographyElement5Id::content"), Postal_Code); //Postal code 50062
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:smc11::content"]/div[1]/span/label //xpath checkbox
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:smc11::content\"]/div[1]/span/label"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:1:AP1:APscl2")); // Save and close
		
		
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl16"));
//	    
//	    setElementText(By.xpath("//input[contains(@id, 'value00::content')]"), Supplier);//"Advanced Corp"
//	    
//	    clickElement(By.xpath("//button[contains(text(), 'Search')]"));
//	    clickElement(By.linkText(Supplier));
//	    clickElement(By.linkText("Addresses"));
//	    clickElement(By.xpath("//img[contains(@id, 'create::icon')]"));
//	    
//	    setElementText(By.xpath("//input[contains(@id, 'it25::content')]"), Address_Name);//"Advananced Corp SW Pay"
//	    
//	    setElementText(By.xpath("//input[contains(@id, 'soc8::content')]"), Country);//"United States"
//	    setElementText(By.xpath("//input[contains(@id, 'it3::content')]"), Address_Line_1);//"4501 Maple"
//	    
//	    setElementText(By.xpath("//input[contains(@id, 'geographyElement5Id::content')]"), Postal_Code);//"75219"
//	    setElementText(By.xpath("//input[contains(@id, 'geographyElement4Id::content')]"), City);//"Dallas"
//	    
//	    clickElement(By.xpath("//input[contains(@id, 'AP1:smc11:_0')]"));
//	    clickElement(By.xpath("//button[contains(@id, 'AP1:APscl')]"));
//	    clickElement(By.xpath("//button[contains(@id, 'dialog1::ok')]"));
//	    clickElement(By.xpath("//button[contains(@id, 'ap1:cb4')]"));
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
//	    clickElement(By.xpath("//button[contains(@id, 'AP1:APb')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaPurchasingSiteITC.class);
			run();
		}
	}

}
