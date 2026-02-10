package QA_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pageEvents.LoginPage_event;




public class TestClass extends CommonClass.BaseTest {
	
	pageEvents.LoginPage_event login= new LoginPage_event();
	//Mange_Roles_events manageRoles=new Mange_Roles_events();
	@Test
	public void samplemethodforEnterningCedential() throws InterruptedException
	{
		//Home.singinButton();
	
		
		Thread.sleep(7000);
		login.entercredentials();

		Thread.sleep(7000);
		login.verifyifloginpageLoaded();
		Thread.sleep(7000);
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(10));
		org.openqa.selenium.WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.pi.pi-bars.cursor-pointer")));
		element.click();
		
	//	manageRoles.sidemenu();
		org.openqa.selenium.support.ui.WebDriverWait wait3= new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(10));
		org.openqa.selenium.WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.pi.pi-bars.cursor-pointer")));
		element3.click();
//	manageRoles.logout();
	}

}


