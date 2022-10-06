package actitimePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasks {

	@FindBy(xpath ="(//img[@height='93'])[4]")
	private WebElement tasksBlock;

	@FindBy(xpath ="//input[@name='visiableFilterString']")
	private WebElement name;

	@FindBy(xpath ="//input[@name='searchTasks']")
	private WebElement apply;

	WebDriver driver;

	public 	ActitimeTasks(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public void tasksBlock() {
		tasksBlock.click();
	}
	public void setName() {
		name.sendKeys("Hanmant");
	}
	public void verifyButton() {
		apply.click();
		System.out.println(" Test scenario passed");
	}
}
