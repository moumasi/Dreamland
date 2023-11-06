package dream_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dream_Utility.dream_base;

public class dream_cotactpageLocator extends dream_base{
	
	public dream_cotactpageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='GET INFORMATION']")
	public WebElement verifycontact;

  }
 