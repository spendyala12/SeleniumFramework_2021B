package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class DefiningAnAllocationRuleSetITC extends BaseTest{
	

	public static String RuleSetName;
	public static String RuleID;
	public static String RTPText;

	private static void run() throws InterruptedException{


		//		clickElement(By.id("pt1:_UISmmLink::icon"));
		//		clickElement(By.id("pt1:nv_itemNode_general_accounting_journals"));

		Thread.sleep(5000);


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl10"));

		Thread.sleep(10000);
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=Oracle_Enterprise_Performance_Management_System_Workspace__Fusion_Edition_adc_fap0846_fa_ext_oracledemos_com_0 | ]]

		//browser.get("https://adc-fap0846-fa-ext.oracledemos.com/workspace/WorkspaceLaunch.jsp");
		System.out.println("====="+browser.getTitle());
		System.out.println(browser.getWindowHandle());
		Iterable<String> no = browser.getWindowHandles();
		for (String s : no) {
			browser.switchTo().window(s);
			System.out.println(browser.getTitle());
			if (browser.getTitle().equalsIgnoreCase("Oracle Enterprise Performance Management System Workspace, Fusion Edition")){
				browser.switchTo().frame(browser.findElement(By.xpath("//frame[starts-with(@src,\"cache/BeGIli-O1bWcNr\")]")));
				clickElement(By.className("bi-tree-view-expand-icon"));
				
				Thread.sleep(10000);
				clickElement(By.xpath("//nobr[starts-with(text(),\"AK_STRUCTURE_INSTANC\")]/img[@title=\"Expand\"]"));
				
				Thread.sleep(5000);
				
				clickElement(By.id("bpm.mnbt_File"));
				
				clickElement(By.xpath("//td[text()=\"ew\"]"));
				
				Thread.sleep(3000);
				
				clickElement(By.xpath("//td[text()=\"Ru\"]"));
				
				Thread.sleep(3000);
				
				setElementText(By.xpath("//input[@class='bi-text-field text-field']"),RuleSetName);
				//*[@class='bi-text-field text-field' and contains(text(),'qwerty')]
				//setElementText(By.id("BiTextField-528"),RuleSetName);
				
				Thread.sleep(3000);
				
				clickElement(By.xpath("//div[contains(@class,'bi-label combo-box-label')]"));
				
				//clickElement(By.id("BiComponent-532"));bi-label combo-box-label
				
				Thread.sleep(3000);
				
				clickElement(By.xpath("//div[contains(@class,'bi-list-item list-item list-item-selected list-item-lead')]"));
				
				//clickElement(By.id("BiComboBoxItem-534"));
				
				Thread.sleep(3000);
				
				clickElement(By.xpath("//div[contains(@class,'bi-label combo-box-label')]"));
				
				//clickElement(By.id("BiLabel-539"));
				
				Thread.sleep(3000);
				
				clickElement(By.xpath("//div[contains(@class,'bi-list-item list-item list-item-selected list-item-lead')]"));
				
				Thread.sleep(3000);
				
				clickElement(By.xpath("//input[@class='bi-button buttonPrimary buttonPrimary-hover']"));
				
				Thread.sleep(5000);
				
//				clickElement(By.id("com.hyperion.bpm.web.common.DialogButton-520"));
//				
//				Thread.sleep(3000);
				
				clickElement(By.xpath("//img[@alt=\"Save\"]"));
				
				//clickElement(By.id("com.hyperion.bpm.web.common.DialogButton-943"));
				
					
				
			}
				
		};
	
	}

	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(DefiningAnAllocationRuleSetITC.class);
			run();
		}
	}

}
