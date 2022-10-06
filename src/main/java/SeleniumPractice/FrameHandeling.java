package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FrameHandeling extends BaseClass{

	public static void main(String [] args) {
		FrameHandeling a = new FrameHandeling();
		a.launchChrome();
		driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,5000)");
		driver.findElement(By.xpath("//a[text()='Platform & Database Testing']"));
		System.out.println("Completed");
		driver.quit();
	}
}
