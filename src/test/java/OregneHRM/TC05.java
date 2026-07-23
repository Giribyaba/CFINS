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

import pageEvents.AddUser_Event;
@Listeners(Utilities.ExtentReport.class)
public class TC05 extends BaseTest {
	@Test(retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void Adduser(String loginuser, String loginpass,
            String empname, String role,
            String status, String newUsername, String newpassword,String cnfrmPassword) throws InterruptedException

	{
		AddUser_Event Adduser = new AddUser_Event();
		Adduser.adduser(loginuser, loginpass, empname, role, status, newUsername, newpassword,cnfrmPassword);

		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		  WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'toast')]")));
		  
		  String text = toast.getText();
		Assert.assertTrue(text.contains("Success"), "Toast message validation failed. Actual message: " + text);

}
	
}
