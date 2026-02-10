package pageEvents;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjectClass.Loginpage;
import Utilities.Elementfetch;

public class LoginPage_event
{
	Elementfetch ele=new Elementfetch();

	public void  verifyifloginpageLoaded() throws InterruptedException
	{

		
		WebElement LoginButton = ele.getWebElement("XPATH",Loginpage.loginText);
		try {
			//Wait().until(ExpectedConditions.visibilityOf(LoginButton));
			Assert.assertTrue(LoginButton != null && LoginButton.isDisplayed(), "Login element found");
			System.out.println("Login page loaded successfully.");
		}
		catch(Exception e)
		{
			System.err.println("Element not found or not visible: " + e.getMessage());
			Assert.fail("Login page did not load as expected.");
		}
		LoginButton.click();
	}
	public void entercredentials() throws InterruptedException
	{
		
		ele.getWebElement("XPATH",Loginpage.email).sendKeys("iqdevsupport@cfins.com");
		ele.getWebElement("XPATH",Loginpage.pass).sendKeys("Welcome123!");
	}
}
