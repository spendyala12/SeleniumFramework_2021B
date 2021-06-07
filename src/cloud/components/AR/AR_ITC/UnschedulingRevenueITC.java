package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class UnschedulingRevenueITC extends BaseTest{

	public static String Transaction_Date;
	public static String Comments;



	private static void run() throws InterruptedException{

		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
	    clickElement(By.id("pt1:nv_itemNode_receivables_receivables_revenue"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTsdiRevenueAdjustmentsTaskList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:_FOTRaT:0:RAtl1"));
	    
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:q1:value50::content"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:q1:value50::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:q1:value50::content"), Transaction_Date);
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:q1::search"));
	    
	    //Thread.sleep(5000);
	    
	    //clickElement(By.xpath("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:transactionLinesAppTable:_ATp:t2::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
	    //clickElement(By.xpath("//tr[contains(@class,'p_AFSelected xe8')]"));
	    clickElement(By.cssSelector("td.p_AFFocused.xzn"));
	    //clickElement(By.xpath("//td[contains(@class,'p_AFFocused xzn')]"));
	    //clickElement(By.xpath("//td[contains(.,'1003')][0]"));
	   // clickElement(By.xpath("//div[contains(@id,'_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:transactionLinesAppTable:_ATp:t2::db')]//td[contains(@class,'p_AFFocused xzn')]"));
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:0:ap1:transactionLinesAppTable:_ATp:commandButton4"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:1:ap1:soc1::content"))).selectByVisibleText("Other");
	    clickElement(By.cssSelector("option[title=\"Other\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:1:ap1:inputText1::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:1:ap1:inputText1::content"), Comments);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:1:ap1:commandButton1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:1:ap1:popupYesButton"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:2:ap1:panelSaveandClose"));
	    
	    clickElement(By.cssSelector("span.x1l5"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(UnschedulingRevenueITC.class);
			run();
		}
	}

}




