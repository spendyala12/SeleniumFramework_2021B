package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CorrectingFundsTransferErrorsITC extends BaseTest{
	
	public static String ErrorText;
	public static String CCNumber;
	
	private static void run() throws InterruptedException{
		
		
//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		clickElement(By.id("pt1:nv_itemNode_receivables_receivables_balances"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl10"));
	    	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:q1:operator0::content"))).selectByVisibleText("Starts with");
	    
	    clickElement(By.cssSelector("option[title=\"Starts with\"]"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:q1:value00::content"), ErrorText);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:q1::search"));
	   
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:AT1:_ATp:table1::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[3]"));
	    
	    Thread.sleep(2000);
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:AT1:_ATp:table1:0:selectOneChoice2::content"));
	    
//	    clickElement(By.xpath("//*[contains(@id, 'table1:0:selectOneChoice2::content')]"));
	    
	    new Select(browser.findElement(By.xpath("//select[contains(@name, 'selectOneChoice2')]"))).selectByVisibleText("Change Instrument");
	    
	    clickElement(By.cssSelector("option[title=\"Change Instrument\"]"));
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:FCTra1:1:CreditCardAssignmentId1::lovIconId"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:FCTra1:1:CreditCardAssignmentId1::dropdownPopup::popupsearch"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:FCTra1:1:CreditCardAssignmentId1_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[2]"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:FCTra1:1:CreditCardAssignmentId1::lovDialogId::ok"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:FCTra1:1:inputText1::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:FCTra1:1:inputText1::content"), CCNumber);
	   
	    Thread.sleep(1000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:actb1")); 
	    
	    Thread.sleep(1000);
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:AT1:_ATp:commandToolbarButton1']/a/span"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:APb"));
	    		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CorrectingFundsTransferErrorsITC.class);
			run();
		}
	}

}
