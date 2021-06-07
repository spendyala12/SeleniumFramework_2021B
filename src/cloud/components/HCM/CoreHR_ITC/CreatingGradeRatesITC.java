package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingGradeRatesITC extends BaseTest{
	
	public static String Legislative_Data_Group ;
	public static String Name;
	public static String Grade;
	public static String Minimum;
	public static String Maximum;
	
	
	private static void run() throws InterruptedException{
		
			
		Thread.sleep(2000);
		 	clickElement(By.id("pt1:_UISmmLink::icon"));
		 	Thread.sleep(2000);
		    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:3:ll02Pce:ll01Lv:0:ll01Pse:ll01Rly")); //Manage Grade Rates
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP4:AT5:_ATp:commandToolbarButton1::icon")); // Create button
		    Thread.sleep(2000);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP4:AT5:legislativeDataGroupNameId::content"), Legislative_Data_Group);
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP4:AT5:commandButton2"));// OK
		    Thread.sleep(2000);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP2:inputText2::content"), Name); //Name
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP2:createGrdRateValuesApplTable:_ATp:addRateValueinCreate::icon")); // Add row
		    Thread.sleep(2000);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP2:createGrdRateValuesApplTable:_ATp:t1:0:nameId::content"), Grade);// Grade
		    Thread.sleep(2000);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP2:createGrdRateValuesApplTable:_ATp:t1:0:it2::content"), Minimum);// Min
		    Thread.sleep(2000);
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP2:createGrdRateValuesApplTable:_ATp:t1:0:it3::content"), Maximum);//Max
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP2:tt1:review"));//Review
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP1:tt1:submit"));// Submit
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP1:tt1:okWarningDialog"));//Yes
		    Thread.sleep(2000);
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP1:scOk"));// Ok
		    
		    
		    
		    		    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradeRatesITC.class);
			run();
		}
	}

}
