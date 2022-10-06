package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends BaseClass{

	public static void main(String [] args) throws IOException {
		Screenshot a = new Screenshot();
		a.launchChrome();
		driver.navigate().to("https://www.amazon.in/");
		
		TakesScreenshot s =	((TakesScreenshot)driver);
		File src=s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\AllSetups\\setups\\eclipse_IDE_2021_12\\eclipse_IDE_2021_12\\MVN_Practice\\Screenshots\\Amazon.png");
		FileHandler.copy(src, dest);
		driver.quit();;
	}
}
