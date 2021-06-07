package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ViewingDepreciationAccountingEntriesITC extends BaseTest{

	public static String Book;
	public static String  Asset_Number;
	//public static String Search;

	private static void run() throws InterruptedException{

//		clickElement(By.xpath("pt1:_UISmmLink::icon"));
//		clickElement(By.xpath("_FOpt1:_UISnvr:0:nv_itemNode_fixed_assets_additions::icon"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Inquire Assets"));		
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,':MAnt2:1:AP4:r1:0:r2:0:q1:value00::content')]")));
		dropdown.selectByIndex(2);
		setElementText(By.xpath("//*[contains(@id,':MAnt2:1:AP4:r1:0:r2:0:q1:value20::content')]"),Asset_Number);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP4:r1:0:r2:0:q1::search')]"));
		clickElement(By.linkText("Depreciation"));
		clickElement(By.linkText("//tr[@class='xep p_AFSelected']//td[@class='x12z']"));
		clickElement(By.linkText("//span[contains(text(),'View Accounting')]"));
		

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ViewingDepreciationAccountingEntriesITC.class);
			run();
		}
	}

}
