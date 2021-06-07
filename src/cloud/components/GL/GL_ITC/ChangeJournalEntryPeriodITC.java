package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ChangeJournalEntryPeriodITC extends BaseTest{
	
	public static String Journal;
	public static String Journal_batch;
	public static String AccountingPeriod;
	public static String BatchStatus;
	
	private static void run() throws InterruptedException{
		
		
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ChangeJournalEntryPeriodITC.class);
			run();
		}
	}

}
