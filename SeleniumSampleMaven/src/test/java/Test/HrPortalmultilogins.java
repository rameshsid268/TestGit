package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HrPortalmultilogins {
	public static WebDriver driver;
	  Logger log = Logger.getLogger(Testlogs.class);
  @Test
  public void multiLogins() throws IOException {
	  String actualtitle = driver.getTitle();
		String exptitle ="DevRabbit Time Tracker";
		//Assert.assertEquals(exptitle, actualtitle);
	
	  FileInputStream fi = new FileInputStream("D:\\SeleniumPractise\\SeleniumSampleMaven\\Hrportalmultilogins.xls") ;
	  HSSFWorkbook we = new HSSFWorkbook(fi);
	  HSSFSheet s = we.getSheet("login");
	  int colcount= s.getRow(0).getPhysicalNumberOfCells();
	  System.out.println(colcount);
	  System.out.println(s.getLastRowNum());
	  DataFormatter formatter = new DataFormatter();
	  FileOutputStream fo = new FileOutputStream("D:\\SeleniumPractise\\SeleniumSampleMaven\\Hrportaoutput.xls");
	  HSSFWorkbook wo = new HSSFWorkbook();
	  HSSFSheet s1 = wo.createSheet("Results");
	 Row row = s1.createRow(0);
     Cell c = row.createCell(1);
	  for(int i =1;i<=s.getLastRowNum();i++) {
		  
		 String username= formatter.formatCellValue(s.getRow(i).getCell(0));
		 String password = formatter.formatCellValue(s.getRow(i).getCell(1));
		// String output = formatter.formatCellValue(s1.createRow(i).createCell(0));
		
		try {
			
		 driver.findElement(By.id("inputEmail")).sendKeys(username);
			log.info("Entered emailID");
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		log.info("Entered password");
			driver.findElement(By.xpath("//button[text()='sign in']")).click();
			log.info("Click on signin button");
			Assert.assertEquals(exptitle, actualtitle, "failed");
			driver.findElement(By.xpath("//*[@id='mobile_only_nav']/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//span[text()='Log Out']")).click();
			log.info("Click on logout button");
			//c.setCellValue(output);
			//c.setCellValue("passed");
			
	  } catch(Exception e) {
		c.setCellValue(i+"  failed");
		wo.write(fo);
		fo.close();
		wo.close();
		
		  System.out.println("Invalfid username or password   "+username+'/'+password);
	  }
		
		
	  }
  }		
  @BeforeTest
  public void beforeTest() {
	
		PropertyConfigurator.configure("./log4j.properties");
		System.setProperty("webdriver.chrome.driver","D:\\Raaam\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("chrome launched");
		driver.manage().window().maximize();
		driver.get("https://devrabbitdev.com/hr/web/timetracker/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
