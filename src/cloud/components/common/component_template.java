package cloud.components.common;

import itc.framework.BaseTest;

public class component_template extends BaseTest{
	
	public static String Search;
	
	private static void run(){
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(component_template.class);
			run();
		}
	}

}
