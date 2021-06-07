package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingaPurchaseOrderfromRequisitionLinesITC extends BaseTest{
	
	public static String Requisitioning_BU;
	
	private static void run(){
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTRaT:0:RAtl1"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:q1:value20::content"), "");
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:q1:value00::content"))).selectByVisibleText(Requisitioning_BU);//"US1 Business Unit"

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:q1::search"));
	    WebElement WebElement1 = browser.findElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk, '1')]"));
	    WebElement WebElement2 = browser.findElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk, '3')]"));
//	    WebElement WebElement3 = browser.findElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk, '5')]"));
	    new Actions(browser).click(WebElement1).keyDown(Keys.CONTROL).click(WebElement2).keyUp(Keys.CONTROL).build().perform();
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:AT5:_ATp:AddToDocBuilder"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:AT5:cb1"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:pt1:r1:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaPurchaseOrderfromRequisitionLinesITC.class);
			run();
		}
	}

}
