package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logoutpage {
WebDriver driver;
@FindBy (xpath ="//*[@id='mobile_only_nav']/ul/li[2]/a")
WebElement profile;
@FindBy(xpath ="//span[text()='Log Out']")
WebElement logout;
public void clicklogout() {
	profile.click();
	logout.click();
}
}
