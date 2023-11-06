package dream_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dream_Utility.dream_base;

public class dream_aboutusLocator extends dream_base{
	
	public dream_aboutusLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='JOIN THE EVENT']")
	public WebElement verifyAUpage;

}
