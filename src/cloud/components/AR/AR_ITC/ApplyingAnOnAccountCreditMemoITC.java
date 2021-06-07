package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ApplyingAnOnAccountCreditMemoITC extends BaseTest{

	public static String TransactionNumber_1;
	public static String TransactionNumber_2;
	
	private static void run() throws InterruptedException{

//		clickElement(By.id("pt1:_UISmmLink::icon"));
//
//		clickElement(By.id("pt1:nv_itemNode_receivables_receivables_balances"));


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl11"));


		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:qryId1:operator3::content"))).selectByVisibleText("Equals");

		clickElement(By.cssSelector("option[title=\"Equals\"]"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:qryId1:value30::content"), TransactionNumber_1);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:qryId1::search"));	    

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:AT1:_ATp:t1::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[2]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:AT1:_ATp:cb1"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckapplicationsTable1:_ATp:create::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckapplicationsTable1:_ATp:t1:0:transactionNumberId::lovIconId"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckapplicationsTable1:_ATp:t1:0:transactionNumberId::_afrLovInternalQueryId:value00::content"), TransactionNumber_2);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckapplicationsTable1:_ATp:t1:0:transactionNumberId::_afrLovInternalQueryId::search")); 

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckapplicationsTable1:_ATp:t1:0:transactionNumberId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckapplicationsTable1:_ATp:t1:0:transactionNumberId::lovDialogId::ok")); 
		
		Thread.sleep(2000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:ckap1:ckcb12"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:cb5"));  



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApplyingAnOnAccountCreditMemoITC.class);
			run();
		}
	}

}
