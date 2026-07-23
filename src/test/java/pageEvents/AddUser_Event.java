package pageEvents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObjectClass.AddUser;
import Utilities.Elementfetch;

public class AddUser_Event {
	
	Elementfetch ele=	new Elementfetch();
	 public void adduser(String loginuser, String loginpass,String empname, String role, String status, String newUsername, String newpassword, String cnfrmPassword) throws InterruptedException
	 
	 {
		 
		 ele.getWebElement("Xpath",PageObjectClass.Loginpage.username).sendKeys(loginuser);
		 ele.getWebElement("Xpath", PageObjectClass.Loginpage.Password).sendKeys(loginpass);
		 ele.getWebElement("xpath",PageObjectClass. Loginpage.buuton).click();
		 Thread.sleep(3000);
		 ele.getWebElement("Xpath", AddUser.adminbtm).click();
		 WebElement adminpage = ele.getWebElement("Xpath", AddUser.adminPage);
		if( adminpage.getText().contains("Admin"))
		{
		 ele.getWebElement("Xpath", AddUser.addbtm).click();		
		}
		else
		{
			System.out.println("adminpage not displayed");
		}
		
		WebElement usermagPage = ele.getWebElement("Xpath", AddUser.UserMangPage);
		Assert.assertTrue(usermagPage.getText().contains("User Management"),"Usermagement page is displayed");
		WebElement roledropdown = ele.getWebElement("Xpath", AddUser.userRole);
		
		Select sp = new Select(roledropdown);
		sp.selectByVisibleText(role);
		
		WebElement EmpNme = ele.getWebElement("Xpath", AddUser.EmpName);
		EmpNme.sendKeys(empname,Keys.ARROW_DOWN.ENTER);
		
		 WebElement status1 = ele.getWebElement("Xpath",AddUser.status);
		 
		 Select stsdp= new Select(status1);
		 stsdp.selectByVisibleText(status);
		 
		 ele.getWebElement("Xpath",AddUser.username).sendKeys(newUsername);
		 ele.getWebElement("Xpath", AddUser.paswrd).sendKeys(newpassword);
		 ele.getWebElement("Xpath", AddUser.cfmpaswrd).sendKeys(cnfrmPassword);
		 ele.getWebElement("Xpath", AddUser.cfmpaswrd).click();
		 
		
	 }

}
