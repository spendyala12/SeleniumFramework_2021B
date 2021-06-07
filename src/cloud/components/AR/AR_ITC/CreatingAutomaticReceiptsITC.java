package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingAutomaticReceiptsITC extends BaseTest{

	public static String Business_Unit;
	public static String Receipt_Method;
	public static String Transaction_From;
	public static String Transaction_To;

	private static void run() throws InterruptedException{
		clickElement(By.id("_FOpt1:nv_itemNode_receivables_receivables_balances"));
		//_FOpt1:nv_itemNode_receivables_receivables_balances
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl3"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:operatingUnitId::content"), Business_Unit);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:receiptMethodId::content"), Receipt_Method);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:id3::content"), Transaction_From);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:id5::content"), Transaction_From);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:actb1\"]/table/tbody/tr/td[1]/a/span "));
		clickElement(By.id("_FOd1::msgDlg::cancel"));
		//ClickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:actb1\"]/table/tbody/tr/td[1]/a/span "));
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:actb1"]/table/tbody/tr/td[1]/a/span
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl3"));
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:operatingUnitId::content"), Business_Unit);//US1 Business Unit
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:receiptMethodId::content"), Receipt_Method);//EFT (Automatic)

	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:id3::content"), Transaction_From);//"2/1/17"
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:AP1:id5::content"), Transaction_To);//"2/14/17"
	   // clickElement(By.cssSelector("span.xpc"));
	    //clickElement(By.id("_FOd1::msgDlg::cancel"));
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAutomaticReceiptsITC.class);
			run();
		}
	}

}
