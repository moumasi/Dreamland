package dream_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import dream_Utility.dream_base;

public class dream_HomepageLocator extends dream_base{
	
	public  dream_HomepageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[1]/section/div/div[2]/div/div/div/nav[1]/ul/li[2]/a")
	public WebElement aboutlink;
	
	
	@FindBy(linkText ="Contact")
	public WebElement contactlink;
	
	@FindBy(linkText ="Event")
	public WebElement eventlink;
	
	@FindBy(linkText = "Blog")
	public WebElement bloglink;
	
	@FindBy(xpath = "//span[text()='Flight Status']")
	public WebElement clndr;
	
	
	@FindBy(linkText="Paychex Flex login")
	public WebElement Dreamwindow;
	
	
	
	
	
}
