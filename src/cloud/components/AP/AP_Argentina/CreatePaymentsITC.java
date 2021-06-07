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
		clickElement(By.xpath("//*[contains(text(),'T3INV7972')]"));
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cb1']"));//Apply Button
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:dialog1::ok']")); //OK
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:cb5']")); //Save and Close
		clickElement(By.xpath("//button[@id='_FOd1::msgDlg::cancel']"));//Confirmation msg
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:cb6']"));//Cancel
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAyes']"));
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Submit Payment Process Request")); //Submit Payment Process Request
		setElementText(By.xpath("//*[contains(@id,'ap1:inputText1::content')]"),PPRName);
		setElementText(By.xpath("//*[contains(@id,'ap1:inputDate2::content')]"),PayThroughDate);
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
