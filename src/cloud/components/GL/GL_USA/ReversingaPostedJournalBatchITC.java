package cloud.components.GL.GL_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReversingaPostedJournalBatchITC extends BaseTest{

	public static String Accounting_Period;
	public static String Source;
	public static String Category;
	public static String Reversal_Period;

	private static void run() throws Exception  {
		
		clickElement(By.linkText("Journals"));
		clickElement(By.xpath("//*[contains(@id,'_FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Journals"));
		setElementText(By.xpath("//*[contains(@id,'pt1:ap1:queryP:value20::content')]"),Accounting_Period);
		setElementText(By.xpath("//*[contains(@id,'pt1:ap1:queryP:value30::content')]"),Source);
		new Select(browser.findElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:queryP:value50::content')]"))).selectByVisibleText("Posted");
		clickElement(By.xpath("//*[contains(@id,'search')]"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:AT1:_ATp:t1::db']/table/tbody/tr[1]/td[5]/span"));
		//clickElement(By.linkText(JournalName));
		clickElement(By.linkText("Actions"));
		clickElement(By.xpath("//td[contains(text(),'Reverse Batch')]"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:revBatchPeriodId::content')]"),Reversal_Period);
		new Select(browser.findElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:soc_revmethod::content')]"))).selectByVisibleText("Change sign");
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:cb2')]")); //click ok
		clickElement(By.xpath("//*[contains(@id,'Ok')]"));
		
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReversingaPostedJournalBatchITC.class);
			run();
		}
	}
}