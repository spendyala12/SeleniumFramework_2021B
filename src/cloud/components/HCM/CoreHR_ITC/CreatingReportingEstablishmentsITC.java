package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingReportingEstablishmentsITC extends BaseTest{

	public static String Name;
	public static String Location;
	public static String Reporting_Name;
	public static String Manager;
	

	

	private static void run() throws InterruptedException
	
	{
        clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		
	    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures']")); // Workforce Structures
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:4:ll02Pce:ll01Lv:5:ll01Pse:ll01Cl")); //Manage Reporting Establishments
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP1:AT2:_ATp:commandToolbarButton12::icon']")); // Create
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content']"), Name); //name
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:locationCode1Id::content']"), Location); //Location
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next']")); //next
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content']"), Reporting_Name);  //Reporting Name
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content']"), Manager);  //Manager
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:next']")); //next
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:submit']")); //submit
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:okWarningDialog']")); //yes
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:okConfirmationDialog']")); //ok
	    
	    
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingReportingEstablishmentsITC.class);
			run();
		}
	}

}




