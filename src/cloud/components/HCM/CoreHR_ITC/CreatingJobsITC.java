package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

@SuppressWarnings("unused")
public class CreatingJobsITC extends BaseTest{
	
	public static String JobName;
	public static String JobCode;
	public static String JobGrade;
	public static String ProfileName;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(2000);
		clickElement(By.id("pt1:_UISmmLink::icon"));
		Thread.sleep(2000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));//work structures link
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:1:ll02Pce:ll01Lv:0:ll01Pse:ll01Cl"));//WorkforceStructure
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP1:AT1:_ATp:createBtn"));//Create Button
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:basicDetailsPnl:name::content"), JobName); // JobName
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:basicDetailsPnl:jobCode::content"), JobCode);//Code
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:basicDetailsPnl:tt1:next")); //Next
		Thread.sleep(5000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:fullPartTime::content"));
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:fullPartTime::pop\']/li[3]"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:regularTemporary::content"));
		clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:regularTemporary::pop\']/li[3]"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:vgApplTbl:_ATp:vgAdd")); //Add row
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:vgApplTbl:_ATp:t1:0:nameFld::content"), JobGrade);
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:jobDetailsPnl:tt1:next")); //Next
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:evalCriteriaPnl:tt1:next")); //Next
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:a_btn")); //Add existing Profile
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::lovIconId"));//Dropdown
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::dropdownPopup::popupsearch")); //Pop Search
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::_afrLovInternalQueryId:value10::content"), ProfileName);	
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::_afrLovInternalQueryId::search"));// Search
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id_afrLovInternalTableId::db")); //Select row
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::lovDialogId::ok"));//ok
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:tt1:submit"));//submit
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:tt1:okWarningDialog"));//yes
		Thread.sleep(2000);		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:jobProfPnl:tt1:okConfirmationDialog"));//Ok
			
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingJobsITC.class);
			run();
		}
	}

}
