package dream_PageAction;

import org.testng.Assert;

import dream_PageLocator.dream_blogpageLocator;
import dream_Utility.dream_base;
import dream_Utility.dream_utiliti;

public class dream_blogpageAction extends dream_base{
	
	 dream_blogpageLocator  dreblogpageLocator = new  dream_blogpageLocator();
	 
	 public void  Verifysearchfieldavailableinblog() throws Exception {
		 boolean BLsuccess = dreblogpageLocator.verifyblog.isDisplayed();
		 Assert.assertTrue(BLsuccess);
		 Thread.sleep(2000);
		 dream_utiliti.takeMyScreenshot(driver, "blog page");
	 }

   }
