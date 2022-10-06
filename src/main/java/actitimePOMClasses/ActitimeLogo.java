package actitimePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogo {

	@FindBy(xpath ="//img[@height='61']")
	private WebElement logo;
	
	@FindBy(xpath ="//a[@id='logoutLink']")
	private WebElement logout;
	WebDriver driver;
	public ActitimeLogo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogo() {
		boolean condition = logo.isDisplayed();
		if(condition==true) {
			System.out.println("Test scenario passed logo is displayed");
		}
		else {
			System.out.println("Test scenario failed logo is not displayed");
		}
	}
	public void verifyLogoutButton() {
		logout.click();
		System.out.println("Logged out succesfully...");
	}

}
