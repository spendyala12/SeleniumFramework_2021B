package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingAReceivablesReceiptRemittanceITC extends BaseTest{

	public static String Receipt_Class;
	public static String Receipt_Method;
	public static String Search_Receipt_Method;
	public static String Remittance_Bank;
	public static String Remittance_Bank_Branch;
	public static String Remittance_Bank_Account;




	private static void run() throws InterruptedException{


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl8"));

		clickElement(By.linkText("Create Receipt Remittance Batch"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptClassId::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptClassId::content"), Receipt_Class);

		Thread.sleep(10000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptMethodId::lovIconId"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptMethodId::dropdownPopup::dropDownContent::db']/table/tbody/tr/td"));

		//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptClassId::_afrautosuggestpopup"));
		//		    
		//		 
		//
		//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptMethodId::content"));
		//		     
		//		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptMethodId::content"), Receipt_Method);
		//		    
		//		    
		//		   Thread.sleep(5000);
		//		    
		//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:receiptMethodId::_afrautosuggestpopup"));
		//		    
		//		    
		//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:remittanceBankId::content"));
		//		    
		//		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:remittanceBankId::content"), Remittance_Bank);
		//		    
		//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:remittanceBankId::_afrautosuggestpopup"));
		//		    
		//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:remittanceBankBranchId::content"));
		//		    
		//		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:remittanceBankBranchId::content"), Remittance_Bank_Branch);
		//		    
		//		 
		//		    
		//		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:bankAccountNum::content"));
		//		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:bankAccountNum::content"), Remittance_Bank_Account);

		Thread.sleep(10000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:AT1:_ATp:commandToolbarButton1::icon"));
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:q1:value60::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:q1:value60::content"), Search_Receipt_Method);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:q1::search"));

		Thread.sleep(3000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:AT2:_ATp:t1::db"));
		
		Thread.sleep(2000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:commandButton1"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:commandButton2"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RBCF:0:ap1:commandButton4"));
		Thread.sleep(2000);
		clickElement(By.id("_FOd1::msgDlg::cancel"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAReceivablesReceiptRemittanceITC.class);
			run();
		}
	}

}




