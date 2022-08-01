package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_volunteer_Details 
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
//	@FindBy(xpath="//input[@aria-label='Contact Stewarded By, Lookup']")private WebElement ContactStewardedBy;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement clickonSave;
	@FindBy(xpath="//li[@aria-label='Details']")private WebElement clickonDetails;
	@FindBy(xpath="//button[@aria-label='Toggle menu']")private WebElement clickonContactMethod;
	@FindBy(xpath="(//input[@aria-label='Home Phone'])[2]")private WebElement HomePhone;
	@FindBy(xpath="//input[@aria-label='Secondary Email 1']")private WebElement SecondaryEmail1;
	@FindBy(xpath="//input[@aria-label='Secondary Email 2']")private WebElement SecondaryEmail2;
	@FindBy(xpath="//input[@aria-label='Fax']")private WebElement Fax;
	@FindBy(xpath="//input[@class='addressAutocomplete']")private WebElement SearchAddress;
	@FindBy(xpath="//input[@aria-label='Address (Suite/Apt.)']")private WebElement AddressSuite_Apt;
	@FindBy(xpath="//input[@aria-label='Street #']")private WebElement Street;
	@FindBy(xpath="//input[@aria-label='City']")private WebElement City;
	@FindBy(xpath="//input[@aria-label='State/Province']")private WebElement State_Province;
	@FindBy(xpath="//input[@aria-label='Postal Code']")private WebElement PostalCode;
	@FindBy(xpath="//input[@aria-label='Country']")private WebElement Country;
	@FindBy(xpath="//input[@aria-label='Employee ID']")private WebElement EmployeeID;
	@FindBy(xpath="//textarea[@aria-label='Area of Expertise']")private WebElement AreaofExpertise;
	@FindBy(xpath="//textarea[@aria-label='Focus/Specialty']")private WebElement FocusSpecialty;
	@FindBy(xpath="//textarea[@aria-label='Internal Note']")private WebElement InternalNote;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement Save;


	public CRM_VOL_volunteer_Details  (WebDriver driver)
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
		Thread.sleep(1000);
		FirstName.clear();
		FirstName.sendKeys(fName);
	}
	public void setCRMvolunteerLastName(String lName) throws InterruptedException
	{
		Thread.sleep(1000);
		LastName.clear();
		LastName.sendKeys(lName);
	}
	public void setCRMvolunteerSalutation(String salutation) throws InterruptedException
	{
		Thread.sleep(1000);
		Salutation.clear();
		Salutation.sendKeys(salutation);
	}
	public void setCRMvolunteerPositionTitle(String positionTitle) throws InterruptedException
	{
		Thread.sleep(1000);
		PositionTitle.clear();
		PositionTitle.sendKeys(positionTitle);
	}
	public void setCRMvolunteerEmailPrimary(String Email) throws InterruptedException
	{
		Thread.sleep(1000);
		EmailPrimary.clear();
		EmailPrimary.sendKeys(Email);
	}
	public void setCRMvolunteerMobilePhone(String Mobile) throws InterruptedException
	{
		Thread.sleep(1000);
		MobilePhone.clear();
		MobilePhone.sendKeys(Mobile);
	}
	public void clickonPreferredMethodOfContact(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonContactStewardedBy(WebDriver driver)
	{
		WebElement Time = driver.findElement(By.xpath("//input[@aria-label='Contact Stewarded By, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Time).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
//	public void setCRMvolunteerContactStewardedBy(String StewardedBy)
//	{
//		ContactStewardedBy.clear();
//		ContactStewardedBy.sendKeys(StewardedBy);
//	}
	
	public void clickonclickonSave()
	{
		clickonSave.click();
	}
	public void clickonDetails()
	{
		clickonDetails.click();
	}
	public void clickonpreferedcontactmethod(WebDriver driver)
	{
		WebElement ContactMethod = driver.findElement(By.xpath("//button[@aria-label='Toggle menu']"));
		Actions act=new Actions(driver);
		act.click(ContactMethod).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}
	public void clickonPrimaryPhone(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label=' Primary Phone']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void setCRMvolunteerHomePhone(String Hphone)
	{
		HomePhone.clear();
		HomePhone.sendKeys(Hphone);
	}
	public void setCRMvolunteerSecondaryEmail1(String Email1)
	{
		SecondaryEmail1.clear();
		SecondaryEmail1.sendKeys(Email1);
	}
	public void setCRMvolunteerSecondaryEmail2(String Email2)
	{
		SecondaryEmail2.clear();
		SecondaryEmail2.sendKeys(Email2);
	}
	public void setCRMvolunteerFax(String fax)
	{
		Fax.clear();
		Fax.sendKeys(fax);
	}
	public void clickonMarketingMaterials(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Marketing Materials']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonDonotallowPhoneCalls(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Phone Calls']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonDonotallowEmails(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Emails']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonDonotallowBulkEmails(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Bulk Emails']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonDonotallowMails(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Mails']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void setCRMvolunteerSearchAddress(String searchAddress)
	{
		SearchAddress.clear();
		SearchAddress.sendKeys(searchAddress);
	}
	public void setCRMvolunteerAddressSuite_Apt(String addressSuite_Apt)
	{
		AddressSuite_Apt.clear();
		AddressSuite_Apt.sendKeys(addressSuite_Apt);
	}
	public void setCRMvolunteerStreet(String street)
	{
		Street.clear();
		Street.sendKeys(street);
	}
	public void setCRMvolunteerCity(String city)
	{
		City.clear();
		City.sendKeys(city);
	}
	public void setCRMvolunteerState_Province(String Province)
	{
		State_Province.clear();
		State_Province.sendKeys(Province);
	}
	public void setCRMvolunteerPostalCode(String postalCode)
	{
		PostalCode.clear();
		PostalCode.sendKeys(postalCode);
	}
	public void setCRMvolunteerCountry(String country)
	{
		Country.clear();
		Country.sendKeys(country);
	}
	public void setCRMvolunteerEmployeeID(String employeeID)
	{
		EmployeeID.clear();
		EmployeeID.sendKeys(employeeID);
	}
	public void setCRMvolunteerAreaofExpertise(String Expertise)
	{
		AreaofExpertise.clear();
		AreaofExpertise.sendKeys(Expertise);
	}
	public void setCRMvolunteerFocusSpecialty(String country)
	{
		FocusSpecialty.clear();
		FocusSpecialty.sendKeys(country);
	}
	public void clickonLevelofEducation(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Level of Education']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void setCRMvolunteerInternalNote(String internalNote)
	{
		InternalNote.clear();
		InternalNote.sendKeys(internalNote);
	}
	public void clickoncalander(WebDriver driver) 
	{
		WebElement cal = driver.findElement(By.xpath("(//i[@data-icon-name='Calendar'])[3]"));
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", cal);
	}
	public void clickonsave()
	{
		Save.click();
	}
	
	
	}