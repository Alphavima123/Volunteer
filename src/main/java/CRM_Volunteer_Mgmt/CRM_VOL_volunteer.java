package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_volunteer 
	{

	@FindBy(xpath="//div[@id='AppDetailsSec_1_Item_21']")private WebElement clickonVolunteerMgmt;
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
	
	public void setCRMvolunteerFirstName(String fName)
	{
		FirstName.clear();
		FirstName.sendKeys(fName);
	}
	public void setCRMvolunteerLastName(String lName)
	{
		LastName.clear();
		LastName.sendKeys(lName);
	}
	public void setCRMvolunteerSalutation(String salutation)
	{
		Salutation.clear();
		Salutation.sendKeys(salutation);
	}
	public void setCRMvolunteerPositionTitle(String positionTitle)
	{
		PositionTitle.clear();
		PositionTitle.sendKeys(positionTitle);
	}
	public void setCRMvolunteerEmailPrimary(String Email)
	{
		EmailPrimary.clear();
		EmailPrimary.sendKeys(Email);
	}
	public void setCRMvolunteerMobilePhone(String Mobile)
	{
		MobilePhone.clear();
		MobilePhone.sendKeys(Mobile);
	}
	public void clickonPreferredMethodOfContact(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	
	public void setCRMvolunteerContactStewardedBy(String StewardedBy)
	{
		ContactStewardedBy.clear();
		ContactStewardedBy.sendKeys(StewardedBy);
	}
	
	public void clickonclickonSave()
	{
		clickonSave.click();
	}
	
	}