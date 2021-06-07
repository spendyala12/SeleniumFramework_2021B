package cloud.components.GL.GL_Canada;

import org.openqa.selenium.By;
import itc.framework.BaseTest;


public class EnteringJournalsManuallyITC extends BaseTest{
public static String Category;
public static String Account1;
public static String Debit;
public static String description1;
public static String Account2;
public static String Credit;
public static String description2;

	private static void run() throws Exception  {
		
		clickElement(By.xpath("//*[contains(@id,'_FndTasksList::icon')]"));
		clickElement(By.linkText("Create Journal"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,':userJeCategoryNameInputSearch1::content')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:ap1:sis3:userJeCategoryNameInputSearch1::item0')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:accountCS::content')]"),Account1);
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:EnteredDr::content')]"),Debit);
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:it4::content')]"),description1);
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db']/table/tbody/tr[2]/td[1]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:1:accountCS::content')]"),Account2);
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:1:EnteredCr::content')]"),Credit);
		setElementText(By.xpath("//*[contains(@id,'jeLineAppTable:_ATp:t3:1:it4::content')]"),description2);
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:completeButton']"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:saveBatch']"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:postBatch']")); //post
		clickElement(By.xpath("//*[contains(@id,'Ok')]"));

	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(EnteringJournalsManuallyITC.class);
			run();
		}
	}
}