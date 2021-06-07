package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class RunMassAdditionsITC extends BaseTest {
	public static String AssetBook;
	
	private static void run() throws Exception{

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Create Mass Additions"));		
		clickElement(By.xpath("//*[contains(@id,'basicReqBody:paramDynForm_ATTRIBUTE1_ATTRIBUTE1::glyph')]")); //click on date
		clickElement(By.xpath("//td[@class='x18e p_AFSelected']"));//select date
		
		Select dropdown = new Select(browser.findElement(By.xpath("//*[contains(@id,'ATTRIBUTE2::content')]")));
		dropdown.selectByIndex(2);
		clickElement(By.xpath("//*[contains(@id,'requestBtns:submitButton')]")); //submit
		clickElement(By.xpath("//*[contains(@id,'requestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));//ok
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_UISmmLink::icon')]"));
		clickElement(By.xpath("//span[contains(text(),'Scheduled Processes')]"));
		clickElement(By.xpath("//*[contains(@id,'pt1:panel:processRefreshId::icon')]")); //refresh
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:result::db']/table/tbody/tr[1]/td[1]"));
		clickElement(By.xpath("//h1[contains(text(),'Output')]"));
		clickElement(By.xpath("//span[@class='dataLink']"));
			
}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(RunMassAdditionsITC.class);
			run();
		}
	}
}