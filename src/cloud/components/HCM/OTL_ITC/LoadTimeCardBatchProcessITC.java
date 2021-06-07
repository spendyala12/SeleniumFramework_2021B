package cloud.components.HCM.OTL_ITC;
import itc.framework.BaseTest;

public class LoadTimeCardBatchProcessITC extends BaseTest{

	public static String Role;
	
private static void run() throws InterruptedException	
	
	{
		
	
	
	
}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(LoadTimeCardBatchProcessITC.class);
		run();
	}
}
}