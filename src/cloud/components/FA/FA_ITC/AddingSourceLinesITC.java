package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class AddingSourceLinesITC extends BaseTest{

	public static String book;
	public static String Assetname;
	public static String cost;
	public static String asset_number;
	public static String tag_number;
	public static String AssetType;

	private static void run(){

		clickElement(By.xpath("//a[@title='Navigator']"));
		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl4"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value30::content"));
		//		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1:value30::content"))).selectByVisibleText(AssetType);
		clickElement(By.cssSelector("option[title=\"CIP\"]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:q1::search"));
		clickElement(By.cssSelector("td.xu5"));
		//		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:0:SrchTF:0:AP2:tbl1:_ATp:t1::db']/table/tbody/tr[1]/td[1]"));

		//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:0:SrchTF:0:AP2:tbl1:_ATp:t1::db']/table/tbody/tr[1]/td[1]"));
		clickElement(By.linkText("Actions"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:tbl1:_ATp:menumodifySrcLine']/td[2]"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:tbl1:_ATp:cmiaddSrcLine']/td[2]"));
		clickElement(By.cssSelector("td.xu5"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText78::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText78::content"), "204542");

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText2::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText2::content"), "1");
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText72::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText72::content"), "Test Adding Source Lines");
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText51::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:inputText51::content"), "2");
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:fixedCost::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:fixedCost::content"), "2233");
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:TransSuppName_LOV::content"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:TransSuppName_LOV::content"), "Test Supplier 1");
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:AT1:_ATp:table1:0:TransSuppNumber_LOV::content"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:1:AP1:commandButton2"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:SrchTF:0:AP2:done"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingSourceLinesITC.class);
			run();
		}
	}

}
