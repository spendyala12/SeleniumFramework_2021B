package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReinstatinganAssetITC extends BaseTest {

	public static String Book;

	private static void run() throws Exception{
	
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Reinstate Assets"));
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:Searc1:0:AP2:q1:value00::content')]")));
		dropdown.selectByIndex(2);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:Searc1:0:AP2:q1::search')]"));
		clickElement(By.className("x12z"));
		clickElement(By.xpath("//*[contains(@id,'searchRetirementUIVOCriteriaQueryResultId:_ATp:commandButton4')]"));
		clickElement(By.xpath("//*[contains(@id,'commandButton3')]"));
		clickElement(By.xpath("//*[contains(@id,'Searc1:0:AP2:commandButton5')]"));
		
		
	}
	
	
	
	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReinstatinganAssetITC.class);
			run();
		}

	}
}
