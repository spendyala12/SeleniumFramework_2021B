///After selecting the Account field , Unable to click on "ok" button (Some time it is working, some time it is not working). The "OK" button is clicking but not closing the current dialog box. Unable to give the account number.

package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAndPostingCrossCurrencyJournalsITC extends BaseTest{
	
	public static String JournalName;
	public static String JournalDescription;
	public static String AccountingPeriod ;
	public static String JournalName2;
	public static String JournalDescription2;	
	public static String CategoryName;
	//public static String JournalType;
	public static String Alias;
	//public static String Value;
	public static String DebitAmount;
	public static String Alias2;
	//public static String Value2;
	public static String CreditAmount;
//	public static String Accountnumber3;
//	public static String CreditAmount2;
	public static String BatchName;
	
	private static void run() throws InterruptedException{
		
		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		//clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_general_accounting_journals"));
		clickElement(By.id("pt1:nv_itemNode_general_accounting_journals"));
		//Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr2:0:cl1"));  //Click on Change
		                    
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr2:0:soc1::content")); // Data Access Set
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr2:0:d1::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::ti"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl2"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
		                  //_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl2"));  //Create Journal
	                     	
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessBatchName::content"),JournalName);    //Journal Batch	
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessBatchDescription::content"),JournalDescription);  //Description	
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:DefaultPeriodName1::content"),AccountingPeriod);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessJournalName::content"), JournalName2); //Journal	
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessJournalDescription::content"), JournalDescription2);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::lovIconId"),CategoryName); //Category
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::_afrLovInternalQueryId:value00::content"), CategoryName);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::_afrLovInternalQueryId::search"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1_afrLovInternalTableId::db\"]/table/tbody/tr[1]")); //selecting row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::lovDialogId::ok"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:CurrencyCode1::content"));  //click on currency
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS2"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountKBIMG::icon")); //click on Add btn
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::lovIconId")); //Alias drop down
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::dropdownPopup::popupsearch"));
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::_afrLovInternalQueryId:value00::content"), Alias);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::_afrLovInternalQueryId::search"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha_afrLovInternalTableId::db\"]/table/tbody/tr[1]")); //Selecting row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSEl")); //click on ok
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content"),DebitAmount);
      //  clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:it39::content"));
        
		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:CurrencyCode1::content"))).selectByVisibleText("EUR-Euro");
		                                      
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db\"]/table/tbody/tr[2]"));
		//clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db\"]/table/tbody/tr[2]/td[1]"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content"));
		Thread.sleep(2000); 
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountKBIMG::icon")); //Click on search
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchSha::lovIconId"));
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchSha::dropdownPopup::popupsearch"));
        setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchSha::_afrLovInternalQueryId:value00::content"), Alias2);
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchSha::_afrLovInternalQueryId::search"));
        Thread.sleep(2000);
        clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchSha_afrLovInternalTableId::db\"]/table/tbody/tr[1]"));
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchSha::lovDialogId::ok"));
        Thread.sleep(2000);

        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountSEl")); //Click on ok btn
        //   //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db"]/table/tbody/tr[2]/td[6]
        Thread.sleep(2000);
        setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content"), CreditAmount);
                             
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS"), Accountnumber2);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr"), CreditAmount);
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:saveBatch")); //click on save btn
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:cil2::icon")); //Refresh
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:m7")); //Drop down btn
        Thread.sleep(2000);
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:amountTypeEntered")); //Entered Amount
        Thread.sleep(2000);
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:saveBatch::popEl")); //Save drop down tbn
        Thread.sleep(2000);
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:cmi5")); //click on Save and close 
        
        //clickElement(By.id("_FOpt1:_UISpgl53u")); //Click on navigator
        //clickElement(By.id("_FOpt1:nv_itemNode_general_accounting_journals"));
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
        clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1"));
       new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP:value10::content"))).deselectByVisibleText("ITCTest20454");
       clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP:value20::lovIconId"));//Accounting Period
       clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP:value20::dropdownPopup::dropDownContent::db\"]/table/tbody/tr[1]/td"));
       clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:queryP::search"));
       clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:t1::db\"]/table/tbody/tr[1]"));
       clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:commandToolbarButton3")); //Post batch
       clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:userResponsePopupDialogButtonOk")); //Click on ok btn
       clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:ap1:SPb")); //Done btn

        
      
        
        
		
		
		
		
		
		//clickElement(By.id("pt1:nv_itemNode_general_accounting_journals"));
		
//		Thread.sleep(5000);
//	    
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsr2:0:cl1"));
//		
//		Thread.sleep(2000);
//	    
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsr2:0:soc1::content"))).selectByVisibleText("US Ledger Set");
//	    
//	    clickElement(By.cssSelector("option[title=\"US Ledger Set\"]"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsr2:0:d1::ok"));
//	    
//	    
//	    Thread.sleep(3000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl2"));
//	    
//	    Thread.sleep(3000);
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:showLessBatchName::content"),JournalName);
//	    
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:showLessBatchDescription::content"),JournalDescription);
//	    
//	   
//	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::content"),JournalType);
//	    
//	    Thread.sleep(2000);
//	    
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:CurrencyCode1::content"))).selectByVisibleText("EUR - Euro");
//	    
//	    clickElement(By.cssSelector("option[title=\"EUR - Euro\"]"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content"));
//	    
//	    
//	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content"),Accountnumber1);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content"));
//	    
//	   
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content"),DebitAmount);
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredCr::content"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:create::icon"));
//	    
//	    Thread.sleep(6000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:2:j_id131"));
//	    
//	    
//	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:2:accountCS::content"),Accountnumber2);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:2:EnteredCr::content"));
//	    
//	    Thread.sleep(2000);
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:2:EnteredCr::content"),CreditAmount);
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:2:EnteredDr::content"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:saveBatch::popEl"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:cmi4']/td[2]"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl1"));
//	    
////	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:queryP:operator1::content"))).selectByVisibleText("Contains");
////	    
////	    clickElement(By.cssSelector("option[title=\"Contains\"]"));
//	    
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:queryP:operator1::content"))).selectByVisibleText("Equals");
//	    
//	    clickElement(By.xpath("(//option[@value='2'])[2]"));
//	    
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:queryP:value10::content"),BatchName);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:queryP::search"));
//	    
//	    Thread.sleep(3000);
//	    
//	    clickElement(By.cssSelector("td.p_AFFocused.xzn"));
//	    
//	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:AT1:_ATp:commandToolbarButton3']/a/span"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:userResponsePopupDialogButtonOk"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:AT1:_ATp:t1:0:commandLink4"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:commandToolbarButton5']/a/span"));
//	    
//	    clickElement(By.cssSelector("span.xtn"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAndPostingCrossCurrencyJournalsITC.class);
			run();
		}
	}

}
