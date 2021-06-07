package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class EditingSourceLinesITC extends BaseTest{

	public static String InvoiceNumber;
	public static String Cost;
	public static String Category;
	public static String ExpenseAccount;
	public static String Location;


	private static void run(){
		
		
		clickElement(By.id("pt1:_UISmmLink::icon"));

	//	clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));

		clickElement(By.linkText("Prepare Source Lines"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:q1:value10::content"))).selectByVisibleText("New");

		clickElement(By.cssSelector("option[title=\"New\"]"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:q1:value20::content"), InvoiceNumber);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:q1::search"));
		
		clickElement(By.cssSelector("td.xu5"));
		
		clickElement(By.linkText("Actions"));
		
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AT2:_ATp:editSourceLine']/td[2]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:FixedAssetsCost1::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:FixedAssetsCost1::content"), Cost);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:preparerId::lovIconId"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:preparerId::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:categoryFlexFieldCS::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:categoryFlexFieldCS::content"), Category);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:AT1:_ATp:table1:0:DistrUnits::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:AT1:_ATp:table1:0:DistrUnits::content"), "1");

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:AT1:_ATp:table1:0:kf3CS::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:AT1:_ATp:table1:0:kf3CS::content"), ExpenseAccount);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:AT1:_ATp:table1:0:kf1CS::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:AT1:_ATp:table1:0:kf1CS::content"), Location);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:saveButton1::popEl"));
	    
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:cmi2']/td[2]"));
	   	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:dialog5::ok"));
	    	    	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:ap1:queueName::content"))).selectByVisibleText("Post");
	    
	    clickElement(By.cssSelector("option[title=\"Post\"]"));
	    
	    clickElement(By.cssSelector("span.xpc"));
	    		
	


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(EditingSourceLinesITC.class);
			run();
		}
	}

}
