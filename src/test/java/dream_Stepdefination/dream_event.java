package dream_Stepdefination;

import cucumber.api.java.en.Then;
import dream_PageAction.dream_HomepageAction;
import dream_PageAction.dream_eventpageAction;
import dream_Utility.dream_base;

public class dream_event extends dream_base{
	
	dream_HomepageAction dreHomepageAction = new dream_HomepageAction();
	dream_eventpageAction dreeventpageAction = new dream_eventpageAction();
	
	@Then("^click on event$")
	public void click_on_event() throws Throwable {
		dreHomepageAction.clickonevent();
	}

	@Then("^Verify user can click on event$")
	public void verify_user_can_click_on_event() throws Throwable {
		dreeventpageAction.Verifyusercanclickonevent();
	}



}
