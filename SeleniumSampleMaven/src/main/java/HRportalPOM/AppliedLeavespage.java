package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AppliedLeavespage {
WebDriver driver;
@FindBy(xpath="//span[text()='applied Leaves']")
WebElement appliedleaves;
public void clickonAppliedleaves() {
	appliedleaves.click();
}
@FindBy(xpath="//select[@id='status'] ")
WebElement status;
public void selectStatus(String name) {
	new Select(status).selectByVisibleText(name);
}
@FindBy(xpath="//select[@id='status']//following::i[1]")
WebElement editbutton;
public void clickoneditbutton() {
editbutton.click();
}
@FindBy(xpath="//input[@id='submit']")
WebElement updateleave;
public void clickonupdateLeave() {
updateleave.click();
}
@FindBy (xpath="//button[text()='Yes, Continue']")
WebElement yestocontinue;
public void clickonyestocont() {
 yestocontinue.click();
}
@FindBy(xpath="//select[@id='status']//following::i[2]")
WebElement blockbutton;
public void clickonblockbutton() throws InterruptedException {
blockbutton.click();

}
}
