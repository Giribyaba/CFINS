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
	 public void addemployee(String frstName,String midlname,String lstname,String empid,String username, String password,String cnfrmpswrd) throws InterruptedException 
	 {
		 ele.getWebElement("Xpath",AddEmployee.pim).click();
	     ele.getWebElement("Xpath",Pimpageobject.add_btn).click();
	     ele.getWebElement("Xpath", AddEmployee.frstName).sendKeys(frstName);//employee name
	     ele.getWebElement("Xpath", AddEmployee.midlname).sendKeys(midlname);
	     ele.getWebElement("Xpath", AddEmployee.lstname).sendKeys(lstname);
	    ele.getWebElement("Xpath", AddEmployee.empid).sendKeys(empid);
		ele.getWebElement("Xpath", AddEmployee.toggle).click();
		ele.getWebElement("Xpath", AddEmployee.username).sendKeys(username);
		ele.getWebElement("Xpath", AddEmployee.password).sendKeys(password);
		ele.getWebElement("Xpath", AddEmployee.cnfrmpswrd).sendKeys(cnfrmpswrd);
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


