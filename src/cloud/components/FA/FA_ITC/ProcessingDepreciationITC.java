package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ProcessingDepreciationITC extends BaseTest{

	public static String ProcessDepreciation;

	private static void run(){

		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdc2j_id_4:ITtile"));
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdc2j_id_4:ITsel::icon"));

		clickElement(By.linkText("Calculate Depreciation"));
				
//		clickElement(By.cssSelector("span.xpc"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsr1:0:AP1:region1:0:ITPdtl:1:d4::ok"));

		clickElement(By.id("_FOpt1:_UISmmLink::icon"));

		clickElement(By.id("_FOpt1:nv_moreLk"));

		clickElement(By.id("_FOpt1:nv_itemNode_tools_scheduled_processes"));

		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:panel:processRefreshId::icon"));

		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:srRssdfl::_afrDscl"));

		setElementText(By.id("pt1:USma:0:MAnt1:0:pt1:srRssdfl:value00::content"), ProcessDepreciation);

		new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:srRssdfl:value20::content"))).selectByVisibleText("Succeeded");

		clickElement(By.cssSelector("option[title=\"Succeeded\"]"));

		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:srRssdfl::search"));

		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:panel:result:100:j_id__ctru104pc11"));

		clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:stsmsginfopwid::ok"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ProcessingDepreciationITC.class);
			run();
		}
	}

}
