package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class SweepingIncompleteIntercompanyTransactionsITC extends BaseTest{
	
	public static String Search;
	public static String Transaction_Type;
	public static String Period;
	public static String Status;
	
	private static void run(){
		
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s1:it1::content']"), Search);//"Manage Intercompany Period Status"
	    clickElement(By.xpath("//img[@title='Search']"));
	    clickElement(By.linkText(Search));
	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:searchQ:value00::content"))).selectByVisibleText(Transaction_Type);//"I/C Sales"
	    setElementText(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:searchQ:value10::content"), Period);//"FY1-16"
	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:searchQ:value20::content"))).selectByVisibleText(Status);//"Open"
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:searchQ::search"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:rTable:_ATp:table1::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[7]"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:rTable:_ATp:sweepTransactions']/a/span"));
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:rTable:_ATp:okBtn1"));
	    clickElement(By.id("d1::msgDlg::cancel"));
	    setElementText(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:searchQ:value10::content"), "");
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:searchQ::search"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:rTable:_ATp:table1::db']/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[7]"));
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:pt1:ap1:APc"));
	    clickElement(By.id("pt1:r1:0:r0:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(SweepingIncompleteIntercompanyTransactionsITC.class);
			run();
		}
	}

}
