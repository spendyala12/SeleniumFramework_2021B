package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageAccountingPeriodsITC extends BaseTest{

	public static String Ledger;
	
	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'FONSr2:0:_FOTRaT:0:RAtl18')]")); //Manage accounting periods
		//clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:AT1:_ATp:table1:0:i8')]")); //row 1
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:0:ap1:AT1:_ATp:table1:0:ot9')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pm1:r1:1:ap1:SPb')]"));			

	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageAccountingPeriodsITC.class);
			run();
		}
	}
}