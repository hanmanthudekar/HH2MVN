package demoOpenCartTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class OpenCartBase {

public static WebDriver driver;
	public static String ssPath="C:\\Setups\\setups\\Screenshot_From_Selenium";
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demo.opencart.com/admin/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void takeScreenshot()  {
		String path = "C:\\velocityTraining\\setups\\Screenshot_From_Selenium";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void screenshot (String failedMethodName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(ssPath + failedMethodName + "Failed.png");
		FileHandler.copy(src, dest);
		
		System.out.println("\nFailed Method name is : " + failedMethodName);
		//System.out.println(dest);
		
	}

}
