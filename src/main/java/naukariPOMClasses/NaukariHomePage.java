package naukariPOMClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukariHomePage {

	@FindBy(xpath="//img[@src='https://static.naukri.com/s/4/100/i/naukri_Logo.png']")
	private WebElement logo;
	
	@FindBy(xpath ="(//div[@class='mTxt'])[8]")
	private WebElement myNaukari;
	
	@FindBy(xpath = "(//div[@class='subMenu c2'])[2]//a")
	private List <WebElement> opt;

	WebDriver driver;
	public NaukariHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	this.driver = driver;
	}
	public void verifyLogo() {
	boolean cond = logo.isDisplayed();
	if(cond == true) {
		System.out.println("Test scenario passed logo is displayed");
	}
	else {
		System.out.println("Test scenario failed logo is not displayed");
	}
	}
	public void myNaukari() {
		Actions s = new Actions(driver);
		s.moveToElement(myNaukari).perform();
		System.out.println("Moved to my naukari");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void verifyLogout() {
		
		for (WebElement ch: opt) {
			if((ch.getText()).equals("Logout")) {
				ch.click();
				
					System.out.println("Logged out succesfully...");	
			}
		}
	}
}
