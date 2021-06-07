package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingaStandardReceiptITC extends BaseTest{
	
	public static String Receipt_Number;
	public static String Amount;
	public static String Account_Number;
	public static String Reference_Number;
	public static String Reference_Amount;
	
	private static void run(){
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:_FOTRaT:0:RAtl1"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:receiptMethodId::lovIconId"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:receiptMethodId::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:receiptNumberId::content"), Receipt_Number);//"5557"
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:amountId::content"), Amount);//"1000"
	    clickElement(By.cssSelector("img[alt=\"Search: Account Number\"]"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:customerAccountId::_afrLovInternalQueryId:value10::content"), Account_Number);//"10060"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:customerAccountId::_afrLovInternalQueryId::search"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:customerAccountId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:customerAccountId::lovDialogId::ok"));
	    clickElement(By.cssSelector("img[alt=\"Search: Site\"]"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:locationId::dropdownPopup::dropDownContent::db']/table/tbody/tr/td"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:AT1:_ATp:create::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:AT1:_ATp:table1:0:inputText2::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:AT1:_ATp:table1:0:inputText2::content"), Reference_Number);//"10120"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:AT1:_ATp:table1:0:inputText3::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:AT1:_ATp:table1:0:inputText3::content"), Reference_Amount);//"200"
	    clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:commandButton2::popEl']/img"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:cmi3']/td[2]"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:REF:0:ap1:commandButton122"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingaStandardReceiptITC.class);
			run();
		}
	}

}
