package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsAddNewTaskpage {
	WebDriver driver;
	@FindBy(xpath="//img[@class='brand-img mr-10']/following::span[8]")
	WebElement projectslink;
	public void  clickonprojects() {
		projectslink.click();
	}
	@FindBy (xpath="//*[@id='73']/div/div/div[1]/div[1]/a/img")
	WebElement projview;
	public void clickonprojectview() {
		projview.click();
	}
	@FindBy(xpath="//span[text()='Add New Task']")
	WebElement addnewtask;
	public void clickaddnewtask() {
		addnewtask.click();
	}
	@FindBy(xpath="//textarea[@name='task_name']")
	WebElement taskname;
	public void entertaskname(String tname) {
		taskname.sendKeys(tname);
}
	@FindBy(xpath="//textarea[@name='task_desc']")
	WebElement taskdesc;
	public void entertaskdescription(String taskde) {
		taskdesc.sendKeys(taskde);
}
	@FindBy(xpath="//input[@name='estimated_hrs']")
	WebElement estimatedhrs;
	public void enterhrs(String estm) {
		estimatedhrs.sendKeys(estm);
}
	@FindBy(xpath="//input[@name='task_start_date']")
	WebElement startdate;
	public void enterstartdate(String sdate) {
		startdate.sendKeys(sdate);
}
	@FindBy(xpath="//input[@name='task_end_date']")
	WebElement enddate;
	public void enterenddate(String edate) {
		enddate.sendKeys(edate);
}
	@FindBy(xpath="//button[@name='assign_emp_task']")
	WebElement savebutton;
	public void entersavebutton() {
		savebutton.click();
}
	
}
