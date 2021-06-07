package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class PerformingaSourceLineRetirementITC extends BaseTest {


	public static String Book;
	public static String AssetNumber;
	public static String AmountRetired;
	
	
	private static void run() throws InterruptedException{

		//		clickElement(By.xpath("pt1:_UISmmLink::icon"));
		//		clickElement(By.xpath("_FOpt1:_UISnvr:0:nv_itemNode_fixed_assets_additions::icon"));
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Inquire Assets"));	
		
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value00::content')]"),Book);//US CORP
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1:value20::content')]"),AssetNumber); //100

		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:q1::search')]"));

		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:0:AP1:q1::search')]"));
		//clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:0:AP1:findAssetVCQueryResultId:_ATp:t1:c10')]"));
		
		clickElement(By.xpath("//a[contains(text(),'Actions')]"));
		
		clickElement(By.xpath("//td[contains(text(),'Retire Source Lines')]"));
		
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:2:AP1:at1:_ATp:t1:0:CostRetired::content')]"),AmountRetired);
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:2:AP1:selectOneChoice3::content')]"));
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:Searc1:2:AP1:commandButton3')]"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:Searc1:0:AP1:cb1')]"));
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PerformingaSourceLineRetirementITC.class);
			run();
		}
	}

}