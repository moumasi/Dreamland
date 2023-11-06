package dream_Stepdefination;

import cucumber.api.java.en.Then;
import dream_PageAction.dream_HomepageAction;
import dream_PageAction.dream_cotactpageAction;
import dream_Utility.dream_base;

public class dream_contact extends dream_base {
	
	dream_HomepageAction dreHomepageAction = new dream_HomepageAction();
	dream_cotactpageAction drecotactpageAction = new dream_cotactpageAction();
	
	@Then("^click on contact link$")
	public void click_on_contact_link() throws Throwable {
		dreHomepageAction.clickoncontactlink();
	  
	}

	@Then("^Verify contact link is in home page and it clickable$")
	public void verify_contact_link_is_in_home_page_and_it_clickable() throws Throwable {
		 drecotactpageAction.Verifycontactlinkisinhomepageanditclickable();
	}



}
