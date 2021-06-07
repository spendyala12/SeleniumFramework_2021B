package cloud.components.GL.GL_China;
import org.openqa.selenium.By;
import itc.framework.BaseTest;
public class CreatingParametersforRevaluationITC extends BaseTest{

	public static String DataAccessSet;
	public static String LedgerorLedgerSet;
	public static String Revaluation;
	public static String AccountingPeriod;

	private static void run() throws Exception  {
		
		clickElement(By.xpath("//*[contains(@id,'_FOTsdiPeriodCloseRegionalArea::icon')]"));
		clickElement(By.linkText("Revalue Balances"));
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:ap1:AT1:_ATp:table3::db']/table/tbody/tr[2]/td[1]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:_ATp:cb1')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:r1:basicReqBody:dynam1:0:Revaluation::content')]"));
		
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:r1:basicReqBody:dynam1:0:Revaluation::content')]"),DataAccessSet);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:r1:basicReqBody:dynam1:0:soc2::content')]"),LedgerorLedgerSet);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:r1:basicReqBody:dynam1:0:inputComboboxListOfValues1::content')]"),Revaluation);
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:r1:basicReqBody:dynam1:0:soc3::content')]"),AccountingPeriod);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:ap1:AT1:r1:requestBtns:submitButton')]"));
		clickElement(By.xpath("//*[contains(@id,'requestBtns:confirmationPopup:confirmSubmitDialog::ok')]"));
		
		
	}
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingParametersforRevaluationITC.class);
			run();
		}
	}
}