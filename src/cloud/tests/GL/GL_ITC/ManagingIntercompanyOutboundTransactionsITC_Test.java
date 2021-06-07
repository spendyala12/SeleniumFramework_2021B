package cloud.tests.GL.GL_ITC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cloud.components.GL.GL_ITC.ManagingIntercompanyOutboundTransactionsITC;
import cloud.components.common.Login;
import cloud.components.common.Navigate;
import itc.framework.BaseTest;

public class ManagingIntercompanyOutboundTransactionsITC_Test extends BaseTest {

	@BeforeTest
	public void start(){
		startUp("chrome", this.getClass().getSimpleName()); 
	}

	@Test
	@Parameters({ "dataFile" ,"sheet","scenario"})
	public void executeTest(String dataFile1,String sheet1,String scenario1) throws Exception{
		testDataFile = dataFile1;
		scenario = scenario1;
		testsheet = sheet1;
		Login.run(1);
		Navigate.run(1);
		ManagingIntercompanyOutboundTransactionsITC.run(1);
	}
	@AfterTest
	public void end(){
		close();
	}
}
