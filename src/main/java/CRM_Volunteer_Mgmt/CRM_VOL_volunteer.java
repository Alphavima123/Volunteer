package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_volunteer 
	{

	@FindBy(xpath="(//div[@title='Volunteer Management'])[2]")private WebElement clickonVolunteerMgmt;
	@FindBy(xpath="//span[text()='Volunteer']")private WebElement clickonVolunteer;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
//	@FindBy(xpath="//input[@aria-label='Opportunity Title']")private WebElement clickonTitle;
	@FindBy(xpath="//input[@aria-label='First Name']")private WebElement FirstName;
	@FindBy(xpath="//input[@aria-label='Last Name']")private WebElement LastName;
	@FindBy(xpath="//input[@aria-label='Salutation']")private WebElement Salutation;
	@FindBy(xpath="//input[@aria-label='Position Title']")private WebElement PositionTitle;
	@FindBy(xpath="(//input[@aria-label='Email- Primary'])[1]")private WebElement EmailPrimary;
	@FindBy(xpath="(//input[@aria-label='Mobile Phone'])[1]")private WebElement MobilePhone;
	@FindBy(xpath="//input[@aria-label='Contact Stewarded By, Lookup']")private WebElement ContactStewardedBy;
	@FindBy(xpath="//li[@aria-label='Details']")private WebElement clickonDetails;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
	

	public CRM_VOL_volunteer (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonVolunteerAap(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		clickonVolunteerMgmt.click();
	}
	public void clickonVolunteer()
	{
		clickonVolunteer.click();
	}
	public void clickonNew()
	{
		clickonNew.click();
	}
	public void clickonTitle(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Title']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	
	public void setCRMvolunteerFirstName(String fName) throws InterruptedException
	{
		FirstName.clear();
		//Thread.sleep(1000);
		FirstName.sendKeys(fName);
	}
	public void setCRMvolunteerLastName(String lName) throws InterruptedException
	{
		LastName.clear();
		Thread.sleep(1000);
		LastName.sendKeys(lName);
	}
	public void setCRMvolunteerSalutation(String salutation) throws InterruptedException
	{
		Salutation.clear();
		Thread.sleep(1000);
		Salutation.sendKeys(salutation);
	}
	public void setCRMvolunteerPositionTitle(String positionTitle) throws InterruptedException
	{
		PositionTitle.clear();
		Thread.sleep(1000);
		PositionTitle.sendKeys(positionTitle);
	}
	public void setCRMvolunteerEmailPrimary(String Email) throws InterruptedException
	{
		EmailPrimary.clear();
		Thread.sleep(1000);
		EmailPrimary.sendKeys(Email);
	}
	public void setCRMvolunteerMobilePhone(String Mobile) throws InterruptedException
	{
		MobilePhone.clear();
		Thread.sleep(1000);
		MobilePhone.sendKeys(Mobile);
	}
	public void clickonPreferredMethodOfContact(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	
	public void setCRMvolunteerContactStewardedBy(String StewardedBy) throws InterruptedException
	{
		ContactStewardedBy.clear();
		Thread.sleep(1000);
		ContactStewardedBy.sendKeys(StewardedBy);
	}
	public void clickonDetails()
	{
		clickonDetails.click();
	}
	public void clickoncalander(WebDriver driver) 
	{
		WebElement cal = driver.findElement(By.xpath("(//i[@data-icon-name='Calendar'])[3]"));
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", cal);
	}
	public void clickonclickonSave()
	{
		clickonSave.click();
	}
	
	}