package CommonClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class BaseTest {

	public static WebDriver driver;
	 protected Logger logger;
	@BeforeMethod
	  
	
	public void Setup() throws IOException
	{
		
		
		//	Properties prop = new Properties();
		//	prop.load(input);

		logger= LogManager.getLogger(this.getClass());
		logger.info("Browser lunched ");
	   // WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get(prop.getProperty("url"));
		
	}
	
	
@AfterMethod
	public void Teardown() 
	{
		driver.quit();
		logger.info("Browser closed");
	}
	

	
	  public  String capturescreenshot(String tname) {
		  
		  String timestamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());  
		  TakesScreenshot tss= ( TakesScreenshot) driver;
		  File	soursefile=  tss.getScreenshotAs(OutputType.FILE);
		  String targetfilepath= System.getProperty("user.dir")+ "\\Screenshots\\"+tname+"-"+ timestamp+".png";
		  File Targetfile = new File(targetfilepath);
		  soursefile.renameTo(Targetfile);
		return targetfilepath;
		  
	  }
}
