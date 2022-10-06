package amazonPOMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	private WebElement Acc;
	
	@FindBy(xpath = "//div[@id='nav-al-your-account']//a")
	private List<WebElement> signout;

	WebDriver driver;
	public SignOut(WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver = driver;
	}
	public void signOut() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		Actions s = new Actions(driver);
		s.moveToElement(Acc).perform();
		for(WebElement ch :signout) {
		String text = ch.getText();
		if (text.equalsIgnoreCase("Sign Out")) {	
			ch.click();
			System.out.println("Signed out succesfully...");
		}
		}
}
}