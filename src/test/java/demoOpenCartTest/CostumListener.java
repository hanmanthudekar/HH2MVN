package demoOpenCartTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CostumListener extends OpenCartBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test scenario execution started");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test scenario passed succesfully..");
	}
	
	public void onTestFailure(ITestResult result) {

		System.out.println("Ohhh Shit !!! Test case failed");

		String failedMethodName = result.getName().trim();
		//System.out.println("\n Name is : \t " + result.getName());

		try {
			screenshot(failedMethodName);
			System.out.println("Screen shot captured");
		}catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Screenshot captured");		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped..");
	}	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	public void onStart(ITestContext context) {
		System.out.println("Testing of user story started");
	}
	public void onFinish(ITestContext context) {

		System.out.println("Testing Of User Story completed");	
	}

}
