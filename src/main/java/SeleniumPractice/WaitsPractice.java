package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice extends BaseClass{

	public static void main(String [] args) throws InterruptedException {
		WaitsPractice s = new WaitsPractice();
		s.launchChrome();
		driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver"));
		WebElement d=driver.findElement(By.xpath("//h2[@id='h2']"));
		System.out.println(d.getText());
		driver.close();
	}
}
