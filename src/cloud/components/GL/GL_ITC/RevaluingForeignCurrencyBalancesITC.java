package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class RevaluingForeignCurrencyBalancesITC extends BaseTest{
	
	public static String Name;
	public static String Description;
	public static String Chart_of_Accounts;
	public static String Currency;
	public static String Gain_Account;
	public static String Loss_Account;
	public static String Data_Access_Set;
	public static String Ledger;
	public static String Revaluation;
	public static String Accounting_Period;
	
	
	
	private static void run(){
		if(browser.findElement(By.xpath("//div[@class='shortcuts-popup-wrapper ng-scope']")).isDisplayed())
			browser.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")).click();
		
		clickElement(By.xpath("//*[contains(@id,'_FOTsdiPeriodCloseRegionalArea::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_period_close:0:_FOTRaT:0:RAtl3')]"));
	    clickElement(By.cssSelector("div.xi4"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:ap1:AT1:_ATp:createMenuItem']/td[2]"));
	    setElementText(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_period_close:0:MAnt2:2:AP1:it1::content')]"), Name);
	    setElementText(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_period_close:0:MAnt2:2:AP1:it2::content')]"), Description);
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:sol1::content')]"))).selectByVisibleText(Chart_of_Accounts);
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:fromCurrencyCodeId::content')]"))).selectByVisibleText(Currency);
	    
	     clickElement(By.xpath("//*[contains(@id,'userConversionTypeId::lovIconId')]"));
	    clickElement(By.xpath("//*[contains(@id='MAnt2:2:AP1:userConversionTypeId::dropdownPopup::dropDownContent::db')]/table/tbody/tr[2]/td"));
	    setElementText(By.xpath("//*[contains(@id,'MAnt2:2:AP1:kf1CS::content')]"), Gain_Account);
	    setElementText(By.xpath("//*[contains(@id,'MAnt2:2:AP1:kf2CS::content')]"), Loss_Account);
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:create::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:ATt1:0:kff1_ACKFF_KFFButconImage1::icon')]"));
	    clickElement(By.xpath("//a[@class='x1gr']"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:KFFFILTERFilterCriteria:addFieldsIter:0:j_id18']/td[2]"));
	  		 
	    setElementText(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:ATt1:0:KFFFILTERFilterCriteria:value00::content')]"), "2210");
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:AT1:_ATp:ATt1:0:kff1SEl')]"));
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:commandButton1')]"));
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:DAScommandButton12')]"));
	  
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'Revaluation::content')]"))).selectByVisibleText(Data_Access_Set);
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'soc2::content')]"))).selectByVisibleText(Ledger);
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'soc1::content')]"))).selectByVisibleText(Revaluation);
	    new Select(browser.findElement(By.xpath("//*[contains(@id,'soc3::content')]"))).selectByVisibleText(Accounting_Period);
	  
	    clickElement(By.xpath("//*[contains(@id,'requestBtns:submitButton')]"));
	    clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));
	    clickElement(By.xpath("//*[contains(@id,'dialogGenerate::close')]"));
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:2:AP1:DAScommandButton11')]"));
	    clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_period_close:0:MAnt2:1:ap1:cb3')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(RevaluingForeignCurrencyBalancesITC.class);
			run();
		}
	}

}
