package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class HiringEmployeesITC extends BaseTest{

	public static String LegalEmployer;
	public static String PersonNumber;
	public static String LastName;
	public static String FirstName;
	public static String NationalID;
	public static String Address;
	public static String Pincode;
	public static String AreaCode;
	public static String Number;
	public static String WorkEmail;
	public static String Salary;
	public static String NextSalaryDate;
	
	

	private static void run() throws InterruptedException
	
	{
		//System.out.println("hello");
		//clickElement(By.xpath("//*[contains(@title,'Hire an Employee'"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:_FOTsr1:0:cl01Upl:UPsp1:cl01Pce:cl01Lv:1:cl01Pse:cl01Cl']")); //hireanemployee
		Thread.sleep(9000);
		setElementText(By.xpath("//*[contains(@id,'selectOneChoice3::content')]"), LegalEmployer); //legalEmployer
		Thread.sleep(5000);
	    setElementText(By.xpath("//*[contains(@id,'NewPe1:0:r1:0:it1::content')]"), PersonNumber); //PersonNumber
	    Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'NewPe1:0:pt_r1:0:r1:0:i1:4:it20::content')]"), LastName); //lastname
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'NewPe1:0:pt_r1:0:r1:0:i1:5:it60::content')]"), FirstName); //FiratName
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:0:SP1:NewPe1:0:pt_r2:0:AT2:_ATp:create::icon']")); //Add
		Thread.sleep(5000);
		
		
		clickElement(By.xpath("//*[contains(@id,'NewPe1:0:pt_r2:0:AT2:_ATp:table2:0:soc2::content')]")); //NationalIDType
		Thread.sleep(5000);
		clickElement(By.xpath("//li[contains(text(),'Individual Taxpayer Identification Number')]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'NewPe1:0:pt_r2:0:AT2:_ATp:table2:0:it1::content')]"), NationalID); //NationalID
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:0:SP1:tt1:next']/a")); //Next
		Thread.sleep(5000);
		//PersonIsfo
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'Perso1:0:Maint1:0:i1:0:inputText17::content')]"), Address); //AddressLine1
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'inputComboboxListOfValues28::content')]"), Pincode); //PostalCode
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:1:SP1:Perso2:0:pt_r1:0:AT1:_ATp:create::icon']")); //PhoneADD
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'Perso2:0:pt_r1:0:AT1:_ATp:table1:0:soc1::content')]")); //Type
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:1:SP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:soc1::pop']/li[4]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'Perso2:0:pt_r1:0:AT1:_ATp:table1:0:it2::content')]"), AreaCode); //AreaCode
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'Perso2:0:pt_r1:0:AT1:_ATp:table1:0:it3::content')]"), Number); //Number
		
		//EmailDetails
		
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:1:SP1:Perso2:0:pt_r2:0:AT1:_ATp:create::icon']")); //Add
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'Perso2:0:pt_r2:0:AT1:_ATp:table1:0:soc1::content')]")); //type
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:1:SP1:Perso2:0:pt_r2:0:AT1:_ATp:table1:0:soc1::pop']/li[4]"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'Perso2:0:pt_r2:0:AT1:_ATp:table1:0:it1::content')]"), WorkEmail); //Email
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:1:SP1:tt1:next']/a")); //Next
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:2:sP2:NewPe3:0:NewPe1:0:businessUnitId::lovIconId']")); //BusinessUnit
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:2:sP2:NewPe3:0:NewPe1:0:businessUnitId::dropdownPopup::dropDownContent::db']/table/tbody/tr[8]/td/span"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:2:sP2:tt1:next']/a")); //next
		
		//salary Information
//		Thread.sleep(5000);
//		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:3:SP1:r1:0:r5:0:icAsgLov::lovIconId']")); //salaryBasis
//		Thread.sleep(5000);
//		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:3:SP1:r1:0:r5:0:icAsgLov::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td/span"));
//		Thread.sleep(5000);
//		setElementText(By.xpath("//*[contains(@id,'pt1:pt_r1:3:SP1:r1:0:r5:0:itSA::content')]"), Salary); //salaryAmount
//		Thread.sleep(5000);
//		setElementText(By.xpath("//*[contains(@id,'pt1:pt_r1:3:SP1:r1:0:r5:0:id4::content')]"), NextSalaryDate); //nextsalarydate
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:3:SP1:tt1:next']/a")); //next
		Thread.sleep(9000);
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:submit']/a")); //submit
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:okWarningDialog")); //warning
		Thread.sleep(5000);
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(HiringEmployeesITC.class);
			run();
		}
	}

}
