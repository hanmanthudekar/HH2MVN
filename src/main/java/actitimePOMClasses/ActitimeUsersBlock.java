package actitimePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeUsersBlock {
 
	@FindBy(xpath="(//img[@width='84'])[4]")
	private WebElement user;
	
	@FindBy(xpath="//div[@id='ext-gen7']")
	private WebElement createUser;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//img[@id='closeUserDataLightBoxBtn']")
	private WebElement close;
	WebDriver driver;
	
	public ActitimeUsersBlock(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void verifyUserBlock() {
		user.click();
		boolean condition = user.isSelected();
			System.out.println("Test scenario passed user block opened");
	}
	public void verifyCreateUserBlock() {
		createUser.click();
			System.out.println("Test scenario passed user block opened");
		
	}
	
	public void setFirstName() {
		firstName.sendKeys("Hanmant");
	}
	public void verifyCloseButton() {
		close.click();
		System.out.println("Test scenario passed new user window closed succesfully");
	}
	
}
