package HRPortalGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRPortalLogin {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		    driver.get("https://devrabbitdev.com/hr/web/timetracker/login");					
		    driver.findElement(By.id("inputEmail")).sendKeys("ramesh.siddagani@devrabbit.com");
			  driver.findElement(By.id("inputPassword")).sendKeys("123456");
			  driver.findElement(By.xpath("//button[text()='sign in']")).click();	
	}

}
