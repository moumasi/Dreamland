package dream_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dream_Utility.dream_base;

public class dream_eventpageLocator extends dream_base{
	
	public   dream_eventpageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h3[text()='15th Feb']")
	public WebElement verifyevent;
	

}
