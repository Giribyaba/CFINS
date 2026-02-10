package pageEvents;

import org.openqa.selenium.WebElement;

import Utilities.Elementfetch;

public class Loginpage {
	Elementfetch ele=	new Elementfetch();
	
	public void Testloginpgse(String usname, String password)
	{
		WebElement Username = ele.getWebElement("XPATH", PageObjectClass.Loginpage.username);
		
		Username.sendKeys(usname);
		WebElement pwd = ele.getWebElement("XPATH",  PageObjectClass.Loginpage.Password);
		
		pwd.sendKeys(password);
		ele.getWebElement("XPATH",  PageObjectClass.Loginpage.buuton).click();
	
	}
	
	
	public boolean isErrormsgisdisplayed()
		{
		return 	ele.getWebElement("XPATH",PageObjectClass.Loginpage.errormsg ).isDisplayed();
		}
	
	
	public boolean isdashboardmsgisdisplayed()
	{
		
		return 	ele.getWebElement("XPATH",PageObjectClass.Dashboard.dashboardmsg ).isDisplayed();
	}
	
	}
	

	
