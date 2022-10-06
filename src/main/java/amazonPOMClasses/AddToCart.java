package amazonPOMClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	@FindBy(xpath ="//input[@id='add-to-cart-button']")
	private WebElement cart;
	
	WebDriver driver;
	public AddToCart(WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver = driver;
	}
	
	public void VerifyCart() {
		JavascriptExecutor j =	((JavascriptExecutor)driver);
		j.executeScript("scroll (0,250)");
		System.out.println("scrolled down succaesfully...");
		cart.click();
		System.out.println("Prodect added to cart succaesfully...");
	}

	}
	

