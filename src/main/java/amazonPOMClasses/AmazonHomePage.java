package amazonPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private WebElement logo;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBar;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;

	WebDriver driver;
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void verifyLogo() {
	boolean result = logo.isDisplayed();
	if(result == true) {
	System.out.println("Test scenario passed logo is displayed.");	
	}
	}
	public void setProduct() {
		searchBar.sendKeys("Oneplus Nord");
	}
	public void verifySearchButton() {
		searchButton.click();
		System.out.println("Test scenario passed product searched succesfully.");
	}
}
