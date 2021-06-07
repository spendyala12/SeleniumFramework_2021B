package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class GeneratingAutomaticPostingITC extends BaseTest{
	
	public static String Autopost_Criteria;
	public static String Schedule_Frequency;
	public static String Start_Date;
	
	private static void run(){
		
		clickElement(By.xpath("//*[contains(@id,'FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl5')]"));
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'pt1:r1:basicReqBody:paramDynForm_Attribute1_ATTRIBUTE1::content')]"))).selectByVisibleText(Autopost_Criteria);//"All Journals Japan SL"
	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.xpath("//*[contains(@id,'advRequestBody:scheduleTab11::disAcr')]"));
	    clickElement(By.xpath("//*[contains(@id,'advRequestBody:selectOneRadio1:_1')]"));
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'advRequestBody:schRqRn:1:selectOneChoice1::content')]"))).selectByVisibleText(Schedule_Frequency);//"Once"
	    
	    setElementText(By.xpath("//*[contains(@id,'advRequestBody:schRqRn:1:startdate::content')]"), Start_Date);//"3/1/2017 9:00 AM"
	    clickElement(By.cssSelector("span.x1gs"));
	    clickElement(By.xpath("//*[contains(@id,'advRequestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(GeneratingAutomaticPostingITC.class);
			run();
		}
	}

}
