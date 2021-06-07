package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingACustomerAccountITC extends BaseTest{

	public static String Name;
	public static String CustomerName;
	public static String AccountName;
	public static String SITE;
	public static String Address;
	public static String ZipCode;


	private static void run() throws InterruptedException{

		//		clickElement(By.id("pt1:_UISmmLink::icon"));
		//		clickElement(By.id("pt1:nv_itemNode_receivables_billing"));


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl10"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:q1:value10::content"), Name);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:q1::search")); 

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:pt_r1:0:AT1:_ATp:create::icon"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r1:0:inputText123::content"), CustomerName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r2:0:inputText2::content"), AccountName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r3:0:setIdLovId::content"), SITE);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:0:inputText2::content"), Address);  

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:4:inputComboboxListOfValues4::content"), ZipCode);

		Thread.sleep(2000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r3:0:AT1:_ATp:create::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r3:0:AT1:_ATp:table1:0:SiteUseCode::content"));


		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:pt_r3:0:AT1:_ATp:table1:0:SiteUseCode::content"))).selectByVisibleText("Ship to");

		clickElement(By.cssSelector("option[title=\"Ship to\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:1:cupanel1:cucommandButton2"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupt1:CManF:0:AP1:cb1"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingACustomerAccountITC.class);
			run();
		}
	}

}
