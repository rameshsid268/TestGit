package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;
@FindBy(id = "inputEmail")
WebElement Email;
@FindBy(id = "inputPassword")
WebElement Password;
@FindBy(xpath = "//button[text()='sign in']")
WebElement submit;
public void login(WebDriver driver)
{
this.driver = driver;
PageFactory.initElements(driver, this);
}
public void setusername( String uname) {
	Email.sendKeys(uname);
}
public void setpassword(String password) {
	Password.sendKeys(password);
}
public void clicksignin() {
	submit.click();
}
}
