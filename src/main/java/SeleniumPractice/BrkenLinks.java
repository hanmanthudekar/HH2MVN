package SeleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrkenLinks {

	public static void main(String [] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/browse-jobs");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links=driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("count of total links is "+links.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();

		for(int i=0;i<links.size();i++) {

			if(links.get(i).getAttribute("href") != null) {
				activelinks.add(links.get(i));
			}
		}
		System.out.println("count of active links is "+activelinks.size());
		driver.quit();
	}
}
