package itc.framework;

import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings({"rawtypes","unused"})
public class Framework  {
	private static StringBuffer verificationErrors = new StringBuffer();
	public static WebDriver browser;
	public static WebDriverWait wait;
	public static String testDataFile;
	public static String scenario;
	public static String testsheet;
	public static Field[] fields;
	public static int iteration;
	public static int firstIndex;
	public static HashMap<String, Integer> components; 
	public static ExtentReports extent;
	public static ExtentTest logger;

	public static void startUp(String browserType, String name){
		StartReport(name);
		components = new HashMap<>();
		firstIndex = 0;
		initBrowser(browserType);
	}
	public static boolean scrollByElement(By locator) throws AWTException, InterruptedException{
		boolean gotElement = false;
		boolean isElementFound = false;
		Robot rb = new Robot();
		int iLook = 1;
		while(!gotElement){
			rb.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(10000);
			if(browser.findElement(locator).isDisplayed()){
				gotElement = true;
				isElementFound = true;
			}
			if(iLook > 10)
				gotElement = true;
			iLook++;
		}
		return isElementFound;
	}
	public static void initBrowser(String browserType){
		if(browserType.equalsIgnoreCase("ie")){
			File ieFile = new File("lib/IEDriverServer.exe");  
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			System.setProperty("webdriver.ie.driver", ieFile.getAbsolutePath());
			browser = new InternetExplorerDriver(capabilities);
		}else if(browserType.equalsIgnoreCase("firefox")){
			File ffFile = new File("lib/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", ffFile.getAbsolutePath());
			browser = new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("chrome"))
		{
//			File ffFile = new File("lib\\chromedriver1.exe");
//			System.setProperty("webdriver.chrome.driver", ffFile.getAbsolutePath());
			WebDriverManager.chromedriver().setup();
			browser = new ChromeDriver();
		}

		browser.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		browser.manage().window().maximize();

	}

	public static void clickElement(By locator)
	{
		try{
			Thread.sleep(5000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(browser).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(10, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class);
			WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			
			ITC_Logger("pass", "Clicked on locator"+locator.toString());
		}
		catch(Exception e){
			ITC_Logger("failed", "Failed while clicking on locator "+locator.toString() +" : Error Msg : "+e.getMessage());
			e.printStackTrace();

		}
	}
	
	//selectByVisibleText
	//Select drpCountry = new Select(driver.findElement(By.xpath("XXPATH")));
	//drpCountry.selectByVisibleText("ANTARCTICA");

/*	public static void selectDropdown(By locator, String value)
	{

		try{
			Thread.sleep(2000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(browser).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(10, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class);
			//WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			Select drpCountry = new Select(driver.findElement(By.xpath(locator)));
			element.click();
			element.selectByVisibleText(value);
			//		element.sendKeys(Keys.RETURN);
			ITC_Logger("pass", "Entered value "+value+" in locator "+locator.toString());
		}
		catch(Exception e){
			ITC_Logger("failed", "Failed while setting value "+value+ "in locator "+locator.toString() +" : Error Msg : "+e.getMessage());
			e.printStackTrace();

		}
	}*/

	public static void setElementText(By locator, String value)
	{

		try{
			Thread.sleep(2000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(browser).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(10, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class);
			WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			element.clear();
			element.sendKeys(value);
			//		element.sendKeys(Keys.RETURN);
			ITC_Logger("pass", "Entered value "+value+" in locator "+locator.toString());
		}
		catch(Exception e){
			ITC_Logger("failed", "Failed while setting value "+value+ "in locator "+locator.toString() +" : Error Msg : "+e.getMessage());
			e.printStackTrace();

		}
	}

	public static void popluateParams(Class comp) throws Exception
	{
		getData(comp);
	}

	public static void getData(Class component) throws Exception{
		//read the xlsx file and store values into hashmap

		File testXlsLoc = new File(testDataFile);
		//FileInputStream testXlsFile = new FileInputStream(testXlsLoc);

		// Finds the workbook instance for XLSX file
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(testXlsLoc));

		// Return first sheet from the XLSX workbook
		// Return first sheet from the XLSX workbook
		XSSFSheet ms = wb.getSheet(testsheet);

		Iterator<Row> rowIterator = ms.iterator();
		Row row1;
		int scenarioRow = 0;
		boolean foundScenario = false;
		Cell c = null;
		Iterator<Cell> cellIterator;
		while(rowIterator.hasNext()){
			row1 = rowIterator.next();
			c = row1.getCell(0);
			if(c != null){
				if(c.getStringCellValue().equalsIgnoreCase(scenario))
				{
					scenarioRow = c.getRowIndex();
					foundScenario = true;
					break;
				}
			}
			//scenarioRow++;
		}
		//find the component name in the excel file
		int compCol = 0;
		boolean compFound = false;
		ArrayList<String> columns = new ArrayList<String>();
		int compOccurance = -1;
		if(foundScenario)
		{
			row1 = ms.getRow(0);
			//get component name column number
			cellIterator = row1.cellIterator();
			while(cellIterator.hasNext()){
				c = cellIterator.next();
				if((c!=null) && (c.getColumnIndex() >= firstIndex ))
				{
					if(c.getStringCellValue().equalsIgnoreCase(component.getSimpleName())){
						compOccurance++;
						if(components.get(component.getSimpleName())==null)
						{
							components.put(component.getSimpleName(), c.getColumnIndex());
							firstIndex = c.getColumnIndex();
							compCol = c.getColumnIndex();
							compFound = true;
							break;
						}else if((components.get(component.getSimpleName()) < c.getColumnIndex()) || (iteration > 0))
						{
							components.put(component.getSimpleName(), c.getColumnIndex());
							firstIndex = c.getColumnIndex();
							compCol = c.getColumnIndex();
							compFound = true;
							break;
						}
					}
				}
			}
		}
		else
			fail("Scenario not found in the excel file");
		//create parameters from the excel columns
		Row row2;
		scenarioRow = scenarioRow+iteration;
		String data = null;
		if(compFound)
		{
			row1 = ms.getRow(1);
			boolean endOfParam = true;
			while(endOfParam){
				if(row1.getCell(compCol) == null){
					break;
				}
				columns.add(row1.getCell(compCol).getStringCellValue());
				row2 = ms.getRow(scenarioRow);
				if(row2.getCell(compCol) == null)
					data = "";
				else
					data = row2.getCell(compCol).getStringCellValue();
				component.getDeclaredField(row1.getCell(compCol).getStringCellValue()).set(component, evalString(data));			
				compCol++;
			}
		}
		else
			fail("Component not found in the excel file");
		wb.close();
	}

	public static void initComponent(){
		firstIndex = 0;
	}

	public static void close() {
		browser.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
		EndReport();
	}

	public static void setValue(String variable,String value) throws Exception
	{
		Properties prop = new Properties();
		File filename = new File("Config/Variables.properties");
		if(!filename.createNewFile())
		{
			InputStream in = new FileInputStream(filename);
			prop.load(in);
			in.close();
		}
		OutputStream os = new FileOutputStream(filename);
		prop.setProperty(variable, value);
		prop.store(os, null);
		os.close();
		prop = null;
		filename = null;
	}

	public static String evalString(String data) throws Exception{
		if(data.startsWith("{"))
		{
			data = getValue(data.substring(1, data.length()-1));
		}else if(data.contains("<UID>")){
			String Num = String.valueOf(fnRandomNum());
			data = data.replace("<UID>", Num);
		}
		return data.toString();
	}

	public static String getValue(String variable) throws Exception{

		Properties prop = new Properties();
		File filename = new File("Config/Variables.properties");
		InputStream in = new FileInputStream(filename);
		prop.load(in);
		String value = prop.getProperty(variable);
		in.close();
		filename = null;
		prop = null;
		return value;
	}
	public static void captureOutput(By locator, String variable) throws Exception{
		WebDriverWait wait = new WebDriverWait(browser, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String value = (String) element.getText().subSequence(14, 20);
		setValue(variable, value);
	}
	public static String captureOutputFromAField(By locator) throws Exception{
		WebDriverWait wait = new WebDriverWait(browser, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String value = (String) element.getText();
		return value;
	}

	public static Integer fnRandomNum(){
		Random rand = new Random();
		int UID = rand.nextInt(10000);
		return UID;
	}

	public static void StartReport(String name){
		String extentReportFile = System.getProperty("user.dir")+ "/Results/"+name+".html";
		// initialize the HtmlReporter
		extent = new ExtentReports(extentReportFile,true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"/lib/extent-config.xml"));
		logger = extent.startTest(name);
	}
	public static void EndReport(){
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}
	public static void captureScreenShot(String name){
		try{
			TakesScreenshot ts = (TakesScreenshot)browser;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = System.getProperty("user.dir") +"/Results/img/"+name+".png";
			File destination = new File(dest);
			FileUtils.copyFile(source, destination); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static String captureScreenShot() throws Exception{
		try{
			UUID idOne = UUID.randomUUID();
			captureScreenShot(String.valueOf(idOne));
			return String.valueOf(idOne);
		}
		catch(Exception e){
			e.printStackTrace();
			return "";
		}
	}
	public static void ITC_Logger(String status,String msg){
		try{
			msg = msg+addScreenShot();
			if(status.equalsIgnoreCase("pass"))
				logger.log(LogStatus.PASS, msg);
			else if(status.equalsIgnoreCase("fail"))
				logger.log(LogStatus.FAIL, msg);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static String addScreenShot() throws Exception{
		String id = captureScreenShot();
		return logger.addScreenCapture(System.getProperty("user.dir") +"/results/img/"+id+".png");
	}

	private static void copyFile(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}
}