package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseClass{

	public static void main(String [] args) { 
		DropDown a = new DropDown();
		a.launchChrome();
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");

		WebElement e1 = driver.findElement(By.xpath("(//select)[1]"));
		WebElement e2 = driver.findElement(By.xpath("(//select)[2]"));
		WebElement e3 = driver.findElement(By.xpath("(//select)[3]"));

		Select s = new Select(e1);
		s.selectByIndex(12);

		Select s2 = new Select(e2);
		s2.selectByValue("8");

		Select s3 = new Select(e3);
		s3.selectByVisibleText("1998");

		List<WebElement> opt1 = s.getOptions();
		int count = opt1.size();
		System.out.println("Count of options is "+count);

		for(WebElement c: opt1) {
			System.out.print(c.getText()+" ");
			
			JavascriptExecutor j = ((JavascriptExecutor)driver);
			j.executeScript("scroll(0,200)");
		}
	}
}
