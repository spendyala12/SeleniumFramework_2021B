package cloud.components.GL.GL_Philippines;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ReversingaPostedJournalBatchITC extends BaseTest{

	public static String Journal;


	private static void run() throws Exception  {
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'_FndTasksList::icon')]"));
		clickElement(By.linkText("Manage Journals"));
		setElementText(By.xpath("//*[contains(@id,'queryP:value00::content')]"),Journal);
		clickElement(By.xpath("//*[contains(@id,'search')]"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:0:pt1:ap1:AT1:_ATp:t1::db']/table/tbody/tr[1]/td[1]"));
		clickElement(By.linkText("Actions"));
		clickElement(By.xpath("//td[contains(text(),'Reverse Batch')]"));
	


	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(OpeningPeriodsITC.class);
			run();
		}
	}
}