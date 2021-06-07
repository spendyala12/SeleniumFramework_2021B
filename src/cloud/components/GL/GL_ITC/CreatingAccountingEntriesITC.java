package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreatingAccountingEntriesITC extends BaseTest {
	public static String Name;
	//public static String Subledger_Application;
	public static String Ledger;
	public static String Process_Category;
	public static String Journal_Batch;

	private static void run() throws Exception{

		clickElement(By.id("pt1:_UISmmLink::icon"));
		//clickElement(By.linkText("More..."));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		//clickElement(By.id("pt1:nv_itemNode_tools_scheduled_processes_fuse_plus"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_tools_scheduled_processes_fuse_plus"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:scheduleProcess"));   //Schedule New Process
		               
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2::dropdownPopup::popupsearch"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId:value00::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId:value00::content"), Name);		
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2::_afrLovInternalQueryId::search"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2_afrLovInternalTableId::db\"]/table/tbody/tr[1]")); //Selecting row
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:selectOneChoice2::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:snpokbtnid"));  //ok btn
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:srspw1::close")); //Close btn
		
		clickElement(By.id("_FOpt1:_UISmmLink::icon")); //Navigation btn
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_UISnvr:0:nv_itemNode_payables_payables_invoices"));        
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon")); //clicking on Task
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl11")); //Creating Accounting
		Thread.sleep(2000);
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_SubledgerApplicationAttr::content"))).selectByVisibleText("Payables");
//		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_SubledgerApplicationAttr::content"), Subledger_Application);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::_afrLovInternalQueryId:value00::content"), Ledger);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::_afrLovInternalQueryId::search"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr_afrLovInternalTableId::db\"]/table/tbody/tr"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::lovDialogId::ok"));
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content"));
		Thread.sleep(3000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content"), Process_Category); //Process Category	
		Thread.sleep(3000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content"), Journal_Batch);
		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content"))).deselectByVisibleText("03-083111");
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:requestBtns:submitButton")); //Submit the process
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"));
		
		
		
		
//		clickElement(By.cssSelector("span.xpc"));
//		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:selectOneChoice2::lovIconId"));

//		clickElement(By.xpath("//tr[@class='xe6 p_AFSelected']"));
		
//		clickElement(By.xpath("//button[@id='pt1:USma:0:MAnt1:0:pt1:snpokbtnid']"));
//		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:r1:0:r1:0:cb1"));
//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		clickElement(By.id("pt1:nv_itemNode_payables_payables_invoices"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl10"));
//
//		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_SubledgerApplicationAttr::content"))).selectByVisibleText(Subledger_Application);
//
//		clickElement(By.cssSelector("option[title=\"Payables\"]"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::lovIconId"));
//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::dropdownPopup::dropDownContent::db']/table/tbody/tr[9]/td"));
//
//		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content"))).selectByVisibleText(Process_Category);
//		
//		clickElement(By.cssSelector("option[title=\"Invoices\"]"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE9_ATTRIBUTE9::content"));
//		clickElement(By.cssSelector("option[title=\"All\"]"));
//		clickElement(By.xpath("(//option[@value='1'])[7]"));
//		
//		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content"), Journal_Batch);
//
//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:requestBtns:submitButton']/a/span"));
////		captureOutput(By.xpath("//span[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:requestBtns:confirmationPopup:pt_ol1']/label"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"));

	}

	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAccountingEntriesITC.class);
			run();
		}

	}


}
