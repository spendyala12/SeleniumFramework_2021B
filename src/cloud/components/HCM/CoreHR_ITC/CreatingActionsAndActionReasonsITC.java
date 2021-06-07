package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingActionsAndActionReasonsITC extends BaseTest{

	public static String SearchAction;
	public static String ActionCode;
	public static String ActionName;
	public static String ActionType;
	public static String ActionReasonCode;
	public static String ActionReason;
	public static String ReasonStartDate;


	private static void run() throws InterruptedException{	
		Thread.sleep(500);
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		Thread.sleep(500);
		//clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop"));
		clickElement(By.xpath("//*[text()='Workforce Deployment']"));
		Thread.sleep(500);
		setElementText(By.xpath("//*[contains(@id,'it2::content')]"),SearchAction);
		clickElement(By.xpath("//*[contains(@id,'AP1:s92:ctb3')]"));
		Thread.sleep(500);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:t2:0:ot23"));
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:2:cl4"));
		clickElement(By.xpath("//*[contains(@id,'dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:create::icon')]"));
		Thread.sleep(500);
		setElementText(By.xpath("//*[contains(@id,'0:it1::content')]"),ActionCode);
		setElementText(By.xpath("//*[contains(@id,'0:it2::content')]"),ActionName);
		clickElement(By.xpath("//*[contains(@id,'AP1:AT1:_ATp:table1:0:soc1::content')]"));
		Thread.sleep(500);
		clickElement(By.xpath("//li[contains(text(),'Hire an Employee')]"));		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:_ATp:create::icon"));
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:commandButton6"));
		Thread.sleep(500);
		setElementText(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:inputText2::content']"),ActionReasonCode);
		setElementText(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:inputText1::content']"),ActionReason);
		setElementText(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:inputDate2::content']"),ReasonStartDate);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:commandButton3"));

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:commandButton12"));
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:commandButton10"));		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingActionsAndActionReasonsITC.class);
			run();
		}
	}

}
