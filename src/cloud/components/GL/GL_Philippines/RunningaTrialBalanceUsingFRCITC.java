package cloud.components.GL.GL_Philippines;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class RunningaTrialBalanceUsingFRCITC extends BaseTest{

	public static String EnterSearchTerms;
	public static String DataAccessSet;

	private static void run() throws Exception  {
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'_FOTsr1:0:SP1:cl6::icon')]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'_FOTsr1:0:SP1:s12:it3::content')]"),EnterSearchTerms);
		clickElement(By.xpath("//*[contains(@id,'FOTsr1:0:SP1:s12:cil1::icon')]")); //search
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:SP1:t1:12:gil1')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOTsr1:1:SP2:goLink1::icon')]"));
		//setElementText(By.xpath("//*[contains(@id,'r1:0:r1:basicReqBody:dynam1:0:soc2::content')]"),DataAccessSet);	//ITC USA PL
		clickElement(By.xpath("//*[contains(@id,'r1:0:r1:requestBtns:submitButton')]"));
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));
		



	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(RunningaTrialBalanceUsingFRCITC.class);
			run();
		}
	}
}