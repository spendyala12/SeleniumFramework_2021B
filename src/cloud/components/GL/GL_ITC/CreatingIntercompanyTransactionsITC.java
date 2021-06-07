package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingIntercompanyTransactionsITC extends BaseTest {

	public static String Transaction_Type;
	public static String Control_Amount;
	public static String Debit;
	
	public static void run(int iterations) throws Exception
	{	
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingIntercompanyTransactionsITC.class);
			run();
		}
	}

	private static void run() {
		clickElement(By.id("pt1:nv_itemNode_intercompany_accounting_transactions_processing"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiTransactions_itemNode_FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl3"));  //Create transaction
		
		
		
		
		
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:_FOTsdiTransactions_itemNode_FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:_FOTRaT:0:RAtl3"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:intercoOrgNameId::lovIconId"));
	    clickElement(By.cssSelector("td.xe7"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:soc1::content"))).selectByVisibleText(Transaction_Type);
//	    ClickElement(By.cssSelector("option[title=\"I/C Adjustment\"]"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:inputText5::content"), Control_Amount);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:create::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:table1:1:partyName1Id::lovIconId"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:table1:1:partyName1Id::dropdownPopup::dropDownContent::db']/table/tbody/tr[3]/td"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:table1:1:it7::content"), Debit);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:commandButton2"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:create::icon"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:0:kf1CS::content"), "101.10.25200.000.000.000");
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:0:Percentage::content"),"60");
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:create::icon"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:1:kf1CS::content"), "101.10.22210.000.000.000");
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:AT2:_ATp:table2:1:Percentage::content"), "40");
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:AT1:_ATp:dialog1::ok"));
	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_intercompany_accounting_transactions_processing:0:MAnt2:1:AP2:APc"));
		
	}
	
}
