package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingARefundITC extends BaseTest{

	public static String RecieptNumber;
	public static String CustomerSite;
	
	

	private static void run() throws InterruptedException{

//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		clickElement(By.id("pt1:nv_moreLk"));
//		clickElement(By.id("pt1:nv_itemNode_receivables_receivables_balances"));
		clickElement(By.id("pt1:_UISmmLink::icon"));
	 	
	 	clickElement(By.id("pt1:_UISnvr:0:nvcl1")); //More 
		//clickElement(By.id("_FOpt1:_UISnvr:0:nv_itemNode_receivables_receivables_balances"));
	 	//clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_receivables_balances"));
	 	//clickElement(By.id("pt1:nv_itemNode_receivables_receivables_balances")); // New UI for Ac recei
	 	clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_receivables_receivables_balances"));
				
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"), RecieptNumber);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1::search")); // Search
		
		Thread.sleep(2000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"));
					        //_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1::db"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1::db"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1\"] ")); // Number Link
							//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1
		Thread.sleep(3000);
		//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1
		//clickElement(By.id("__FOpt1:_FOr1:0:_FONSr2:0:_FOTpsl1"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:showDetailItem2::ti"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cb7"));// Unapply application
		
						//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cb7
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb14")); // Save and Close
		//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:pgl12d
		//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:menu1 // Alternate for Actions button
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:ATm"));// Actions
							//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:ATm
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1")); // More.....
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cmi2")); //Issue refund
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1
		//clickElement(By.xpath("//td[text()='More']"));
						//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1
		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1"))).selectByVisibleText("Issue Refund");
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:siteAddressId::content"), CustomerSite);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:siteAddressId::su0"));
							//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:siteAddressId::su0
		
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:refundPaymentMethodCodeNameId::content"))).selectByVisibleText("Check");
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb8")); // OK button
		
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3::db\"]/table/tbody/tr[1]"));
		//  _FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:4:soc2::content
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:soc2::content"))).selectByVisibleText("Overpayment");
											  
		
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122")); // Save and Close
							  //_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:commandButton1")); // Done
		//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:siteAddressId::su0
							//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb14
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:menu1"]/div/table
							//_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:0:commandLink1

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl5"));

		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:operator1::content"))).selectByVisibleText("Equals");

		//clickElement(By.cssSelector("option[title=\"Equals\"]"));

		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content"), RecieptNumber);

		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value60::content"), RecieptMethod);	    

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1::search"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:appTable:_ATp:t1:1:commandLink1"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cb7"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb14"));

		//Thread.sleep(2000);
		
		//clickElement(By.xpath("(//a[contains(text(),'Actions')])[2]"));
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:ATm']/div/table/tbody/tr/td[2]/a"));

		//clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1']/td[2]"));

		//clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:cmi2']/td[2]"));
		
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:siteAddressId::content"), SiteAddress);

		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:refundPaymentMethodCodeNameId::content"))).selectByVisibleText("Check");

		//clickElement(By.cssSelector("option[title=\"Check\"]"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb8"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:soc2::content"));

		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:soc2::content"))).selectByVisibleText("Overpayment");

		//clickElement(By.cssSelector("option[title=\"Overpayment\"]"));

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122")); 

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:commandButton1")); 



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingARefundITC.class);
			run();
		}
	}

}
