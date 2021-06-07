package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatinganInvoiceITC extends BaseTest{

	public static String Transaction_Source;
	public static String Customer_Name;
	public static String Remit_Address;
	public static String Line_Item;
	public static String Quantity;
	public static String Price;

	private static void run() throws InterruptedException{

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl1"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::content"), Transaction_Source);//"Manual"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::lovIconId"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::_afrLovInternalQueryId:value00::content"), Customer_Name);//"Easy Solutions"

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::_afrLovInternalQueryId::search"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::lovDialogId::ok"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:showMore"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:SDPayment::disAcr"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:remitToAddress1Id::content"), Remit_Address);//"1 Chiswick Park"

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:showLess"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:searchIcoId::icon"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:Popup1:0:Advan1:0:efqrp:value00::content"),Line_Item);//"AS21010"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:Popup1:0:Advan1:0:efqrp::search"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:Popup1:0:Advan1:0:rstab:_ATp:table1::db']/table/tbody/tr/td[3]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:cb1"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content"), Quantity);//"5"
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:sellingPrice::content"), Price);//"10"
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:newTrx']/table/tbody/tr/td/a/span"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:commandToolbarButton2']/a/span"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:dialogCancel::yes"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatinganInvoiceITC.class);
			run();
		}
	}

}
