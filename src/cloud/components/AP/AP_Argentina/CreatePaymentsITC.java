package cloud.components.AP.AP_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreatePaymentsITC extends BaseTest{


	public static String BusinessUnit;
	public static String Supplier;
	public static String PaymentDate;
	public static String Desc;
	public static String BankAccount;
	public static String PaymentMethod;
	public static String PaymentProcessProfile;
	public static String PaymentDocument;
	public static String PPRName;
	public static String PayThroughDate;
	public static String PayFromDate;
	public static String FromPaymentPriority;
	public static String ToPaymentPriority;
	public static String DateBasis;
	public static String IncludeZeroAmountInvoices;
	public static String SupplierType;
	public static String Template;
	public static String SelectionCriteria_PaymentMethod;
	public static String InvoiceConversionRateType;
	public static String SupplierOrParty;
	public static String InvoiceGroup;
	public static String RemitToAccount;
	

	private static void run() throws Exception  {


		clickElement(By.linkText("Payments")); //Payments
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Payment")); //Create Payment

		//Enter fields
		setElementText(By.xpath("//*[contains(@id,'AP1:OrgUiId::content')]"), BusinessUnit); //BusinessUnit
		browser.findElement(By.xpath("//*[contains(@id,'AP1:OrgUiId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id,'AP1:payeeNameId::content')]"), Supplier); //Supplier
		setElementText(By.xpath("//*[contains(@id,'AP1:checkDate::content')]"), PaymentDate); //PaymentDate
		clickElement(By.xpath("//*[contains(@id,'AP1:paymentTypeFlagUi::content')]"));//Type
		clickElement(By.xpath("//option[contains(text(),'Quick')]"));//Select Payment Type
		setElementText(By.xpath("//*[contains(@id,'AP1:inputText4::content')]"), Desc); //Description
		setElementText(By.xpath("//*[contains(@id,'AP1:bankAccountNameId::content')]"), BankAccount); //BankAccount
		browser.findElement(By.xpath("//*[contains(@id,'AP1:bankAccountNameId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id,'paymentMethodNameUiId::content')]"), PaymentMethod); //PaymentMethod
		setElementText(By.xpath("//*[contains(@id,'AP1:paymentProfileUICompId::content')]"), PaymentProcessProfile); //PaymentTerms
		setElementText(By.xpath("//*[contains(@id,'AP1:PaymentDocumentIdUi::content')]"), PaymentDocument); //PaymentDocument
		clickElement(By.xpath("//*[contains(@id,'ATp:commandToolbarButton1::icon')]"));//Select and add button
		clickElement(By.xpath("//*[contains(text(),'T3INV3708')]"));
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cb1']"));//Apply Button
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:dialog1::ok']")); //OK
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:cb5']")); //Save and Close
		clickElement(By.xpath("//button[@id='_FOd1::msgDlg::cancel']"));//Confirmation msg
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:cb6']"));//Cancel
		//clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAyes']"));
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Submit Payment Process Request")); //Submit Payment Process Request
		setElementText(By.xpath("//*[contains(@id,'ap1:inputText1::content')]"),PPRName);
		//setElementText(By.xpath("//*[contains(@id,'ap1:templateNameId::content')]"),Template);
		setElementText(By.xpath("//*[contains(@id,'ap1:inputDate2::content')]"),PayThroughDate);
		//setElementText(By.xpath("//*[contains(@id,'ap1:inputDate4::content')]"),PayFromDate);  //PayFromDate
		//setElementText(By.xpath("//*[contains(@id,'ap1:inputText2::content')]"),FromPaymentPriority);   //FromPaymentPriority
		//setElementText(By.xpath("//*[contains(@id,'ap1:inputText3::content')]"),ToPaymentPriority);  // ToPaymentPriority
		//setElementText(By.xpath("//*[contains(@id,'ap1:selectOneChoice12::content')]"),DateBasis);  //  DateBasis
		//setElementText(By.xpath("//*[contains(@id,'ap1:soc1::content')]"),IncludeZeroAmountInvoices);   // IncludeZeroAmountInvoices
		//setElementText(By.xpath("//*[contains(@id,'ap1:selectOneChoice13::content')]"),SupplierType);  // SupplierType
		//setElementText(By.xpath("//*[contains(@id,'paymentMethodNameId::content')]"),SelectionCriteria_PaymentMethod);  // SelectionCriteria_PaymentMethod
		//setElementText(By.xpath("//*[contains(@id,'selectOneChoice2::content')]"),InvoiceConversionRateType);  // InvoiceConversionRateType
		//setElementText(By.xpath("//*[contains(@id,'partyNameId::content')]"),SupplierOrParty);  // SupplierOrParty
		//setElementText(By.xpath("//*[contains(@id,'batchNameId::content')]"),InvoiceGroup);  // InvoiceGroup
		clickElement(By.xpath("//*[contains(@id,'ap1:SPsb2')]"));//Submit
			
		
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatePaymentsITC.class);
			run();
		}
	}

}
