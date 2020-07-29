package HRportalPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Timesheetspage {
@FindBy (xpath="//span[text()='Timesheets']")
WebElement timesheets;
public void clicktimesheets() {
	timesheets.click();
}
@FindBy (xpath="//*[@id='heading_1']/a")
WebElement dateclick;
public void dateclick1() {
	dateclick.click();
}
}
