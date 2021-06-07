package cloud.components.PO;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class SplittingInformationBetweenTwoChargeAccountsITC extends BaseTest{
	
	public static String Supplier;
	public static String Description;
	public static String Category;
	public static String UoM;
	public static String Quantity;
	public static String Price;
	public static String SplitQTY1;
	public static String POAccount1;
	public static String SplitQTY2;
	public static String POAccount2;
	
	private static void run() throws Exception{
		
		clickElement(By.xpath("(//a[contains(text(),'Actions')])[2]"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:AT12:_ATp:createMenuItem']/td[2]"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:Supplier::content"), Supplier);//"Advanced Corp"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt1:0:AP1:r1:0:r2:1:commandButton1"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:lineDetailItemId::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:create::icon"));
	    	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:Lines:1:ItemDescription::content"), Description);//"Hardware"
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT1:_ATp:Lines:1:Category::content"), Category);//"Miscellaneous"
	    setElementText(By.xpath(".//*[contains(@id, 'Uom::content')]"), UoM);//"Dz"
	    setElementText(By.xpath("//*[contains(@id, 'Quantity::content')]"), Quantity);//"120"	    
	    setElementText(By.xpath(".//*[contains(@id, 'UnitPrice::content')]"), Price);//"10"
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:showDetailItem4::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:commandImageLink11::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:1:QuantityDist::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:1:QuantityDist::content"), SplitQTY1);//"60"
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:1:DistPoChargeAcctKffCS::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:1:DistPoChargeAcctKffCS::content"), POAccount1);//"101.10.60540.120.000.000"
	    
	    clickElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists::db']/table/tbody/tr[1]/td[1]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:0:QuantityDist::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:0:QuantityDist::content"), SplitQTY2);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:0:DistPoChargeAcctKffCS::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:AT3:_ATp:Dists:0:DistPoChargeAcctKffCS::content"), POAccount2);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_purchasing:0:MAt2:1:AP1:APsb2"));
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(SplittingInformationBetweenTwoChargeAccountsITC.class);
			run();
		}
	}

}
