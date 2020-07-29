package HRPortalGit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlist {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Libraries\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
		List<WebElement> eles = driver.findElements(By.xpath("//input"));
		for (WebElement element : eles) {
			System.out.println(element.getAttribute("id"));
			//System.out.println("tetststst");
	}
	}
}
