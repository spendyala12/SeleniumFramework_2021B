package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreatingBalanceSheetClosingJournalsITC extends BaseTest {
	public static String Closing_Account;
	public static String Recipient;
	public static String Category;
	public static String Out_ReqId;

	private static void run() throws Exception{

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsdiPeriodCloseRegionalArea::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTRaT:0:RAtl8"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1CS::content"), Closing_Account);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:settingsButton"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:timeFormatSetting::content"))).selectByIndex(3);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:d1::ok"));
		clickElement(By.cssSelector("span.xpc"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:scheduleTab11::disAcr"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:notifyTab::disAcr"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:pCol:addaction::icon"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:userName::content"), Recipient);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition::drop"));
		clickElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition::drop"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:addActionDlg::ok"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBtns:submitButton']/a/span"));

		captureOutput(By.xpath("//span[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBtns:confirmationPopup:pt_ol1']/label"), Out_ReqId);
		System.out.println(getValue("confirmation"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBtns:confirmationPopup:confirmSubmitDialog::ok"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSsdiitemNode_general_accounting_journals::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:_FOTRaT:0:RAtl1"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP:operator1::content"))).selectByVisibleText("Contains");
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP:value10::content"), getValue("Confirmation"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP:value40::content"), Category);
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP:value50::content"))).selectByVisibleText("Unposted");


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP::search"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:AT1:_ATp:t1::db']/table/tbody/tr/td[1]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:AT1:_ATp:commandToolbarButton3"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:2:pt1:ap1:userResponsePopupDialogButtonOk"));
		
		System.out.println(getValue("confirmation"));

	}

	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingBalanceSheetClosingJournalsITC.class);
			run();
		}

	}


}