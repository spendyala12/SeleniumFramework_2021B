package cloud.tests.GL.GL_ITC;

import itc.framework.BaseTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cloud.components.GL.GL_ITC.Dummy1;
import cloud.components.GL.GL_ITC.Dummy2;

public class Dummy_Test extends BaseTest{
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
		Dummy1.run(1);
		Dummy2.run(1);
	}
	@AfterTest
	public void end(){
		close();
	}
}