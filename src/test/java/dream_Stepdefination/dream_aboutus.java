package dream_Stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dream_PageAction.dream_HomepageAction;
import dream_PageAction.dream_aboutusAction;
import dream_Utility.dream_base;

public class dream_aboutus extends dream_base{
	
	 dream_HomepageAction dreHomepageAction = new dream_HomepageAction();
	 dream_aboutusAction dreaboutusAction = new dream_aboutusAction();
	 
	@Given("^Launch <\"([^\"]*)\"> dream$")
	public void launch_dream(String url) throws Throwable {
		DRlaunchurl(url);
		Thread.sleep(2000);
		}

		
    @Then("^click on About us link$")
	public void click_on_About_us_link() throws Throwable {
    	 dreHomepageAction.clickonAboutuslink();
	 
	}

	@Then("^Verify about us link is displaying in homepage and clickable$")
	public void verify_about_us_link_is_displaying_in_homepage_and_clickable() throws Throwable {
		dreaboutusAction.Verifyaboutuslinkisdisplayinginhomepageandclickable();
	}


	
	
	

}
