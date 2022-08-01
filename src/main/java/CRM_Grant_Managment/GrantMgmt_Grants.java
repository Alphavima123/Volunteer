package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantMgmt_Grants 
{

//	@FindBy(xpath ="//div[@title='Grant Setup']")private WebElement clickonGrantSetup;
	@FindBy(xpath ="//div[@title='Grants']") private WebElement clickonGrants;
	@FindBy(xpath ="//button[@aria-label='New']") private WebElement clickonNew;
	@FindBy(xpath ="//button[@aria-label='More Header Fields']")private WebElement clickonMoreHeaderFields;

	@FindBy(xpath ="//input[@aria-label='Name']") private WebElement Name;
    @FindBy(xpath ="//input[@aria-label='Version']") private WebElement Version;
    @FindBy(xpath ="//input[@aria-label='Total Program Funding']") private WebElement TotalProgramFunding;	
    @FindBy(xpath ="//input[@aria-label='Expected Number of Awards']") private WebElement ExpectedNumberofAwards;	 
	@FindBy(xpath ="//input[@aria-label='Award Ceiling']")private WebElement AwardCeiling;
	@FindBy(xpath ="//input[@aria-label='Award Floor']")private WebElement AwardFloor;
	@FindBy(xpath ="//input[@aria-label='Fiscal Year']") private WebElement FiscalYear;	 
	@FindBy(xpath ="//input[@aria-label='Date of Application Open Date']")private WebElement ApplicationOpenDate;
	@FindBy(xpath ="//input[@aria-label='Date of Application Close Date']")private WebElement ApplicationCloseDate;
	@FindBy(xpath ="//input[@aria-label='Date of Award Start Date']")private WebElement AwardStartDate;
	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
	
	@FindBy(xpath ="(//li[@aria-label='Grant Applications'])[2]")private WebElement clickonGrantApplications;
	@FindBy(xpath ="//button[@aria-label='New Grant Application. Add New Grant Application']")private WebElement clickonNewGrantApplication;
//	@FindBy(xpath ="//input[@aria-label='Name']")private WebElement Name1;

//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
//	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;

	
	public GrantMgmt_Grants (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonGrantMgmt(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		driver.findElement(By.xpath("//div[@id='AppDetailsSec_1_Item_12']")).click();
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
		ApplicationOpenDate.sendKeys("9/25/2022");
	}
	public void setCRMApplicationCloseDate()
	{
		ApplicationCloseDate.sendKeys("9/29/2022");
	}
	public void setCRMAwardStartDate(String StartDate)
	{
		AwardStartDate.sendKeys("9/26/2022");
	}
	public void clickonSave()
	{
		clickonSave.click();
	}
	public void clickonGrantApplications()
	{
		clickonGrantApplications.click();
	}
	public void clickonNewGrantApplication()
	{
		clickonNewGrantApplication.click();
	}
	

}
