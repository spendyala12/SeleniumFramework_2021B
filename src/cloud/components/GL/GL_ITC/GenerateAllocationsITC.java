package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class GenerateAllocationsITC extends BaseTest{
	
	public static String Rule_Set;
	public static String Accounting_Period;
	
	private static void run() throws InterruptedException{
		
	
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nvcl1')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nv_itemNode_general_accounting_journals')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOTsdi_JournalEntryPage_itemNode_FndTasksList::ti')]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl11"));  //Generate General Ledger Allocations
		clickElement(By.xpath("//*[contains(@id,'nameId::lovIconId')]")); //Rule set drop down
		clickElement(By.xpath("//*[contains(@id,'nameId::dropdownPopup::popupsearch')]"));
		Thread.sleep(2000);
		//*[contains(@id,'nameId::dropdownPopup::popupsearch')]	
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:nameId::_afrLovInternalQueryId:value00::content"), Rule_Set);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:nameId::_afrLovInternalQueryId::search"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:nameId_afrLovInternalTableId::db\"]/table/tbody/tr")); //selecting row
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:nameId::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:i1:0:parlovid::cntnrSpan"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:i1:0:parlovid::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:i1:0:parlovid::_afrLovInternalQueryId:value00::content"), Accounting_Period);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:i1:0:parlovid::_afrLovInternalQueryId::search"));
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:i1:0:parlovid_afrLovInternalTableId::db\"]/table/tbody/tr")); //Selecting row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:i1:0:parlovid::lovDialogId::ok"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:sbc1::content"));   //Post Allocations	
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:submitButton"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"));
		
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(GenerateAllocationsITC.class);
			run();
		}
	}

}
