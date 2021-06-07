package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreatingIncomeStatementClosingJournalsITC extends BaseTest {
	public static String Alias;
	//public static String Closing_Account;
	public static String Recipient;
	public static String Category;

	private static void run() throws Exception{
		
		clickElement(By.id("pt1:nv_itemNode_general_accounting_period_close"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiPeriodCloseRegionalArea::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl7")); // Create Income Statement Closing Journals
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:soc1::content"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1CS::content"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1KBIMG::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1_kffSearchSha::lovIconId"));//Click on drop down
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1_kffSearchSha::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1_kffSearchSha::_afrLovInternalQueryId:value00::content"), Alias);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1_kffSearchSha::_afrLovInternalQueryId::search"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1_kffSearchSha_afrLovInternalTableId::db\"]/table/tbody/tr"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1_kffSearchSha::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1SEl")); //Ok btn
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:settingsButton")); //Click on Process Options btn
		Thread.sleep(2000); 
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:d1::ok"));
		Thread.sleep(2000); 
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:advButton")); //click on Advance btn
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:scheduleTab11::disAcr")); //click on Schedule and Output option is not there
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:notifyTab::disAcr"));  //click on notification
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:pCol:addaction::icon"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:userName::content"), Recipient);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition::drop"));
		clickElement(By.xpath("//*[text()='On Success']"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[text()='On Error']"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition::drop"));
		
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:addActionDlg::ok"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBtns:submitButton"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:advRequestBtns:confirmationPopup:confirmSubmitDialog::ok"));
		
		clickElement(By.id("_FOpt1:_UISmmLink::icon"));   //Click on Navigation
		clickElement(By.id("_FOpt1:nv_itemNode_general_accounting_journals"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1")); //Manage Journal
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP:value40::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP:value40::cntnr"));  //drop down
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP:value50::content"))).selectByIndex(0);  //click on Batch Status
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP::search"));  //click on search btn
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:t1::db\"]/table/tbody/tr[2]")); //Selecting row
		
		                   
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:ATm"));//Action
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:editMenuItem")); //Edit Journal
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:3:pt1:ap1:postBatch"));  //Click on post btn
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:3:pt1:ap1:userResponsePopupDialogButtonOk")); //click on ok btn
		
		
		
		
		
		
		
		
		
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsdiPeriodCloseRegionalArea::icon"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTRaT:0:RAtl7"));
//		
//		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:kf1CS::content"), Closing_Account);
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:settingsButton"));
//
//		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:timeFormatSetting::content"))).selectByIndex(3);
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:d1::ok"));
//		clickElement(By.cssSelector("span.xpc"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:scheduleTab11::disAcr"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:notifyTab::disAcr"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:pCol:addaction::icon"));
//
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:userName::content"), Recipient);
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition::drop"));
//		clickElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:oncondition::drop"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBody:r1:0:addActionDlg::ok"));
//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBtns:submitButton']/a/span"));
//
////		captureOutput(By.xpath("//span[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBtns:confirmationPopup:pt_ol1']/label"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:advRequestBtns:confirmationPopup:confirmSubmitDialog::ok"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSsdiitemNode_general_accounting_journals::icon"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:_FOTRaT:0:RAtl1"));
//
//
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP:value40::content"), Category);
//
//		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP:value50::content"))).selectByVisibleText("Unposted");
//
//		clickElement(By.cssSelector("option[title=\"Unposted\"]"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:queryP::search"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:1:pt1:ap1:AT1:_ATp:t1:1:commandLink3"));
//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:2:pt1:ap1:postBatch']/table/tbody/tr/td/a/span"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:1:MAnt2:2:pt1:ap1:userResponsePopupDialogButtonOk"));

	}

	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingIncomeStatementClosingJournalsITC.class);
			run();
		}

	}


}