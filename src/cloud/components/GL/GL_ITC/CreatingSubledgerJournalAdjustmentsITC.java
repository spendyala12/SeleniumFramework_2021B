package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingSubledgerJournalAdjustmentsITC extends BaseTest{
	
	public static String LedgerName;
	public static String Description;
	public static String AccountNumber1;
	public static String AccountingClass1;
	public static String DebitAmount;
	public static String Description1;
	public static String AccountNumber2;
	public static String AccountingClass2;
	public static String CreditAmount;
	public static String Description2;
	public static String SupportingrefValue;
	public static String SupplierName;
	public static String SupplierSite;
	
	
	private static void run() throws InterruptedException{
		
		
//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		clickElement(By.id("pt1:nv_itemNode_payables_payables_invoices"));
		
		Thread.sleep(4000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl12"));
		
		Thread.sleep(3000);
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:ledgerNameId::content"),LedgerName);
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:it1::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:it1::content"),Description);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:create::icon"));
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.cssSelector("td.xzn"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:kf1CS::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:kf1CS::content"),AccountNumber1);
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:acctgClassMeaningId::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:acctgClassMeaningId::content"),AccountingClass1);
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:it6::content"));

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:it6::content"),DebitAmount);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:it3::content"));

	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:0:it3::content"),Description1);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:create::icon"));
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.cssSelector("td.xzn"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:kf1CS::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:kf1CS::content"),AccountNumber2);
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:acctgClassMeaningId::content"));

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:acctgClassMeaningId::content"),AccountingClass2);
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:it4::content"));
	
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:it4::content"),CreditAmount);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:it3::content"));

	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT2:_ATp:table2:1:it3::content"),Description2);
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:sdi1::disAcr"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT4:_ATp:create::icon"));
	    
	    Thread.sleep(4000);
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT4:soc4::content"))).selectByVisibleText("Additional Attribute 1");
	    
	    clickElement(By.cssSelector("option[title=\"Additional Attribute 1\"]"));
	    
	    Thread.sleep(2000);
	   
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT4:it7::content"),SupportingrefValue);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:AT4:FAsc3"));
	   
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:sdi2::disAcr"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:sdi3::disAcr"));
	    
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:soc3::content"))).selectByVisibleText("Supplier");
	    
	    clickElement(By.cssSelector("option[title=\"Supplier\"]"));
	    
	    Thread.sleep(3000);

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:supplierNameId::content"),SupplierName);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:it10::content"));
	    
	    Thread.sleep(5000);

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:supplierSiteId::content"),SupplierSite);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:it10::content"));
	    
	    clickElement(By.cssSelector("li.p_AFSelected.AFAutoSuggestItem"));
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:cil1"));
	    
	    Thread.sleep(5000);
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:soc1::content"))).selectByVisibleText("Final");
	    
	    clickElement(By.cssSelector("option[title=\"Final\"]"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.cssSelector("span.xtn"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:cb5']/table/tbody/tr/td/a/span"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:cb15"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:mjept1:AP1:dialog3::ok"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingSubledgerJournalAdjustmentsITC.class);
			run();
		}
	}

}
