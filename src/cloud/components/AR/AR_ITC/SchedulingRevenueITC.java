package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class SchedulingRevenueITC extends BaseTest{
	
	public static String Revenue_Amount;
	public static String Adjustment_Reason;
	public static String Comments;
	
	private static void run(){
	    
		
		
		clickElement(By.id("pt1:_UIShome::icon"));
		clickElement(By.id("pt1:atkfr1:0:grid:0:cil_grp_groupNode_receivables::icon"));
		clickElement(By.id("pt1:atkfr1:0:grid:0:cil_wrk_itemNode_receivables_receivables_revenue::icon"));
		
	    clickElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:0:AP1:AT2:_ATp:t1::db']/table/tbody/tr/td[1]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:0:AP1:AT2:_ATp:cb1"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:1:ap1:RevenueAmountRadio::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:1:ap1:spacer2::content"), Revenue_Amount);//"200"
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:1:ap1:soc1::content"))).selectByVisibleText(Adjustment_Reason);//"Revenue management process"
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:1:ap1:inputText1::content"), Comments);//"Test schedule revenue"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:1:ap1:reviewButton"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:1:ap1:popupYesButton"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:2:ap1:t2:1:kf1KBIMG::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:2:ap1:t2:1:kf1SEl"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsr1:2:ap1:panelSaveandClose"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(SchedulingRevenueITC.class);
			run();
		}
	}

}
