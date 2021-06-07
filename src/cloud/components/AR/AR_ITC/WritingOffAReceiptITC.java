package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class WritingOffAReceiptITC extends BaseTest{

	
	public static String Receipt_Number;
	public static String Write_Off_Amount ;



	private static void run() throws InterruptedException{
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"));
		
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:operator1::content"))).selectByVisibleText("Equals");
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"),Receipt_Number);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));
		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1::db\"]/table/tbody/tr")); //selecting row
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1")); //Clicking on number link
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:ATm"));  //Action btn
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1"));  //more
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cmi4")); //Create write off
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:it8::content"), Write_Off_Amount );
		
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:soc6::content"))).selectByVisibleText("Receipt Write-off");
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb12")); //ok btn
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton1")); //Save btn
		
		
		
		                    
		
		
		
		
		
		
		
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
//	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl5"));
//		clickElement(By.linkText("Manage Receipts"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:operator1::content"));
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:operator1::content"))).selectByVisibleText("Equals");
//	    clickElement(By.cssSelector("option[title=\"Equals\"]"));
//	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"), Receipt_Number);
//	    //clickElement(By.id("")).sendKeys("10004");
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:1:commandLink1"));
//	    
//	    Thread.sleep(8000);
//	    clickElement(By.xpath("(//a[contains(text(),'Actions')])[2]"));
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1']/td[2]"));
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cmi4']/td[2]"));
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:soc6::content"))).selectByVisibleText("Receipt Write-off");
//	    clickElement(By.cssSelector("option[title=\"Receipt Write-off\"]"));
//	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb12"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb12"));
//	    Thread.sleep(5000);
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122"));
//	    Thread.sleep(5000);
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:commandButton1"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(WritingOffAReceiptITC.class);
			run();
		}
	}

}




