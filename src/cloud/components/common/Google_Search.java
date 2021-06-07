package cloud.components.common;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class Google_Search extends BaseTest{
	
	public static String Search;
	public static String Which_Button;
	
	private static void run(){
		
		browser.get("http://google.com");
		setElementText(By.id("lst-ib"), Search);
		clickElement(By.linkText("IT Convergence - Oracle Consulting, Support and Training"));
//	    browser.findElement(By.linkText("IT Convergence - Oracle Consulting, Support and Training")).click();
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(Google_Search.class);
			run();
		}
	}

}
