package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class DefiningAVariableToUseAsARuntimePromptITC extends BaseTest{

	public static String RuleName;
	public static String RuleID;
	public static String RTPText;

	private static void run() throws InterruptedException{


		//		clickElement(By.id("pt1:_UISmmLink::icon"));
		//		clickElement(By.id("pt1:nv_itemNode_general_accounting_journals"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::ti"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl10"));
		Thread.sleep(2000);


//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl10"));
//
//		Thread.sleep(2000);
		
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=Oracle_Enterprise_Performance_Management_System_Workspace__Fusion_Edition_adc_fap0846_fa_ext_oracledemos_com_0 | ]]

		//browser.get("https://adc-fap0846-fa-ext.oracledemos.com/workspace/WorkspaceLaunch.jsp");
		
		System.out.println("====="+browser.getTitle());
		System.out.println(browser.getWindowHandle());
		Iterable<String> no = browser.getWindowHandles();
		for (String s : no) {
			browser.switchTo().window(s);
			System.out.println(browser.getTitle());
			if (browser.getTitle().equalsIgnoreCase("Oracle Enterprise Performance Management System Workspace, Fusion Edition")){
				//browser.switchTo().frame(browser.findElement(By.xpath("//frame[starts-with(@src,\"cache/BeGIli-O1bWcNr\")]")));

				clickElement(By.id("bpm.mnbt_Tools"));
				
				//clickElement(By.xpath("//div[@id='bpm.mnbt_Tools']"));

				clickElement(By.xpath("//td[text()=\"Varia\"]"));
				
				Thread.sleep(5000);

				clickElement(By.xpath("//img[starts-with(@class,\"bi-tree-view-expand-\")]"));
				
				Thread.sleep(10000);

				clickElement(By.xpath("//nobr[starts-with(text(),\"AK_STRUCTURE_INSTANCE\")]/img[@title=\"Expand\"]"));

				//new Actions(browser).contextClick(browser.findElement(By.xpath("//nobr[text()=\"db\"]"))).perform();
				
				clickElement(By.xpath("//nobr[text()=\"db\"]"));
				
				Thread.sleep(5000);
				
				clickElement(By.id("bpm.mnbt_File"));

				clickElement(By.xpath("//td[text()=\"ew\"]"));
				
				clickElement(By.xpath("//td[text()=\"ariable\"]"));
				
				Thread.sleep(5000);

				setElementText(By.id("BiTextField-539"),RuleName);

				clickElement(By.id("BiLabel-550"));
				
				Thread.sleep(2000);

				clickElement(By.id("BiComboBoxItem-725"));

				clickElement(By.id("BiLabel-779"));
				
				Thread.sleep(2000);

				clickElement(By.id("BiComboBoxItem-845"));

				clickElement(By.xpath("(//tbody[starts-with(@class,\"bi-show-grid-lines f\")]/tr/td)[3]"));
				
				Thread.sleep(2000);

				setElementText(By.id("BiTextField-864"),RuleID);

				clickElement(By.xpath("(//tbody[starts-with(@class,\"bi-show-grid-lines f\")]/tr/td)[5]"));
				
				Thread.sleep(2000);

				setElementText(By.id("BiTextField-868"),RTPText);
				
				Thread.sleep(2000);

				clickElement(By.xpath("//img[@alt=\"Save\"]"));

				clickElement(By.id("com.hyperion.bpm.web.common.DialogButton-875"));
			}
				
		};
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(DefiningAVariableToUseAsARuntimePromptITC.class);
			run();
		}
	}

}
