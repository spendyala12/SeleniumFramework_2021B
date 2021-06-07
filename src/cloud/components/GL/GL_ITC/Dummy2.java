package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

public class Dummy2 extends BaseTest{
	
	public static String dummy1_output;
	
	private static void run() throws Exception{
		System.out.println(dummy1_output);
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(Dummy2.class);
			run();
		}
	}

}
