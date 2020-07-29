package Test;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testlogs {
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logger log = Logger.getLogger(Testlogs.class);
PropertyConfigurator.configure("./log4j.properties");

System.setProperty("webdriver.chrome.driver","D:\\Raaam\\chromedriver.exe");
driver = new ChromeDriver();
log.info("testing ram");
driver.manage().window().maximize();
log.info("testing ram");
	}


}
