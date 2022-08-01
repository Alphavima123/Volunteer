package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantSetup_Grants
{

//	@FindBy(xpath ="//div[@title='Grant Setup']")private WebElement clickonGrantSetup;
	@FindBy(xpath ="//div[@title='Grants']") private WebElement clickonGrants;
	@FindBy(xpath ="//button[@aria-label='New']") private WebElement clickonNew;
	@FindBy(xpath ="//button[@aria-label='More Header Fields']")private WebElement clickonMoreHeaderFields;

	@FindBy(xpath ="//input[@aria-label='Name']") private WebElement Name;
    @FindBy(xpath ="//input[@aria-label='Version']") private WebElement Version;
    @FindBy(xpath ="") private WebElement Description;   // Iframe  madhe format lihch ahe
    @FindBy(xpath ="//input[@aria-label='Total Program Funding']") private WebElement TotalProgramFunding;	
    @FindBy(xpath ="//input[@aria-label='Expected Number of Awards']") private WebElement ExpectedNumberofAwards;	 
	@FindBy(xpath ="//input[@aria-label='Award Ceiling']")private WebElement AwardCeiling;
	@FindBy(xpath ="//input[@aria-label='Award Floor']")private WebElement AwardFloor;
	@FindBy(xpath ="//input[@aria-label='Fiscal Year']") private WebElement FiscalYear;	 
	@FindBy(xpath ="//input[@aria-label='Date of Application Open Date']")private WebElement ApplicationOpenDate;
	@FindBy(xpath ="//input[@aria-label='Date of Application Close Date']")private WebElement ApplicationCloseDate;
	@FindBy(xpath ="//input[@aria-label='Date of Award Start Date']")private WebElement AwardStartDate;

	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;

	@FindBy(xpath ="//li[@aria-label='Grant Eligibility Criteria']")private WebElement clickonGrantEligibilityCriteria;
	@FindBy(xpath ="//button[@aria-label='New Gant Eligibility Criteria. Add New Gant Eligibility Criteria']")private WebElement clickonNewGantEligibilityCriteria;
	@FindBy(xpath ="//input[@aria-label='Name']")private WebElement Name1;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;

	
	public GrantSetup_Grants (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonGrantSetup(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		driver.findElement(By.xpath("(//div[@style='display: inline-block; vertical-align: top; float: left; position: relative;'])[13]")).click();
	//	clickonGrantSetup.click();
	}
	public void clickonGrants()
	{
		clickonGrants.click();
	}
	
	public void clickonNew()
	{
		clickonNew.click();
	}
	public void clickonMoreHeaderFields()
	{
		clickonMoreHeaderFields.click();
	}
	public void clickonStatusReason(WebDriver driver)
	{
		WebElement Statusreason = driver.findElement(By.xpath("(//div[@aria-label='Status Reason'])[2]"));
		Actions act=new Actions(driver);
		act.click(Statusreason).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void setCRMname(String name)
	{
		Name.sendKeys(name);
	}
	public void clickonAgency(WebDriver driver)
	{
		WebElement Agency = driver.findElement(By.xpath("//button[@aria-label='Search records for Agency, Lookup field']"));
		Actions act=new Actions(driver);
		act.click(Agency).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonCategory(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Category']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(4);
	}
	public void setCRMVersion(String version)
	{
		Version.sendKeys(version);
	}
	public void setCRMDescription(WebDriver driver, String discription )
	{
	//	driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@aria-label='Description rich text editor']")));
		driver.findElement(By.xpath("//body[@aria-label='Press ALT 0 for help']")).sendKeys(discription);
	}
	//Description iframe wala poit ahe
	public void setCRMTotalProgramFunding(String programFunding)
	{
		TotalProgramFunding.sendKeys(programFunding);
	}
	public void setCRMExpectedNumberofAwards(String Expertnumber)
	{
		ExpectedNumberofAwards.sendKeys(Expertnumber);
	}
	public void setCRMAwardCeiling(String awardCeiling)
	{
		AwardCeiling.sendKeys(awardCeiling);
	}
	public void setCRMAwardFloor(String awardFloor)
	{
		AwardFloor.sendKeys(awardFloor);
	}
	public void setCRMFiscalYear(String fiscalYear)
	{
		FiscalYear.sendKeys(fiscalYear);
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
	public void setCRMApplicationOpenDate()
	{
		ApplicationOpenDate.sendKeys("8/25/2022");
	}
	public void setCRMApplicationCloseDate()
	{
		ApplicationCloseDate.sendKeys("8/29/2022");
	}
	public void setCRMAwardStartDate(String StartDate)
	{
		AwardStartDate.sendKeys("8/26/2022");
	}
	public void clickonSave()
	{
		clickonSave.click();
	}
	public void clickonGrantEligibilityCriteria()
	{
		clickonGrantEligibilityCriteria.click();
	}
	public void clickonNewGantEligibilityCriteria()
	{
		clickonNewGantEligibilityCriteria.click();
	}
	public void setCRMName1(String name1)
	{
		Name1.sendKeys(name1);
	}
	public void clickonEligibilityCriteria(WebDriver driver)
	{
		WebElement Reviewer = driver.findElement(By.xpath("//input[@aria-label='Eligibility Criteria, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Reviewer).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonDisplayinPortal(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Display in Portal']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(0);
	}
	public void clickonCriteriaRequirement(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Criteria Requirement']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(2);
	}
	//click on save
//	public void setCRMName1(String td) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void clickonEligibilityCriteria(WebDriver driver) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void clickonDisplayinPortal(WebDriver driver) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void clickonCriteriaRequirement(WebDriver driver) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
