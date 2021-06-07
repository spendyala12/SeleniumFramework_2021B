package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManageEnterpriseHCMInformationITC extends BaseTest{

	public static String ApplSearch;
	public static String StartTime;
	public static String EndTime;
	

	private static void run() throws InterruptedException
	
	
	
	{
		
		Thread.sleep(4000);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //AllTasks
		Thread.sleep(4000);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:r10:0:i3:6:cl11")); //search
		Thread.sleep(4000);
		setElementText(By.id("pt1:r1:0:r0:1:AP1:s9:it1::content"), ApplSearch);
		Thread.sleep(4000);
		clickElement(By.id("pt1:r1:0:r0:1:AP1:s9:ctb1::icon")); //search button
		Thread.sleep(4000);
		clickElement(By.linkText("Manage Enterprise HCM Information")); //ManageEnterpriseHCMInformation
		Thread.sleep(9000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:commandToolbarButton1']/table/tbody/tr/td[1]/a")); //Edit
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:commandMenuItem2']/td[2]")); //correct
		Thread.sleep(4000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN1:0:_WORK_START_TIME::content"), StartTime); //workstarttime
		Thread.sleep(4000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN1:0:_WORK_END_TIME::content"), EndTime); //workendtime
		Thread.sleep(4000);
		clickElement(By.id("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:submit']/a")); //submit
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageEnterpriseHCMInformationITC.class);
			run();
		}
	}

}
