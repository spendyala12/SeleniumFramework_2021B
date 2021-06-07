package cloud.components.AP.AP_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreatingManualInvoicesITC extends BaseTest{


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
	public static String DisbCombination;
	

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
		clickElement(By.xpath("//span[contains(text(),'ABRIGO IVAN EMANUEL')]")); //Select
		clickElement(By.xpath("//*[contains(@id,'ap1:r2:0:ic3::lovDialogId::ok')]")); //OK
		browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:r2:0:ic3::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:pm1:r1:0:ap1:r2:0:i2::content')]"), InvoiceNum); //InvoiceNum
		browser.findElement(By.xpath("//*[contains(@id,'ap1:r2:0:i2::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//option[contains(text(),'ARS - Argentine Peso')]"), Currency); //Currency
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i3::content')]"), InvAmount); //InvAmount
		setElementText(By.xpath("//option[contains(text(),'Standard')]"), InvType); //InvType
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i4::content')]"), Desc); //Description
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:id2::content')]"), InvDate); //Date
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:so3::content')]"), PaymentTerms); //PaymentTerms
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:id5::content')]"), TermsDate); //TermsDate
//		clickElement(By.xpath("//*[contains(@id, 'MAnt2:1:pm1:r1:0:ap1:cl1')]"));//Show more
		clickElement(By.linkText("Show More"));//show more
		clickElement(By.linkText("Accounting"));//Click Accounting link
		setElementText(By.xpath("//*[contains(@id, 'ap1:id4::content')]"), AccountingDate); //AccountingDate
		setElementText(By.xpath("//*[contains(@id, 'ap1:kf2CS::content')]"), LiabilityDistribution); //LiabilityDistribution
		clickElement(By.xpath("//*[contains(@id, 'ap1:sh2::_afrDscl')]")); //ExpandLines
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:i26::content')]"), LinesAmount); //LinesAmount
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:kf1CS::content')]"), DisbCombination);
		clickElement(By.linkText("Additional Information")); //Click link
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.xpath("//td[contains(text(),'Validate')]"));
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.xpath("//td[contains(text(),'Post to Ledger')]"));
		clickElement(By.xpath("//*[contains(@id, 'ap1:cb43')]"));// Confirmation OK
		clickElement(By.xpath("//*[contains(@id, 'ap1:cb14')]")); //Save and close
			
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingManualInvoicesITC.class);
			run();
		}
	}

}
