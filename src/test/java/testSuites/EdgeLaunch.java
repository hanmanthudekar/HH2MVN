package testSuites;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class EdgeLaunch {

	WebDriver driver;
	@Test
	public void welcome() {
		System.out.println("Launched Edge succesfully...");
	}
	@Test
	public void launchBrowser() {
		System.out.println("Launching edge browser...");
		System.setProperty("webdriver.edge.driver", "C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
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
