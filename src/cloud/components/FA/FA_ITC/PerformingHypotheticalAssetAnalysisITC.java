package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PerformingHypotheticalAssetAnalysisITC extends BaseTest {


	public static String Book;
	public static String NumberofPeriods;
	public static String MajorCategory;
	public static String Cost;
	public static String DepreciationMethod;
	//public static String Name;
	
	private static void run() throws InterruptedException{

		//clickElement(By.xpath("pt1:_UISmmLink::icon"));
	//	clickElement(By.xpath("//a[@id='_FOpt1:_UISnvr:0:nv_itemNode_fixed_assets_additions']//*[local-name()='svg']"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Perform What-if Analysis"));		
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'BookTypeCodeId::content')]")));
		dropdown.selectByIndex(2);

		Select dropdown2 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:soc6::content')]")));
		dropdown2.selectByIndex(2);

		Select dropdown3 = new Select(browser.findElement(By.xpath("//*[contains(@id,'1:AP2:CurrencyCodeId::content')]")));
		dropdown3.selectByIndex(1);

		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:AP2:it1::content')]"),NumberofPeriods);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:sdi2::ti']//div[@class='x1mn']"));

		clickElement(By.xpath("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:keyFlexfield1KBIMG::icon"));
		setElementText(By.xpath("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:keyFlexfield1SPOP_query:value00::content"),MajorCategory);//EXPENSED
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:keyFlexfield1QRBT')]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:keyFlexfield1SPOP_kffResultTable']//td[1]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:keyFlexfield1SEl')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:DatePlacedInServiceId::glyph')]"));
		clickElement(By.xpath("//tr[3]//td[4]"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:DeprCostId::content')]"),Cost);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:AP2:methodCodeId::content')]"),DepreciationMethod); //150DB
		Select dropdown4 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:LifeYearId::content')]")));
		dropdown4.selectByIndex(2);
		Select dropdown5 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:LifeMonthId::content')]")));
		dropdown5.selectByIndex(1);
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:cb2']"));

		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:dialog5::ok')]"));

		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:cb1')]"));
		
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']"));

		clickElement(By.xpath("pt1:_UISnvr:0:nvcl1"));
		
		clickElement(By.xpath("//span[contains(text(),'Scheduled Processes')]"));
	
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:result::db']/table/tbody/tr[1]/td[1]"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:attachment1:iLstAtt:0:lastAttachedFile')]"));
	

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PerformingHypotheticalAssetAnalysisITC.class);
			run();
		}
	}

}



