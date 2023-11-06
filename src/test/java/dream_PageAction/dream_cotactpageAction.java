package dream_PageAction;

import org.testng.Assert;

import dream_PageLocator.dream_cotactpageLocator;
import dream_Utility.dream_base;
import dream_Utility.dream_utiliti;

public class dream_cotactpageAction extends dream_base{
	
	dream_cotactpageLocator drecotactpageLocator = new dream_cotactpageLocator();
	
	public void  Verifycontactlinkisinhomepageanditclickable() throws Exception {
		boolean DRsuccess = drecotactpageLocator.verifycontact.isDisplayed();
		Assert.assertTrue(DRsuccess);
		Thread.sleep(3000);
		dream_utiliti.takeMyScreenshot(driver, "contact page");
	
	}

  }
