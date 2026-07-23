package pageEvents;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonClass.BaseTest;
import Utilities.Elementfetch;
public class RecuitmentEvent {
	Elementfetch ele=	 new Elementfetch();
	public String recuitment(String username,String password)
	{
		ele.getWebElement("Xpath",PageObjectClass.Loginpage.username).sendKeys(username);
		ele.getWebElement("Xpath", PageObjectClass.Loginpage.Password).sendKeys(password);
		ele.getWebElement("xpath",PageObjectClass.Loginpage.buuton).click();
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.recuitment).click();
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.add_btn).click();
		
		WebElement RecutPageLbl = ele.getWebElement("xpath",PageObjectClass.RecuitementObject.add_recuitment_pag_label);
		 return RecutPageLbl.getText(); 
	}
	public void addCandidate(String firstname,String middlename,String lastname,
			String email,String contactno,String keywords,String Comment, String notes,String datepicker) throws AWTException, InterruptedException
	
	{	
		Thread.sleep(3000);
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.first_name).sendKeys(firstname);
		 ele.getWebElement("xpath",PageObjectClass.RecuitementObject.middle_name).sendKeys(middlename);
		 ele.getWebElement("xpath",PageObjectClass.RecuitementObject.last_name).sendKeys(lastname);
		WebElement DrpDwn = ele.getWebElement("xpath",PageObjectClass.RecuitementObject.vacancy);
		DrpDwn.click();
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.vacancy_option).click();
		
		//new Select(DrpDwn).selectByVisibleText("Sales Representative");
		
		

		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.email).sendKeys(email);
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.contact_no);
		
		 WebElement resume = ele.getWebElement("xpath",PageObjectClass.RecuitementObject.resume);
		 resume.click();
					//WebDriverWait wait = new WebDriverWait( CommonClass.BaseTest.driver, Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.elementToBeSelected(ele.getWebElement("xpath",PageObjectClass.RecuitementObject.resume)));
		Thread.sleep(3000);
	//	String filepath=System.getProperty("user.dir")+ "\\testdata\\Resume(5).pdf";
			//resume. sendKeys("C:\\Users\\admin\\Downloads\\Resume(5).pdf");
	String filepath="C:\\Users\\admin\\eclipse-workspace\\cfins\\testdata\\Resume (5).pdf";
		
		
		//Use this when clicking Choose File opens the operating system's file dialog. Selenium cannot interact with
		
		StringSelection ss = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 Robot robot = new Robot();
		 robot.delay(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.delay(3000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.delay(3000);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.delay(3000);
		 
		 
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.keywords).sendKeys(keywords);
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.notes).sendKeys(notes);
		WebElement datefld = ele.getWebElement("xpath",PageObjectClass.RecuitementObject.datepicker);
		datefld.clear();
	//	datefld.sendKeys(datepicker);
		
		
		
		
		
	
		
		ele.getWebElement("xpath",PageObjectClass.RecuitementObject.Save).click();
		
		
		
		
		
}

	}
	

