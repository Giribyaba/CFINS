package pageEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectClass.AddEmployee;
import PageObjectClass.Pimpageobject;
import Utilities.Elementfetch;

public class AddEmployee_Event {
	
	Elementfetch ele=	new Elementfetch();
	 public void addemployee() throws InterruptedException 
	 {
		 ele.getWebElement("Xpath",PageObjectClass.Loginpage.username).sendKeys("Admin");
		 ele.getWebElement("Xpath", PageObjectClass.Loginpage.Password).sendKeys("admin123");
		 ele.getWebElement("xpath",PageObjectClass. Loginpage.buuton).click();
				 Thread.sleep(3000);
	     ele.getWebElement("Xpath", PageObjectClass.Menubar.pim_btn).click();
		 
	     	Thread.sleep(3000); 
	    
	     ele.getWebElement("Xpath",Pimpageobject.add_btn).click();
	     ele.getWebElement("Xpath", AddEmployee.frstName).sendKeys(" gireesha");
	     ele.getWebElement("Xpath", AddEmployee.midlname).sendKeys("n");
	     ele.getWebElement("Xpath", AddEmployee.lstname).sendKeys("l");
	    ele.getWebElement("Xpath", AddEmployee.empid).sendKeys("01");
		ele.getWebElement("Xpath", AddEmployee.toggle).click();
		ele.getWebElement("Xpath", AddEmployee.username).sendKeys("admin23h");
		ele.getWebElement("Xpath", AddEmployee.password).sendKeys("Admin@123");
		ele.getWebElement("Xpath", AddEmployee.cnfrmpswrd).sendKeys("Admin@123");
		WebElement cnclbtn = ele.getWebElement("Xpath", AddEmployee.cnlbtn);
		WebElement svbtn = ele.getWebElement("Xpath", AddEmployee.svbtn);
		if(svbtn.isDisplayed())
		{
			svbtn.click();
		}
		
		else
		{
			cnclbtn.click();
		}
		
		
		
			 
	 }
}


