package dream_PageAction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import dream_PageLocator.dream_HomepageLocator;
import dream_Utility.dream_base;
import dream_Utility.dream_utiliti;

public class dream_HomepageAction extends dream_base{
	
	dream_HomepageLocator dreaHomepageLocator = new dream_HomepageLocator();
	
	public void clickonAboutuslink() {
		dreaHomepageLocator.aboutlink.click();
	}
	public void clickoncontactlink() {
		dreaHomepageLocator.contactlink.click();
	}
	public void clickonevent() {
		 dreaHomepageLocator.eventlink.click();
	}
	public void  Clickonblog() {
		 dreaHomepageLocator.bloglink.click();
	}
	public void Enterdepartureandreturndate() {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		JavascriptExecutor date= (JavascriptExecutor)driver;
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='09/15/2023'");
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='09/20/2023'");
	}
	public void Verifyusercanenterdepartureandreturndate() throws Exception {
		 boolean success = dreaHomepageLocator.clndr.isDisplayed();
		 Assert.assertTrue(success);
		 Thread.sleep(2000);
		 dream_utiliti.takeMyScreenshot(driver, "celender page");
	}
	public void Clickonloginpagetogoanotherwindow() {
		dreaHomepageLocator.Dreamwindow.click();
	}
	public void  Gotonextandcomebackfirstwindow() throws Exception {
		Set<String>	allwnd	= driver.getWindowHandles();
        Iterator<String> ite = allwnd.iterator();
        String parentwindow = ite.next();
        String childwindow = ite.next();
        
        driver.switchTo().window(childwindow);
        System.out.println("i am in child window");
        Thread.sleep(3000);
        driver.switchTo().window(parentwindow);
        System.out.println("i am in parent window");
        
        Thread.sleep(3000);
	}
	

}
