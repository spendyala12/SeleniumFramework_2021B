package cloud.components.GL.GL_USA;

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
		
		clickElement(By.linkText("Journals")); //journals
		clickElement(By.xpath("//*[contains(@id,'_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon')]")); //task
		clickElement(By.linkText("Create Journal")); //create journal
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,':userJeCategoryNameInputSearch1::content')]")); //search
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:ap1:sis3:userJeCategoryNameInputSearch1::item0')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:accountCS::content')]"),Account1); //account number
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:EnteredDr::content')]"),Debit);  //debit
		Thread.sleep(5000);
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:j_id98']"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:1:accountCS::content')]"),Account2);  //account number
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:1:EnteredCr::content')]"),Credit);   //credit
		clickElement(By.xpath("//span[contains(text(),'Complete')]")); //complete
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:saveBatch']")); //   save
		
		clickElement(By.xpath("//span[contains(text(),'Post')]")); //post
		
		clickElement(By.xpath("//*[contains(@id,'Ok')]")); //ok
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