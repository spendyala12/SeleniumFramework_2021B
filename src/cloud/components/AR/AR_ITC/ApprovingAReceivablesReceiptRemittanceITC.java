package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ApprovingAReceivablesReceiptRemittanceITC extends BaseTest{
	
	public static String RemittanceBatchNumber;
	
	private static void run(){
		
		
//		    clickElement(By.id("pt1:_UISmmLink::icon"));
//		    
//		    clickElement(By.id("pt1:nv_itemNode_receivables_receivables_balances"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl9"));
		    		    
		    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RmBMF:0:AP1:q1:operator2::content"))).selectByVisibleText("Equals");
		    
		    clickElement(By.cssSelector("option[title=\"Equals\"]"));
		    
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RmBMF:0:AP1:q1:value20::content"), RemittanceBatchNumber);
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RmBMF:0:AP1:q1::search"));
		    
		    clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RmBMF:0:AP1:AT1:_ATp:t1:1:commandLink1']/span"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RmBMF:1:akap1:akcommandButton5"));
		    
		    clickElement(By.id("_FOd1::msgDlg::cancel"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RmBMF:0:AP1:cb1"));
		    
		    
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApprovingAReceivablesReceiptRemittanceITC.class);
			run();
		}
	}

}
