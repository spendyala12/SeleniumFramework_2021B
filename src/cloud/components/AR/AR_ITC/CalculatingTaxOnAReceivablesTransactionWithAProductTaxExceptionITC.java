package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CalculatingTaxOnAReceivablesTransactionWithAProductTaxExceptionITC extends BaseTest{

	public static String Search_Transaction;
	public static String Qunatity;
	public static String Unit_Price;
	public static String Item;
	
	
	

	

	private static void run() throws InterruptedException{
		
		
		   clickElement(By.id("pt1:_UISmmLink::icon"));
		    clickElement(By.id("pt1:nv_itemNode_receivables_billing"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl3"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl3"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl3"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl3"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl3"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content"));
		    
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content"), Search_Transaction);
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content")).sendKeys("Test_02");
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1::search"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:AT2:_ATp:table2:0:cl1"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:create::icon"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:table1:2:ip1:lovTxtId::content"));
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:table1:2:ip1:lovTxtId::content"), Item);
		    
		   Thread.sleep(5000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:d2::yes"));
		    Thread.sleep(5000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:table1:2:quantity::content"));
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:table1:2:quantity::content"), Qunatity);
		    Thread.sleep(5000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:table1:2:sellingPrice::content"));
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:AT1:_ATp:table1:2:sellingPrice::content"), Unit_Price);
		
		    clickElement(By.cssSelector("span.xtn"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:inputText134"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:cb2"));
		    clickElement(By.cssSelector("span.xtn"));
		

		   
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CalculatingTaxOnAReceivablesTransactionWithAProductTaxExceptionITC.class);
			run();
		}
	}

}




