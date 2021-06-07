package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ProcessingaPaymentITC extends BaseTest{
	
	public static String Search;
	public static String Account_Number;
	public static String Amount1;
	public static String Payment_Method1;
	public static String Site1;
	public static String Payment_Method2;
	public static String Site2;
	public static String Amount2;
	
	private static void run(){
	    
	    new Select(browser.findElement(By.id("pt1:USra:0:RAp1:0:soc1::content"))).selectByVisibleText(Search);//"Account"

	    setElementText(By.id("pt1:USra:0:RAp1:0:it1::content"), Account_Number);//"10060"
	    clickElement(By.id("pt1:USra:0:RAp1:0:search_Button::icon"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:tab_transactions::disAcr"));
	    clickElement(By.xpath(".//*[@id='pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:AT2:_ATp:t1::db']/table/tbody/tr[1]/td[1]"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:AT2:_ATp:ctb1']/a/span"));

	    setElementText(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:AT1:_ATp:t2:0:amountPaidOrgCurr::content"), Amount1);//"500"

	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:soc1::content"))).selectByVisibleText(Payment_Method1);//"Electronic Funds Transfer"

	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:soc2::content"))).selectByVisibleText(Site1);//"Glasgow"

	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.id("d1::msgDlg::cancel"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:sdi3::disAcr"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:AT2:_ATp:ctb1']/a/span"));

	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:soc1::content"))).selectByVisibleText(Payment_Method2);
	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:soc2::content"))).selectByVisibleText(Site2);
	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:r2:1:BankAccountAssignmentId1::content"))).selectByVisibleText("XXXX5432");

	    setElementText(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:AT1:_ATp:t2:0:amountPaidOrgCurr::content"), Amount2);//"300"
	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.id("d1::msgDlg::cancel"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:AT2:_ATp:sbc2::content"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:cb3"));
	    clickElement(By.id("d1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ProcessingaPaymentITC.class);
			run();
		}
	}

}
