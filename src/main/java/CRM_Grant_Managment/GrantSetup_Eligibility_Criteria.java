package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantSetup_Eligibility_Criteria
{

	@FindBy(xpath ="//div[@title='Eligibility Criteria']") private WebElement clickonEligibilityCriteria;
	@FindBy(xpath ="//button[@aria-label='New']") private WebElement clickonNew;
	@FindBy(xpath ="//input[@aria-label='Code']")private WebElement Code;
	@FindBy(xpath ="//input[@aria-label='Title']") private WebElement Title;
    @FindBy(xpath ="//textarea[@aria-label='Description']") private WebElement Description;
	@FindBy(xpath ="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;

	
	public GrantSetup_Eligibility_Criteria (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonGrantSetup(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		driver.findElement(By.xpath("(//div[@style='display: inline-block; vertical-align: top; float: left; position: relative;'])[13]")).click();
	//	clickonGrantSetup.click();
	}
	public void clickonEligibilityCriteria()
	{
		clickonEligibilityCriteria.click();
	}
	
	public void clickonNew()
	{
		clickonNew.click();
	}
	public void setCRMCode(String code)
	{
		Code.sendKeys(code);
	}
	public void setCRMTitle(String title)
	{
		Title.sendKeys(title);
	}

	public void setCRMDescription(String description)
	{
		Description.sendKeys(description);
	}

	public void clickonSave()
	{
		clickonSave.click();
	}

	
}
