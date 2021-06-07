package cloud.components.GL.GL_ITC;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class InquiringonUnpostedJournalsITC extends BaseTest{
	
	public static String Journal_Batch;
	public static String Journal_Batch2;
	public static String Journal_Batch3;
	
	
	private static void run(){
		
		clickElement(By.xpath("//div[@class='x1cz']/a[contains(@id,'pt1:r1:0:jd1:0:sdi1::disAcr')]"));
	    clickElement(By.xpath("//*[contains(@id,'r1:0:reqAttenApplTable:_ATp:reqAttn::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'pt1:r1:0:jd1:0:requiringMyApprovalTab::disAcr')]"));
	    clickElement(By.linkText(Journal_Batch));//Audit Fee Accrual KL
	    
	    clickElement(By.xpath("//div[contains(@id,'pt1:ap1:ctb1')]/a/span"));
	    clickElement(By.xpath("//*[contains(@id,'pt1:ap1:userResponsePopupDialogButtonOk')]"));
	    clickElement(By.xpath("//div[contains(@id,'pt1:ap1:commandToolbarButton5')]/a/span"));
	    clickElement(By.xpath("//*[contains(@id,'_FOTsr1:0:ap1:Journ1:0:sentForApprovalTab::disAcr')]"));
	    clickElement(By.linkText(Journal_Batch2));//Monthly Accrual Adjustment CB
	  
	    clickElement(By.xpath("//div[contains(@id,'pt1:ap1:commandToolbarButton5')]/a/span"));
	    clickElement(By.xpath("//div[contains(@id,'_FOTsr1:0:ap1:Journ1:0:r5:0:sentApprovalApplTable:_ATp:t3::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[4]"));
	    clickElement(By.xpath("//div[contains(@id,'_FOTsr1:0:ap1:Journ1:0:r5:0:sentApprovalApplTable:_ATp:withdrawbutton')]/a/span"));
	    clickElement(By.xpath("//*[contains(@id,'_FOTsr1:0:ap1:Journ1:0:r5:0:sentApprovalApplTable:d3::ok')]"));
	    clickElement(By.xpath("//*[contains(@id,'_FOTsr1:0:ap1:Journ1:0:r5:0:sentApprovalApplTable:_ATp:refreshSentData::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_general_accounting_journals:0:_FOTsr1:0:ap1:Journ1:0:showDetailItem1::disAcr')]"));
	    clickElement(By.linkText(Journal_Batch3));//Monthly Accrual Adjustment CB
	 
	    clickElement(By.xpath("//div[contains(@id,'pt1:ap1:completeButton')]/table/tbody/tr/td/a/span"));
	    clickElement(By.xpath("//div[contains(@id,'pt1:ap1:commandToolbarButton5')]/a/span"));
	    clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:refreshIncompleteData::icon')]"));
	    clickElement(By.xpath("//*[contains(@id,'ap1:Journ1:0:showDetailItem2::disAcr')]"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(InquiringonUnpostedJournalsITC.class);
			run();
		}
	}

}
