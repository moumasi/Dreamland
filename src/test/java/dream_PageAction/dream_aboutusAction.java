package dream_PageAction;

import org.testng.Assert;

import dream_PageLocator.dream_aboutusLocator;
import dream_Utility.dream_base;
import dream_Utility.dream_utiliti;

public class dream_aboutusAction extends dream_base{
	
	dream_aboutusLocator dreaboutusLocator = new dream_aboutusLocator();
	
    public void Verifyaboutuslinkisdisplayinginhomepageandclickable() throws Exception {
    	boolean DRsuccess = dreaboutusLocator.verifyAUpage.isDisplayed();
    	Assert.assertTrue(DRsuccess);
    	Thread.sleep(2000);
    	 dream_utiliti.takeMyScreenshot(driver, "about us page");
    	
    }
 }
