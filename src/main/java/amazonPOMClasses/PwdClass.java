package amazonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PwdClass {

	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signinButton;
	
		WebDriver driver;
		public PwdClass(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void setPass() {
			pass.sendKeys("Hanmant@123");
		}
		public void verifySigninButton() {
			signinButton.click();
		System.out.println("Logged in succesfully...");
		}
	}

