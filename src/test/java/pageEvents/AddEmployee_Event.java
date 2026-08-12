package pageEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonClass.BaseTest;
import PageObjectClass.AddEmployee;
import PageObjectClass.Pimpageobject;
import Utilities.Elementfetch;

public class AddEmployee_Event {
	
	Elementfetch ele=	new Elementfetch();
	 public void addemployee(String frstName,String midlname,String lstname,String empid,String username, String password,String cnfrmpswrd) throws InterruptedException, AWTException 
	 {
		 ele.getWebElement("Xpath",AddEmployee.pim).click();
	     ele.getWebElement("Xpath",Pimpageobject.add_btn).click();
	     ele.getWebElement("Xpath", AddEmployee.frstName).sendKeys(frstName);//employee name
	     ele.getWebElement("Xpath", AddEmployee.midlname).sendKeys(midlname);
	     ele.getWebElement("Xpath", AddEmployee.lstname).sendKeys(lstname);
	     ele.getWebElement("Xpath", AddEmployee.empPhoto).click();
	     Thread.sleep(2000);
	     String filepath= "C:\\Users\\admin\\eclipse-workspace\\cfins\\testdata\\scenic_landscape_under_1mb.png";
	     StringSelection ss = new StringSelection(filepath);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     Robot robot = new Robot();
	     robot.delay(2000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.delay(2000);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     
	   
	     robot.delay(2000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(2000);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     
	     
	     
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
			if(CommonClass.BaseTest.driver.findElements(By.xpath("//div[contains(@class,'toast')]")).size() > 0) {
			    WebDriverWait wait = new WebDriverWait(CommonClass.BaseTest.driver, Duration.ofSeconds(100));
			    WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
			            By.xpath("//div[contains(@class,'toast')]")));
			    String text = toast.getText();
			    if(text.contains("Success")) {
			        System.out.println("Employee added successfully. Toast message: " + text);
			    } else {
			        System.out.println("Unexpected toast message: " + text);
			    }
			} else {
			    System.out.println("No toast message displayed after saving employee.");
			}
		}
		
		
		
		
		
			 
	 }
}


