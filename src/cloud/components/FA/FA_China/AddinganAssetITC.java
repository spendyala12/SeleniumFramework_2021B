package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class AddinganAssetITC extends BaseTest{


	public static String Category;
	public static String Description;
	public static String Cost;
	public static String Units;
	public static String ExpenseAccount;
	public static String Location;
	public static String AssetNumber;
	public static String AssetKey;

	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form

		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_fixed_assets_additions')]")); //Assets
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Add Asset")); //Add Asset
		
		clickElement(By.xpath("//*[contains(@id, 'book::content')]")); //Book
		clickElement(By.xpath("//option[contains(text(),'ITC_US_CORP')]")); //Select US_Corp
		clickElement(By.xpath("//option[contains(text(),'Capitalized')]")); //AssetType
		setElementText(By.xpath("//*[contains(@id, 'dynam1:0:kf1CS::content')]"), Category); //Select Category
		setElementText(By.xpath("//*[contains(@id, 'descriptionId::content')]"), Description); //Set Desc
		setElementText(By.xpath("//*[contains(@id, 'dynam1:0:it1::content')]"), Cost); //Enter Cost
		setElementText(By.xpath("//*[contains(@id, 'dynam1:0:it2::content')]"), Units); //Enter Units
		setElementText(By.xpath("//*[contains(@id, 'dynam1:0:kf2CS::content')]"), ExpenseAccount); //Expense Account
		setElementText(By.xpath("//*[contains(@id, 'dynam1:0:kf3CS::content')]"), Location); //Location
		clickElement(By.xpath("//*[contains(@id, 'commandButton1')]")); //Click Next
		setElementText(By.xpath("//*[contains(@id, 'inputText4::content')]"), AssetNumber); //AssetNumber
		setElementText(By.xpath("//*[contains(@id, 'kf2CS::content')]"), AssetKey); //AssetKey
		clickElement(By.xpath("//span[contains(text(),'ave and Close')]")); //Save and close
		clickElement(By.xpath("//*[contains(@id, 'outputText24')]")); //Click Description
		clickElement(By.xpath("//*[contains(@id, 'commandButton15')]")); //Submit
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddinganAssetITC.class);
			run();
		}
	}

}
