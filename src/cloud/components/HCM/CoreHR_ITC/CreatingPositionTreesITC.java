package cloud.components.HCM.CoreHR_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingPositionTreesITC extends BaseTest{
	
	
	public static String Tree_Name;
	public static String Tree_Code;
	public static String Desc;
	public static String Date;
	public static String Tree_Version_Name;
	public static String Tree_Version_Desc;
	public static String Start_Date;
	public static String Search_Name;
	public static String Search_Name2;
	
	private static void run() throws InterruptedException{
		

		clickElement(By.xpath("//*[contains(@id, '_UISmmLink::icon')]"));//navigator		
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_workforce_management_workforce_structures')]"));// work structure	
	    clickElement(By.linkText("Manage Position Trees"));//manage position trees	    		      
	    clickElement(By.xpath("//*[contains(@id, 'AP1:ATT2:_ATTp:commandToolbarButton1::popEl')]"));
	    clickElement(By.xpath("//*[contains(@id, 'AP1:ATT2:_ATTp:commandToolbarButton1::icon')]"));//create tree 	
	    
	    clickElement(By.xpath("//*[contains(@id, 'DefName_Create::content')]"));//name
	    setElementText(By.xpath("//*[contains(@id, 'DefName_Create::content')]"), Tree_Name);	 
	    clickElement(By.xpath("//*[contains(@id, 'AP1:DefCode_Create::content')]"));//code
	    setElementText(By.xpath("//*[contains(@id, 'AP1:DefCode_Create::content')]"), Tree_Code);
	    String SearchTree_Code = browser.findElement(By.xpath("//*[contains(@id, 'AP1:DefCode_Create::content')]")).getAttribute("value");
	    System.out.println(SearchTree_Code);
	    clickElement(By.xpath("//*[contains(@id, 'AP1:DefDesc_Create::content')]"));	//description    
	    setElementText(By.xpath("//*[contains(@id, 'AP1:DefDesc_Create::content')]"), Desc);
	    clickElement(By.xpath("//*[contains(@id, 'AP1:tbb1:1:cni2')]"));//next	
	    clickElement(By.xpath("//*[contains(@id, 'AP1:tbb1:1:cni2')]"));// next
	    clickElement(By.xpath("//*[contains(@id, '0:MAnt2:4:pt1:AP1:APsb')]"));//submit
	    
	    setElementText(By.xpath("//*[contains(@id, 'AP1:q2:value00::content')]"), SearchTree_Code);// Search Tree code
	    clickElement(By.xpath("//*[contains(@id, 'AP1:q2::search')]")); // Search
	    Thread.sleep(2000);
	    clickElement(By.xpath("//*[contains(@id, 'AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db')]"));//Select row
	    clickElement(By.xpath("//*[contains(@id, 'AP1:ATT2:_ATTp:commandToolbarButton1::popEl')]"));//drop down
	    
	    clickElement(By.xpath("//tr[contains(@id,'AP1:ATT2:_ATTp:cmp2')]//td[@class='xnw'][contains(text(),'Create Tree Version')]"));//create tree version
	    clickElement(By.xpath("//*[contains(@id, 'AP1:TVName::content')]"));
	    setElementText(By.xpath("//*[contains(@id, 'AP1:TVName::content')]"),Tree_Version_Name);//version name	 
	    clickElement(By.xpath("//*[contains(@id, 'AP1:TVDesc::content')]"));	    
	    setElementText(By.xpath("//*[contains(@id, 'AP1:TVDesc::content')]"),Tree_Version_Desc );//version desc
	    clickElement(By.xpath("//*[contains(@id, 'AP1:inputStartDate::content')]"));	    
	    setElementText(By.xpath("//*[contains(@id, 'AP1:inputStartDate::content')]"), Start_Date);//date
	    clickElement(By.xpath("//*[contains(@id, 'AP1:tbb1:1:cni2')]"));	//next    
	    clickElement(By.xpath("//button[contains(@id,'msgDlg::cancel']"));//ok	    
	    
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:hierCol:addBtn::icon')]"));//add	    
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:addView:cb1')] "));//search
	    clickElement(By.xpath("//*[contains(@id, 'qryId1:value00::content')]"));//name
	    setElementText(By.xpath("//*[contains(@id, 'qryId1:value00::content')]"),Search_Name );//name
	  
	    clickElement(By.xpath("//*[contains(@id, 'addView:r1:0:qryId1::search')] "));//Search
	    clickElement(By.xpath("//*[contains(@id,'AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db\')]/table/tbody/tr/td[1]"));//select row header
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:addView:r1:0:AT1:_ATp:cb1')] "));//add tree node
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:hierCol:tt1::db')]")); //select row header
	    clickElement(By.xpath("//*[contains(@id, 'addBtn::icon')]"));//Add button
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:addView:cb1')]"));//Search
	    clickElement(By.xpath("//*[contains(@id, 'addView:r1:0:qryId1:value00::content')]"));//name
	    setElementText(By.xpath("//*[contains(@id, 'addView:r1:0:qryId1:value00::content')]"),Search_Name2);//name
	    clickElement(By.xpath("//*[contains(@id, 'addView:r1:0:qryId1::search')]"));
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db\')]/table/tbody/tr/td[1]"));//select row header
	    clickElement(By.xpath("//*[contains(@id, 'AP1:AH1:addView:r1:0:AT1:_ATp:cb1')]"));//add tree node
	    clickElement(By.xpath("//*[contains(@id, 'AP1:APsb2')]"));//Submit
	   // clickElement(By.xpath("//*[contains(@id, '_FOd1::msgDlg::cancel')]"));//ok
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPositionTreesITC.class);
			run();
		}
	}

}
