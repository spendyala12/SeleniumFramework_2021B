package cloud.components.GL.GL_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ClosingPeriodsITC extends BaseTest{

	public static String InvoiceNumber;

	private static void run() throws Exception  {
		
		clickElement(By.xpath("//*[contains(@id,'_FOTsr1:0:pt1:r1:0:ph1:r2:0:i1')]"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsr1:0:pt1:r1:1:ap1:AT1:_ATp:table1::db']/table[1]/tbody/tr[1]/td[1]"));
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:ctb3')]"));
		clickElement(By.xpath("//*[contains(@id,'yes')]"));
			
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ClosingPeriodsITC.class);
			run();
		}
	}
}