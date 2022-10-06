package actitimePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	

	@FindBy(xpath="//input[@name='username']")
	private WebElement usernamne;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	WebDriver driver;
	
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername() {
		 usernamne.sendKeys("admin");
	}
	public void setPwd() {
		password.sendKeys("manager");
	}
	public void verifyLoginButton() {
		loginButton.click();
	}
}
