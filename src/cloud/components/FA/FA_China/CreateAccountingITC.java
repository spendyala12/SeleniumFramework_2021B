package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreateAccountingITC extends BaseTest{


	public static String Category;


	private static void run() throws Exception  {

		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form
		
		clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_fixed_assets_additions']")); //Assets
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage All Books")); //Manage All Books
		clickElement(By.xpath("//*[contains(@id, 'table2:0:it8::content')]")); //Select line
		clickElement(By.xpath("//*[contains(@id, 'AP1:r3:0:AT2:_ATp:cb7')]")); //CreateAccounting
		
		
		
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
			popluateParams(CreateAccountingITC.class);
			run();
		}
	}

}
