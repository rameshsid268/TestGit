package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage {
WebDriver driver;
@FindBy(xpath ="//span[text()='Dashboard']")
WebElement dashboard;
public void clickdashboard() {
	dashboard.click();
}
}
