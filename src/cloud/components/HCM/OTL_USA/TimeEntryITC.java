package cloud.components.HCM.OTL_USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class TimeEntryITC extends BaseTest{


	public static String SelectDates;
	public static String Quantity;
	public static String Comments;
	

	
	

	private static void run() throws Exception  {

		
		clickElement(By.xpath("//span[contains(text(),'Time and Absences')]")); //Time and Absences
		//clickElement(By.xpath("//span[contains(text(),'Current Time Card')]")); //CurrentTimeCard
		clickElement(By.xpath("//span[contains(text(),'Existing Time Cards')]")); //Existing Time Cards
		clickElement(By.xpath("//span[contains(text(),'Add')]")); //AddButton
		setElementText(By.xpath("//*[contains(@id,'sdDt::content')]"), SelectDates);
		clickElement(By.xpath("//span[contains(text(),'Add')]")); //AddButton
		clickElement(By.xpath("//*[contains(@id, 'aN4Srh::btn')]")); //Click Project drop down
		clickElement(By.xpath("//div[contains(text(),'308AdminUS')]")); //Select Project
		
		clickElement(By.xpath("//*[contains(@id, 'aN6Srh::btn')]")); //Click Task drop down
		clickElement(By.xpath("//div[contains(text(),'900')]")); //Select Task
	
		clickElement(By.xpath("//*[contains(@id, 'aC7Srh::btn')]")); //Click Expenditure drop down
		clickElement(By.xpath("//div[contains(text(),'Professional - Straight Time')]")); //Select Expenditure
	
		clickElement(By.xpath("//*[contains(@id, 'stePse:dtItr:0:teMdp:mdp_cil1::icon')]")); //Select dates icon
		clickElement(By.xpath("//td[contains(text(),'12')]"));
		clickElement(By.xpath("//td[contains(text(),'13')]"));
		clickElement(By.xpath("//td[contains(text(),'14')]"));
		clickElement(By.xpath("//td[contains(text(),'15')]"));
		clickElement(By.xpath("//td[contains(text(),'16')]"));
		setElementText(By.xpath("//*[contains(@id, 'stePse:dtItr:0:mInp::content')]"), Quantity);
		browser.findElement(By.xpath("//*[contains(@id, 'stePse:dtItr:0:mInp::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'stePse:elcInp::content')]"), Comments);

		clickElement(By.xpath("//*[contains(@id, 'stePse:PSEcb2')]")); //OK
		clickElement(By.xpath("//span[contains(text(),'Submit')]")); //Submit
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TimeEntryITC.class);
			run();
		}
	}

}
