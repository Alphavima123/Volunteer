package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantMgmt_GrantApplications 
{
	@FindBy(xpath ="(//li[@aria-label='Grant Applications'])[1]")private WebElement clickonGrantApplications;
	@FindBy(xpath ="//button[@aria-label='New']") private WebElement clickonNew;
	@FindBy(xpath ="//input[@aria-label='Name']") private WebElement Name;
    @FindBy(xpath ="//input[@aria-label='Date of Due Date']") private WebElement DueDate;
    @FindBy(xpath ="//input[@aria-label='Date of Submitted on']") private WebElement Submittedon;	 
    @FindBy(xpath ="//input[@aria-label='Amount Asked']") private WebElement AmountAsked;	 
	@FindBy(xpath ="//input[@aria-label='Amount Awarded']")private WebElement AmountAwarded;
	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
	@FindBy(xpath ="//div[text()='Assign']")private WebElement clickonAssign;
	@FindBy(xpath ="//button[@aria-label='Next Stage']")private WebElement clickonNext;
	@FindBy(xpath ="//textarea[@aria-label='Revision Reason']")private WebElement RevisionReason;
	@FindBy(xpath ="//button[@aria-label='Set Active']")private WebElement clickonSetActive;
	@FindBy(xpath ="//button[@aria-label='Refresh']")private WebElement clickonRefresh;
	
	@FindBy(xpath ="//button[@aria-label='Finish']")private WebElement clickonFinish;
	
	@FindBy(xpath ="//li[@aria-label='Grant Application Eligibility Criteria']")private WebElement clickonGrantApplicationEligibilityCriteria;
	@FindBy(xpath ="//button[@aria-label='New Grant Application Eligibility Criteria. Add New Grant Application Eligibility Criteria']") private WebElement clickonNewGrantappli;	 
	@FindBy(xpath ="//input[@aria-label='Name']")private WebElement Name1;
	@FindBy(xpath ="//button[@aria-label='Press Enter to go back.']")private WebElement clickonBackbutton;

	@FindBy(xpath ="//div[text()='Approve']")private WebElement clickonApprove;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;

	


	
	public GrantMgmt_GrantApplications (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonGrantMgmt(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		driver.findElement(By.xpath("//div[@id='AppDetailsSec_1_Item_12']")).click();
	//	clickonGrantSetup.click();
	}
	public void clickonGrantApplications()
	{
		clickonGrantApplications.click();
	}
	
	public void clickonNew()
	{
		clickonNew.click();
	}
	public void setCRMname(String name)
	{
		Name.sendKeys(name);
	}
	public void clickonBeneficiary(WebDriver driver)
	{
		WebElement Beneficiary = driver.findElement(By.xpath("//input[@aria-label='Beneficiary, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Beneficiary).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	
	public void clickonGrant(WebDriver driver)
	{
		WebElement Grant = driver.findElement(By.xpath("//input[@aria-label='Grant, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Grant).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	
	public void setCRMDueDate()
	{
		DueDate.sendKeys("8/20/2022");
	}

	public void setCRMSubmittedon()
	{
		Submittedon.sendKeys("8/25/2022");
	}
	public void clickonReviewer(WebDriver driver)
	{
		WebElement Reviewer = driver.findElement(By.xpath("//input[@aria-label='Reviewer, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Reviewer).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void setCRMAmountAsked(String amountAsked)
	{
		AmountAsked.sendKeys(amountAsked);
	}
	public void setCRMAmountAwarded(String amountAwarded)
	{
		AmountAwarded.sendKeys(amountAwarded);
	}
	public void clickonSave()
	{
		clickonSave.click();
	}
	public void clickonAssign()
	{
		clickonAssign.click();
	}
	public void clickonNext()
	{
		clickonNext.click();
	}
	public void clickonNeedRevision(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Need Revision']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(1);
	}
	public void setCRMRevisionReason(String revisionReason) {
		RevisionReason.sendKeys(revisionReason);
	}
	public void clickonSetActive()
	{
		clickonSetActive.click();
	}
	public void clickonRefresh()
	{
		clickonRefresh.click();
	}
	//click on assign
	//click on next
	//click on next
	public void clickonStatusReason(WebDriver driver)
	{
		WebElement Reviewer = driver.findElement(By.xpath("(//div[@aria-label='Status Reason'])[1]"));
		Actions act=new Actions(driver);
		act.click(Reviewer).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	//click on next
	public void clickonApprove()
	{
		clickonApprove.click();
	}
	public void clickonFinish()
	{
		clickonFinish.click();
	}
	public void clickonGrantApplicationEligibilityCriteria()
	{
		clickonGrantApplicationEligibilityCriteria.click();
	}
	public void clickonNewGrantappli()
	{
		clickonNewGrantappli.click();
	}
	public void setCRMName1(String name)
	{
		Name1.sendKeys(name);
	}
	public void clickonGrantEligibilityCriteria(WebDriver driver)
	{
		WebElement Reviewer = driver.findElement(By.xpath("//input[@aria-label='Grant Eligibility Criteria, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Reviewer).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonApplicantAnswer(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@id='id-f7021d9a-4eba-ec11-983f-0022483db20e-4-av_applicantsanswer3ef39988-22bb-4f0b-bbbe-64b5a3748aee-av_applicantsanswer.fieldControl-option-set-select']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(0);
	}
	//click on save
	public void clickonBackbutton()
	{
		clickonBackbutton.click();
	}
	
}
