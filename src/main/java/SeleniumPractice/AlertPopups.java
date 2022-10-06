package SeleniumPractice;

import org.openqa.selenium.By;

public class AlertPopups extends BaseClass {

	public static void main(String [] args) throws InterruptedException {
		
		AlertPopups a = new AlertPopups();
		a.launchChrome();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		driver.quit();
	}
}
