package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingaTransactionITC extends BaseTest{

	public static String Trnx_Number;

	private static void run() throws InterruptedException{

		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		//clickElement(By.id("_FOpt1:_UISmmLink::icon"));
		clickElement(By.id("_FOpt1:nv_itemNode_receivables_billing"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
	   // _FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl2"));
	   // _FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl2
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl2")); //Credit Transaction
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::content"), Trnx_Number); // Txn Number
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::lovIconId"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::lovIconId")); //Search Icon
	   // _FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::content
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::_afrLovInternalQueryId::search")); // Search button
	  //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id_afrLovInternalTableId::db"]/table/tbody/tr
	    clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id_afrLovInternalTableId::db\"]/table/tbody/tr "));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id_afrLovInternalTableId::db")); //Select row
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::lovDialogId::ok")); // OK button
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:saveMenu2")); //save btn
	    //clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:saveMenu2\"]/table/tbody/tr/td[1]/a"));
	  //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:saveMenu2"]/table/tbody/tr/td[1]/a
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:saveMenu2")); //Save
	    
	    Thread.sleep(2000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:AT1:_ATp:creditEntireBal"));
	    					//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:AT1:_ATp:creditEntireBal
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:commandButton6"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:r1:0:ap1:CompleteandClose"));
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::_afrLovInternalQueryId:value10::content"), Trnx_Number);//"5000001"
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::_afrLovInternalQueryId::search"));
	   // clickElement(By.cssSelector("td.xe7"));
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:r1:0:ap1:trxNumber1Id::lovDialogId::ok"));
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:r1:0:ap1:AT1:_ATp:creditEntireBal"));
	   // clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:r1:0:ap1:CompleteandClose']/table/tbody/tr/td/a/span"));
	   // clickElement(By.id("_FOd1::msgDlg::cancel"));
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaTransactionITC.class);
			run();
		}
	}

}
