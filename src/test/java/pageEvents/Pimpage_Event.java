package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import PageObjectClass.Pimpageobject;
import Utilities.Elementfetch;

public class Pimpage_Event {

	Elementfetch ele=	new Elementfetch();
	 public void pimpage() throws InterruptedException
	 {
		 
	 ele.getWebElement("Xpath",PageObjectClass.Loginpage.username).sendKeys("Admin");
	 ele.getWebElement("Xpath", PageObjectClass.Loginpage.Password).sendKeys("admin123");
		ele.getWebElement("xpath",PageObjectClass. Loginpage.buuton).click();
			 Thread.sleep(3000);
     	 ele.getWebElement("Xpath", PageObjectClass.Menubar.pim_btn).click();
	 
     	Thread.sleep(3000); 
     	
		 ele.getWebElement("Xpath",Pimpageobject.add_Emplyee).click();
		 
		 ele.getWebElement("Xpath",Pimpageobject.add_btn).click();
		 WebElement AddEmpPage = ele.getWebElement("Xpath",Pimpageobject.add_emp_pag_label);
		 
		
			 Assert.assertEquals(AddEmpPage.getText(), "Add Employee page");
		 		
		 
	 }

} 
