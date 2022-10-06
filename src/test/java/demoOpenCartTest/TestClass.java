package demoOpenCartTest;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(demoOpenCartTest.CostumListener.class)
public class TestClass extends OpenCartBase {	
	@BeforeMethod
	public void f() {
		launchChrome();
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
	@Test
	public void test1( ) {		
		Assert.assertNull(driver);
	}
	@Test
	public void test2() {
		Assert.assertFalse(10<12);
	}
}
