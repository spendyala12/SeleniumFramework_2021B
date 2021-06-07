package cloud.components.AP.AP_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;


public class CreateAccountingITC extends BaseTest {
	
	public static String BusinessUnit;
	public static String Ledger;
	public static String Option;
	public static String SubledgerApplication;
	public static String AccountingLedger;
	public static String ProcessCategory;
	public static String Date;
	public static String AccountingMode;
	public static String ReportStyle;


	private static void run() throws Exception{


		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]"));
		clickElement(By.linkText("Validate Invoices")); //validate Invoice
		setElementText(By.xpath("//*[contains(@id,'paramDynForm_BusinessUnit::content')]"),BusinessUnit); //US1 Business Unit
		setElementText(By.xpath("//*[contains(@id,'basicReqBody:paramDynForm_ATTRIBUTE4_ATTRIBUTE4::content')]"),Option); //All 
		clickElement(By.xpath("//*[contains(@id,'submitButton')]")); 
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]")); 
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']"));  //navigator
		clickElement(By.xpath("//span[contains(text(),'Scheduled Processes')]")); 
		clickElement(By.xpath("//*[contains(@id,'processRefreshId::icon')]")); //refresh
		clickElement(By.xpath("//body[@class='x1mg p_AFMaximized']/div[@id='_FOd1']/form[@id='_FOf1']/div[@id='_FOpt1:_UISpgl8']/div/div[@id='_FOpt1:_UISpageCust']/div[@id='_FOpt1:_UISpageCust::c']/div[@id='_FOpt1:_UISpgl9']/div/div[@id='_FOpt1:_UISpgrl2']/div/div[@id='_FOpt1:_UISpgl22']/div/div[@id='_FOpt1:_UISpgl16']/div/div[@id='_FOpt1:_FOpsl1']/div/div[@id='_FOpt1:_FOpsl1::c']/div[@id='_FOpt1:_FOpgl1']/div/div[@id='_FOpt1:_FOr1']/div[@id='_FOpt1:_FOr1:0:_FONSpsl2']/div/div[@id='_FOpt1:_FOr1:0:_FONSpsl2::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTpsl1']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTpsl1::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTpgl1']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMsplitter']/table/tbody/tr/td[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMsplitter::f']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMpsl']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMpsl::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:sdhpgltop0']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:sdhpgltop0::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:ps1']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:ps1::f']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:_otrWpr']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:_otrWpr::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:result']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:result::db']/table[@class='x1nq x1oe']/tbody/tr[1]/td[1]")); 
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']")); //navigator
		clickElement(By.xpath("//span[@class='xmq'][contains(text(),'Invoices')]")); 
		clickElement(By.xpath("//*[contains(@id,'FndTasksList::icon')]")); 
		clickElement(By.xpath("//*[contains(@id,'FOTRaT:0:RAtl12')]"));  //creating accounting
		setElementText(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_SubledgerApplicationAttr::content']"),SubledgerApplication);  //AHC Billing 
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_LedgerAttr::content']"),AccountingLedger); //Australia Primary Ledger
		setElementText(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE5_ATTRIBUTE5::content']"),ProcessCategory); //AHC Billing
		clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE6_ATTRIBUTE6::glyph']"));
		clickElement(By.xpath("//td[contains(text(),'16')]"));
		setElementText(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE8_ATTRIBUTE8::content']"),AccountingMode);//Draft
		setElementText(By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:basicReqBody:paramDynForm_ATTRIBUTE10_ATTRIBUTE10::content']"),ReportStyle); //Details
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:requestBtns:submitButton']//a[@class='xx3']")); //submit
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:ap1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok']"));
		clickElement(By.xpath("//a[@id='_FOpt1:_UISmmLink']//*[local-name()='svg']"));//navigator
		clickElement(By.xpath("//span[contains(text(),'Scheduled Processes')]"));
		clickElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:processRefreshId::icon']"));
		clickElement(By.xpath("//body[@class='x1mg p_AFMaximized']/div[@id='_FOd1']/form[@id='_FOf1']/div[@id='_FOpt1:_UISpgl8']/div/div[@id='_FOpt1:_UISpageCust']/div[@id='_FOpt1:_UISpageCust::c']/div[@id='_FOpt1:_UISpgl9']/div/div[@id='_FOpt1:_UISpgrl2']/div/div[@id='_FOpt1:_UISpgl22']/div/div[@id='_FOpt1:_UISpgl16']/div/div[@id='_FOpt1:_FOpsl1']/div/div[@id='_FOpt1:_FOpsl1::c']/div[@id='_FOpt1:_FOpgl1']/div/div[@id='_FOpt1:_FOr1']/div[@id='_FOpt1:_FOr1:0:_FONSpsl2']/div/div[@id='_FOpt1:_FOr1:0:_FONSpsl2::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTpsl1']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTpsl1::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTpgl1']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMsplitter']/table/tbody/tr/td[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMsplitter::f']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMpsl']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:UIMpsl::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:sdhpgltop0']/div/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:sdhpgltop0::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:ps1']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:ps1::f']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:_otrWpr']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:_otrWpr::c']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:result']/div[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:panel:result::db']/table[@class='x1nq x1oe']/tbody/tr[1]/td[1]"));
				
	
}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreateAccountingITC.class);
			run();
		}
	}
}