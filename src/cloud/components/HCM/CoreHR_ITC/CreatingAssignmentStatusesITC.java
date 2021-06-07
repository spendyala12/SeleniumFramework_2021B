package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAssignmentStatusesITC extends BaseTest{

	public static String SearchTask;
	public static String Active;
	public static String UserStatus;
	public static String AssignmentStatusCode;


	private static void run() throws InterruptedException{
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
		Thread.sleep(1000);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop"));
		clickElement(By.xpath("//*[text()='Workforce Deployment']"));
		clickElement(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"));
		Thread.sleep(5000);
		setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"),SearchTask);
		Thread.sleep(500);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));
		Thread.sleep(2000);
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:2:cl4"));
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:create::icon"));
		setElementText(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:11:it3::content']"),UserStatus);
		Thread.sleep(2000);
		clickElement(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:11:it4::content']"));
		setElementText(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:11:it4::content']"),AssignmentStatusCode);
		Thread.sleep(2000);
		clickElement(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:11:soc9::content']"));
		clickElement(By.xpath("//ul[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:11:soc9::pop']//li[@class='x1r8'][contains(text(),'Active')]"));
		clickElement(By.xpath("//input[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:11:soc10::content']"));
		clickElement(By.xpath("//div[@id='DhtmlZOrderManagerLayerContainer']//li[6]"));
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:cb1"));
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:cb3"));
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAssignmentStatusesITC.class);
			run();
		}
	}

}
