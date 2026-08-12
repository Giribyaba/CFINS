package OregneHRM;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageEvents.AddEmployee_Event;
import pageEvents.Loginpage;

public class TC08 extends CommonClass.BaseTest {
	
	
	
	@Test(dataProvider ="LoginExcelData", dataProviderClass = Utilities.Dataprovider.class,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public static void Userlogin(String username , String password)
	{
		 Loginpage loginpage = new Loginpage();
		 String ActualResult = loginpage.Login(username, password);
	
	}
	
	
	@Test(dependsOnMethods="Userlogin",  dataProvider ="AddEmployee", dataProviderClass = Utilities.Dataprovider.class,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public static void AddEmp (String frstName, String midlname, String lstname, String empid, String username, String password, String cnfrmpswrd) throws InterruptedException, AWTException {
	
		
		AddEmployee_Event addEmployee_Event = new AddEmployee_Event();
				addEmployee_Event.addemployee(frstName, midlname, lstname, empid, username, password, cnfrmpswrd);
				
		
	}


}
