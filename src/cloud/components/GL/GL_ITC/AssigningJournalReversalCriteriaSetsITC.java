package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;

public class AssigningJournalReversalCriteriaSetsITC extends BaseTest {
	public static String Task_name;

	private static void run() throws Exception{

		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s1:it1::content']"), Task_name);

		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:ctb1::icon"));
		clickElement(By.id("pt1:r1:0:r0:1:AP1:t1:0:cl3"));
		clickElement(By.id("pt1:r1:0:r0:2:AP1:t1:2:cl4"));
		clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:inputComboboxListOfValues4::lovIconId"));
		clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:inputComboboxListOfValues4::dropdownPopup::dropDownContent::db']/table/tbody/tr[8]/td"));
		clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:selectBooleanCheckbox21::content"));
		clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:APscl"));
		clickElement(By.id("pt1:r1:0:r0:0:AP1:APb"));	    
		clickElement(By.id("pt1:r1:0:r0:1:AP1:APb"));
	}

	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AssigningJournalReversalCriteriaSetsITC.class);
			run();
		}

	}


}
