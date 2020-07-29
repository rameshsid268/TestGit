package HRportalPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeeklyActivitypage {
	@FindBy (xpath="//span[text()='Weekly Activity']")
	WebElement weeklyactivity;
	public void clickonweeklyactivity() {
		weeklyactivity.click();
	}
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/a/span")
	WebElement addnewactivity;
	public void addnewact() {
		addnewactivity.click();
	}
	@FindBy(xpath="//textarea[@id='activity0']")
	WebElement textarea;
	public void enteractivity(String act) {
	textarea.sendKeys(act);
		}
	@FindBy(xpath="//button[@id='add_current_activity']")
	WebElement savebutton;
	public void clickonsave() {
	savebutton.click();
		}
	
}
