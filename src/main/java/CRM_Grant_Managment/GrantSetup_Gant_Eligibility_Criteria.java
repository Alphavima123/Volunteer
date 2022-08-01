package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantSetup_Gant_Eligibility_Criteria
{

	@FindBy(xpath ="//li[@aria-label='Gant Eligibility Criteria']") private WebElement clickonGrantEligibilityCriteria;
	@FindBy(xpath ="//button[@aria-label='New']") private WebElement clickonNew;
	@FindBy(xpath ="//input[@aria-label='Name']")private WebElement Name1;
	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;

	
	public GrantSetup_Gant_Eligibility_Criteria (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonGrantSetup(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		driver.findElement(By.xpath("(//div[@style='display: inline-block; vertical-align: top; float: left; position: relative;'])[13]")).click();
	//	clickonGrantSetup.click();
	}
	public void clickonGrantEligibilityCriteria()
	{
		clickonGrantEligibilityCriteria.click();
	}
	
	public void clickonNew()
	{
		clickonNew.click();
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
	public void clickonGrant(WebDriver driver)
	{
		WebElement Reviewer = driver.findElement(By.xpath("//input[@aria-label='Grant, Lookup']"));
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
	s.selectByIndex(1);
	}
	public void clickonCriteriaRequirement(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Criteria Requirement']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(1);
	}

	public void clickonSave()
	{
		clickonSave.click();
	}

	
}
