package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class AddingACapitalizedAssetITC extends BaseTest {
	public static String book;
	public static String Description;
	public static String cost;
	public static String units;
	public static String ExpenseAccount;
	public static String Location;

	private static void run() throws Exception{
			
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Add Asset"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:book::content')]"),book);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:kf1KBIMG::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value00::lovIconId')]"));
		clickElement(By.xpath("//span[contains(text(),'FURNITURE')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value10::lovIconId')]"));
		clickElement(By.xpath("//span[contains(text(),'OFFICE')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:kf1SEl')]"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:descriptionId::content')]"),Description);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:it1::content')]"),cost);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:it2::content')]"),units);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:kf2CS::content')]"),ExpenseAccount);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:kf3CS::content')]"),Location);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:commandButton1')]"));
		
		
		
		
		
  
	}

	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingACapitalizedAssetITC.class);
			run();
		}

	}


}
