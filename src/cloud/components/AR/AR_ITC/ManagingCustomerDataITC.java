package cloud.components.AR.AR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ManagingCustomerDataITC extends BaseTest{

	public static String Account;
	public static String First_Name;
	public static String Last_Name;
	public static String Phone_Number;
	public static String Site_Name;
	public static String Email;


	private static void run() throws InterruptedException{

		//clickElement(By.id("pt1:nv_itemNode_collections_collections_dashboard"));
		
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:soc1::content"))).selectByVisibleText("Account");
	    
	    clickElement(By.cssSelector("option[title=\"Account\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:it1::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:it1::content"), Account);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP1:r1:0:search_Button"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:tab_contact::disAcr"));
	    
	    clickElement(By.xpath("(//a[contains(text(),'Actions')])[2]"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:_ATp:cmi1']/td[2]"));
	    
	    Thread.sleep(3000);
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:selectOneChoice4::content"))).selectByVisibleText("Miss");
	    
	    clickElement(By.cssSelector("option[title=\"Miss\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:inputText3::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:inputText3::content"), First_Name);
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:inputText4::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:inputText4::content"), Last_Name);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:AT1:_ATp:create::icon"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:AT1:_ATp:table1:0:selectOneChoice3::content"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:r1:1:AT1:_ATp:table1:0:selectOneChoice3::content"))).selectByVisibleText("Credit contact");
	    
	    clickElement(By.cssSelector("option[title=\"Credit contact\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu1:0:AT1:commandButton1"));
	    
	    Thread.sleep(8000);
	    
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:create::icon"));
	    
	    
	    clickElement(By.xpath("//tr[contains(@id, '_FOpt1:_FOr1:1:_FONSr2:0:MAnt2:0:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:createMenuItem')]//td[contains(text(), 'Add Row')]"));//clickElement(By.xpath("//*[contains(@title,'Add Row')]//*[contains(@id,'_FOpt1:_FOr1:1:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:create::icon')]"));
	    
	    clickElement(By.xpath("(//a[contains(text(),'Actions')])[3]"));
	    
	    //clickElement(By.xpath("(//a[contains(text(),'Actions')])[3]"));
	    
	    //clickElement(By.xpath("//div[contains(@id, 'HzCpu2')]//a[contains(text(), 'Actions')]"));
	    
	   
	    
	    //clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:ATm']/div/table/tbody/tr/td[3]/div"));
	    
	    //Thread.sleep(5000);
	    
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:createMenuItem']/td[2]"));
	    
	    //clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:createMenuItem']/td[2]"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:table1:1:soc2::content"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:table1:1:soc2::content"))).selectByVisibleText("Mobile");
	    
	    clickElement(By.cssSelector("option[title=\"Mobile\"]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:table1:1:it3::content"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu4:0:AT1:_ATp:ATm']/div/table/tbody/tr/td[3]/div"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:table1:1:it3::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu2:0:AT1:_ATp:table1:1:it3::content"), Phone_Number);
	    
	    //clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu4:0:AT1:_ATp:createMenuItem']/td[2]"));
	    
	    clickElement(By.xpath("//tr[contains(@id,'_FOpt1:_FOr1:1:_FONSr2:0:MAnt2:0:AP1:CONT_FL:0:HzCpu4:0:AT1:_ATp:createMenuItem')]"));
	    
	    clickElement(By.xpath("(//a[contains(text(),'Actions')])[4]"));
	    
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu4:0:AT1:pt_r1:1:inputText13::content"));
	    
	   // setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu4:0:AT1:pt_r1:1:inputText13::content"), Site_Name);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu4:0:AT1:Create"));
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.xpath("(//a[contains(text(),'Actions')])[5]"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu3:0:AT1:_ATp:createMenuItem']/td[2]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu3:0:AT1:_ATp:table1:1:soc1::content"));
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu3:0:AT1:_ATp:table1:1:soc1::content"))).selectByVisibleText("Collections");
	    
	    clickElement(By.xpath("(//option[@value='5'])[4]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu3:0:AT1:_ATp:table1:1:it2::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:HzCpu3:0:AT1:_ATp:table1:1:it2::content"), Email);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:CONT_FL:0:cb1"));
	    
	    clickElement(By.cssSelector("span.x1l5"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingCustomerDataITC.class);
			run();
		}
	}

}




