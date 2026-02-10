package OregneHRM;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonClass.BaseTest;
import Utilities.Dataprovider;
import pageEvents.Loginpage;
import pageEvents.Pimpage_Event;
@Listeners(Utilities.ExtentReport.class)


public class TC02 extends BaseTest{
@Test(retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void AddEmployeePage() throws InterruptedException
	{
		
		Pimpage_Event	pim= new Pimpage_Event();
		pim.pimpage();
	}

}

