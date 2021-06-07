package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PerformingWhatifDepreciationAnalysisITC extends BaseTest {


	public static String Book;
	public static String  NumberofPeriods;
	public static String Name;
	public static String LifeinMonths;
	
	private static void run() throws InterruptedException{

		//		clickElement(By.xpath("pt1:_UISmmLink::icon"));
		//		clickElement(By.xpath("_FOpt1:_UISnvr:0:nv_itemNode_fixed_assets_additions::icon"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Perform What-if Analysis"));		
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'BookTypeCodeId::content')]")));
		dropdown.selectByIndex(2);

		Select dropdown2 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:soc6::content')]")));
		dropdown2.selectByIndex(2);

		Select dropdown3 = new Select(browser.findElement(By.xpath("//*[contains(@id,'1:AP2:CurrencyCodeId::content')]")));
		dropdown3.selectByIndex(1);
				
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:AP2:it1::content')]"),NumberofPeriods);
		Select dropdown4 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:soc1::content')]")));
		dropdown4.selectByIndex(2);
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:methodCodeId::lovIconId')]"));
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:methodCodeId::dropdownPopup::popupsearch')]"));
		
		setElementText(By.xpath("//*[contains(@id,'_afrLovInternalQueryId:value00::content')]"),Name);
				
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP2:methodCodeId::_afrLovInternalQueryId::search')]"));
		
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:methodCodeId_afrLovInternalTableId::db']/table/tbody/tr[1]/td[1]"));

		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:methodCodeId::lovDialogId::ok')]"));
		
		Select dropdown5 = new Select(browser.findElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:LifeYearId::content')]")));
		dropdown5.selectByIndex(1);
				
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:LifeMonthId::content')]"),LifeinMonths);
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:cb2']"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP2:dialog5::ok')]"));
		

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PerformingWhatifDepreciationAnalysisITC.class);
			run();
		}
	}

}