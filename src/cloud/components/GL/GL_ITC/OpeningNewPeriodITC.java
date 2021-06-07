package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

import org.openqa.selenium.By;

public class OpeningNewPeriodITC extends BaseTest {
	public static String Task;

	private static void run() throws Exception{

		
		clickElement(By.xpath("//span[text()='General Ledger']")); //general ledger
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:pt1:r1:1:ap1:AT1:_ATp:table1::db']/table/tbody/tr[1]/td[1]"));  //select row
		clickElement(By.xpath("//*[text(),'Open Period']"));  //open period 
		clickElement(By.xpath("//button[text()='Yes']"));  //yes
		clickElement(By.xpath("//*[@accesskey='o']"));  //done

}
public static void run(int iterations) throws Exception
{	

	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(OpeningNewPeriodITC.class);
		run();
	}

}
}