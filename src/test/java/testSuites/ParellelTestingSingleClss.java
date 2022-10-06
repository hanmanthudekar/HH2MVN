package testSuites;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParellelTestingSingleClss {
	WebDriver driver;
	@Test
	public void chromeBrowser() {
		System.out.println("Launching chrome browser...");
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://web.whatsapp.com/");
		System.out.println("Launched chrome succesfully...");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void edgeDriver() {
		System.out.println("Launching Edge browser...");
		System.setProperty("webdriver.edge.driver", "C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://web.whatsapp.com/");
		System.out.println("Launched EdgeDriver succesfully...");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
/*	@BeforeMethod
	public void welcome() {
		System.out.println("Strating parellel testing");
	}
	*/
	@AfterMethod
	public void closeBrowsers() {
		driver.quit();
		System.out.println("Closed Browsers sucessfully...");
	}

}
