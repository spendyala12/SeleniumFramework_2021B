package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class GenerateAutomaticReversalsITC extends BaseTest{
	
	public static String Reversal_Period;
	public static String Schedule_Frequency;
	public static String Start_Date;
	
	private static void run(){
		
		clickElement(By.xpath("//*[contains(@id,'_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl6')]"));
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'basicReqBody:paramDynForm_Attribute2_ATTRIBUTE2::content')]"))).selectByVisibleText(Reversal_Period);//"Jan-17"
	    clickElement(By.cssSelector("option[title=\"Jan-17\"]"));
	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.xpath("//*[contains(@id,'advRequestBody:scheduleTab11::disAcr')]"));
	    clickElement(By.xpath("//*[contains(@id,'advRequestBody:selectOneRadio1:_1')]"));
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'advRequestBody:schRqRn:1:selectOneChoice1::content')]"))).selectByVisibleText(Schedule_Frequency);//"Once"
	    
	    setElementText(By.xpath("//*[contains(@id,'advRequestBody:schRqRn:1:startdate::content')]"), Start_Date);//"3/1/17 9:00 AM"
	    clickElement(By.cssSelector("span.x1gs"));
	    clickElement(By.xpath("//*[contains(@id,'advRequestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(GenerateAutomaticReversalsITC.class);
			run();
		}
	}

}
