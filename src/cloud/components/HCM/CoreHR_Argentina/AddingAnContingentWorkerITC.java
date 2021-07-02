package cloud.components.HCM.CoreHR_Argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class AddingAnContingentWorkerITC extends BaseTest{


	public static String LegalEmployer;
	public static String LastName;
	public static String FirstName;
	public static String Address1;
	public static String Address2;
	public static String Province;
	public static String City;
	public static String PostalCode;
	public static String BusinessUnit;
	public static String TimeCardReq;
	public static String Manager;
	public static String SalaryBasis;
	public static String SalaryAmt;
	public static String AssignmentCategory;
	public static String RegularOrTemp;
	public static String FullTimeOrPartTime;
	public static String Payroll;
	//
	public static String PlacementReason;
	public static String Title;
	public static String MiddleName;
	public static String Gender;
	public static String SubcontractAgreement;
	public static String TemporaryEmploymentAgreement;
	public static String W9;
	public static String OriginalDateOfHire;
	public static String PreferredName;
	public static String EmployeeLegalStatus;
	public static String Address3;
	public static String Address4;
	public static String MaritalStatus;
	public static String HighestEducationLevel;
	public static String VeteranSelfIdentificationStatus;
	public static String I9Status;
	public static String EVerifyStatus;
	public static String I9Expiration;
	public static String NewHireStatus;
	public static String ExceptionReason;
	public static String MedicalInsuranceavailable;
	public static String Position;
	public static String Job;
	public static String Grade;
	public static String Department;
	public static String ReportingEstablishment;
	public static String Location;
	public static String WorkingAtHome;
	public static String WorkingAsManager;
	public static String HourlyPaisOrSalaried;
	public static String WorkingHours;
	public static String Frequency;
	public static String StatementOfWorkSigned;
	public static String GroupDescription;
	public static String JobDescription;
	public static String PeopleGroup;
	

	
	

	private static void run() throws Exception  {

		
		clickElement(By.xpath("//span[contains(text(),'New Person')]")); //New Person
		clickElement(By.linkText("Add a Contingent Worker")); //Contingent Worker
		setElementText(By.xpath("//*[contains(@id, 'SP1:selectOneChoice3::content')]"), LegalEmployer); //LegalEmployer
		browser.findElement(By.xpath("//*[contains(@id, 'SP1:selectOneChoice3::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'it20::content')]"), LastName);
		setElementText(By.xpath("//*[contains(@id, 'it60::content')]"), FirstName);
		//setElementText(By.xpath("//*[contains(@id, 'selectOneChoice4::content')]"), Title);
		//setElementText(By.xpath("//*[contains(@id, 'it24::content')]"), MiddleName);
		//setElementText(By.xpath("//*[contains(@id, 'SP1:NewPe1:0:pt_r1:0:soc3::content')]"), Gender);
		//setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratorsubcontractorAgreement_Display__FLEX_EMPTY::content')]"), SubcontractAgreement);
		//setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratortemporaryEmploymentAgreement_Display__FLEX_EMPTY::content')]"), TemporaryEmploymentAgreement);
		//setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratorw9_Display__FLEX_EMPTY::content')]"), W9);
		//setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratororiginalDateOfHire__FLEX_EMPTY::content')]"), OriginalDateOfHire);
		//setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratorpreferredName__FLEX_EMPTY::content')]"), PreferredName);
		//setElementText(By.xpath("//*[contains(@id, 'PersonDFFIteratoremployeeLegalStatus__FLEX_EMPTY::content')]"), EmployeeLegalStatus);
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		setElementText(By.xpath("//*[contains(@id, 'inputText17::content')]"), Address1); //Company ABC S.L
		setElementText(By.xpath("//*[contains(@id, 'inputText18::content')]"), Address2); //Av. Rivadavia 2403
		setElementText(By.xpath("//*[contains(@id, 'inputComboboxListOfValues25::content')]"), Province); //Autonome Stadt Buenos Aires
		browser.findElement(By.xpath("//*[contains(@id, 'inputComboboxListOfValues25::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'inputText21::content')]"), City); //Buenos Aires
		browser.findElement(By.xpath("//*[contains(@id, 'inputText21::content')]")).sendKeys(Keys.TAB);
		setElementText(By.xpath("//*[contains(@id, 'inputText27::content')]"), PostalCode); //76621
		//clickElement(By.xpath("//*[contains(@id, 'soc2::drop')]")); //MaritalStatus
		//clickElement(By.xpath("//li[contains(text(),'"+MaritalStatus+"')]"));
		//clickElement(By.xpath("//*[contains(@id, 'hoc2::drop')]")); //HighestEducationLevel
		//clickElement(By.xpath("//span[contains(text(),'"+HighestEducationLevel+"')]"));
		clickElement(By.xpath("//*[contains(@id, 'SP1:tt1:next')]")); //Next
		Thread.sleep(1000);
		//setElementText(By.xpath("//*[contains(@id, 'I9_STATUS_DisplayUS::content')]"), I9Status);
		//setElementText(By.xpath("//*[contains(@id, 'E_VERIFY_STATUS_DisplayUS::content')]"), EVerifyStatus);
		//setElementText(By.xpath("//*[contains(@id, 'I9_EXPIRATIONUS::content')]"), I9Expiration);
		//setElementText(By.xpath("//*[contains(@id, 'NEW_HIRE_STATUS_DisplayUS::content')]"), NewHireStatus);
		//setElementText(By.xpath("//*[contains(@id, 'NEW_HIRE_EXCEPTION_REASON_DisplayUS::content')]"), ExceptionReason);
		//setElementText(By.xpath("//*[contains(@id, 'WorkRelationshipLegDDFIteratormedicalInsuranceAvailable_DisplayUS::content')]"), MedicalInsuranceavailable);
		setElementText(By.xpath("//*[contains(@id, 'businessUnitId::content')]"), BusinessUnit); //BusinessUnit -IT Convergence USA
		browser.findElement(By.xpath("//*[contains(@id, 'businessUnitId::content')]")).sendKeys(Keys.TAB);
		//setElementText(By.xpath("//*[contains(@id, 'positionId::content')]"), Position);
		//setElementText(By.xpath("//*[contains(@id, 'JobDe1:0:jobId::content')]"), Job);
		//setElementText(By.xpath("//*[contains(@id, 'gradeId::content')]"), Grade);
		//setElementText(By.xpath("//*[contains(@id, 'departmentId::content')]"), Department);
		//setElementText(By.xpath("//*[contains(@id, 'selectOneChoice7::content')]"), ReportingEstablishment);
		//setElementText(By.xpath("//*[contains(@id, 'locationId::content')]"), Location);
		//setElementText(By.xpath("//*[contains(@id, 'selectOneRadio1::content')]"), WorkingAtHome);
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:selectOneChoice3::drop')]")); //Click Assignment Category drop down
		clickElement(By.xpath("//li[contains(text(),'"+AssignmentCategory+"')]"));
		//clickElement(By.xpath("//li[contains(text(),'Part-time regular')]"));
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:soc2::drop')]")); //Click Regular or temp drop down
		//clickElement(By.xpath("//li[contains(text(),'"+RegularOrTemp+"')]"));
		clickElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]/li[4]"));
		clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:soc1::drop')]")); //Click full time or part time drop down
		clickElement(By.xpath("//li[contains(text(),'"+FullTimeOrPartTime+"')]"));
		//clickElement(By.xpath("//*[contains(@id, 'selectOneRadio2::drop')]")); // Work as manager Drop down
		//clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:selectOneChoice2::drop')]")); //Hourly Paid or Salaried
		//setElementText(By.xpath("//*[contains(@id, 'JobDe1:0:inputText1::content')]"), WorkingHours);
		//clickElement(By.xpath("//*[contains(@id, 'JobDe1:0:selectOneChoice6::drop')]")); // frequency
		//setElementText(By.xpath("//*[contains(@id, 'BaseWorkerAsgDFFIteratorsow_Display__FLEX_EMPTY::content')]"), StatementOfWorkSigned);
		//setElementText(By.xpath("//*[contains(@id, 'BaseWorkerAsgDFFIteratorgroupdesc__FLEX_EMPTY::content')]"), GroupDescription);
		//setElementText(By.xpath("//*[contains(@id, 'BaseWorkerAsgDFFIteratorjobdesc__FLEX_EMPTY::content')]"), JobDescription);
		//setElementText(By.xpath("//*[contains(@id, 'kf2CS::content')]"), PeopleGroup);
		setElementText(By.xpath("//*[contains(@id, 'JobDe1:0:df2_BaseWorkerAsgDFFIteratortimecardRequired_Display__FLEX_EMPTY::content')]"), TimeCardReq); //TimeCardReq
		setElementText(By.xpath("//*[contains(@id, 'ManagerNameId::content')]"), Manager); //Manager-Gustavo, Gutierrez
		browser.findElement(By.xpath("//*[contains(@id, 'ManagerNameId::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'AT1:_ATp:cil113::icon')]")); //click + Under Payroll details
		clickElement(By.xpath("//*[contains(@id, 'selectOneChoice1::lovIconId')]")); //Payroll drop down
		clickElement(By.xpath("//span[contains(text(),'"+Payroll+"')]"));
		clickElement(By.xpath("//*[contains(@id, 'tt1:next')]")); //Next
		clickElement(By.xpath("//button[@id='_FOd1::msgDlg::cancel']")); //Ok
		clickElement(By.xpath("//*[contains(@id, 'tt1:next')]")); //Next
		setElementText(By.xpath("//*[contains(@id, 'icAsgLov::content')]"), SalaryBasis); //SalaryBasis-USA Weekly Basis
		setElementText(By.xpath("//*[contains(@id, 'itSA::content')]"), SalaryAmt); //SalaryAmt-10000
		browser.findElement(By.xpath("//*[contains(@id, 'itSA::content')]")).sendKeys(Keys.TAB);
		clickElement(By.xpath("//*[contains(@id, 'pt1:AddCw1:3:AP2:tt1:next')]")); //Next
		clickElement(By.xpath("//span[contains(text(),'Save')]")); //Save
		clickElement(By.xpath("//*[contains(@id, 'okConfirmationDialog')]")); //Confirmation Ok
		clickElement(By.xpath("//*[contains(@id, 'submit')]")); //Submit
		clickElement(By.xpath("//*[contains(@id, 'okWarningDialog')]")); //Confirmation Yes
		clickElement(By.xpath("//*[contains(@id, 'okConfirmationDialog')]")); //Confirmation Ok
	
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingAnContingentWorkerITC.class);
			run();
		}
	}

}
