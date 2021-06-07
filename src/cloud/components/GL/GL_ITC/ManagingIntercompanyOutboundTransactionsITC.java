package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManagingIntercompanyOutboundTransactionsITC extends BaseTest {

	public static String Provider;
	public static String Transaction_Type;
	public static String Control_Amount;
	public static String Debit;
	
	public static void run(int iterations) throws Exception
	{	
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingIntercompanyOutboundTransactionsITC.class);
			run();
		}
	}

	private static void run() throws InterruptedException {
		
		Thread.sleep(5000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:_FOTsdiTransactions_itemNode_FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:_FOTRaT:0:RAtl3"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:intercoOrgNameId::lovIconId"));
	    clickElement(By.cssSelector("td.xe9"));
	    
	    Thread.sleep(2000);
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:intercoOrgNameId::content"));
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:intercoOrgNameId::content"),Provider);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:inputText5::content"));
	    Thread.sleep(3000);
	   // new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:soc1::content"))).selectByVisibleText(Transaction_Type);
//	    ClickElement(By.cssSelector("option[title=\"I/C Adjustment\"]"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:inputText5::content"), Control_Amount);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:create::icon"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:table1:1:partyName1Id::lovIconId"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:table1:1:partyName1Id::dropdownPopup::dropDownContent::db']/table/tbody/tr[3]/td"));
	    
	    
	    Thread.sleep(3000);
	    
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:table1:1:it7::content"), Debit);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:commandButton2"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:create::icon"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:0:kf1CS::content"), "101.10.25200.000.000.000");
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:0:Percentage::content"),"60");
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:create::icon"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:1:kf1CS::content"), "101.10.22210.000.000.000");
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:1:Percentage::content"), "40");
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:dialog1::ok"));
	    clickElement(By.cssSelector("span.xtn"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:SPc']/a/span"));
		
	}
	
}
