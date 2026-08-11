package pageEvents;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonClass.BaseTest;
import Utilities.Elementfetch;
import freemarker.core.ReturnInstruction.Return;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class RejectJobApplEvent {
	Elementfetch ele=	new Elementfetch();
	public boolean rejectAcandidate(String candidateName) throws InterruptedException
	{
		
		WebElement CandNameSearchFld = ele.getWebElement("Xpath",PageObjectClass.RejectJobAppli.cndname);
		CandNameSearchFld.sendKeys(candidateName);
		Thread.sleep(3000);
		CandNameSearchFld.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		CandNameSearchFld.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ele.getWebElement("Xpath",PageObjectClass.RejectJobAppli.srchbtn).click();
		
		
		  List<WebElement> tblrow = ele.getWebElements("CSS",PageObjectClass.RejectJobAppli.tblrow);
			for(WebElement  NameOFCan:tblrow) {
				
				
				if(NameOFCan.getText().contains(candidateName))
				{
					System.out.println("Candidate found");
					WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(ele.getWebElement("Xpath", PageObjectClass.RejectJobAppli.dltbtn)));
					ele.getWebElement("Xpath", PageObjectClass.RejectJobAppli.dltbtn).click();
					
					return true;
			}
				}
			return false;
	}
			
			public boolean isdeletepopisdisplayed() throws InterruptedException {
				Thread.sleep(2000);
					//WebDriverWait wait=new WebDriverWait(BaseTest.driver,Duration.ofSeconds(10)).
					//wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("Xpath",PageObjectClass.RejectJobAppli.pupupPage)));
					WebElement pupup = ele.getWebElement("Xpath",PageObjectClass.RejectJobAppli.pupupPage);
					
					return pupup.isDisplayed();
				}
			
			public boolean iscandidatedltScsfly() throws InterruptedException {
				Thread.sleep(2000);
				ele.getWebElement("Xpath",PageObjectClass.RejectJobAppli.Cnfmdltbtn).click();
				Thread.sleep(2000);
				WebElement ToastMsg = ele.getWebElement("Xpath", PageObjectClass.RejectJobAppli.toastMsg);
				Thread.sleep(2000);
				return ToastMsg.getText().contains("Successfully Deleted");
			
		}
	}

