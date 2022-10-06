package naukariPOMClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonProperties {

	JavascriptExecutor j;
	WebDriver driver;
	public CommonProperties(WebDriver driver) {
		this.driver = driver;
	}
	public void scrollDown() {
		j = ((JavascriptExecutor )driver);
		j.executeScript("scroll(0,300)");
		System.out.println("Scrolled down succesfully..");
	}
	public void scrollUp() {
		j = ((JavascriptExecutor )driver);
		j.executeScript("scroll(-3000,0)");	
		System.out.println("Scrolled up succesfully..");
	}
}
