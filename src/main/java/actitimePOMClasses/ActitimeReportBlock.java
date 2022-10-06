package actitimePOMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeReportBlock {

	@FindBy(xpath ="(//img[@width='84'])[3]")
	private WebElement report;

	@FindBy(xpath="//div[@class='roundedBoxTag  straightBorder-left graphicButton dropdownButton']")
	private WebElement dropdown;
	
	@FindBy(xpath="//ul[@class='x-menu-list']//a")
	private List<WebElement> options;
	
	WebDriver driver;
	public	ActitimeReportBlock(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	public void validateReport() {
		report.click();
	}
	public void dropdown() throws InterruptedException {
		dropdown.click();
		Thread.sleep(1000);
	}
	public void selectOpt() {
		for(WebElement ch:options) {
			if((ch.getText()).equalsIgnoreCase("Staff Performance")) {
				ch.click();
				System.out.println("Clicked on "+ch.getText());
			}
		}
	}
}
