package HRportalPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class HRPortalTest {
	WebDriver driver;
  @Test(priority=1)
  public void login() {
	  Loginpage login =  
	           PageFactory.initElements(driver, 
	           Loginpage.class); 
     login.setusername("ramesh.siddagani@devrabbit.com");
	  login.setpassword("123456");
	  login.clicksignin();
  }
  @Test(priority=2)
  public void dashBoard() {
	  Dashboardpage ds =PageFactory.initElements(driver,Dashboardpage.class);
	  ds.clickdashboard();
  }
  @Test(enabled=false)
  public void logout() {
	  Logoutpage lo =PageFactory.initElements(driver,Logoutpage.class);
	  lo.clicklogout();
  }
  @Test(priority=3)
  public void projectslink() {
	  Projectspage project =PageFactory.initElements(driver,Projectspage.class);
	  project.clickprojects();
  }
  @Test(enabled=false)
  public void projects() {
	  Projectspage project1 =PageFactory.initElements(driver,Projectspage.class);
	 project1.clickaddproject();
	 String   parentHandle = driver.getWindowHandle();
	 // driver.findElement(By.xpath("//button[@id='new_project']")).click();
new HRPortalBaseclass().timetosleep(driver);
	  Set<String> handles = driver.getWindowHandles();
		for (String windowHandles : handles) {
			System.out.println(windowHandles);
			driver.switchTo().window(windowHandles);
			project1.enterprojname("testing project");
			project1.enterprojtype("Non-Billable");
			project1.enterstartdate("07012020");
			project1.enterenddate("07302020");
			project1.projectdescription("Testdescription");
			project1.clientname("testclientname");
			project1.enteremail("Test1@gmail.com");
			project1.clickaddbutton();
		}
		driver.switchTo().window(parentHandle);
		new HRPortalBaseclass().timetosleep(driver);
  }
  @Test(enabled=false)
  public void addNewTask() throws InterruptedException {
	  ProjectsAddNewTaskpage addnewtask1 =PageFactory.initElements(driver,ProjectsAddNewTaskpage.class);
	  addnewtask1.clickonprojects();
	  addnewtask1.clickonprojectview();
	  addnewtask1.clickaddnewtask();
	  String   parentHandle = driver.getWindowHandle();
		 // driver.findElement(By.xpath("//button[@id='new_project']")).click();
	new HRPortalBaseclass().timetosleep(driver);
		  Set<String> handles = driver.getWindowHandles();
			for (String windowHandles : handles) {
				System.out.println(windowHandles);
				driver.switchTo().window(windowHandles);
				Thread.sleep(5000);
				addnewtask1.entertaskname("testing");
				addnewtask1.entertaskdescription("testdescription");
				addnewtask1.enterstartdate("070102020");
				addnewtask1.enterenddate("07302020");
				addnewtask1.enterhrs("8");
				addnewtask1.entersavebutton();
			}
  }
  
  @Test(enabled=false)
  public void timesheet()
  {
	  Timesheetspage time =PageFactory.initElements(driver,Timesheetspage.class);
	  time.clicktimesheets();
	  time.dateclick1();
	  
  }
  @Test(enabled=false)
  public void weeklyActivity() throws InterruptedException {
	  WeeklyActivitypage activity =PageFactory.initElements(driver,WeeklyActivitypage.class);
	  activity.clickonweeklyactivity();
	  activity.addnewact();
	  String   parentHandle = driver.getWindowHandle();
		 // driver.findElement(By.xpath("//button[@id='new_project']")).click();
	new HRPortalBaseclass().timetosleep(driver);
		  Set<String> handles = driver.getWindowHandles();
			for (String windowHandles : handles) {
				System.out.println(windowHandles);
				driver.switchTo().window(windowHandles);
				Thread.sleep(5000);
				activity.enteractivity("test");
				activity.clickonsave();
			}
  }
  @Test(enabled=false)
  public void leaveRequest() throws InterruptedException {
	  RequestLeavepage leave =PageFactory.initElements(driver,RequestLeavepage.class);
	  leave.clickonrequestleave();
	  leave.enterStardate("03042020");
	  leave.enterenddate("03042020");
	  leave.enterresumedate("03042020");
	  leave.selectleavetype("Casual Leave");
	  leave.enterreason("test");
	  Thread.sleep(10000);
	  leave.clickonsubmit();
	  
	  String   parentHandle = driver.getWindowHandle();
		 // driver.findElement(By.xpath("//button[@id='new_project']")).click();
	new HRPortalBaseclass().timetosleep(driver);
		  Set<String> handles = driver.getWindowHandles();
			for (String windowHandles : handles) {
				System.out.println(windowHandles);
				driver.switchTo().window(windowHandles);
				Thread.sleep(5000);
				leave.clickonyestocont();
			}
	  
  }
  @Test(priority=4)
  public void appliedLeaves() throws InterruptedException {
	  AppliedLeavespage appleave =PageFactory.initElements(driver,AppliedLeavespage.class);
	  appleave.clickonAppliedleaves();
	  appleave.selectStatus("Approved");
	  Thread.sleep(5000);
	  appleave.selectStatus("Pending");
	  appleave.clickoneditbutton();
	  appleave.clickonupdateLeave();
	  Thread.sleep(6000);
	  appleave.clickonyestocont();
	  appleave.clickonblockbutton();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  appleave.selectStatus("Cancelled");
  }
  @Test(priority=5)
  public void resumeDashBoard() {
	  ResumeBuilderDashboardpage redashboard =PageFactory.initElements(driver,ResumeBuilderDashboardpage.class);
	  redashboard.clickresumedashboard();
  } 
  @Test(priority=6)
  public void downloadhrpolicies() {
	  DownloadHRPolicespage downloadhr =PageFactory.initElements(driver,DownloadHRPolicespage.class);
	  downloadhr.clickhrpolicies();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Raaam\\chromedriver.exe");
		driver = new ChromeDriver();
		//log.info("chrome launched");
		driver.manage().window().maximize();
		driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
