package dream_PageAction;

import org.testng.Assert;

import dream_PageLocator.dream_eventpageLocator;
import dream_Utility.dream_base;
import dream_Utility.dream_utiliti;

public class dream_eventpageAction extends dream_base{
	
	 dream_eventpageLocator  dreeventpageLocator = new  dream_eventpageLocator();
	 
	 public void  Verifyusercanclickonevent() throws Exception {
		 boolean ELsuccess = dreeventpageLocator.verifyevent.isDisplayed();
		 Assert.assertTrue(ELsuccess);
		 Thread.sleep(3000);
		 dream_utiliti.takeMyScreenshot(driver,"event page");
	 }
	 

  }
