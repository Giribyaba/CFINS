package QA_Test;

import org.testng.annotations.Test;

import pageEvents.PETC01;

public class TC_01_VlaidateProductPrice extends CommonClass.BaseTest {
	pageEvents.PETC01 P_action	=new PETC01();
	@Test
	public void VlaidateProductPrice()
	{
		P_action.getthePriceOfTheProduct();
		P_action. getthePriceOfTheProduct_1();
		
	}

}
