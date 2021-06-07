package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PerformingACostRetirementITC extends BaseTest{

	public static String Book;
	public static String AssetNumber;
	public static String Comments;
	public static String CostRetired;
	public static String ProceedsofSale;
	public static String SoldTo;


	private static void run(){

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Retire Assets"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value00::content')]"),Book);//US CORP
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value20::content')]"),AssetNumber); //100

		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:0:AP1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:findAssetVCQueryResultId:_ATp:cb2')]"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:3:AP2:inputText8::content')]"),Comments);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:3:AP2:costRetired::content')]"),CostRetired);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:3:AP2:proceedsOfSale::content')]"),ProceedsofSale);
		
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:3:AP2:selectOneChoice3::content')]")));
		dropdown.selectByIndex(2);
		
		
		Select dropdown2 = new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:3:AP2:selectOneChoice2::content')]")));
		dropdown2.selectByIndex(1);
		
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:3:AP2:inputText1::content')]"),SoldTo);
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:3:AP2:commandButton7')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:0:AP1:cb1')]"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PerformingACostRetirementITC.class);
			run();
		}
	}

}
