package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_volunteer_Applications 
	{

	@FindBy(xpath="(//div[@title='Volunteer Management'])[2]")private WebElement clickonVolunteerMgmt;
	@FindBy(xpath="//span[text()='Volunteer Applications']")private WebElement clickonVolunteerApplications;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
//	@FindBy(xpath="//input[@aria-label='Opportunity, Lookup']")private WebElement Opportunity;
//	@FindBy(xpath="//input[@aria-label='Applicant, Lookup']")private WebElement Applicant;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
	@FindBy(xpath="//div[text()='Applicant Information']")private WebElement clickonApplicantInformation;
	@FindBy(xpath="//button[@aria-label='Next Stage']")private WebElement clickonNext;
	@FindBy(xpath="//button[@aria-label='Close']")private WebElement clickonclose;
	@FindBy(xpath="//select[@aria-label='Application Status']")private WebElement ApplicationStatus;
	@FindBy(xpath="//div[text()='Schedule Interview']")private WebElement clickonScheduleInterview;
	@FindBy(xpath="//button[@aria-label='Next Stage']")private WebElement clickonNext1;
	@FindBy(xpath="//button[@aria-label='Next Stage']")private WebElement clickonNext2;
	@FindBy(xpath="//button[@aria-label='Next Stage']")private WebElement clickonNext3;
	@FindBy(xpath="//button[@aria-label='Next Stage']")private WebElement clickonNext4;
	@FindBy(xpath="//button[@aria-label='Finish']")private WebElement clickoFinish;



	public CRM_VOL_volunteer_Applications  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonVolunteerAap(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		clickonVolunteerMgmt.click();
	}
	public void clickonVolunteerApplication()
	{
		clickonVolunteerApplications.click();
	}
	public void clickonNew()
	{
		clickonNew.click();
	}
	
	public void clickonOpportunity(WebDriver driver)
	{
		WebElement Opportunity = driver.findElement(By.xpath("//input[@aria-label='Opportunity, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Opportunity).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	public void clickonApplicant(WebDriver driver)
	{
		WebElement Applicant = driver.findElement(By.xpath("//input[@aria-label='Applicant, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Applicant).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	public void clickonSave() 
	{
		clickonSave.click();
	}
	public void clickonApplicantInformation() 
	{
		clickonApplicantInformation.click();
	}
	public void clickonNext() 
	{
		clickonNext.click();
	}
	public void clickonclose() 
	{
		clickonclose.click();
	}
	
	public void clickonApplicationStatus(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Application Status']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonInterviewScheduled(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Interview Scheduled']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonInterviewCompleted(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Interview Completed']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonCandidateStatus(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Candidate Status']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonOfferAcceptance(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Offer Acceptance']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonOrientationScheduled(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Orientation Scheduled']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonFirstShiftScheduled(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='First Shift Scheduled']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonScheduleInterview()
	{
		clickonScheduleInterview.click();
	}
	public void clickonNext1()
	{
		clickonNext1.click();
	}
	public void clickonCandidateStatus1(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("(//select[@aria-label='Candidate Status'])[2]"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonNext2()
	{
		clickonNext2.click();
	}
	public void clickonCertificationsCompleted(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Certifications Completed']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonTrainingsCompleted(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Trainings Completed']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonReferenceChecksCompleted(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Reference Checks Completed']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonPoliceRecordCheckSeen(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Police Record Check Seen']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(0);	
	}
	public void clickonDriverAbstractAvailable(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Reference Checks Completed']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonQualificationsVerified(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Qualifications Verified']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonNext3()
	{
		clickonNext3.click();
	}
	
	public void clickonVolunteerStatus(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Volunteer Status']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonTemporaryBreak(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Temporary Break']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonTermConcluded(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Term Concluded']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonNext4()
	{
		clickonNext4.click();
	}
	public void clickonOfferAcceptance1(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("(//select[@aria-label='Offer Acceptance'])[2]"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickoFinish()
	{
		clickoFinish.click();
	}
	
	}