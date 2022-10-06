package amazonTestClasses;

import org.testng.annotations.Test;

import amazonPOMClasses.AddToCart;
import amazonPOMClasses.AmazonHomePage;
import amazonPOMClasses.ClickOnProduct;
import amazonPOMClasses.PwdClass;
import amazonPOMClasses.SignOut;
import amazonPOMClasses.UsernameClass;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AmazonTest {
	WebDriver driver;
	UsernameClass a;
	PwdClass b;
	AmazonHomePage c;
	ClickOnProduct d;
	AddToCart e;
	SignOut f;

//	@Test(priority = 1,groups = {"login"}) 
	public void Verifyusername() {
		a.setUsername();
		a.verifyContButton();
	}
//	@Test(priority = 2,groups = {"login"})
	public void VerifyPass() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		b.setPass();
		b.verifySigninButton();
	}
	@Test(priority = 3,groups = {"search"})
	public void searchProduct() {
		c.verifyLogo();
		c.setProduct();
		c.verifySearchButton();
	}
	@Test(priority = 4)
	public void selectProduct() {
		d.selectProduct();
	}
	@Test(priority = 5)
	public void verifyCartButton() {
		e.VerifyCart();
	}
	//	@Test
	public void verifySignOut() throws InterruptedException {
		f.signOut();
	}
	@BeforeClass
	public void launchBrowsers() {
		System.out.println("Lanching chrome browser...");
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/gp/new-releases/?ref_=nav_cs_newreleases");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Fetching login details...");
		a = new UsernameClass(driver);
		b = new PwdClass(driver);
		c = new AmazonHomePage(driver);
		d = new ClickOnProduct(driver);
		e = new AddToCart(driver);
		f = new SignOut(driver);
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
