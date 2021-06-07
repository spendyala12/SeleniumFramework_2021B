package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingADisputeITC extends BaseTest{

	public static String Account;

	


	private static void run() throws InterruptedException{
		
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
	    clickElement(By.id("pt1:nv_itemNode_collections_collections_dashboard"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:soc1::content"))).selectByVisibleText("Account");
	    clickElement(By.cssSelector("option[title=\"Account\"]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:it1::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:it1::content"), Account);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:search_Button"));
	    clickElement(By.cssSelector("td.xzn"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:TRX_FL:0:AT2:_ATp:ctb2']/a/span"));
	
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:TRX_FL:1:selectOneChoice1::content"))).selectByVisibleText("Tax");
	    clickElement(By.cssSelector("option[title=\"Tax\"]"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:TRX_FL:1:selectOneChoice2::content"))).selectByVisibleText("Tax exempt");
	    clickElement(By.cssSelector("td > a.xtk > span.xtn"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:TRX_FL:0:cb3"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
		

		   
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingADisputeITC.class);
			run();
		}
	}

}




