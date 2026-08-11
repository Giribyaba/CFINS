package pageEvents;

import org.openqa.selenium.WebElement;

import Utilities.Elementfetch;

public class Login {
	
	public void Testloginpgse(String usname, String password)
	{
	Elementfetch ele=	new Elementfetch();				
	ele.getWebElement("Xpath",PageObjectClass.Login.username).sendKeys(usname);
	ele.getWebElement("Xpath",PageObjectClass.Login.Password).sendKeys(password);
	ele.getWebElement("Xpath",PageObjectClass.Login.buuton).click();
	WebElement Dashboard = ele.getWebElement("Xpath",PageObjectClass.Login.Dashboard);
	
	if(Dashboard.isDisplayed())
	{
		System.out.println("Login successful");
	}
	else
	{
		System.out.println("Login failed");
	}

}
}
