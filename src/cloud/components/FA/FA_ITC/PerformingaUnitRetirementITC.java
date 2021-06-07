package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PerformingaUnitRetirementITC extends BaseTest{

	public static String Book;
	public static String AssetNumber;
	public static String RetiredUnit;
	public static String ProceedsofSale;

	private static void run() throws Exception{
	
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Retire Assets"));
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value00::content')]")));
		dropdown.selectByIndex(2);
		Select dropdown2 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value40::content')]")));
		dropdown2.selectByIndex(2);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value20::content')]"),AssetNumber);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:0:AP1:q1::search')]"));
		clickElement(By.xpath("//tr[@class='xep p_AFSelected']//td[@class='x12z']"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:findAssetVCQueryResultId:_ATp:cb3')]"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:1:AP3:it1::content')]"));
		clickElement(By.xpath("//*[contains(@id,'1:Searc1:1:AP3:AT2:_ATp:t1:0:UnitsRetired::content')]"));
		
		WebElement ele= browser.findElement(By.xpath("//*[contains(@id,'1:Searc1:1:AP3:AT2:_ATp:t1:0:UnitsRetired::content')]"));
		ele.clear();
		
		setElementText(By.xpath("//*[contains(@id,'1:Searc1:1:AP3:AT2:_ATp:t1:0:UnitsRetired::content')]"),RetiredUnit);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:1:AP3:proceedsOfSale::content')]"),ProceedsofSale);
		
		Select dropdown3 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:1:AP3:soc1::content')]")));
		dropdown3.selectByIndex(1);
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:1:AP3:cb4')]"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:0:AP1:cb1')]"));	
		
	}
	
	
	
	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PerformingaUnitRetirementITC.class);
			run();
		}

	}
}
