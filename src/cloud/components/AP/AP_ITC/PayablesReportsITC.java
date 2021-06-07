package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class PayablesReportsITC extends BaseTest{

	public static String Name;
	
	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id,'panel:scheduleProcess')]")); //add new process
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::lovIconId')]"));
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::dropdownPopup::popupsearch')]"));
		setElementText(By.xpath("//*[contains(@id,'selectOneChoice2::_afrLovInternalQueryId:value00::content')]"),Name); //name
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::_afrLovInternalQueryId::search')]"));
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2_afrLovInternalTableId::db')]"));
		clickElement(By.xpath("//*[contains(@id,'selectOneChoice2::lovDialogId::ok')]"));
		clickElement(By.xpath("//*[contains(@id,'pt1:snpokbtnid')]")); //ok btn
		clickElement(By.xpath("//*[contains(@id,'requestBtns:submitButton')]"));
		clickElement(By.xpath("//*[contains(@id,'requestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));
		clickElement(By.xpath("//*[contains(@id,'panel:processRefreshId::icon')]")); //refresh
		clickElement(By.xpath("//*[contains(@id,'panel:processRefreshId::icon')]")); //refresh
		clickElement(By.xpath("//*[contains(@id,'panel:processRefreshId::icon')]")); //refresh
		clickElement(By.xpath("//*[contains(@id,'pt1:panel:result:100:pgl1')]"));
		clickElement(By.xpath("//h1[contains(text(),'Output')]"));
		

	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PayablesReportsITC.class);
			run();
		}
	}
}