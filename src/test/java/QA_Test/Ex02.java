package QA_Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class Ex02 {
public static	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
Thread.sleep(3000);
	WebElement serchfld =driver.findElement(By.xpath("//div[@class='nav-search-field ']//input")); //if we use the dev tag its not the input type
	serchfld.click();
	
	serchfld.sendKeys("Sofa set 5 seater");
	
	/*Actions a=new Actions(driver);
	a.sendKeys(Keys.ARROW_DOWN)
	.build().perform();
	*/
	List<WebElement> suggestions =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='two-pane-results-container']//span")));
	for(WebElement options:suggestions)
	{
		System.out.println(options.getText());
	}
	
	for(WebElement item:suggestions )
	{
		String text = item.getText().trim();
		if(text.equalsIgnoreCase("for living room"))
		{
			item.click();
			break;
		}
	}
	
	}
}
	
	
	//div[@class='left-pane-results-container']//span[.=' set 5 seater']

