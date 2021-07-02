

package cloud.components.HCM.CoreHR_India;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class HireAnEmployeeITC extends BaseTest{


	public static String HireDate;
	public static String LegalEmployer;
	public static String LastName;
	public static String FirstName;
	public static String MiddleName1;
	public static String PreferredName1;
	public static String DateofBirth;
	public static String SubcontractorAgreement;
	public static String TemporaryEmploymentAgreement;
	public static String W9;
	public static String OriginalDateofHire;
	public static String MiddleName2;
	public static String PreferredName2;
	public static String EmployeeLegalStatus;
	public static String Address1;
	public static String Address2;
	public static String City;
	public static String PinCode;
	public static String State;
	public static String SeniorityDate;
	public static String AssignmentNumber;
	public static String BusinessUnit;
	public static String ProjectedEndDate;
	public static String Position;
	public static String Job;
	public static String Grade;
	public static String Department;
	public static String ReportingEstablishment;
	public static String Location;
	public static String WorkerCategory;
	public static String WorkingHours;
	
	public static String TimeCardReq;
	public static String PeopleGroup;
	public static String Manager;
	public static String SalaryBasis;
	public static String SalaryAmt;
	

	private static void run() throws Exception  {

		
		clickElement(By.xpath("//span[contains(text(),'New Person')]")); //New Person
		clickElement(By.linkText("Hire an Employee")); //Hire an Employee
		setElementText(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:inputDate1::content')]"), HireDate);
//		clickElement(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:selectOneChoice1::content')]"));
//		clickElement(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:selectOneChoice1::sp')]"));
		
//		clickElement(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:selectOneChoice2::drop')]"));
//		clickElement(By.xpath("//li[contains(text(),'Hire to fill vacant position')]"));//("Hire to fill vacant position"));
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id, 'SP1:selectOneChoice3::content')]"), LegalEmployer); //LegalEmployer
		browser.findElement(By.xpath("//*[contains(@id, 'SP1:selectOneChoice3::content')]")).sendKeys(Keys.TAB);
	//	clickElement(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:NewPe1:0:pt_r1:0:r1:0:i1:2:selectOneChoice4::drop')]"));//Title dropdown
		clickElement(By.xpath("//*[contains(@id, 'NewPe1:0:pt_r1:0:r1:0:i1:4:selectOneChoice4::drop')]"));
		clickElement(By.xpath("//li[contains(text(),'Mr.')]"));
		
		setElementText(By.xpath("//*[contains(@id, 'it20::content')]"), LastName);
		setElementText(By.xpath("//*[contains(@id, 'it60::content')]"), FirstName);
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:pt1:pt_r1:0:SP1:NewPe1:0:pt_r1:0:r1:0:i1:7:it24::content')]"), MiddleName1);
		setElementText(By.xpath("//*[contains(@id, 'MAnt2:1:pt1:pt_r1:0:SP1:NewPe1:0:pt_r1:0:r1:0:i1:8:it21::content')]"), PreferredName1);
	//	new Select(browser.findElement(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:NewPe1:0:pt_r1:0:soc3::content')]"))).selectByVisibleText("Female");
		setElementText(By.xpath("//*[contains(@id, '_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:pt_r1:0:SP1:NewPe1:0:pt_r1:0:id3::content')]"), DateofBirth);
		setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratorsubcontractorAgreement_Display__FLEX_EMPTY::content')]"), SubcontractorAgreement);
		setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratortemporaryEmploymentAgreement_Display__FLEX_EMPTY::content')]"), TemporaryEmploymentAgreement);
		setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratorw9_Display__FLEX_EMPTY::content')]"), W9);
		setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratororiginalDateOfHire__FLEX_EMPTY::content')]"), OriginalDateofHire);
		setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratormiddleName__FLEX_EMPTY::content')]"), MiddleName2);
		setElementText(By.xpath("//*[contains(@id, '_PersonDFFIteratorpreferredName__FLEX_EMPTY::content')]"), PreferredName2);
		setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratoremployeeLegalStatus__FLEX_EMPTY::content')]"), EmployeeLegalStatus);
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		setElementText(By.xpath("//*[contains(@id, 'inputText17::content')]"), Address1); //741 Park Evenue
		setElementText(By.xpath("//*[contains(@id, 'inputText18::content')]"), Address2); //Dallas
		setElementText(By.xpath("//*[contains(@id, 'inputComboboxListOfValues26::content')]"), City); 
		setElementText(By.xpath("//*[contains(@id, 'inputText27::content')]"), PinCode);
		setElementText(By.xpath("//*[contains(@id, 'inputComboboxListOfValues25::content')]"), State); //Dallas
		//setElementText(By.xpath("//*[contains(@id, 'inputComboboxListOfValues28::content')]"), PostalCode); //76621
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		
		setElementText(By.xpath("//*[contains(@id, 'sP2:Servi1:0:id3::content')]"), SeniorityDate);
		setElementText(By.xpath("//*[contains(@id, 'NewPe3:0:NewPe1:0:inputText1::content')]"), AssignmentNumber);
		browser.findElement(By.xpath("//*[contains(@id, 'NewPe3:0:NewPe1:0:inputText1::content')]")).sendKeys(Keys.TAB);  
		
		setElementText(By.xpath("//*[contains(@id, 'businessUnitId::content')]"), BusinessUnit); //BusinessUnit -IT Convergence USA
		browser.findElement(By.xpath("//*[contains(@id, 'businessUnitId::content')]")).sendKeys(Keys.TAB);
		
		//new Select(browser.findElement(By.xpath("//*[contains(@id, 'P2:NewPe3:0:NewPe1:0:selectOneChoice1::content')]"))).selectByVisibleText("Employee"); //person type   
		browser.findElement(By.xpath("//*[contains(@id, 'P2:NewPe3:0:NewPe1:0:selectOneChoice1::content')]")).sendKeys(Keys.TAB);
		//new Select(browser.findElement(By.xpath("//*[contains(@id, 'pt_r1:2:sP2:NewPe3:0:NewPe1:0:selectOneChoice2::content')]"))).selectByVisibleText("Active - Payroll Eligible");
		browser.findElement(By.xpath("//*[contains(@id, 'pt_r1:2:sP2:NewPe3:0:NewPe1:0:selectOneChoice2::content')]")).sendKeys(Keys.TAB);
		
		setElementText(By.xpath("//*[contains(@id, 'sP2:NewPe3:0:NewPe1:0:id1::content')]"), ProjectedEndDate);
		setElementText(By.xpath("//*[contains(@id, 'NewPe3:0:JobDe1:0:positionId::content')]"), Position);
		setElementText(By.xpath("//*[contains(@id, 'pt1:pt_r1:2:sP2:NewPe3:0:JobDe1:0:jobId::content')]"), Job);
		setElementText(By.xpath("//*[contains(@id, 'pt1:pt_r1:2:sP2:NewPe3:0:JobDe1:0:gradeId::content')]"), Grade);
		setElementText(By.xpath("//*[contains(@id, 'pt1:pt_r1:2:sP2:NewPe3:0:JobDe1:0:departmentId::content')]"), Department);
//		setElementText(By.xpath("//*[contains(@id, 'pt1:pt_r1:2:sP2:NewPe3:0:JobDe1:0:selectOneChoice7::content')]"), ReportingEstablishment);
		setElementText(By.xpath("//*[contains(@id, 'pt_r1:2:sP2:NewPe3:0:JobDe1:0:locationId::content')]"), Location);
	//	new Select(browser.findElement(By.xpath("//*[contains(@id, 'sP2:NewPe3:0:JobDe1:0:selectOneRadio1::content')]"))).selectByVisibleText("No");
		browser.findElement(By.xpath("//*[contains(@id, 'sP2:NewPe3:0:JobDe1:0:selectOneRadio1::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'JobDe1:0:selectOneChoice1::content')]"), WorkerCategory);
		browser.findElement(By.xpath("//*[contains(@id, 'JobDe1:0:selectOneChoice1::content')]")).sendKeys(Keys.TAB);
		
//		setElementText(By.xpath("//*[contains(@id, 'pt_r1:0:sP2:NewPe3:0:JobDe1:0:selectOneChoice3::content')]"), AssignmentCategory);
//		setElementText(By.xpath("//*[contains(@id, ':pt1:pt_r1:0:sP2:NewPe3:0:JobDe1:0:soc2::content')]"), RegularorTemporary);
//		setElementText(By.xpath("//*[contains(@id, 'r1:0:sP2:NewPe3:0:JobDe1:0:soc1::content')]"), FullTimeorPartTime);
//		new Select(browser.findElement(By.xpath("//*[contains(@id, 'sP2:NewPe3:0:JobDe1:0:selectOneRadio2::content')]"))).selectByVisibleText("No");
//		setElementText(By.xpath(""), );
//		setElementText(By.xpath(""), );
		
		clickElement(By.xpath("//*[contains(@id, 'selectOneChoice3::drop')]")); //Click Assignment Category drop down
		clickElement(By.xpath("//li[contains(text(),'Full-time regular')]"));
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:soc2::drop')]")); //Click Regular or temp drop down
		clickElement(By.xpath("//li[contains(text(),'Regular')]"));
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:soc1::drop')]")); //Click Regular or temp drop down
		clickElement(By.xpath("//li[contains(text(),'Full time')]"));
		
		//new Select(browser.findElement(By.xpath("//*[contains(@id, '0:sP2:NewPe3:0:JobDe1:0:selectOneRadio2::content')]"))).selectByVisibleText("No");
		browser.findElement(By.xpath("//*[contains(@id, '0:sP2:NewPe3:0:JobDe1:0:selectOneRadio2::content')]")).sendKeys(Keys.TAB);
		
		browser.findElement(By.xpath("//*[contains(@id, 'NewPe3:0:JobDe1:0:selectOneChoice2::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'NewPe3:0:JobDe1:0:inputText1::content')]"), WorkingHours);
		
		
		
		
		
		
		
		setElementText(By.xpath("//*[contains(@id, 'JobDe1:0:df2_BaseWorkerAsgDFFIteratortimecardRequired_Display__FLEX_EMPTY::content')]"), TimeCardReq); //TimeCardReq
		setElementText(By.xpath("//*[contains(@id, 'kf2CS::content')]"), PeopleGroup); //TimeCardReq-15 Days Vacation
		setElementText(By.xpath("//*[contains(@id, 'ManagerNameId::content')]"), Manager); //Manager-Gustavo, Gutierrez
		browser.findElement(By.xpath("//*[contains(@id, 'ManagerNameId::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'AT1:_ATp:cil113::icon')]")); //click + Under Payroll details
		clickElement(By.xpath("//*[contains(@id, 'selectOneChoice1::lovIconId')]")); //Payroll drop down
		clickElement(By.xpath("//span[contains(text(),'India Payroll 12x')]"));
		clickElement(By.xpath("//*[contains(@id, 'sP2:tt1:next')]")); //Next
		setElementText(By.xpath("//*[contains(@id, 'icAsgLov::content')]"), SalaryBasis); //SalaryBasis-USA Weekly Basis
		setElementText(By.xpath("//*[contains(@id, 'itSA::content')]"), SalaryAmt); //SalaryAmt-10000
		browser.findElement(By.xpath("//*[contains(@id, 'itSA::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		clickElement(By.xpath("//span[contains(text(),'Save')]")); //Save
		clickElement(By.xpath("//*[contains(@id, 'AP1:tt1:okConfirmationDialog')]")); //Confirmation Ok
		clickElement(By.xpath("//*[contains(@id, 'AP1:tt1:submit')]")); //Submit
		clickElement(By.xpath("//*[contains(@id, 'AP1:tt1:okWarningDialog')]")); //Confirmation Yes
		clickElement(By.xpath("//*[contains(@id, 'AP1:tt1:okConfirmationDialog')]")); //Confirmation Ok
	
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(HireAnEmployeeITC.class);
			run();
		}
	}

}
