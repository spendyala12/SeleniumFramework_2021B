package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CalculatingTaxesOnAReceivablesTransactionITC extends BaseTest{
	
	public static String Transaction_Source;
	public static String Transaction_Number;
	public static String Bil_to_Name;
	public static String Payment_Terms	;
	public static String Item1;
	public static String Item2;
	public static String Quantity1;
	public static String Unit_Price1;
	public static String Quantity2;
	public static String Unit_Price2;
	
	
	private static void run() throws InterruptedException{
		
		 	
		    clickElement(By.id("pt1:_UISmmLink::icon"));
		    clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		    //clickElement(By.id("pt1:nv_itemNode_receivables_billing"));
		    clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_billing::icon"));
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl1"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1"));
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::content"), Transaction_Source);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::content"),Transaction_Source);
		    Thread.sleep(15000);
	   	    
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::content"), Bil_to_Name);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::content"),Bil_to_Name);
		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:paymentTermId::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:paymentTermId::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:paymentTermId::content"), Payment_Terms);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:paymentTermId::content"),Payment_Terms);
		    Thread.sleep(5000);

		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"), Item1);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:lovTxtId::content"),Item1);
		    
		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content"), Quantity1);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content"),Quantity1);
		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:sellingPrice::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:sellingPrice::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:sellingPrice::content"), Unit_Price1);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:sellingPrice::content"),Unit_Price1);
		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:ip1:lovTxtId::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:ip1:lovTxtId::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:ip1:lovTxtId::content"), Item2);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:ip1:lovTxtId::content"),Item2);
		    Thread.sleep(5000);
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:quantity::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:quantity::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:quantity::content"), Quantity2);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:quantity::content"),Quantity2);
		    Thread.sleep(5000);
		    
		   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:sellingPrice::content"));
		     clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:sellingPrice::content"));
		    
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:sellingPrice::content"), Unit_Price2);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:1:sellingPrice::content"),Unit_Price2);
		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:inputText2::content"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:inputText2::content"));
		    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:inputText2::content"), Transaction_Number);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:inputText2::content"),Transaction_Number);
		    //clickElement(By.cssSelector("span.xtn"));
		    //clickElement(By.id("_FOd1::msgDlg::cancel"));

		    //clickElement(By.cssSelector("span.xtn"));
//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:inputText134"));
//		    
//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:cb2"));
//		    
//		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:saveMenu::popEl"));
		    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:saveMenu::popEl"));
		    //clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:cmi10']/td[2]"));
		    clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:TCF:0:ap1:cmi1']/td[2]"));
		    Thread.sleep(5000);
		    
		    //clickElement(By.id("_FOd1::msgDlg::cancel"));
		    clickElement(By.id("_FOd1::msgDlg::cancel"));

		    
		    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CalculatingTaxesOnAReceivablesTransactionITC.class);
			run();
		}
	}

}
