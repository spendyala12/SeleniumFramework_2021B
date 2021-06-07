package cloud.components.GL.GL_ITC;

import itc.framework.BaseTest;

public class Dummy1 extends BaseTest{
	
	public static String Id;
	public static String Name;
	public static String output;
	private static void run() throws Exception{
		setValue(output, "1234");
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(Dummy1.class);
			run();
		}
	}

}
