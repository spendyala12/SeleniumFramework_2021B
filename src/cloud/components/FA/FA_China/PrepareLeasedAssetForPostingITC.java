package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class PrepareLeasedAssetForPostingITC extends BaseTest{


	public static String AssetKey;
	public static String Location;
	
	
	private static void run() throws Exception  {

		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form
		
		clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_fixed_assets_additions']")); //Assets
		clickElement(By.xpath("//*[contains(@id,'AP1:soc1::drop')]")); //Asset Drop down
		clickElement(By.xpath("//li[contains(text(),'ITC_BR_CORP - BRL')]")); //ITC_BR_CORP - BRL
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage Leases")); //Manage Leases
		clickElement(By.xpath("//span[@class='xng'][contains(text(),'T31343')]")); //Click on Lease number
		clickElement(By.linkText("Assets")); //Assets Tab
		clickElement(By.xpath("//*[contains(@id,'AP2:AT8:_ATp:t7:0:cil21')]")); //Asset Description
		setElementText(By.xpath("//*[contains(@id,'ap1:kf2CS::content')]"), AssetKey);
		setElementText(By.xpath("//*[contains(@id,'ATp:table1:0:kf1CS::content')]"), Location);
		clickElement(By.xpath("//td[@class='x3ea']//a[@class='xx3']")); //Save and Close
		clickElement(By.xpath("//*[contains(@id,'AP2:SPb')]")); //Done
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:r1:0:ap1:SPb')]")); //Done
		clickElement(By.xpath("//tr[@class='p_AFFocused p_AFSelected xep']//td[@class='xeq x1of']")); //Click on Lease Number
		clickElement(By.xpath("//span[contains(text(),'Ready to Post')]")); //Ready to Post
		
		
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
			popluateParams(PrepareLeasedAssetForPostingITC.class);
			run();
		}
	}

}
