package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class AssetAdjustmentandTrackingITC extends BaseTest{


	public static String AssetNumber;
	public static String Comments;
	public static String NewUnits;
	public static String NewNewUnits;
	public static String DepExpAccount;
	public static String Location;


	private static void run() throws Exception  {

		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form
		
		clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_fixed_assets_additions']")); //Assets
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Transfer Assets")); //Transfer Assets link
		clickElement(By.xpath("//option[contains(text(),'ITC_US_CORP')]")); //Select us_Corp
		setElementText(By.xpath("//*[contains(@id,'AP1:q1:value20::content')]"), AssetNumber); //Enter Asset Number
		clickElement(By.xpath("//*[contains(@id,'AP1:q1::search')]")); //Search_Btn
		clickElement(By.xpath("//*[contains(@id,'ATp:commandButton1')]")); //Transfer Asset Btn
		setElementText(By.xpath("//*[contains(@id,'AP1:inputText4::content')]"), Comments); //Comments
		setElementText(By.xpath("//*[contains(@id,'ATp:table1:0:newUnits::content')]"), NewUnits); //NewUnits to 0
		clickElement(By.xpath("//*[contains(@id,'ATp:create::icon')]")); //'+' Assignment Details
		setElementText(By.xpath("//*[contains(@id,'newUnits::content')]"), NewNewUnits); //NewNewUnits
		setElementText(By.xpath("//*[contains(@id,'ATp:table1:1:kf1CS::content')]"), DepExpAccount);
		setElementText(By.xpath("//*[contains(@id,'ATp:table1:1:kf3CS::content')]"), Location);
		clickElement(By.xpath("//*[contains(@id,'AP1:commandButton2')]")); //Submit Button
		clickElement(By.xpath("//*[contains(@id,'AP1:done')]")); //Done
		
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
			popluateParams(AssetAdjustmentandTrackingITC.class);
			run();
		}
	}

}
