package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RequestLeavepage {
	WebDriver driver;
@FindBy (xpath="//span[text()='Request for Leave']")
WebElement requestleave;
public void clickonrequestleave() {
	requestleave.click();
}
@FindBy (xpath="//input[@id='from']")
WebElement startdate;
public void enterStardate(String fromdate) {
 startdate.sendKeys(fromdate);
}
@FindBy (xpath="//input[@id='to']")
WebElement enddate;
public void enterenddate(String todate) {
 enddate.sendKeys(todate);
}
@FindBy (xpath="//input[@id='resume']")
WebElement resumedate;
public void enterresumedate(String redate) {
 resumedate.sendKeys(redate);
}
@FindBy (xpath="//select[@id='leavetype']")
WebElement leavetype;
public void selectleavetype(String letype) {
	new Select(leavetype).selectByVisibleText(letype);
}
@FindBy (xpath="//textarea[@id='reason']")
WebElement reason;
public void enterreason(String res) {
 reason.sendKeys(res);
}
@FindBy (xpath="//select[@id='leavetype']//following::input[5]")
WebElement submit;
public void clickonsubmit() {
 submit.click();
}
@FindBy (xpath="//button[text()='Yes, Continue']")
WebElement yestocontinue;
public void clickonyestocont() {
 yestocontinue.click();
}
}
