package Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HrPortal {
public static WebDriver driver;
Logger log = Logger.getLogger(Testlogs.class);
	@BeforeTest
	public void  launchchrome() {
		Logger log = Logger.getLogger(Testlogs.class);
		PropertyConfigurator.configure("./log4j.properties");
		System.setProperty("webdriver.chrome.driver","D:\\Raaam\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("chrome launched");
		driver.manage().window().maximize();
		driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
		
		String actualtitle = driver.getTitle();
		String exptitle ="DevRabbit Time Tracker";
		//Assert.assertEquals(exptitle, actualtitle);
		Assert.assertEquals(exptitle, actualtitle, "failed");
		//Boolean tr = driver.getTitle().equalsIgnoreCase(exptitle);
	//	assertTrue(tr);
		
	}
	@Test(priority=1)
	public void login() throws InterruptedException {
		driver.findElement(By.id("inputEmail")).sendKeys("ramesh.siddagani@devrabbit.com");
		driver.findElement(By.id("inputPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='sign in']")).click();
		
		String aft= driver.getTitle();
		System.out.println("Dashboard title is"+aft);
		log.info("Login successful");
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	}
	@Test(priority=2)
	public void dashboard() throws InterruptedException {
		driver.findElement(By.xpath("//img[@class='brand-img mr-10']/following::span[7]")).click();
		//Thread.sleep(6000);
		log.info("Clicked on dashboard");	
	}
	@Test(enabled =false)
	public void alllinks() throws InterruptedException {
		List<WebElement>alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=1;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
			
		}
		//Thread.sleep(5000);
				}
	@Test(priority=3)
	public void projects() throws InterruptedException {
		driver.findElement(By.xpath("//img[@class='brand-img mr-10']/following::span[8]")).click();
		Thread.sleep(6000);
		//driver.findElement(By.linkText("Projects in Progress")).click();
		driver.findElement(By.linkText("Archived Projects")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Closed Projects")).click();
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void addprojects() throws InterruptedException {
		String   parentHandle = driver.getWindowHandle();
		  driver.findElement(By.xpath("//button[@id='new_project']")).click();
		  log.info("Click on add new project");
		  Set<String> handles = driver.getWindowHandles();
			for (String windowHandles : handles) {
				System.out.println(windowHandles);
				driver.switchTo().window(windowHandles);
				Thread.sleep(5000);
				driver.findElement(By.id("project_name")).sendKeys("Test44");
				new Select(driver.findElement(By.id("project_type"))).selectByVisibleText("Non-Billable");
				driver.findElement(By.name("start_date")).sendKeys("07072020");
				driver.findElement(By.name("end_date")).sendKeys("10082020");
				driver.findElement(By.xpath("//textarea[@id='project_desc']")).sendKeys("testtsts");
				driver.findElement(By.id("client_name")).sendKeys("testclient");
				driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
				//driver.findElement(By.id("project_logo")).sendKeys("C:\\Users\\prash\\OneDrive\\Desktop\\sam.jpg\r\n" + 
					//	"");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@id='add_project btn-sm']")).click();
				Thread.sleep(8000);
			}

	}
	@AfterTest
	public void closechrome() {
		//driver.close();
	}
}
