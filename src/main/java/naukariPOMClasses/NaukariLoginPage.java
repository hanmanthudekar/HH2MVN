package naukariPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukariLoginPage {

	@FindBy(xpath ="//input[@id='usernameField']")
	private WebElement mail;
	
	@FindBy(xpath ="//input[@id='passwordField']")
	private WebElement pwd;
	
	@FindBy(xpath ="(//button[@type='submit'])[1]")
	private WebElement loginButton;
	
	WebDriver driver;
	public NaukariLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setMail() {
		mail.sendKeys("hanmanthudekar@gmail.com");
	}
	public void setPwd() {
		pwd.sendKeys("Hanmant@123");
	}
	public void loginButton() {
		loginButton.click();
	}

}
