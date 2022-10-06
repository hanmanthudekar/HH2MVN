package testSuites;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ParellelTestingMultipleClasses {
	WebDriver driver;
  @Test
  public void welcome() {
		System.out.println("Launched chrome succesfully...");
  }
  @Test
  public void launchBrowser() {
	  System.out.println("Launching chrome browser...");
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @AfterSuite
  public void quitBrowser() {
	  driver.quit();
  }
}
