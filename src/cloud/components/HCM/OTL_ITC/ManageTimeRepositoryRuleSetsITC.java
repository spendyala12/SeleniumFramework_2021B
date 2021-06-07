package cloud.components.HCM.OTL_ITC;
import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageTimeRepositoryRuleSetsITC extends BaseTest{

	public static String Role;
	public static String Name;
	public static String Date;
	public static String MemberName1;
	public static String MemberName2;
	
private static void run() throws InterruptedException	
	
	{
		clickElement(By.id("pt1:_UIScmil2u::icon")); //user account//*[contains(@id, 'UIScmil2u::icon')]
		
		clickElement(By.linkText("Setup and Maintenance")); //set up and maintenance
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //task
		
		clickElement(By.linkText("Search")); //search				
		
		clickElement(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']")); //
				
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']"), Role); //define time and labor
				
		clickElement(By.xpath("//div[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']//a[@class='xx3']")); //search
			
		clickElement(By.linkText("Define Time and Labor")); //define time and labor link
					
		clickElement(By.linkText("Manage Time Repository Rule Sets")); //manage time repository rule sets link			
		
		clickElement(By.xpath("//*[contains(@id, 'dynamicRegion1:0:AP1:AT1:_ATp:create::icon')]")); //create
		
		clickElement(By.xpath("//*[contains(@id, 'itrName::content')]")); //name
		
		setElementText(By.xpath("//*[contains(@id, 'itrName::content')]"), Name);
					
		clickElement(By.xpath("//*[contains(@id, 'sRType2::content')]")); //rule set type
		
		clickElement(By.xpath("//ul[contains(@id,'sRType2::pop')]/li[contains(text(), 'Time entry rule')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'id3::content')]")); //effective start date
		
		setElementText(By.xpath("//*[contains(@id, 'id3::content')]"), Date);
		
		clickElement(By.xpath("//button[@accesskey='u']")); //continue		
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:AT1:_ATp:create::icon')]")); //create
		
		clickElement(By.xpath("//*[contains(@id, 'ATt1:0:type21::content')]")); //member type
		
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP1:AT1:_ATp:ATt1:0:type21::pop']/li[2]")); //rule
		
		clickElement(By.xpath("//*[contains(@id, '0:clmn31::content')]")); //member name
		
		setElementText(By.xpath("//*[contains(@id, '0:clmn31::content')]"), MemberName1);		
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:AT1:_ATp:create::icon')]")); //create
		
		clickElement(By.xpath("//*[contains(@id, 'ATt1:1:type21::content')]")); //member type
		
		clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP1:AT1:_ATp:ATt1:1:type21::pop']/li[2]")); //rule
		
		clickElement(By.xpath("//*[contains(@id, '1:clmn31::content')]")); //member name
		
		setElementText(By.xpath("//*[contains(@id, '1:clmn31::content')]"), MemberName2);		
		
		clickElement(By.xpath("//button[@accesskey='S']")); //save and close
		
		clickElement(By.xpath("//button[@accesskey='K']")); //ok		
		
}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeRepositoryRuleSetsITC.class);
		run();
	}
}
}