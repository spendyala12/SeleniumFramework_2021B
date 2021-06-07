package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import itc.framework.BaseTest;

public class ReconcilewithGeneralLedgerITC extends BaseTest{

	public static String Name;
	public static String RequestName;
	public static String Ledger;
	public static String AccountingPriod;

	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id,'panel:scheduleProcess')]")); //add new process
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::lovIconId')]"));
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::dropdownPopup::popupsearch')]"));
		setElementText(By.xpath("//*[contains(@id,'selectOneChoice2::_afrLovInternalQueryId:value00::content')]"),Name); //name
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::_afrLovInternalQueryId::search')]"));
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2_afrLovInternalTableId::db')]"));
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::lovDialogId::ok')]"));
		clickElement(By.xpath("//*[contains(@id,'pt1:snpokbtnid')]")); //ok btn
		setElementText(By.xpath("//*[contains(@id,'basicReqBody:dynam1:0:it1::content')]"),RequestName); 
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'basicReqBody:dynam1:0:soc1::content')]"),Ledger);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'basicReqBody:dynam1:0:aTTRIBUTE6Id::content')]"),AccountingPriod); 
		clickElement(By.xpath("//*[contains(@id,'requestBtns:submitButton')]")); //submit
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));
		clickElement(By.xpath("//*[contains(@id,'processRefreshId::icon')]")); //refresh
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']")); //navigator
		//clickElement(By.linkText("Show More"));
		clickElement(By.xpath("//span[contains(text(),'Invoices')]"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]")); 
		clickElement(By.linkText("Payables to Ledger Reconciliation"));
		
		WebElement ele1 = browser.findElement(By.id("saw_213725_3_1"));
		browser.switchTo().frame(ele1);
		setElementText(By.id("saw_213725_3_1"),Ledger);
		browser.switchTo().defaultContent();

		WebElement ele2 = browser.findElement(By.id("saw_213725_4_1"));
		browser.switchTo().frame(ele2);
		setElementText(By.id("saw_213725_4_1"),RequestName);
		browser.switchTo().defaultContent();

		WebElement ele3 = browser.findElement(By.id("gobtn"));
		browser.switchTo().frame(ele3);
		clickElement(By.id("gobtn"));
		browser.switchTo().defaultContent();

	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReconcilewithGeneralLedgerITC.class);
			run();
		}
	}
}