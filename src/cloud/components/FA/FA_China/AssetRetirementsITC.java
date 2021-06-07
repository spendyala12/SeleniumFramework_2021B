package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class AssetRetirementsITC extends BaseTest{


	public static String AssetNumber;
	public static String Comments;
	public static String RetiredUnits;



	private static void run() throws Exception  {

		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form
		
		clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_fixed_assets_additions']")); //Assets
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Retire Assets")); //Retire Assets link
		clickElement(By.xpath("//option[contains(text(),'ITC_US_CORP')]")); //Select us_Corp
		setElementText(By.xpath("//*[contains(@id,'AP1:q1:value20::content')]"), AssetNumber); //Enter Asset Number
		clickElement(By.xpath("//*[contains(@id,'AP1:q1::search')]")); //Search_Btn
		clickElement(By.xpath("//button[contains(@id,'ATp:cb3')]")); //Retire Units
		setElementText(By.xpath("//*[contains(@id,'AP3:it1::content')]"), Comments); //Comments
		setElementText(By.xpath("//*[contains(@id,'ATp:t1:0:UnitsRetired::content')]"), RetiredUnits); //RetireUnits to 0
		clickElement(By.xpath("//*[contains(@id,'AP3:cb4')]")); //Submit
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
			popluateParams(AssetRetirementsITC.class);
			run();
		}
	}

}
