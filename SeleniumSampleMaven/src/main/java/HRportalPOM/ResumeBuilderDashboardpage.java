package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResumeBuilderDashboardpage {
WebDriver driver;
@FindBy(xpath="//span[text()='applied Leaves']//following::span[2]")
WebElement resumedashboard;
public void clickresumedashboard() {
	resumedashboard.click();
}
					
}
