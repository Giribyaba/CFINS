package pageEvents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.Strings;

import Utilities.Elementfetch;

public class Loginpage {
	Elementfetch ele=	new Elementfetch();
	
	public String  Login(String username,String password)
	{
		ele.getWebElement("Xpath",PageObjectClass.Loginpage.username).sendKeys(username);
		ele.getWebElement("Xpath", PageObjectClass.Loginpage.Password).sendKeys(password);
		ele.getWebElement("xpath",PageObjectClass.Loginpage.buuton).click();
		WebDriverWait wait=	new WebDriverWait(CommonClass.BaseTest.driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("xpath",PageObjectClass.Login.Dashboard)));
		return ele.getWebElement("xpath",PageObjectClass.Login.Dashboard).getText();
		
	}
	
	
}
	

	
