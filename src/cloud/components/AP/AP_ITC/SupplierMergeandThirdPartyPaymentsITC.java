package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;


public class SupplierMergeandThirdPartyPaymentsITC extends BaseTest{

	
	public static String FromSuppliers;
	public static String FromSuppliersSite;
	public static String ToSupplier;
	public static String ToSupplierSite;
	public static String Keywords;

	private static void run() throws Exception  {	
		
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl6')]")); //merge suppliers
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:create::icon')]")); //add row
		setElementText(By.xpath("//*[contains(@id,'_ATp:table1:0:fromVendorNameId::content')]"),FromSuppliers);
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:fromVendorNameId::su0')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:table1:0:fromVendorSiteNameId::content')]"),FromSuppliersSite); //From suppliers site
		
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:sbc1::Label0')]"));
		setElementText(By.xpath("//*[contains(@id,'_ATp:table1:0:toVendorNameId::content')]"),ToSupplier); 
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:toVendorNameId::su0')]"));
		
		setElementText(By.xpath("//*[contains(@id,'_ATp:table1:0:toVendorSiteNameId::content')]"),ToSupplierSite);
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:toVendorSiteNameId::dropdownPopup::dropDownContent::db')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt3:0:AP1:SPsb2')]")); //submit
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:AP1:cb1']")); //yes
		clickElement(By.xpath("//*[contains(@id,'_FOd1::msgDlg::cancel']")); //ok
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]")); 
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1')]")); //manage suppliers
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt4:0:pt1:Suppl1:0:AP1:q1:value00::content')]"),Keywords);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt4:0:pt1:Suppl1:0:AP1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAt4:0:pt1:Suppl1:0:AP1:AT1:_ATp:Table:0:cl1')]"));
		clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt5:0:ap1:sitesTab::disAcr']")); //site
	

	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(SupplierMergeandThirdPartyPaymentsITC.class);
			run();
		}
	}
}