package cloud.components.AR.AR_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import itc.framework.BaseTest;

public class CreatingCustomerITC extends BaseTest{

	public static String CustomerName;
	public static String DUNSNumber;
	public static String TaxPayerNumber;
	public static String AccountDescription;
	public static String AccountEstablishedDate;
	public static String AccountAddressSet;
	public static String FromDate;
	public static String ToDate;
	public static String SiteName;
	public static String AddressLine1;
	public static String Province;
	public static String City,PostalCode;
	public static String TableToDate;

	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_receivables_billing')]")); //Billing
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); // Tasks
		clickElement(By.linkText("Create Customer")); //Create Customer Link
		setElementText(By.xpath("//*[contains(@id, '0:inputText123::content')]"),CustomerName); //Customer Name : JohnTest
		setElementText(By.xpath("//*[contains(@id, '0:inputText31::content')]"),DUNSNumber); //DUNSNumber : 45678
		setElementText(By.xpath("//*[contains(@id, '0:inputText23::content')]"),TaxPayerNumber); //TaxPayerNumber : 9988
		setElementText(By.xpath("//*[contains(@id, '1:pt_r2:0:inputText2::content')]"),AccountDescription); //AccountDescription
		clickElement(By.xpath("//*[contains(@id, 'pt_r2:0:selectOneChoice1::content')]")); //AccountType
		clickElement(By.xpath("//option[contains(text(),'Internal')]")); //Internal
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:cupanel1:pt_r2:0:inputDate1::glyph')]"), AccountEstablishedDate); //Account Established Date
		setElementText(By.xpath("//*[contains(@id, '0:setIdLovId::content')]"),AccountAddressSet); //AccountAddressSet : SET0003
		browser.findElement(By.xpath("//*[contains(@id, '0:setIdLovId::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, '0:inputDate9::content')]"), FromDate);
		setElementText(By.xpath("//*[contains(@id, 'pt_r3:0:inputDate1::content')]"), ToDate);
		
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:cupanel1:pt_r3:0:dynam1:0:inputText13::content')]"),SiteName);
		clickElement(By.xpath("//*[contains(@id, 'LocationCountry::content')]")); //Country 
		clickElement(By.xpath("//option[contains(text(),'Argentina')]"));
		setElementText(By.xpath("//*[contains(@id, 's2:i1:7:inputText2::content')]"),AddressLine1);
		setElementText(By.xpath("//*[contains(@id, 'inputComboboxListOfValues1::content')]"),Province); //province	
		setElementText(By.xpath("//*[contains(@id, '11:inputText6::content')]"),City);  //city
		setElementText(By.xpath("//*[contains(@id, 'inputText7::content')]"),PostalCode);  //PostalCode
		
		clickElement(By.xpath("//*[contains(@id, 'create::icon')]")); //Create
		setElementText(By.xpath("//*[contains(@id, 'table1:0:inputDate3::content')]"), TableToDate); //TableToDate
		clickElement(By.xpath("//*[contains(@id, '0:SiteUseCode::content')]")); //Purpose
		clickElement(By.xpath("//option[contains(text(),'Ship to')]")); //Shipto
		clickElement(By.xpath("//button[@accesskey='S']")); //Save and close
		clickElement(By.xpath("//button[@accesskey='K']")); //OK
		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingCustomerITC.class);
		run();
	}
}

}
