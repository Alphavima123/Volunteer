package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_Opportunity_Schedule_page 
	{

	@FindBy(xpath="(//div[@title='Volunteer Management'])[2]")private WebElement clickonVolunteerMgmt;
	@FindBy(xpath="//span[text()='Opportunity Schedules']")private WebElement clickonOpportunitiesSchedule;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
	
//	@FindBy(xpath="(//div[@aria-label='Status Reason'])[2]")private WebElement clickonStatusReason ;
	@FindBy(xpath="//input[@aria-label='Job Title']")private WebElement JobTitle;
//	@FindBy(xpath="//input[@aria-label='Volunteer Opportunity, Lookup']")private WebElement VolunteerOpportunity;
	
	@FindBy(xpath="(//i[@data-icon-name='Calendar'])[1]")private WebElement StartDate;	
	@FindBy(xpath="//button[@aria-label='September']")private WebElement clickonMonth;
	@FindBy(xpath="//button[@aria-label='29, September, 2022']")private WebElement clickonDate;
	
	@FindBy(xpath="(//i[@data-icon-name='Calendar'])[2]")private WebElement EndDate;
	@FindBy(xpath="//button[@aria-label='September']")private WebElement clickonMonth1;
	@FindBy(xpath="//button[@aria-label='30, September, 2022']")private WebElement clickonDate1;
	
//	@FindBy(xpath="//span[@id='okButtonText_1']")private WebElement clickonCloseError;
	
	@FindBy(xpath="//button[@aria-label='Close']")private WebElement clickonOK;
//	@FindBy(xpath="//input[@aria-label='Date of End Date']")private WebElement EndDate;
//	@FindBy(xpath="//input[@aria-label='Time of End Date']")private WebElement TimeofEndDate;
	@FindBy(xpath="//input[@aria-label='Expected Hours Per Day']")private WebElement ExpectedHours;
	@FindBy(xpath="//button[@aria-label='Monday: No']")private WebElement WorkingDay;
	@FindBy(xpath="//span[text()='Save']")private WebElement clickonOnSave;

	
	
	public CRM_VOL_Opportunity_Schedule_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonVolunteerAap(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		clickonVolunteerMgmt.click();
	}
	public void clickonOpprotunitiesSchedule()
	{
		clickonOpportunitiesSchedule.click();
	}
	public void clickonNew()
	{
		clickonNew.click();
	}
	
	public void setCRMvolunteerpageJobTitle(String jobTitle)
	{
		JobTitle.clear();
		JobTitle.sendKeys(jobTitle);
	}
	public void clickonVolunteeropp(WebDriver driver)
	{
		WebElement Time = driver.findElement(By.xpath("//input[@aria-label='Volunteer Opportunity, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Time).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
//	public void setCRMvolunteerOpportunity(String volopp) throws InterruptedException
//	{
//		VolunteerOpportunity.clear();
//		Thread.sleep(2000);
//		VolunteerOpportunity.sendKeys(volopp);
//	}
	public void clickonStartdate()
	{
		StartDate.click();
	}
	public void clickonMonth()
	{
		clickonMonth.click();
	}
	public void clickonDate()
	{
		clickonDate.click();
	}
	public void clickonStartTime(WebDriver driver)
	{
		WebElement Time = driver.findElement(By.xpath("//i[@data-icon-name='Clock']"));
		Actions act=new Actions(driver);
		act.click(Time).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	
//	public void setCRMvolunteerOpportunityStartTime(String StartTime)
//	{
//		TimeofStartDate.sendKeys(StartTime);
//	}
	public void clickonEndDate()
	{
		EndDate.click();
	}
	public void clickonMonth1()
	{
		clickonMonth1.click();
	}
	public void clickonDate1()
	{
		clickonDate1.click();
	}
//	public void clickonClose()
//	{
//		clickonCloseError.click();                         //Issue is taking while creating the time
//	}
	
	
	public void clickonOK()
	{
		clickonOK.click();
	}
	public void clickonEndTime(WebDriver driver)
	{
		WebElement Time = driver.findElement(By.xpath("(//i[@data-icon-name='Clock'])[2]"));
		Actions act=new Actions(driver);
		act.click(Time).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
//	public void setCRMvolunteerSchedulepageEnddate(String username)
//	{
//		EndDate.sendKeys("09/30/2022");
//	}
//	public void setCRMvolunteerOpportunityEndTime(String EndTime)
//	{
//		TimeofEndDate.sendKeys(EndTime);
//	}
	public void setCRMvolunteerpageExpectedHours(String exphr) throws InterruptedException
	{
		ExpectedHours.clear();
		Thread.sleep(2500);
		ExpectedHours.sendKeys(exphr);
	}
	public void clickonWorkingDay()
	{
		WorkingDay.click();
	}
	public void clickonOnSave() 
	{
		clickonOnSave.click();
	}
	}