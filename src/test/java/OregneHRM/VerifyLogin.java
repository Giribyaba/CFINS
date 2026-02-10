package OregneHRM;



import org.testng.Assert;
import org.testng.annotations.Test;

import CommonClass.BaseTest;
import Utilities.Dataprovider;
import pageEvents.Loginpage;


public class VerifyLogin extends BaseTest{
	
    @Test(dataProvider = "logindata",
    	    dataProviderClass = Dataprovider.class)
	public void TestCase01(String usname ,String password,String expectedresult)
	{
    	Loginpage lp = new Loginpage();
		lp.Testloginpgse(usname, password);
		
		if(expectedresult.equalsIgnoreCase("valid"))
		{
			Assert.assertTrue(lp.isdashboardmsgisdisplayed(),"dashboard not displayed for valid logindata");
			
		}
		else
		{
			Assert.assertTrue(lp.isErrormsgisdisplayed(),"the error message is not displayed");
		}
	}
    
    
	
	

}
