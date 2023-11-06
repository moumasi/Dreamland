package dream_Stepdefination;

import cucumber.api.java.en.Then;
import dream_PageAction.dream_HomepageAction;
import dream_Utility.dream_base;

public class dream_Celender extends dream_base{
	
	 dream_HomepageAction  dreaHomepageAction = new  dream_HomepageAction();
	 
	@Then("^Enter departure and return date$")
	public void enter_departure_and_return_date() throws Throwable {
		dreaHomepageAction.Enterdepartureandreturndate();
	}

	@Then("^Verify user can enter departure and return date$")
	public void verify_user_can_enter_departure_and_return_date() throws Throwable {
	  
	}



}
