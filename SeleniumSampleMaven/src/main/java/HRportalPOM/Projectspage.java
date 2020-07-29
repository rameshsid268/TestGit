package HRportalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Projectspage {
WebDriver driver;
@FindBy(xpath="//img[@class='brand-img mr-10']/following::span[8]")
WebElement projectslink;
@FindBy(linkText ="Projects in Progress")
WebElement projectsinprogress;
@FindBy(linkText ="Archived Projects")
WebElement archivedprojects;
@FindBy(linkText ="Closed Projects")

WebElement closedprojects;
public void  clickprojects() {
	projectslink.click();
  //  projectsinprogress.click();
    archivedprojects.click();
    closedprojects.click();
	
}
@FindBy(xpath="//button[@id='new_project']")
WebElement addproject;
public void clickaddproject() {
	addproject.click();
}
@FindBy(id="project_name")
WebElement projectname;
public void enterprojname(String projname) {
	projectname.sendKeys(projname);
}

@FindBy(id="project_type")
WebElement projecttype;
public void enterprojtype(String projtype) {
	new Select(projecttype).selectByVisibleText(projtype);
}
@FindBy(name="start_date")
WebElement startdate; 
@FindBy(name="end_date")
WebElement enddate; 
public void enterstartdate(String statdate) {
	startdate.sendKeys(statdate);
}
public void enterenddate(String endate) {
	enddate.sendKeys(endate);
}
@FindBy(xpath="//textarea[@id='project_desc']")
WebElement projectdesc; 
public void projectdescription(String pd) {
	projectdesc.sendKeys(pd);
}
@FindBy(id="client_name")
WebElement clientname; 
public void clientname(String cname) {
	clientname.sendKeys(cname);;
}
@FindBy(id="email")
WebElement email; 
public void enteremail(String emai) {
	email.sendKeys(emai);
}
public void clickaddbutton() {
	addbutton.click();
}
@FindBy(xpath="//button[@id='add_project btn-sm']")
WebElement addbutton;
@FindBy(xpath="//*[@id='73']/div/div/div[1]/div[1]/a/img")
WebElement projectview;
public void clickonproject() {
	projectview.click();
}


}
