package cloud.components.PO;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingaContractPurchaseAgreementITC extends BaseTest{
	
	public static String Style;
	public static String Supplier;
	//public static String SupplierSite;
	public static String Start_Date;
	public static String End_Date;
	public static String Minimum_Release_Amount;
	public static String Contract_Template;
	public static String Agreement_Style;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_procurement_PurchaseOrders"));  //Purchase Order
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl8"));   //manage agreements
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:ATm")); //click on action
		Thread.sleep(2000);
	//	new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:createMenuItem"))).selectByVisibleText("Create");;  //Create
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:_ATp:createMenuItem"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:styleNameId::lovIconId"));  //click on drop down list
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:styleNameId::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:styleNameId::_afrLovInternalQueryId:value00::content"), Style);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:styleNameId::_afrLovInternalQueryId::search"));
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:styleNameId_afrLovInternalTableId::db")); //selecting row
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:styleNameId::lovDialogId::ok")); 
		
		Thread.sleep(2000); 
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:AgreementSupplierId::content"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:AgreementSupplierId::lovIconId"));   //Supplier Search
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:AgreementSupplierId::_afrLovInternalQueryId:value00::content"), Supplier);
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:AgreementSupplierId::_afrLovInternalQueryId::search"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:AgreementSupplierId_afrLovInternalTableId::db")); //Selecting row
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:AgreementSupplierId::lovDialogId::ok"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:vendorSiteCodeId::content"));        //supplier site
	//	setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:vendorSiteCodeId::dropdownPopup::dropDownContent::db"), SupplierSite	);
	//	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:vendorSiteCodeId::lovIconId")); //click on supplier site
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:firstNameId::content"));   //Supplier Contact	
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:Purch1:0:AP1:r1:0:AT1:Creat1:1:commandButton1"));        //Create btn
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:HeaderStartDateActiveId::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:HeaderStartDateActiveId::content"), Start_Date);
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:EndDateId::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:EndDateId::content"), End_Date);
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:minReleaseId::content"),Minimum_Release_Amount);
	 	//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:plam4"));//Minimum Release Amount	
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:sdi1::disAcr"));  //Contract Term
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:r1:1:commandButton11")); //Add Contract Term
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:r1:1:cl1::icon")); 
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:r1:1:r1:1:ivcq1::search_icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:r1:1:r1:1:applicationsTable1:_ATp:table1::db")); //Selecting row
	
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:r1:1:cb1")); //ok
		                    
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:r1:1:okButton")); //ok
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:pt1:r1:0:ap1:SPsb2"));  //Submit
		
		clickElement(By.id("_FOd1::msgDlg::cancel"));   //ok 
		
		
		
		
		
		
		
		clickElement(By.xpath("(//a[contains(text(),'Actions')])[3]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r3:0:AT5:_ATp:createMenuItem"));

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r3:0:Creat1:1:styleNameId::content"), Agreement_Style);//Contract Purchase Agreement
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r3:0:Creat1:1:AgreementSupplierId::content"), Supplier);//"Advanced Corp"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r3:0:Creat1:1:commandButton1"));
	    
	    setElementText(By.xpath("//*[contains(@id, 'HeaderStartDateActiveId::content')]"), Start_Date);//"02/21/17"
	    
	    clickElement(By.xpath("//*[contains(@id, 'plam6')]"));
	    setElementText(By.xpath("//*[contains(@id, ':EndDateId::content')]"), End_Date);//"02/21/18"
	    
	    clickElement(By.linkText("Contract Terms"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:ap1:r1:1:commandButton11"));
	    
	    setElementText(By.xpath("//*[contains(@id, 'inputText4::content')]"), Contract_Template);//"Contract Purchase Agreement Terms Template"
	    clickElement(By.xpath("//*[contains(@id, 'okButton')]"));
	    clickElement(By.xpath("//*[contains(@id, ':APsb2')]"));
	    clickElement(By.xpath("//*[contains(@id, 'cancel')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaContractPurchaseAgreementITC.class);
			run();
		}
	}

}
