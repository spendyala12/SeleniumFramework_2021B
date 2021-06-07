package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingLocationsITC extends BaseTest{
	
	public static String LocationName;
	public static String LocationCode;
	public static String Country;
	public static String Address1;
	public static String City;
	public static String State;
	public static String PostalCode;
	
	private static void run(){
		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("_FOpt1:_UISmmLink")); // Navigator
		clickElement(By.id("_FOpt1:nv_itemNode_workforce_management_workforce_structures"));// Workforce Mgt link
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:5:ll02Pce:ll01Lv:0:ll01Pse:ll01Cl")); // Manage Locations
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:locSearchPanel:resultsAppsTable:_ATp:ctb1")); //Create icon
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText562::content"), LocationName); // Location Name
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:it1::content"), LocationCode); // Location Code
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:countrylov::lovIconId")); //Country dropdown
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:countrylov::dropdownPopup::popupsearch"));// Pop search
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:countrylov::_afrLovInternalQueryId:value00::content"), Country);//Country
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:countrylov::_afrLovInternalQueryId::search"));// Search
		clickElement(By.xpath("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:countrylov_afrLovInternalTableId::db']/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:countrylov::lovDialogId::ok"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:i1:0:inputText17::content"), Address1);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:i1:2:inputComboboxListOfValues27::content"), City);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:i1:3:inputComboboxListOfValues25::content"), State);				  
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:r3:0:i1:4:inputComboboxListOfValues28::content"), PostalCode);					  
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:submit")); // Submit
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:okWarningDialog")); //Yes
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:okConfirmationDialog")); //OK
							}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingLocationsITC.class);
			run();
		}
	}

}
