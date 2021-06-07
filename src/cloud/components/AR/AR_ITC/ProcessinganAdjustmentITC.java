package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ProcessinganAdjustmentITC extends BaseTest{
	
	public static String Search;
	public static String Account_Number;
	public static String Receivables_Activity;
	public static String Adjustment_Type;
	public static String Adjustment_Amount;
	
	private static void run(){
	    
	    new Select(browser.findElement(By.id("pt1:USra:0:RAp1:0:soc1::content"))).selectByVisibleText(Search);//Account
	    setElementText(By.id("pt1:USra:0:RAp1:0:it1::content"), Account_Number);//"10060"
	    clickElement(By.id("pt1:USra:0:RAp1:0:search_Button::icon"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:tab_transactions::disAcr"));
	    clickElement(By.xpath("//*[@id='pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:AT2:_ATp:t1::db']/table[1]/tbody/tr/td[1]"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:sdi3::disAcr"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:sdi3_1::disAcr"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:AT2:_ATp:ctb3']/a/span"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:ap1:AT1:_ATp:create::icon"));
	    setElementText(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:ap1:AT1:actvty::content"), Receivables_Activity);//"Freight Adjustment"
	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:ap1:AT1:selectOneChoice2::content"))).selectByVisibleText("Discount");
	    new Select(browser.findElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:ap1:AT1:selectOneChoice1::content"))).selectByVisibleText(Adjustment_Type);//"Freight Adjustments"
	    setElementText(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:ap1:AT1:amountId::content"), Adjustment_Amount);//"-225"
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:1:ap1:AT1:saveBtn1"));
	    clickElement(By.id("d1::msgDlg::cancel"));
	    clickElement(By.cssSelector("span.x1gs"));
	    clickElement(By.id("pt1:USma:0:MAnt1:0:pt1:AP1:TRX_FL:0:sdi3::disAcr"));
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ProcessinganAdjustmentITC.class);
			run();
		}
	}

}
