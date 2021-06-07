package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAndPostingAStandardJournalITC extends BaseTest{
	
	public static String Journal_batch;
	public static String Journal_batch_desc;
	public static String Journal;
	public static String Journal_desc;
	public static String Category;
	public static String Account1;
	//public static String Alias;
	public static String debit_amount;
	public static String Account2;
	public static String credit_amount;
	
	private static void run() throws InterruptedException{
		
		
		clickElement(By.xpath("//img[@title='Tasks']")); //task
		clickElement(By.linkText("Create Journal")); //create journal	
		
		//*[contains(@id,'pt1:ap1:saveBatch')]
		setElementText(By.xpath("//*[contains(@id,'showLessBatchName::content')]"),Journal_batch);
		setElementText(By.xpath("//*[contains(@id,'showLessBatchDescription::content')]"), Journal_batch_desc);
	    setElementText(By.xpath("//*[contains(@id,'showLessJournalName::content')]"), Journal);
		setElementText(By.xpath("//*[contains(@id,'showLessJournalDescription::content')]"), Journal_desc);
		Thread.sleep(3000);		
		clickElement(By.xpath("//*[contains(@id,'userJeCategoryNameInputSearch1::content')]")); //category drop down
		setElementText(By.xpath("//*[contains(@id,'userJeCategoryNameInputSearch1::content')]"), Category);		
		
		Thread.sleep(3000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content"), Account1);		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content"), debit_amount);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db\"]/table/tbody/tr[2]"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content"), Account2);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content"), credit_amount);
		
		clickElement(By.xpath("//span[@class='xx6'][contains(text(),'Save')]"));
		clickElement(By.xpath("//span[contains(text(),'Complete')]"));
		clickElement(By.xpath("//span[contains(text(),'Post')]"));
		clickElement(By.xpath(""));
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAndPostingAStandardJournalITC.class);
			run();
		}
	}

}
