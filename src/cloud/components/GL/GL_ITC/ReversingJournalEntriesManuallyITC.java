package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReversingJournalEntriesManuallyITC extends BaseTest{
	
	public static String Journal;
	public static String Journal_batch;
	public static String Accounting_Period;
	public static String Batch_Status;
	
	private static void run(){
		
		clickElement(By.xpath("//img[@title='Tasks']")); //task
		clickElement(By.linkText("Manage Journals")); //manage journal	
		
		setElementText(By.xpath("//*[contains(@id,'queryP:value00::content')]"),Journal);
		setElementText(By.xpath("//*[contains(@id,'queryP:value10::content')]"),Journal_batch);
		setElementText(By.xpath("//*[contains(@id,'queryP:value20::content')]"),Accounting_Period);
		clickElement(By.xpath("//*[contains(@id,'queryP:value50::content')]"));
		new Select(browser.findElement(By.xpath("//*[contains(@id,'queryP:value50::content')] "))).selectByVisibleText(Batch_Status);
		clickElement(By.xpath("//*[contains(@id,'queryP::search')]"));
		
		//*[contains(@id,'pt1:ap1:APb')]	
		clickElement(By.linkText(Journal));
	    clickElement(By.xpath("//*[contains(@id,'ap1:showMoreHeader')]"));
	    clickElement(By.xpath("//*[contains(@id,'pt1:ap1:sdi7::disAcr')]"));
	    clickElement(By.xpath("//*[contains(@id,'pt1:ap1:accrualRevPeriodName::lovIconId')]"));
	    clickElement(By.xpath("//*[contains(@id='pt1:ap1:accrualRevPeriodName::dropdownPopup::dropDownContent::db')]/table/tbody/tr[8]/td"));
	    clickElement(By.linkText("Journal Actions"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:cmi2']/td[2]"));
	    clickElement(By.cssSelector("td > a.x1gr > span.xpc"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:commandToolbarButton5']/a/span"));
	    setElementText(By.xpath("//*[contains(@id,'pt1:ap1:queryP:value00::content')]"), Journal);
	    clickElement(By.xpath("//*[contains(@id,'pt1:ap1:queryP::search')]	"));
	    clickElement(By.linkText(Journal));
	    clickElement(By.xpath("//*[contains(@id,'pt1:ap1:showMoreHeader')]"));
	    clickElement(By.cssSelector("td > a.x1gr > span.xpc"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:commandToolbarButton5']/a/span"));
	    clickElement(By.id("//*[contains(@id,'pt1:ap1:APb')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReversingJournalEntriesManuallyITC.class);
			run();
		}
	}

}
