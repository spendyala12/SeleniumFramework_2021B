package cloud.components.GL.GL_Argentina;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class EnteringJournalsManuallyITC extends BaseTest{

public static String Jrnl_Batch;
public static String Jrnl_Description;
public static String Jrnl_Name;
public static String Jrnl_Desc;
public static String Category;
public static String Account1;
public static String Debit;
public static String description1;
public static String Account2;
public static String Credit;
public static String description2;

	private static void run() throws Exception  {
		
		clickElement(By.xpath("//span[contains(text(),'Journals')]"));
		clickElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon']"));
		clickElement(By.linkText("Create Journal"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'ap1:showLessBatchName::content')]"),Jrnl_Batch);
		setElementText(By.xpath("//*[contains(@id, 'ap1:showLessBatchDescription::content')]"),Jrnl_Description);
		setElementText(By.xpath("//*[contains(@id, 'ap1:showLessJournalName::content')]"),Jrnl_Name);
		setElementText(By.xpath("//*[contains(@id, 'ap1:showLessJournalDescription::content')]"),Jrnl_Desc);
		clickElement(By.xpath("//*[contains(@id,':userJeCategoryNameInputSearch1::content')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:ap1:sis3:userJeCategoryNameInputSearch1::item0')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:accountCS::content')]"),Account1);
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:0:EnteredDr::content')]"),Debit);
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'ap1:jeLineAppTable:_ATp:t3:1:j_id99')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:1:accountCS::content')]"),Account2);
		setElementText(By.xpath("//*[contains(@id,'_ATp:t3:1:EnteredCr::content')]"),Credit);
		clickElement(By.xpath("//span[contains(text(),'Complete')]")); //complete
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:saveBatch']")); //   save
		clickElement(By.xpath("//span[contains(text(),'Post')]")); //post
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