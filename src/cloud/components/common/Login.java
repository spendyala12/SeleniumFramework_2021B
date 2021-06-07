package cloud.components.common;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public final class Login extends BaseTest{

	public static String url;
	public static String username;
	public static String password;

	private static void run() throws Exception
	{		

		browser.get(url);
		setElementText(By.id("userid"), username);
		setElementText(By.id("password"), password);
		clickElement(By.xpath("//button[@id='btnActive']"));
		
	}
	public static void run(int iterations) throws Exception
	{	
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(Login.class);
			run();
		}

	}

}