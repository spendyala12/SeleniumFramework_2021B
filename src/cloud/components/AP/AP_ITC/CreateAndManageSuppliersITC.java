package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreateAndManageSuppliersITC extends BaseTest {
	
	
public static String Keywords;
public static String Supplier;
	

	private static void run() throws Exception{
		
		
		clickElement(By.xpath("//a[@id='pt1:_UIScil1u']"));
	    clickElement(By.xpath("//div[@id='pt1:_UISnvr:0:nvgpgl2_groupNode_procurement']//div[1]"));
	    clickElement(By.xpath("//span[contains(text(),'Suppliers')]"));
	    clickElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiPrcPozSuppliersDashboard__FndTasksList::icon']"));
	   
//	    clickElement(By.xpath("//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTRaT:0:RAtl1']"));
//	    setElementText(By.xpath("//input[@id='pt1:_FOr1:1:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:q1:value00::content']"), Keywords); //input keyword
//	    clickElement(By.xpath("//button[@id='pt1:_FOr1:1:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:q1::search']")); //search btn
	    
	    
//	    clickElement(By.xpath("//img[@id='pt1:_FOr1:1:_FONSr2:0:MAt2:0:pt1:Suppl1:0:AP1:AT1:_ATp:edit::icon']")); //click on edit btn
//	    setElementText(By.xpath("//input[@id='pt1:_FOr1:1:_FONSr2:0:MAt3:0:ap1:inputText2::content']"),Supplier);
//	    clickElement(By.xpath("//div[@id='pt1:_FOr1:1:_FONSr2:0:MAt3:0:ap1:APsv2']")); //save
//	    clickElement(By.xpath("//div[@id='pt1:_FOr1:0:_FONSr2:0:MAt3:0:ap1:cb4']")); //submit
	  	  
	   
}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAnInvoiceITC.class);
			run();
		}
	}
	
}