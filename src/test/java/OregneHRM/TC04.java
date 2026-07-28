package OregneHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonClass.BaseTest;
import pageEvents.AddEmployee_Event;
@Listeners(Utilities.ExtentReport.class)
public class TC04 extends BaseTest{
	@Test
	public void addEployee() throws InterruptedException
	{
		AddEmployee_Event Aaddemp = new AddEmployee_Event();
		 Aaddemp.addemployee();
		 
		 Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		  WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//div[contains(@class,'toast')]" )));
		  String message = toast.getText();
		        
		   
		   Assert.assertTrue(message.contains("Success"), "Toast message validation failed. Actual message: " + message);
		  
		}
			
	}


	


