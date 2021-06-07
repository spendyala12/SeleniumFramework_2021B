package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;


public class ClosingAPayablesPeriodITC extends BaseTest{

	public static String Periods;
	public static String Name1;
	public static String Ledger;
	public static String From_Accounting_Date;
	public static String To_Accounting_Date;
	public static String Name2;
	public static String From_Accounting_Date_2;
	public static String To_Accounting_Date_2;

	private static void run() throws Exception{
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_payables_payables_invoices')]"));
		clickElement(By.xpath("//*[contains(@id,'0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'0:_FOTRaT:0:RAtl16')]"));
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:AT1:_ATp:table1:1:ot9')]"));
		clickElement(By.id("_afrFilter_FOpt1_afr__FOr1_afr_0_afr__FOSritemNode_payables_payables_invoices_afr_0_afr_MAnt2_afr_1_afr_pm1_afr_r1_afr_1_afr_ap1_afr_AT1_afr__ATp_afr_table1_afr_idPeriodName::content")); 
		setElementText(By.id("_afrFilter_FOpt1_afr__FOr1_afr_0_afr__FOSritemNode_payables_payables_invoices_afr_0_afr_MAnt2_afr_1_afr_pm1_afr_r1_afr_1_afr_ap1_afr_AT1_afr__ATp_afr_table1_afr_idPeriodName::content"), Periods);
		WebElement element = browser.findElement(By.id("_afrFilter_FOpt1_afr__FOr1_afr_0_afr__FOSritemNode_payables_payables_invoices_afr_0_afr_MAnt2_afr_1_afr_pm1_afr_r1_afr_1_afr_ap1_afr_AT1_afr__ATp_afr_table1_afr_idPeriodName::content"));;
		element.sendKeys(Keys.RETURN);
		 
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:1:ap1:AT1:_ATp:table1::db')]"));
		 
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:AT1:_ATp:ctb3']/a/span")); 
		 
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:1:ap1:d13::ok')]"));
		 
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:1:ap1:APb')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:APb')]"));
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		clickElement(By.id("_FOpt1:nv_moreLk")); 
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_tools_scheduled_processes')]"));
		clickElement(By.cssSelector("span.xr5")); 
		setElementText(By.xpath("//*[contains(@id,'0:pt1:selectOneChoice2::content')]"),Name1);
		clickElement(By.xpath("//*[contains(@id,':0:pt1:snpokbtnid')]"));
		setElementText(By.xpath("//*[contains(@id,'0:r1:0:r1:basicReqBody:paramDynForm_LEDGER::content')]"),Ledger);
		clickElement(By.cssSelector("td.p_AFFocused.xx2"));
		clickElement(By.xpath("//*[contains(@id,'0:r1:basicReqBody:paramDynForm_LEDGER::lovDialogId::ok')]"));
		setElementText(By.xpath("//*[contains(@id,'r1:basicReqBody:paramDynForm_ATTRIBUTE7_ATTRIBUTE7::content')]"),From_Accounting_Date);
		clickElement(By.xpath("//*[contains(@id,'r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content')]"));
		setElementText(By.xpath("//*[contains(@id,'r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content')]"),To_Accounting_Date);
		clickElement(By.cssSelector("span.x1ig"));
		clickElement(By.xpath("//*[contains(@id,'r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));
		clickElement(By.xpath("//*[contains(@id,'0:pt1:panel:processRefreshId::icon')]"));
		clickElement(By.cssSelector("span.xr5"));
		setElementText(By.xpath("//*[contains(@id,'0:pt1:selectOneChoice2::content')]"),Name2);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt1:0:pt1:snpokbtnid')]"));
		setElementText(By.xpath("//*[contains(@id,'r1:basicReqBody:paramDynForm_ATTRIBUTE4_ATTRIBUTE4::content')]"),From_Accounting_Date_2);
		clickElement(By.xpath("//*[contains(@id,'r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content')]"));
		setElementText(By.xpath("//*[contains(@id,'r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content')]"),To_Accounting_Date_2);
		clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt1:0:pt1:r1:0:r1:0:r1:requestBtns:submitButton']/a/span"));
		new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:r1:0:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content"))).selectByVisibleText("Yes");
		clickElement(By.cssSelector("option[title=\"Yes\"]"));
		clickElement(By.xpath("//*[contains(@id,'r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));
		clickElement(By.xpath("//*[contains(@id,'0:pt1:panel:processRefreshId::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'0:pt1:panel:processRefreshId::icon')]"));
		new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:r1:0:r1:0:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content"))).selectByVisibleText("Yes");
		clickElement(By.cssSelector("option[title=\"Yes\"]"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ClosingAPayablesPeriodITC.class);
			run();
		}
	}

}