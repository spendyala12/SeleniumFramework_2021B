package cloud.components.HCM.OTL_ITC;
import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class GenerateTimeCardFieldsITC extends BaseTest{

	public static String Role;
	public static String NewTimeCard;
	
private static void run() throws InterruptedException	
	
	{
		clickElement(By.id("pt1:_UIScmil2u::icon")); //user account//*[contains(@id, 'UIScmil2u::icon')]
		
		clickElement(By.linkText("Setup and Maintenance")); //set up and maintenance
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //task
		
		clickElement(By.linkText("Search")); //search				
		
		clickElement(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']")); //
				
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']"), Role); //define time and labor
				
		clickElement(By.xpath("//div[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']//a[@class='xx3']")); //search
			
		clickElement(By.linkText("Define Time and Labor")); //define time and labor link
					
		clickElement(By.linkText("Generate Time Card Fields")); //Generate Time Card Fields link			
		
		clickElement(By.xpath("//*[contains(@id, 'paramDynForm_Attribute2_null::content')]")); //new time card field
		
		setElementText(By.xpath("//*[contains(@id, 'paramDynForm_Attribute2_null::content')]"), NewTimeCard);
			
		
		clickElement(By.xpath("//*[contains(@id, 'paramDynForm_Attribute3_null::content')]")); //include absence types
		
		clickElement(By.xpath("//li[contains(text(),'Yes')]")); //yes		
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:basicReqBody:paramDynForm_Attribute5_null::content")); //legislative data group
		
		//clickElement(By.xpath("//li[contains(text(),'US Legislative Data Group')]")); //US Legislative Data Group
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:basicReqBody:paramDynForm_Attribute5_null::pop']/li[11]")); //US Legislative Data Group
		//clickElement(By.xpath("//ul[contains(@id,'')]/li[contains(text(), 'Time entry rule')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'requestBtns:submitButton')]")); //submit
		
		clickElement(By.xpath("//*[contains(@id, 'confirmSubmitDialog::ok')]")); //ok
		
}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(GenerateTimeCardFieldsITC.class);
		run();
	}
}
}