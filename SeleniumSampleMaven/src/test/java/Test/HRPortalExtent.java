package Test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class HRPortalExtent {
	static ExtentTest test;
	static ExtentReports report;

  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver","D:\\Libraries\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
	  driver.findElement(By.id("inputEmail")).sendKeys("ramesh.siddagani@devrabbit.com");
		driver.findElement(By.id("inputPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='sign in']")).click();
		String aft= driver.getTitle();
		System.out.println("Dashboard title is"+aft);
		
		
	  if (aft.equals("DevRabbit Time Tracker")) {
	  test.log(LogStatus.PASS, "Navigated to the specified URL");
	  } else {
	  test.log(LogStatus.FAIL, "Test Failed");
	  }
  }
  @BeforeClass
  public void beforeTest() {

report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\ExtentReportResults1.html");
test = report.startTest("ExtentDemo");
  }

  @AfterClass
  public void afterTest() {
	  report.endTest(test);
	  report.flush();

  }

}
