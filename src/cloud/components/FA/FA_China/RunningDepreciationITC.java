package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class RunningDepreciationITC extends BaseTest{


	public static String Category;


	private static void run() throws Exception  {

		 
		clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_fixed_assets_additions')]")); //Assets
		clickElement(By.xpath("//*[contains(@id, 'ITPsh4:0:pt1:pgl2')]")); //Click Depreciation
		clickElement(By.xpath("//a[@class='xx3']")); //Calculate Depreciation
		
		
		
	}

	@SuppressWarnings("unused")
	private static void selectElement(By xpath) {
		// TODO Auto-generated method stub
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(RunningDepreciationITC.class);
			run();
		}
	}

}
