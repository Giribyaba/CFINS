package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonClass.BaseTest;

 
public class Elementfetch {

		    public WebElement getWebElement(String type, String locator) {
		        switch(type.toUpperCase()) {
		            case "XPATH":
		                return BaseTest.driver.findElement(By.xpath(locator));
		            case "ID":
		                return BaseTest.driver.findElement(By.id(locator));
		            case "CSS":
		                return BaseTest.driver.findElement(By.cssSelector(locator));
		            default:
		                return null;
		        }
		    }     
		        
		        public List<WebElement> getWebElements(String type, String locator) {
		            switch(type.toUpperCase()) {
		                case "XPATH":
		                    return BaseTest.driver.findElements(By.xpath(locator));
		                case "ID":
		                    return BaseTest.driver.findElements(By.id(locator));
		                case "CSS":
		                    return BaseTest.driver.findElements(By.cssSelector(locator));
		                default:
		                    return null;
		            }
		    }
}
		

	


