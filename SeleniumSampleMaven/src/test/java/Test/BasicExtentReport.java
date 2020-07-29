package Test;

import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.Rept;
import org.openqa.selenium.remote.ProtocolHandshake.Result;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {
	static ExtentTest test;
	ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	//Logger loger = Logger.getLogger(BasicExtentReport.class);
	
  @Test
  public void f() {
	  /*System.setProperty("webdriver.chrome.driver", "D:\\SubmittalExchange_TFS\\QA\\Automation\\3rdparty\\chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.co.in");*/
	  test = extent.createTest("Test Case 1", "PASSED test case");
      Assert.assertTrue(true);
	  
	  
  }
  @SuppressWarnings("deprecation")
@BeforeTest
  public void beforeTest() {
	
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
	  extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
     // htmlReporter.config().setChartVisibilityOnOpen(true);
      htmlReporter.config().setDocumentTitle("Extent Report Demo");
      htmlReporter.config().setReportName("Test Report");
    //  htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
      htmlReporter.config().setTheme(Theme.STANDARD);
      htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
  }

  @AfterTest
  public void afterTest() {
	 /* if(Rept.getStatus() == ITestResult.FAILURE) {
          test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
          test.fail(result.getThrowable());
      }
      else if(Result.getStatus() == ITestResult.SUCCESS) {
          test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
      }
      else {
          test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
          test.skip(result.getThrowable());
      }*/
  }

}
