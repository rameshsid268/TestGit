package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreportdemo {
static ExtentTest test;
static ExtentReports report;

@BeforeClass
public static void startTest() {
report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\ExtentReportResults.html");
test = report.startTest("ExtentDemo");
}

@Test
public void extentReportsDemo() {
	System.setProperty("webdriver.chrome.driver","D:\\Libraries\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
if (driver.getTitle().equals("Google")) {
test.log(LogStatus.PASS, "Navigated to the specified URL");
} else {
test.log(LogStatus.FAIL, "Test Failed");
}
}

@AfterClass
public static void endTest() {
report.endTest(test);
report.flush();
}
}