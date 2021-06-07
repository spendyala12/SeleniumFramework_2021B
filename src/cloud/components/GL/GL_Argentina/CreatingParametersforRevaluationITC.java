package cloud.components.GL.GL_Argentina;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;
public class CreatingParametersforRevaluationITC extends BaseTest{

	public static String Name;
	public static String ConversionRateType;	
	public static String UnrealizedGainAccount;	
	public static String UnrealizedLossAccount;	
	public static String Account;
	public static String Revaluation;
	public static String AccountingPeriod;

	private static void run() throws Exception  {
		
		Thread.sleep(5000);
		clickElement(By.linkText("Period Close"));
		clickElement(By.xpath("//*[contains(@id,'_FOTsdiPeriodCloseRegionalArea::icon')]"));
		clickElement(By.linkText("Revalue Balances"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:AT1:_ATp:create::icon')]")); //click create button
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:it1::content')]"),Name);
		new Select(browser.findElement(By.xpath("//*[contains(@id,'AP1:sol1::content')]"))).selectByVisibleText("ITC ARGENTINA COA INSTANCE"); //click the status drop down and select Open.
		
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:userConversionTypeId::content')]"),ConversionRateType);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:kf1CS::content')]"),UnrealizedGainAccount);
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:kf2CS::content')]"),UnrealizedLossAccount);
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:create::icon')]")); //Click add button
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:kff1_ACKFF_KFFButconImage1::icon')]")); //click the Account filter icon
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:KFFFILTERFilterCriteria:addFields::popEl')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:KFFFILTERFilterCriteria:addFieldsIter:0:adFldMenuItem')]")); //selecting account
		
		//clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:KFFFILTERFilterCriteria:value00::lovIconId')]"));
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:KFFFILTERFilterCriteria:value00::content')]"),Account); //selecting account number
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:AT1:_ATp:ATt1:0:kff1SEl')]"));   //ok
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:commandButton1')]")); //save button
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:DAScommandButton12')]")); //Generate button
		new Select(browser.findElement(By.xpath("//*[contains(@id,'AP1:r1:basicReqBody:dynam1:0:Revaluation::content')]"))).selectByVisibleText("ITC ARG PL");
		new Select(browser.findElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:r1:basicReqBody:dynam1:0:soc2::content')]"))).selectByVisibleText("ITC USA PL"); 
		setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:r1:basicReqBody:dynam1:0:inputComboboxListOfValues1::content')]"),Revaluation); 
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:r1:basicReqBody:dynam1:0:soc3::content')]"));
		clickElement(By.xpath("//option[contains(text(),'NOV-27')]"));
		//setElementText(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:r1:basicReqBody:dynam1:0:soc3::content')]"),AccountingPeriod);
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP1:r1:requestBtns:submitButton')]"));
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingParametersforRevaluationITC.class);
			run();
		}
	}
}