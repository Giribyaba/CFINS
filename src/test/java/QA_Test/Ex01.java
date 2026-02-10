package QA_Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex01 {
	static WebDriver driver;
	public static void main(String[] args) {
		  driver= new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		 // driver.findElement(By.xpath("//label[@for='radio1']")).click();
		 
		    WebElement ele = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		    Select sl = new Select (ele);
		   sl.selectByIndex(2);
		   sl.selectByValue("option1");
		 //  sl.deselectAll();
		   
		   
		   //Auto-Suggest / Dynamic Dropdown
		        driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Ind");
		   
		   		WebDriverWait	wait  = new WebDriverWait(driver,Duration.ofSeconds(3));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li")));
				List<WebElement> sugestion = driver.findElements(By.tagName("li"));
		        
		        
				//for(WebElement option:sugestion)
				/*	Actions actions = new Actions(driver);
				actions.sendKeys(Keys.ARROW_DOWN)
				       .sendKeys(Keys.ARROW_DOWN)
				       
				       .build()
				       .perform();*/
				  

	}

}
