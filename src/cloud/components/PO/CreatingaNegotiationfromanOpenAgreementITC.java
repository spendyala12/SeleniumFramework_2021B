package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingaNegotiationfromanOpenAgreementITC extends BaseTest{
	
	public static String order;
	public static String Negotiation_Type;
	public static String Negotiation_Style;
	
	private static void run(){
		
		
		//_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PrcPoPurchaseOrdersWorkarea_itemNode__RecentItems::icon
		//_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_2:1:cl1 //Link//dup
		//	_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaTj_id_2:1:cl1// Link
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:ViewA1:0:AP4:ctb33 // Actions
		//_FOpt1:_FOr1:0:_FONSr2:0:MAt2:0:pt1:ViewA1:0:AP4:CA_HEADER_CREATE_NEGOTIATION // Create Negotiation
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__RecentItems::icon"));
	    clickElement(By.linkText(order));//Blanket Purchase Agreement: 52237
	    clickElement(By.xpath("//span[contains(text(), 'Actions')]"));
	    clickElement(By.xpath("//td[contains(text(), 'Create Negotiation')]"));
	    new Select(browser.findElement(By.xpath("//select[contains(@id, 'soc5::content')]"))).selectByVisibleText(Negotiation_Type);//"Auction"

	    new Select(browser.findElement(By.xpath("//select[contains(@id, 'soc6::content')]"))).selectByVisibleText(Negotiation_Style);//"Standard Negotiation"

	    clickElement(By.xpath("//button[contains(@id, 'AP4:cb6')]"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.xpath("//span[contains(text(), 'Save')]"));
	    clickElement(By.xpath("//button[contains(@id, 'AP3:APc')]"));
	    clickElement(By.xpath("//button[contains(@id, 'AP4:APb')]"));
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaNegotiationfromanOpenAgreementITC.class);
			run();
		}
	}

}
