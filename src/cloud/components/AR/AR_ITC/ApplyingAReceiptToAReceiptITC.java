package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ApplyingAReceiptToAReceiptITC extends BaseTest{
	

	public static String Receipt_Number_1;
	public static String Receipt_Number_2;
	public static String Applied_Amount;

	private static void run(){

		
		
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl5")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl5"));
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content")).clear();
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content")).sendKeys("140209051");
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"), Receipt_Number_1);
		 new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value70::content"))).selectByVisibleText("Confirmed");
		 //driver.findElement(By.cssSelector("option[title=\"Confirmed\"]")).click();
//		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1::search")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));
		clickElement(By.linkText(Receipt_Number_1));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:ATm']/div/table/tbody/tr/td[2]/a"));
//		clickElement(By.cssSelector("#1485947779551 > table > tbody > tr > td.x1f1 > a.xg9"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cmi3"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2:operator4::content"))).selectByVisibleText("Equals");
	    //driver.findElement(By.cssSelector("option[title=\"Equals\"]")).click();
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2:value40::content")).clear();
		// driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2:value40::content")).sendKeys("140210003");
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2:value40::content"), Receipt_Number_2);
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2::search")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2::search"));
		//driver.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:AT8:_ATp:t4::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td")).click();
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:AT8:_ATp:t4::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td"));
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb11done")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb11done"));
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:AmtApplied::content")).click();
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:AmtApplied::content"));
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:AmtApplied::content")).clear();
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:AmtApplied::content")).sendKeys("10");
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:AmtApplied::content"), Applied_Amount);
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton1")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton1"));
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122")).click();
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApplyingAReceiptToAReceiptITC.class);
			run();
		}
	}

}
