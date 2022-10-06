package actitimeTestClass;

import org.testng.annotations.Test;

import actitimePOMClasses.ActitimeLoginPage;
import actitimePOMClasses.ActitimeLogo;
import actitimePOMClasses.ActitimeReportBlock;
import actitimePOMClasses.ActitimeTasks;
import actitimePOMClasses.ActitimeUsersBlock;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ActitimeTestClass {
	ActitimeLoginPage a;
	ActitimeLogo b;
	ActitimeTasks c;
	ActitimeUsersBlock d;
	ActitimeReportBlock e;
	WebDriver driver;

	@Test(priority=1)
	public void verifyLogo() {
		b = new ActitimeLogo(driver);
		b.verifyLogo();
	}
	@Test(priority=2)
	public void verifyTasksBlock() {
		c = new ActitimeTasks(driver);
		c.tasksBlock();
		c.setName();
		c.verifyButton();
	}
	@Test(priority=3)
	public void reportsBlock() throws InterruptedException {
		e = new ActitimeReportBlock(driver);
		e.validateReport();
		e.dropdown();
		//e.selectOpt();
	}
	@Test(priority=4)
	public void usersBlock() {
		d = new ActitimeUsersBlock(driver);
		d.verifyUserBlock();
		d.verifyCreateUserBlock();
		d.verifyCloseButton();
	}
	@Test
	public void Login() {
		a = new ActitimeLoginPage(driver);
		a.setUsername();
		a.setPwd();
		a.verifyLoginButton();
	}

	@Test(priority=5)
	public void Logout() {
		b = new ActitimeLogo(driver);
		b.verifyLogoutButton();
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
