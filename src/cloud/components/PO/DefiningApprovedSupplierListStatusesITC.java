package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class DefiningApprovedSupplierListStatusesITC extends BaseTest{
	
	public static String Supplier;
	public static String Status;
	
	private static void run(){
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl17"));

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:0:AP1:q1:value50::content"),Supplier);//"ABC Consulting"

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:0:AP1:q1::search"));
	    clickElement(By.linkText("Actions"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:0:AP1:AT2:_ATp:editMenuItem']/td[2]"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:1:AP1:soc7::content"))).selectByVisibleText(Status);//"Approved"

	    clickElement(By.cssSelector("span.xpc"));
	    if(browser.findElement(By.id("_FOd1::msgDlg::cancel")).isDisplayed())
	    	clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:Manag1:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(DefiningApprovedSupplierListStatusesITC.class);
			run();
		}
	}

}
