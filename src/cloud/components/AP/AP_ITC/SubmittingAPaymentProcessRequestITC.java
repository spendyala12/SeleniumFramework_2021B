package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;


public class SubmittingAPaymentProcessRequestITC extends BaseTest{
	public static String Name;
	public static String INV_Group;
	public static String Req_Id;
	
	
	private static void run() throws Exception{

	 	clickElement(By.id("pt1:_UISmmLink::icon"));
	 	
	 	clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
	 	clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_payables_payables_payments::icon"));//Payments Icon
	 	
	   
	    //clickElement(By.id("pt1:nv_itemNode_payables_payables_payments"));
	 	clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl1"));// Payment request process
	  //  clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl1"));
	    
	
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputText1::content"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:inputText1::content"));
	    
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:inputText1::content"), Name);
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:inputText1::content"), Name);
	  
	   // clickElement(By.cssSelector("#_FOpt1\3A_FOr1\3A 0\3A_FONSr2\3A 0\3AMAnt2\3A 1\3A ap1\3A CurrencyGroupRadio\3A\3A content .x144:nth-child(3) > .x2l"));
	    clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:CurrencyGroupRadio::content\"]/fieldset/span[2]/label"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:CurrencyGroupRadio:_1"));
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:create::icon"));
	                     // id=_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:create::icon
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT2:_ATp:create::icon"));
	    
//	    _FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:table2:3:currencyCodeId::content
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:table2:1:currencyCodeId::content"));
	    
	   // clickElement(By.cssSelector("option[title=\"AZN - Azerbaijanian Manat\"]"));
	    
	    //clickElement(By.id("_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:table2:0:currencyCodeId::content")));

	   // clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:table2:0:currencyCodeId::content"));

	    //new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT2:_ATp:table2:0:currencyCodeId::content"))).selectByVisibleText("USD - US Dollar");
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT2:_ATp:table2:0:currencyCodeId::content"))).selectByVisibleText("USD - US Dollar");
	    
//	    clickElement(By.cssSelector("option[title=\"USD - US Dollar\"]"));
	    

	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:AT2:_ATp:table2:0:currencyCodeId::content"));

	   // clickElement(By.cssSelector("option[title=\"USD - US Dollar\"]"));
	    //clickElement(By.id("_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId::lovIconId"));
	    //clickElement(By.id("_FOr1:0:_FONSr2:0:MAnt2:1:ap1:xCurrUserConversionTypeId::content"));
	  //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:selectBooleanCheckbox3"]/td[2]/span/span/label
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId::lovIconId"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId::dropdownPopup::popupsearch"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId::_afrLovInternalQueryId:value00::content"), INV_Group);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId::_afrLovInternalQueryId::search"));
	    Thread.sleep(2000);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId_afrLovInternalTableId::db"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:batchNameId::lovDialogId::ok"));
	    
	    
	    //
	    //clickElement(By.cssSelector(".p_AFSelected > .xeq > .x2r9"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:showDetailItem2::disAcr"));// Payment and processing options
	  
	   clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:selectBooleanCheckbox3\"]/td[2]/span/span"));
	   						 //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:selectBooleanCheckbox3"]/td[2]/span/span
	    clickElement(By.cssSelector("#\\_FOpt1\\3A_FOr1\\3A 0\\3A_FONSr2\\3A 0\\3AMAnt2\\3A 1\\3A ap1\\3ASPsb2 .x1pk"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	  //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:selectBooleanCheckbox3"]/td[2]/span/span/label
	    
	  //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:selectBooleanCheckbox3"]/td[2]/span/span/label

	  //  clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:batchNameId::lovIconId"));

	    //clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:batchNameId::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td"));

	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:showDetailItem2::disAcr"));

	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:selectBooleanCheckbox1::content"));

	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:ap1:APsb2"));
	    
	   // captureOutput(By.id("_FOd1::msgDlg::_cnt"), Req_Id);

	   // clickElement(By.id("_FOd1::msgDlg::cancel"));
	    
	}
	
		public static void run(int iterations) throws Exception{
			initComponent();
			for(int i=0;i<iterations;i++)
			{
				iteration=i;
				popluateParams(SubmittingAPaymentProcessRequestITC.class);
				run();
			}
		}

	}
