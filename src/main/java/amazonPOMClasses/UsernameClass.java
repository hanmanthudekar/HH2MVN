package amazonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsernameClass {

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;

	WebDriver driver;
	public UsernameClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUsername() {
		username.sendKeys("");
	}
	public void verifyContButton() {
		continueButton.click();
	}
}
