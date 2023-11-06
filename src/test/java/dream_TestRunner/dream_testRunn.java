package dream_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import dream_Utility.dream_base;

@CucumberOptions(features = {"src/test/resources/Dream_featureFolder"},
plugin = {"json:target/cucumber.json"},
glue = "dream_Stepdefination",tags = {"@Araab"})

public class dream_testRunn extends AbstractTestNGCucumberTests  {
	
	 @BeforeTest
	   public void DStarturl() {
		 dream_base DR = new dream_base();
		 DR.dreBrowser();
		 
	   }
	 @AfterTest
	   public void DCloseurl() throws Exception {
		 Thread.sleep(3000);
		 dream_base DR = new dream_base();
		 DR.driver.quit();
	    
	   }
		
	
	
	
	
	
	

}
