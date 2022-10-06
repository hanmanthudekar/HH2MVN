package amazonPOMClasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnProduct {

	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
	private WebElement product;
	
	WebDriver driver;
	public ClickOnProduct(WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver = driver;
	}
	public void selectProduct() {
	String parent = driver.getWindowHandle();
		product.click();
		System.out.println("Product selected succesfully...");
		Set<String> parentAndChild = driver.getWindowHandles();
		for(String ch: parentAndChild) {
			if(!ch.equals(parent)) {
				driver.switchTo().window(ch);
				System.out.println("Switched to new window");break;
			}
				
		}
	}
}
