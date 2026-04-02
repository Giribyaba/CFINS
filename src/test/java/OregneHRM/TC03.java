package OregneHRM;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonClass.BaseTest;
import pageEvents.Update_Events;
@Listeners(Utilities.ExtentReport.class)
public class TC03 extends  BaseTest{
	
	@Test
	public void UpdateTheUserPaswrd()
	{
		Update_Events pswrd=new Update_Events();
		pswrd.creatingpswrd(); 
	}

}
