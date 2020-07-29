package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestDataProvider {
	public static WebDriver driver;
  @Test(dataProvider ="login")
  public void login(String email,String password) {
	  System.setProperty("webdriver.chrome.driver","D:\\Raaam\\chromedriver.exe");

	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
	  driver.findElement(By.id("inputEmail")).sendKeys(email);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='sign in']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

  @DataProvider(name ="login")
  public Object[][] getDataFromDatprovider(){
	  return new  Object [][]
			  {
		  {"ramesh.siddagani@devrabbit.com","123456"},
		  {"viswanath.mallichetty@devrabbit.com","123456"},
		  {"jyothy.alugala@devrabbit.com","123456"},
			  };
  }

}



