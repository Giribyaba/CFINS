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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class BaseTest {

	public static WebDriver driver;
	 protected Logger logger;
	//@BeforeMethod
	//@Parameters("browser")
	@BeforeClass
	/*"If each test case should run independently, I use @BeforeMethod to launch the browser and @AfterMethod to close it. This ensures every 
	test starts with a clean browser session. If multiple test methods need to share the same browser session for performance reasons,
	 I use @BeforeClass and @AfterClass."*/
	public void Setup() throws IOException
	{
		
		
		//	Properties prop = new Properties();
		//	prop.load(input);

		logger= LogManager.getLogger(this.getClass());
		logger.info("Browser lunched ");
	   // WebDriverManager.chromedriver().setup();
		//if(browser.equalsIgnoreCase("chrome"))
		//{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get(prop.getProperty("url"));
		/*}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		*/
	}
	
	
//@AfterMethod
//@AfterClass
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
