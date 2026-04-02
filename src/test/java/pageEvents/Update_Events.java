package pageEvents;

import org.openqa.selenium.WebElement;

import PageObjectClass.updatepaswrd;
import Utilities.Elementfetch;

public class Update_Events {
	Elementfetch ele=	new Elementfetch();
	public void creatingpswrd()
	{
		ele.getWebElement("Xpath",PageObjectClass.Loginpage.username).sendKeys("Admin");
		ele.getWebElement("Xpath", PageObjectClass.Loginpage.Password).sendKeys("admin123");
		ele.getWebElement("xpath",PageObjectClass. Loginpage.buuton).click();
		ele.getWebElement("XPATH",updatepaswrd.userdrdwn).click();
		ele.getWebElement("XPATH", updatepaswrd.changepswrd).click();
		WebElement pim_page = ele.getWebElement("XPATH", updatepaswrd.pim_page);
		if(pim_page.isDisplayed())
		{
		ele.getWebElement("XPATH", updatepaswrd.crntpaswrd).sendKeys("admin123");
		ele.getWebElement("XPATH", updatepaswrd.newpaswrd).sendKeys("GM@radha7652");
		ele.getWebElement("XPATH", updatepaswrd.cnfirmpaswrd).sendKeys("GM@radha7652");
		ele.getWebElement("XPATH", updatepaswrd.save).click();
		}
		else
		{
			System.out.println("Pim gae is not displayed");
		}
		
			WebElement sucss_msg = ele.getWebElement("XPATH",updatepaswrd.sucssmsg);
			String Actual_msg= sucss_msg.getText();
		String expectmsg="";
		
		if(Actual_msg.equalsIgnoreCase(expectmsg))
			
		{  System.out.println("Password updated successfully");
        } 
		else {
            System.out.println("Password update failed");
        }
		
	}
}
	