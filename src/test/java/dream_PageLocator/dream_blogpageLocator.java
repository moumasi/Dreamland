package dream_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dream_Utility.dream_base;

public class dream_blogpageLocator extends dream_base{
	
	public  dream_blogpageLocator() {
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath = "//input[@type='search']")
	public WebElement verifyblog;

}
