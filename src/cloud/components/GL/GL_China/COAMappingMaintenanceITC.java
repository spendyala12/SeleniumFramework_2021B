package cloud.components.GL.GL_China;


import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class COAMappingMaintenanceITC extends BaseTest{

	public static String Search;
	public static String MappingMethod;
	public static String TargetSegmentValue;
	public static String SoureSegment;

	private static void run() throws Exception  {  //more>>Setup and Maintenance

//		clickElement(By.linkText("More..."));
//		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='pt1:_UIShome::icon']"));
		clickElement(By.xpath("//a[@id='itemNode_tools_setup_and_maintenance_25']"));
		
//		clickElement(By.xpath("//*[contains(@id,'setup_and_maintenance::icon')]"));
//		Thread.sleep(5000);
//		clickElement(By.xpath("//*[contains(@id,'_FOpt1:nv_itemNode_tools_setup_and_maintenance')]"));
//		Thread.sleep(5000);
//		clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_tools_setup_and_maintenance']"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'pt1:r1:0:r0:0:r1:0:sdi10::icon')]"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,':0:i3:6:cl11')]"));
		setElementText(By.xpath("//*[contains(@id,'AP1:s9:it1::content')]"),Search);
		clickElement(By.xpath("//*[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']/a"));
		clickElement(By.linkText("Manage Chart of Accounts Mappings"));
		clickElement(By.linkText("ITC CHINA COA MAPPING"));	
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:segAppTb:_ATp:segTb::db']/table/tbody/tr[3]/td[1]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:segTb:2:mapTypeSel::content')]"),MappingMethod); 	
		clickElement(By.xpath("//*[contains(@id,'yes')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:segTb:2:singleValueId::content')]"),TargetSegmentValue); //1001
		setElementText(By.xpath("//*[contains(@id,'_ATp:segTb:2:fromSegCd::content')]"),SoureSegment); //Company
		clickElement(By.xpath("//*[contains(@id,'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:defPanel:APsca1')]"));
		
		
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(COAMappingMaintenanceITC.class);
			run();
		}
	}
}