package naukariPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukariLogin {

	@FindBy(xpath="(//div[@class='mTxt'])[5]")
	private WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;

	WebDriver driver;
	public NaukariLogin(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void verifyLoginButton() {
		login.click();
	}
	public void fillDetails() {
		email.sendKeys("hanmanthudekar@gmail.com");
		password.sendKeys("Hanmant@123");
		loginButton.click();
		System.out.println("Logged in succesfully...");
		
	}
}
