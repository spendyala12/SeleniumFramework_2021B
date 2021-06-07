package cloud.components.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ViewingandSubmittingaPurchaseAgreementITC extends BaseTest{
	
	public static String Order_Number;
	public static String Communication_type;
	
	private static void run() throws Exception{
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:_FOTsdi__PrcPoPurchasingWorkarea_itemNode__RecentItems::icon"));
	    clickElement(By.linkText(Order_Number));//Blanket Purchase Agreement: 52223
	    clickElement(By.xpath("//a[contains(@id, 'ctb33::popEl')]"));
	    clickElement(By.xpath("//*[contains(@id, 'CA_HEADER_EDIT')]"));
	    Thread.sleep(200);	
	    if(browser.findElements(By.xpath("//button[contains(@id, 'd1::yes')]")).size()!=0)
	    	clickElement(By.xpath("//button[contains(@id, 'd1::yes')]"));
	    new Select(browser.findElement(By.xpath("//*[contains(@id, 'supplierNotifMethodId::content')]"))).selectByVisibleText(Communication_type);//"Print"
	    if(browser.findElement(By.xpath("//textarea[contains(@id, 'inputText18::content')]")).getText().isEmpty())
	    	setElementText(By.xpath("//textarea[contains(@id, 'inputText18::content')]"), "Test");
	    clickElement(By.xpath("//button[contains(@accesskey, 'm')]"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.xpath("//*[contains(@id, 'AP4:APb')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ViewingandSubmittingaPurchaseAgreementITC.class);
			run();
		}
	}

}
