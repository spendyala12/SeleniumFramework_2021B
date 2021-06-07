package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingACustomerITC extends BaseTest{
	
	public static String Name;
	public static String CustomerName;
	public static String AccountName;
	public static String Address_SetName;
	public static String SITE;
	public static String Address;
	public static String PostalCode;


	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
	 	
	 	clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
	 	clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_billing::icon"));//Bills Icon
	 	//clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_billing"));//Bills Icon
	 	//pt1:_UISnvr:0:nv_itemNode_receivables_billing// bill icon alt

		//		clickElement(By.id("pt1:_UISmmLink::icon"));
		//		clickElement(By.id("pt1:nv_itemNode_receivables_billing"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_billing"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl9"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r1:0:inputText123::content"), CustomerName);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r2:0:inputText1::content"), AccountName);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::_afrLovInternalQueryId:value00::content"), Address_SetName);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::_afrLovInternalQueryId::search"));
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId_afrLovInternalTableId::db"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]/span
		clickElement(By.xpath("//tr[@class='xep']//td//div//table//tbody//tr//span[@class='x2r9'][contains(text(),'AP_DEPT_SET')] "));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::lovDialogId::ok"));
						  //_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::lovDialogId::ok
							//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::lovDialogId::ok
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:inputText13::content"), SITE);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:4:inputText2::content"), Address);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:2:inputComboboxListOfValues4::content"), PostalCode);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:create::icon"));
		
		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:table1:3:SiteUseCode::content"))).selectByVisibleText("Bill to");
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:table1:0:SiteUseCode::content"),"Bill to");
		clickElement(By.xpath("//*[text()='Bill to']"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:cucommandButton2"));
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId_afrLovInternalTableId::scroller"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl9"));

		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r1:0:inputText123::content"), CustomerName);

		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r2:0:inputText2::content"), AccountName);

		//(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:setIdLovId::content"), SITE);

		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:0:inputText2::content"), Address);  

				
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:dynam1:0:dynam1:0:s2:i1:4:inputComboboxListOfValues4::content"), ZipCode);

		//Thread.sleep(2000);

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:create::icon"));
							  //_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:create::icon

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:table1:0:SiteUseCode::content"));


		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:pt_r3:0:AT1:_ATp:table1:0:SiteUseCode::content"))).selectByVisibleText("Bill to");

		//clickElement(By.cssSelector("option[title=\"Bill to\"]"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:cupanel1:cucommandButton2"));

//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:2:AP1:cb1"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingACustomerITC.class);
			run();
		}
	}

}
