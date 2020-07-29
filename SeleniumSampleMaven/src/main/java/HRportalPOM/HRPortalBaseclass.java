package HRportalPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class HRPortalBaseclass {
public void timetosleep(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
}
}
