package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("wedriver.chrome.driver","D:\\Libraries\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Raaam\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
driver.getTitle();
System.out.println(driver.getTitle());
	}

}
