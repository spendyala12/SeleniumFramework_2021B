package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingaPurchaseOrderwithManualGroupingofRequisitionLinesITC extends BaseTest{
	
	public static String Requisitioning_BU;
	public static String Order_Line;
	
	private static void run(){
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl1"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:q1:value20::content"), "");
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:q1:value00::content"))).selectByVisibleText(Requisitioning_BU);//"US1 Business Unit"

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:q1::search"));
	    WebElement WebElement1 = browser.findElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk, '1')]"));
	    WebElement WebElement2 = browser.findElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk, '3')]"));

	    new Actions(browser).click(WebElement1).keyDown(Keys.CONTROL).click(WebElement2).keyUp(Keys.CONTROL).build().perform();
	    
	    clickElement(By.xpath("//*[contains(@id,'_ATp:AddToDocBuilder')]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:AT5:cb1"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:DocBF1:0:cb1"));
	    clickElement(By.xpath("//a[contains(text(), 'Actions')]"));
	    clickElement(By.xpath("//tr[contains(@id, 'manualGrouping')]"));

	    setElementText(By.xpath("//input[contains(@id,'it2::content')]"), Order_Line);//"6"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:2:ap1:cb2"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt3:1:AP1:APsb2"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaPurchaseOrderwithManualGroupingofRequisitionLinesITC.class);
			run();
		}
	}

}
