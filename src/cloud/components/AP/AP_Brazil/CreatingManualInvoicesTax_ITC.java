package cloud.components.AP.AP_Brazil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingManualInvoicesTax_ITC extends BaseTest{


	public static String BusinessUnit;
	public static String Supplier;
	public static String InvoiceNum;
	public static String InvAmount;
	public static String Currency;
	public static String InvType;
	public static String Desc;
	public static String InvDate;
	public static String PaymentTerms;
	public static String TermsDate;
	public static String AccountingDate;
	public static String LiabilityDistribution;
	public static String LinesAmount;
	public static String Distribution_DisbCombination;
	public static String Tax_TaxClassification;
	public static String Tax_IntendedUse;
	//Extra fields added
	public static String LinesDistributionSet;
	public static String InvoiceGroup;
	public static String Reference_Requester;
	public static String LinesRequester;
	public static String Tax_ShipToLocation;
	public static String Tax_Withholding;
	public static String Tax_ShipFromLocation;
	public static String Tax_LocationOfFinalDischarge;
	public static String Tax_TransactionBusinessCategory;
	public static String Tax_ProductFiscalClassification;
	public static String Tax_UserDefinedFiscalClassification;
	public static String Tax_ProductType;
	public static String Tax_ProductCategory;
	public static String Tax_AssessableValue;
	public static String Tax_TaxControlAmount;
	public static String PurchaseOrder_Number;
	public static String Name;
	public static String PurchaseOrder_Quantity;
	public static String PurchaseOrder_UnitPrice;
	public static String PurchaseOrder_UOM;
	public static String Inventory_InventoryItem;
	public static String Overlay_DistributionCombination;
	public static String Multiperiod_StartDate;
	public static String Multiperiod_EndDate;
	public static String Multiperiod_AccrualAccount;
	public static String IncomeTax_Region;
	public static String IncomeTax_Type;
	public static String Asset_Manufacturer;
	public static String Asset_Model;
	public static String Asset_SerialNumber;
	public static String Asset_Book;
	public static String Asset_AssetCategory;
	public static String CorrectedInvoice_CorrectionType;
	public static String CorrectedInvoice_Number;
	public static String Project_ProjectNumber;
	
	
	
	
	

	private static void run() throws Exception  {

		//clickElement(By.xpath("//span[contains(text(),'Invoices')]")); //Invoices
		clickElement(By.linkText("Invoices"));
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Invoice")); //Create Invoice
		
		
		//Enter fields
		
		setElementText(By.xpath("//*[contains(@id,'ic2::content')]"), BusinessUnit); //BusinessUnit
		clickElement(By.xpath("//*[contains(@id,'ap1:r2:0:ic3::lovIconId')]"));
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:ic3::_afrLovInternalQueryId:value00::content')]"), Supplier); //Supplier
		clickElement(By.xpath("//*[contains(@id,'ap1:r2:0:ic3::_afrLovInternalQueryId::search')]")); //Search
		clickElement(By.xpath("//span[contains(text(),'ABDS CONSULTORIA EM INFORMATICA LTDA')]")); //  Select ABDS CONSULTORIA EM INFORMATICA LTDA //'ABRIGO IVAN EMANUEL'
		clickElement(By.xpath("//*[contains(@id,'ap1:r2:0:ic3::lovDialogId::ok')]")); //OK
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"), InvoiceGroup); // InvoiceGroup 
		browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"), InvoiceNum); //InvoiceNum
		browser.findElement(By.xpath("//*[contains(@id,'ap1:r2:0:i2::content')]")).sendKeys(Keys.TAB);
		//setElementText(By.xpath("//option[contains(text(),'ARS - Argentine Peso')]"), Currency); //Currency
		//setElementText(By.xpath("//option[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:r2:0:i3::content')]"), Currency); //Currency
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i3::content')]"), InvAmount); //InvAmount
		setElementText(By.xpath("//option[contains(text(),'Standard')]"), InvType); //InvType
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i4::content')]"), Desc); //Description
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:id2::content')]"), InvDate); //Date
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:so3::content')]"), PaymentTerms); //PaymentTerms
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:id5::content')]"), TermsDate); //TermsDate
		//clickElement(By.xpath("//*[contains(@id, 'MAnt2:1:pm1:r1:0:ap1:cl1')]"));//Show more
		//clickElement(By.linkText("Show More"));//show more
		//clickElement(By.linkText("Accounting"));//Click Accounting link
		//setElementText(By.xpath("//*[contains(@id, 'ap1:id4::content')]"), AccountingDate); //AccountingDate
		//setElementText(By.xpath("//*[contains(@id, 'ap1:kf2CS::content')]"), LiabilityDistribution); //LiabilityDistribution
		clickElement(By.xpath("//*[contains(@id, 'ap1:sh2::_afrDscl')]")); //ExpandLines
		//Changes//
		clickElement(By.linkText("View")); // Lines View
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:_clmns\"]/td[2]")); //Columns option
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:at2:_ATp:_shwAll\"]/td[2]")); //Show all Option
		Thread.sleep(10000);
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:i26::content')]"), LinesAmount); //LinesAmount
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:kf1CS::content')]"), LinesDistributionSet); // Lines Distribution Set//
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:kf1CS::content')]"), Distribution_DisbCombination); // Distribution Combination//
		//setElementText(By.xpath("//*[contains(@id, 'pm1:r1:0:ap1:at2:_ATp:ta2:0:ic27::content')]"), Tax_TaxClassification);   // Tax Classification 
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:fcslov2:sis1:is1::content')]"),Tax_IntendedUse); // IntendedUse
		JavascriptExecutor js = (JavascriptExecutor) browser;
		WebElement Element = browser.findElement(By.xpath("//span[contains(text(),'Product Type')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		browser.findElement(By.xpath("//*[contains(@id, 'pm1:r1:0:ap1:at2:_ATp:ta2:0:ic41::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'pm1:r1:0:ap1:at2:_ATp:ta2:0:ic41::content')]"), Tax_Withholding); // Withholding
		
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic28::content')]"), Tax_ShipToLocation); //ShipToLocation
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic202::content')]"), Reference_Requester);  //Requester
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:iclov1::content')]"), Tax_ShipFromLocation); // ShipFromLocation
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:finalDischargeLocationId::content')]"), Tax_LocationOfFinalDischarge);  //LocationOfFinalDischarge
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic43::content')]"), Tax_TransactionBusinessCategory);  // TransactionBusinessCategory
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic44::content')]"), Tax_ProductFiscalClassification);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic31::content')]"), Tax_UserDefinedFiscalClassification);
		//browser.findElement(By.xpath("//*[contains(@id, 'ta2:0:so18::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'ta2:0:so18::content')]"), Tax_ProductType);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic33::content')]"), Tax_ProductCategory);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i37::content')]"), Tax_AssessableValue);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i38::content')]"), Tax_TaxControlAmount);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic21::content')]"), PurchaseOrder_Number);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:so18::content')]"), Name);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i27::content')]"), PurchaseOrder_Quantity);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i28::content')]"), PurchaseOrder_UnitPrice);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic24::content')]"), PurchaseOrder_UOM);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:in1:lovTxtId::content')]"), Inventory_InventoryItem);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:kf4CS::content')]"), Overlay_DistributionCombination);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:id3::content')]"), Multiperiod_StartDate);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:id6::content')]"), Multiperiod_EndDate);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:kf10CS::content')]"), Multiperiod_AccrualAccount);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic39::content')]"), IncomeTax_Region);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic40::content')]"), IncomeTax_Type);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i43::content')]"), Asset_Manufacturer);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i44::content')]"), Asset_Model);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:i45::content')]"), Asset_SerialNumber);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:so16::content')]"), Asset_Book);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:kf3CS::content')]"), Asset_AssetCategory);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:so17::content')]"), CorrectedInvoice_CorrectionType);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:ic42::content')]"), CorrectedInvoice_Number);
		//setElementText(By.xpath("//*[contains(@id, 'ta2:0:df3_LinePJCDFF1Iterator_PROJECT_ID_Display::content')]"), Project_ProjectNumber);
	
		
		
		
		//clickElement(By.linkText("Additional Information")); //Click link
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.xpath("//td[contains(text(),'Validate')]"));
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.xpath("//td[contains(text(),'Post to Ledger')]"));
		clickElement(By.xpath("//*[contains(@id, 'ap1:cb43')]"));// Confirmation OK
		clickElement(By.xpath("//*[contains(@id, 'ap1:cb14')]")); //Save and close
		
	}

	private static void delay(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingManualInvoicesTax_ITC.class);
			run();
		}
	}

}
