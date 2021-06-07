package cloud.components.FA.FA_China;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class LeasedAssetsITC extends BaseTest{


	public static String LeaseNumber;
	public static String LeaseDescription;
	public static String Category;
	public static String PayablesBussinessUnit;
	public static String Lessor;
	public static String LessorSite;
	public static String LeaseStrtDate;
	public static String NonCancelableTerm;
	public static String AssetToAdd;
	public static String Amount;
	public static String InterestRate;
	public static String OneTimeAmount;
	
	private static void run() throws Exception  {

		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form
		
		clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_fixed_assets_additions']")); //Assets
		clickElement(By.xpath("//*[contains(@id,'AP1:soc1::drop')]")); //Asset Drop down
		clickElement(By.xpath("//li[contains(text(),'ITC_BR_CORP - BRL')]")); //ITC_BR_CORP - BRL
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage Leases")); //Manage Leases
		clickElement(By.xpath("//*[contains(@id,'ap1:ls4:ctb1::icon')]")); //'+' Create
		setElementText(By.xpath("//*[contains(@id,'AP2:it111::content')]"), LeaseNumber); //Enter LeaseNumber
		setElementText(By.xpath("//*[contains(@id,'AP2:it6::content')]"), LeaseDescription); //Enter LeaseDescription
		setElementText(By.xpath("//*[contains(@id,'AP2:kf1CS::content')]"), Category); //Enter Category
		setElementText(By.xpath("//*[contains(@id,'AP2:businessUnitId::content')]"), PayablesBussinessUnit);
		setElementText(By.xpath("//*[contains(@id,'AP2:inputComboboxListOfValues1::content')]"), Lessor);
		setElementText(By.xpath("//*[contains(@id,'AP2:inputComboboxListOfValues2::content')]"), LessorSite);
		setElementText(By.xpath("//*[contains(@id,'AP2:id9::content')]"), LeaseStrtDate);
		clickElement(By.xpath("//*[contains(@id,'AP2:soc5::content')]"));//Click Book drop down
		clickElement(By.xpath("//*[contains(@id,'AP2:soc5::content')]")); //Select Book
		clickElement(By.xpath("//option[contains(text(),'ITC_BR_CORP - BRL')]"));//Select ITC_BR_CORP - BRL
		setElementText(By.xpath("//*[contains(@id,'AP2:it71::content')]"), NonCancelableTerm);
		setElementText(By.xpath("//*[contains(@id,'AP2:it21::content')]"), AssetToAdd);
		clickElement(By.xpath("//*[contains(@id,'ATp:create::icon')]")); //'+'Recurring Payments
		clickElement(By.xpath("//*[contains(@id,'ATp:t3:0:soc2::content')]")); //PaymentType
		clickElement(By.xpath("//option[contains(text(),'Periodic lease payment')]")); //PaymentType
		setElementText(By.xpath("//*[contains(@id,'ATp:t3:0:it10::content')]"),Amount); //PaymentTypeAmt
		setElementText(By.xpath("//*[contains(@id,'ATp:t3:0:it11::content')]"),InterestRate); //InterestRate
		clickElement(By.linkText("One Time Payments")); //Onetime payments tab
		clickElement(By.xpath("//*[contains(@id,'ATp:create::icon')]")); //'+'One time payments
		clickElement(By.xpath("//*[contains(@id,'ATp:t4:0:soc3::content')]")); //Click PaymentType
		clickElement(By.xpath("//option[contains(text(),'Advanced lease payment')]")); //select PaymentType
		setElementText(By.xpath("//*[contains(@id,'ATp:t4:0:it37::content')]"),OneTimeAmount);
		clickElement(By.xpath("//*[contains(@id,'AP2:ctb4')]")); //Generate Schedules
		clickElement(By.linkText("Pending Transactions")); //Pending Transactions
		clickElement(By.xpath("//span[@class='xng']")); //Click Lease Num
		clickElement(By.xpath("//*[contains(@id,'ATp:schedule2')]")); //Amortization Schedule
		clickElement(By.xpath("//*[contains(@id,'AP2:dialog1::ok')]")); //Ok
		clickElement(By.xpath("//*[contains(@id,'AP2:ctb2')]")); //Submit
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:r1:0:ap1:SPb')]")); //Done
		
	}

	@SuppressWarnings("unused")
	private static void selectElement(By xpath) {
		// TODO Auto-generated method stub
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(LeasedAssetsITC.class);
			run();
		}
	}

}
