package cloud.components.HCM.CoreHR_ITC;

import java.awt.AWTException;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingPersonTypesITC extends BaseTest{

	public static String Search_Tasks_Name;
	public static String Assignment_Person_Type;
	

	

	private static void run() throws InterruptedException, AWTException
	
	
	
	{
		clickElement(By.id("pt1:_UISmmLink::icon']")); //navigator
		


		clickElement(By.id("_FOpt1:_UISmmLink::icon"));// Navigator
		 
	    clickElement(By.id("_FOpt1:nv_itemNode_tools_setup_and_maintenance")); // Setup and maintenanace
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop"));
	    clickElement(By.xpath("//*[@id=\"pt1:r1:0:r0:0:r1:0:AP1:soc2::pop\"]/li[7]"));//workforce development 
	    
	    setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"), Search_Tasks_Name);
	    					  
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));// Search Icon
	    
	    Thread.sleep(5000);
	  
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:2:cl4"));//Manage Person Types Link
	    clickElement(By.xpath("//*[@id=\"pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db\"]/table[2]/tbody/tr[6]/td[2]/div/table/tbody/tr/td/span"));// Employee   
	    
	    Thread.sleep(10000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3")); // Add button
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:table2:13:it1::content"), Assignment_Person_Type);
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:APscl2")); // Add button
	  
	    

//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		
//	    clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
	 
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"));
	    
	    setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"), Search_Tasks_Name);
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));
	    
	    Thread.sleep(5000);
	  
	    clickElement(By.linkText("Manage Person Types"));
	 
	    ///clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']/table/tbody/tr[11]/td[2]/div/table/tbody/tr/td"));
	
	    //clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3"));
	    
	    //Thread.sleep(5000);
	    
	    //clickElement(By.linkText("Employee"));
	  
	    //clickElement(By.xpath("//tr[contains(text(),'Employee'"));
	    
	    
	    
	    Thread.sleep(10000);
	    
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']"));
	    
	    scrollByElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']//*[./text()='Contact']"));
	    
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']//*[./text()='Contact']"));
	    
	  //  clickElement(By.xpath("//td/span[./text()='Employee']"));
	    
	    Thread.sleep(20000);
	    
	    //clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3"));
  
	    //clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:table2::db']/table/tbody/tr[1]/td[1]"));
	    
	    //clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']/table/tbody/tr[10]/td[2]/div/table/tbody/tr/td"));
	    
	    Thread.sleep(10000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3"));
	    
	    Thread.sleep(15000);
	    
	    clickElement(By.cssSelector("td.p_AFFocused.xzn")); 
	    
	    setElementText(By.xpath("//td[@title= 'Assignment Person Type']//input[1]"), Assignment_Person_Type);
	  
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:APscl2']/a/span"));
	  
	    clickElement(By.id("d1::msgDlg::cancel"));



		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance']")); //SetupandMaintenance
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop']")); //setup
		
		clickElement(By.id("//li[contains(text(),'Workforce Deployment')]")); //workforceDeployment
		
		setElementText(By.id("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"), Search_Tasks_Name); //taskname
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3']//a[@class='xx3']")); //search
		
		clickElement(By.linkText("Manage Person Types")); //clickthelink
		
		clickElement(By.id("p_AFInactive p_AFSelected xep']//td//div//table//tbody//tr//span[@class='x2s3'][contains(text(),'Employee')]")); //employee
		
		clickElement(By.id("//span[contains(text(),'Add')]")); //add
		
		setElementText(By.id("p_AFInactive xep p_AFSelected']//td//td[1]"), Assignment_Person_Type); //AssignmentpersonType
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:APscl2']")); //saveandclose
		

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPersonTypesITC.class);
			run();
		}
	}

}




