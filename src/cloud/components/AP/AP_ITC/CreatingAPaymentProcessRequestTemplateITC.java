package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingAPaymentProcessRequestTemplateITC extends BaseTest{
	
	public static String Name;
	public static String Description;
	public static String Pay_Through_Days;
	public static String Disbursement_Bank_Account;
	
	
	public static void run() throws Exception{
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl3')]"));
		setElementText(By.xpath("//*[contains(@id,'value00::content')]"),Name);  //name field
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:q1::search')]")); //search
		clickElement(By.xpath("//*[contains(@id,'ATp:t1:0:outputText1')]"));	
		setElementText(By.xpath("//*[contains(@id,'inputText5::content')]"), Pay_Through_Days); //Pay Through Days
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:showDetailItem3::disAcr')]")); //click on Payment and Processing Options
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::lovIconId')]")); //Click drop down button
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::content')]"), Disbursement_Bank_Account);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:APscl2')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_UISmmLink::icon')]"));
		//clickElement(By.xpath("//*[contains(@id,'nvcl1')]")); //show more
		clickElement(By.xpath("//span[contains(text(),'Payments')]"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]")); //
		clickElement(By.linkText("Submit Payment Process Request"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:inputText1::content')]"),Name); //name
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:SPsb2']//a[@class='xx3']"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Payment Process Requests"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:3:pt1:AP1:ATT2:_ATTp:ATTm')]"));
		clickElement(By.xpath("//td[contains(text(),'Review Installments')]"));
		clickElement(By.linkText("Review Installments"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:3:pt1:AP1:SPb']/a"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
		clickElement(By.linkText("Submit Payment Process Request"));
			
	}

public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingAPaymentProcessRequestTemplateITC.class);
		run();
	}
}
}
