package dream_Stepdefination;

import cucumber.api.java.en.Then;
import dream_PageAction.dream_HomepageAction;
import dream_PageAction.dream_blogpageAction;
import dream_Utility.dream_base;

public class dream_blog extends dream_base{
	
	dream_HomepageAction dreHomepageAction = new dream_HomepageAction();
	dream_blogpageAction dreblogpageAction = new dream_blogpageAction();
	
	@Then("^Click on blog$")
	public void click_on_blog() throws Throwable {
		dreHomepageAction.Clickonblog();
	}

	@Then("^Verify search field available in blog$")
	public void verify_search_field_available_in_blog() throws Throwable {
		 dreblogpageAction.Verifysearchfieldavailableinblog();
	}



}
