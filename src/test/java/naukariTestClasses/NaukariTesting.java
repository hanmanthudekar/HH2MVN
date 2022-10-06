package naukariTestClasses;

import org.testng.annotations.Test;

import naukariPOMClasses.CommonProperties;
import naukariPOMClasses.NaukariHomePage;
import naukariPOMClasses.NaukariLoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NaukariTesting {
	NaukariLoginPage a;
	NaukariHomePage b;

	WebDriver driver;
	CommonProperties c;
	@Test
	public void verifyLogo() {
		b = new NaukariHomePage(driver);
		b.verifyLogo();
	}
	@BeforeMethod
	public void login() {
		a = new NaukariLoginPage(driver);
		a.setMail();
		a.setPwd();
		a.loginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void verifyLogut() {
		b = new NaukariHomePage(driver);
		b.myNaukari();
		b.verifyLogout();
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launching chrome browser...");
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		System.out.println("Launched chrome succesfully...");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		System.out.println("Browser closed succesfully..");
	}
}
