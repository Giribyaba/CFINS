package OregneHRM;



import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import CommonClass.BaseTest;
import Utilities.Dataprovider;
import Utilities.ExtentReport;
import pageEvents.RecuitmentEvent;
@Listeners(Utilities.ExtentReport.class)
public class TC06 extends BaseTest{

	
	@Test(dataProvider="LoginExcelData" ,dataProviderClass=Dataprovider.class,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void recuitmentTest(String username,String password)
	{
		RecuitmentEvent recuitment=new RecuitmentEvent();
		String actuallable=recuitment.recuitment(username,password);
		
		Assert.assertEquals(actuallable, "Candidates", "Recruitment page label validation failed. Actual label: " + username);
		}
	
	@Test(dependsOnMethods="recuitmentTest",dataProvider="AddCandidateData",dataProviderClass=Dataprovider.class)
	public void addCnadidate(String firstname,String middlename,String lastname,String email,String contactno,String keywords,String comment,String Note,String datepicker) throws AWTException, InterruptedException
	{
		
		RecuitmentEvent recuitment=new RecuitmentEvent();
		recuitment.addCandidate(firstname,middlename,lastname,email,contactno,keywords,comment,Note,datepicker);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		  WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//div[contains(@class,'toast')]" )));
		String text = toast.getText();
		Assert.assertTrue(text.contains("Success"), "Toast message validation failed. Actual message: " + text);

}


}