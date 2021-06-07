package cloud.components.FA.FA_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class TransferringAssetsITC extends BaseTest{

	public static String AssetNumber;
	public static String CommentsField;
	public static String Units_New;
	public static String Units_Old;
	public static String ExpenseAccount;
	public static String Location;
	public static String EmployeeName;
	

	private static void run(){


		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl9"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:q1:value10::content"), AssetNumber);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:q1::search"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:FindAssetsQueryResultId:_ATp:commandButton1"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:inputText4::content"), CommentsField);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:0:newUnits::content"), Units_Old);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:create::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:newUnits::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:newUnits::content"), Units_New);	    

//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:employeeId::lovIconId"));
//
//		clickElement(By.cssSelector("tr.xe6.p_AFSelected > td.xe7"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:kf1CS::content"));

//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:employeeId::content"), EmployeeName);		
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:kf1CS::content"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:kf1CS::content"), ExpenseAccount);

		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:kf3CS::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:1:kf3CS::content"), Location);

//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:AT2:_ATp:table1:0:newUnits::content"), Units_Old);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP1:commandButton2"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:done"));

		



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TransferringAssetsITC.class);
			run();
		}
	}

}
