package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAccountingForAssetsITC extends BaseTest{

	public static String book;
	public static String ProcessCategory;
	public static String EndDate;
	public static String ReportStyle;
	public static String JournalBatch;
	//public static String Assetname;
//	public static String cost;
//	public static String asset_number;
//	public static String tag_number;

	private static void run() throws InterruptedException{



		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_fixed_assets_additions"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl18"));  //Click on create accounting
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_LedgerAttr::content"),book);  //Book
		Thread.sleep(2000);
		setElementText(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content']/option[2]"), ProcessCategory);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE6_ATTRIBUTE6::content"), EndDate); //date
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE10_ATTRIBUTE10::content"),ReportStyle);      //Report Style 
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content"),JournalBatch);      //Journal Batch
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:submitButton"));   //Submit
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"));   //ok
 		

		
		
		
		
		
		
//		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl16"));
//
//
//		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content"))).selectByVisibleText("Adjustment");
//
//		clickElement(By.cssSelector("option[title=\"Adjustment\"]"));
//
//		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE10_ATTRIBUTE10::content"))).selectByVisibleText("Detail");
//
//		clickElement(By.cssSelector("option[title=\"Detail\"]"));
//
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_ATTRIBUTE13_ATTRIBUTE13::content"), "TestJournalBatch");
//
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_RecalculateEndDate::content"));
//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:r1:requestBtns:submitButton']/a/span"));
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:pt1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAccountingForAssetsITC.class);
			run();
		}
	}

}
