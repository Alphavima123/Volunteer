package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Opportunity_1
{
	@FindBy(xpath ="//textarea[@aria-label='Description']")private WebElement Description2;
	@FindBy(xpath ="//li[@aria-label='Grant Details']") private WebElement clickonGrantDetails;
	@FindBy(xpath ="//input[@aria-label='Title of Grant']") private WebElement TitleofGrant;
	@FindBy(xpath ="//input[@aria-label='Application Reference ID']") private WebElement ApplicationReference;
	@FindBy(xpath ="//input[@aria-label='Date of Due Date']") private WebElement DueDate;
    @FindBy(xpath ="//textarea[@aria-label='Notes']") private WebElement Notes;
    @FindBy(xpath ="//input[@aria-label='Minimum Funding']") private WebElement MinimumFunding; 
    @FindBy(xpath ="//input[@aria-label='Maximum Funding']") private WebElement MaximumFunding;	
    @FindBy(xpath ="//input[@aria-label='Actual Revenue']") private WebElement ActualRevenue;	 
	@FindBy(xpath ="//div[text()='Cultivate']")private WebElement clickonCultivate;
	@FindBy(xpath ="//input[@aria-label='Date of Introductory Meeting']")private WebElement DateofIntroductory;
 //   @FindBy(xpath ="//select[@aria-label='Grant Type']") private WebElement GrantType; 
    @FindBy(xpath ="//button[@aria-label='Next Stage']") private WebElement clickonNext; 
    @FindBy(xpath ="//span[text()='Create Grant Application']")private WebElement clickonGrantApplication;
    @FindBy(xpath ="//input[@aria-label='Date of Due Date']")private WebElement DueDate2;
    @FindBy(xpath ="//input[@aria-label='Date of Submitted on']")private WebElement DateofSubmitted;
    @FindBy(xpath ="//textarea[@aria-label='Reason']")private WebElement Reason;
    @FindBy(xpath ="//div[text()='Draft Application']")private WebElement clickonDraftApplication;
    @FindBy(xpath ="//li[@aria-label='Documents']")private WebElement clickonDocuments;
    @FindBy(xpath ="//button[@aria-label='Upload']")private WebElement clickonUpload;
    @FindBy(xpath ="//button[@aria-label='OK']")private WebElement clickonOK2;    
    @FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;    
    @FindBy(xpath ="//input[@aria-label='Awarded Amount']")private WebElement AwardedAmount;
    @FindBy(xpath ="//input[@aria-label='Revision Reason']")private WebElement RevisionReason;
	@FindBy(xpath ="(//textarea[@aria-label='Description'])[2]")private WebElement Description3;
	@FindBy(xpath ="//button[@aria-label='Finish']")private WebElement clickonFinish;

	
	
	public CRM_Opportunity_1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonAccount(WebDriver driver)
	{
		WebElement Account = driver.findElement(By.xpath("//input[@aria-label='Account, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Account).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void setCRMopportunityDescription2(String description)
	{
		Description2.sendKeys(description);
	}
	public void clickonEngagementLevel(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Engagement Level']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(2);
	}
	public void clickonGrantApplicationAttachmentData(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Grant Application Attachment Data']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(1);
	}
	public void clickonGrantDetails()
	{
		clickonGrantDetails.click();
	}
	public void setCRMopportunityTitleofGrant(String titlegrant)
	{
		TitleofGrant.sendKeys(titlegrant);
	}
	public void setCRMopportunityApplicationReference(String Application)
	{
		ApplicationReference.sendKeys(Application);
	}
	public void clickonFiscalSponsor(WebDriver driver)
	{
		WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Fiscal Sponsor, Lookup']"));
		Actions act=new Actions(driver);
		act.click(cause).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonsetCRMopportunityDueDate(String date)
	{
		DueDate.sendKeys("10/22/2022");
	}
	public void clickonGrantPeriod(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Grant Period']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(2);
	}
	public void setCRMopportunityNotes(String notes)
	{
		Notes.sendKeys(notes);
	}
	public void setCRMopportunityMinimumFunding(String minimum)
	{
		MinimumFunding.sendKeys(minimum);
	}
	public void setCRMopportunityMaximumFunding(String maximum)
	{
		MaximumFunding.sendKeys(maximum);
	}
	public void setCRMopportunityActualRevenue(String actual)
	{
		ActualRevenue.sendKeys(actual);
	}
	public void clickonType(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(2);
	}
	public void clickonProject(WebDriver driver)
	{
		WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Project, Lookup']"));
		Actions act=new Actions(driver);
		act.click(cause).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonInternalContact(WebDriver driver)
	{
		WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Internal Contact, Lookup']"));
		Actions act=new Actions(driver);
		act.click(cause).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonCultivate()
	{
		clickonCultivate.click();
	}
	public void setCRMopportunityDateofIntroductory(String date)
	{
		DateofIntroductory.sendKeys("10/20/2022");
	}
	public void clickonGrantType(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Grant Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(1);
	}
	public void clickonNext()
	{
		clickonNext.click();
	}
	public void clickonGrantApplication()
	{
		clickonGrantApplication.click();
	}
	public void setCRMopportunityDueDate2(String date)
	{
		DueDate2.sendKeys("10/23/2022");
	}
	public void setCRMDateofSubmitted(String date)
	{
		DateofSubmitted.sendKeys("10/24/2022");
	}
	public void clickonReviewer(WebDriver driver)
	{
		WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Reviewer, Lookup']"));
		Actions act=new Actions(driver);
		act.click(cause).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonNeedRevision(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Need Revision']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(0);
	}
	public void setCRMopportunityReason(String reason)
	{
		Reason.sendKeys(reason);
	}
	public void clickonDocuments()
	{
		clickonDocuments.click();
	}
	public void clickonUpload()
	{
		clickonUpload.click();
	}
	public void clickonOverwriteexisting(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Overwrite existing files']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(1);
	}
	public void clickonOK2()
	{
		clickonOK2.click();
	}
	public void clickonSave()
	{
		clickonSave.click();
	}
	public void clickonDraftApplication()
	{
		clickonDraftApplication.click();
	}
	//click on next
	//click on revision
	//click on next
	//click on next
	public void clickonGrantApplicationStatus(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Grant Application Status']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(1);
	}
	//click on next
	public void setCRMopportunityAwardedAmount(String amount)
	{
		AwardedAmount.sendKeys(amount);
	}
	public void setCRMopportunityRevisionReason(String reavision)
	{
		RevisionReason.sendKeys(reavision);
	}
	//click on next
	public void setCRMopportunityDescription3(String description)
	{
		Description3.sendKeys(description);
	}
	public void clickonFinish()
	{
		clickonFinish.click();
	}
}
