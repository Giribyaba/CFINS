package OregneHRM;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonClass.BaseTest;
import pageEvents.Loginpage;
import pageEvents.RejectJobApplEvent;

@Listeners(Utilities.ExtentReport.class)

public class TC07 extends BaseTest {
	
	//reject the job application
	@Test(dataProvider ="LoginExcelData", dataProviderClass = Utilities.Dataprovider.class,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void userLogin(String UserName, String password) {
	    Loginpage loginpage = new Loginpage();
	    String ActualResult = loginpage.Login(UserName, password);
	    Assert.assertEquals(ActualResult, "Candidates", "Login failed or Recruitment page label validation failed. Actual label: " + ActualResult);
	    
	}
	@Test(dependsOnMethods="userLogin",dataProvider ="RejectCandidate", dataProviderClass = Utilities.Dataprovider.class,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void rejectJobApplication(String candidateName) throws InterruptedException 
	{
		RejectJobApplEvent rejectJobApplEvent = new RejectJobApplEvent();
		rejectJobApplEvent.rejectAcandidate(candidateName);
		
		Assert.assertTrue(rejectJobApplEvent.isdeletepopisdisplayed(), "Delete confirmation popup is not displayed");
		
		rejectJobApplEvent.iscandidatedltScsfly();
		Assert.assertTrue(rejectJobApplEvent.iscandidatedltScsfly(), "Candidate deletion was not successful");
	  }
	

}
