package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManagingIntercompanyInboundTransactionsITC extends BaseTest{
	
	public static String BatchNumber;
	public static String AccountNumber;
	public static String Amount;
	
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'_FOTsdiTransactions_itemNode_FndTasksList::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_intercompany_accounting_transactions_processing:0:_FOTRaT:0:RAtl2')]"));
		setElementText(By.xpath("//*[contains(@id,'inboundSearchPanel:qryId2:value00::content')]"),BatchNumber);		
		clickElement(By.xpath("//*[contains(@id,'inboundSearchPanel:qryId2::search')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//div[contains(@id,'inboundSearchPanel:AT1:_ATp:table1::db')]/table/tbody/tr[1]/td[5]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'inboundSearchPanel:AT1:_ATp:edit::icon')]"));
		Thread.sleep(2000);		
		clickElement(By.id("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:create::icon')]"));
		Thread.sleep(3000);		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:t1:2:kf1CS::content')]"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:t1:2:kf1CS::content')]"),AccountNumber);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:t1:2:AmtCr::content')]"));
		setElementText(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:t1:2:AmtCr::content')]"),Amount);		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:t1:2:inputText39::content')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:APscl2::popEl')]"));
		clickElement(By.xpath("//tr[contains(@id,'MAnt2:2:AP1:APsv')]/td[2]"));

	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingIntercompanyInboundTransactionsITC.class);
			run();
		}
	}

}
