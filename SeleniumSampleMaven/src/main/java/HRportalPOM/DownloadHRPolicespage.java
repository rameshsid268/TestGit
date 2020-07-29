package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadHRPolicespage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='applied Leaves']//following::span[4]")
	WebElement downloadhrpolicies;
	public void clickhrpolicies() {
		downloadhrpolicies.click();
	}

}
