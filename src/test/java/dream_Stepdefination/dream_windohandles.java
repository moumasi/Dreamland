package dream_Stepdefination;

import cucumber.api.java.en.Then;
import dream_PageAction.dream_HomepageAction;
import dream_Utility.dream_base;

public class dream_windohandles extends dream_base{
	
	dream_HomepageAction dreaHomepageAction = new dream_HomepageAction();
	
	@Then("^Click on login page to go another window$")
	public void click_on_login_page_to_go_another_window() throws Throwable {
		dreaHomepageAction.Clickonloginpagetogoanotherwindow();
	}

	@Then("^Goto next and come back first window$")
	public void goto_next_and_come_back_first_window() throws Throwable {
		dreaHomepageAction.Gotonextandcomebackfirstwindow();
	}


}



