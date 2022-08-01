package CRM_Grant_Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Prospect_3
{
	@FindBy(xpath="//div[@id='AppDetailsSec_1_Item_10']")private WebElement clickFunddevelopment;
	@FindBy(xpath="//div[@title='Prospects']")private WebElement clickonprospect;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
	
	@FindBy(xpath = "//div[@aria-label='Household']") private WebElement clickonHousehold;
	
	@FindBy(xpath = "//input[@type='text']") private WebElement estimated;
	@FindBy(xpath ="(//input[@type='text'])[2]") private WebElement date;
	
	@FindBy(xpath ="//button[@aria-label='Existing Contact: No']") private WebElement clickonExistingContact;
	
//	@FindBy(xpath ="//input[@aria-label='First Name']") private WebElement FirstName;
//    @FindBy(xpath = "//input[@aria-label='Last Name']") private WebElement LastName;
//    @FindBy(xpath = "//input[@aria-label='Position Title']") private WebElement PositionTitle; 
//    @FindBy(xpath ="//input[@placeholder='Provide an email']") private WebElement EmailId;	
//    @FindBy(xpath ="//input[@aria-label='Business Phone']") private WebElement BusinessPhone;	 
//    @FindBy(xpath ="//input[@aria-label='Business Phone Ext.']") private WebElement BusinessPhoneExt; 
//    @FindBy(xpath ="//input[@aria-label='Mobile Phone']") private WebElement Mobilephone; 
    @FindBy(xpath = "//textarea[@aria-label='Grant Eligibility Criteria']")private WebElement GrantEligibilityCriteria;
    @FindBy(xpath = "//input[@aria-label='Description']")private WebElement Description;
    
    @FindBy(xpath = "//button[@aria-label='Existing Organization/ Household: No']")private WebElement clickonExistingOrganization;
    // 
//    @FindBy(xpath = "//input[@aria-label='New Organization']")private WebElement NewOrganization;
//    @FindBy(xpath = "//input[@aria-label='Organization Phone Number']")private WebElement OrganizationPhoneNumber;
//    @FindBy(xpath = "(//input[@aria-label='Email'])[2]")private WebElement Email2;
//    @FindBy(xpath = "//input[@class='addressAutocomplete']")private WebElement SearchAddress;
//    @FindBy(xpath = "//input[@aria-label='Apartment/Suite number']")private WebElement Apartmentnumber;
//    @FindBy(xpath = "//input[@aria-label='Street']")private WebElement Street;
//    @FindBy(xpath = "//input[@aria-label='City']")private WebElement City;
//    @FindBy(xpath = "//input[@aria-label='State/Province']")private WebElement StateProvince;
//    @FindBy(xpath = "//input[@aria-label='ZIP/Postal Code']")private WebElement ZIpPostalCode;
//    @FindBy(xpath = "//input[@aria-label='Country']")private WebElement Country;
//    @FindBy(xpath = "//input[@aria-label='Website']")private WebElement Website;

    
    @FindBy(xpath = "//li[@aria-label='Details']")private WebElement clickonDetails;
    @FindBy(xpath = "(//input[@aria-label='Email'])[3]")private WebElement clickonEmail;
    @FindBy(xpath = "//input[@aria-label='Follow Email Activity']")private WebElement clickonFollowEmailActivity;
    @FindBy(xpath = "//input[@aria-label='Bulk Email']")private WebElement clickonBulkEmail;
    @FindBy(xpath = "//input[@aria-label='Phone']")private WebElement clickonPhone;
    @FindBy(xpath = "//input[@aria-label='Mail']")private WebElement clickonMail;    
    @FindBy(xpath = "//input[@aria-label='Annual Revenue']")private WebElement AnnualRevenue;
    @FindBy(xpath = "//input[@aria-label='No. of Employees']")private WebElement Employees;
	@FindBy(xpath = "//button[@aria-label='Save (CTRL+S)']")private WebElement clickonsave;
	@FindBy(xpath = "//div[text()='Identify & Qualify']")private WebElement clickonIdentifyQualify;
	@FindBy(xpath = "//button[@title='Qualify']")private WebElement clickonqualify;
	@FindBy(xpath = "//button[@aria-label='OK']")private WebElement clickonOK;

//	@FindBy(xpath = "//select[@aria-label='Grant Eligibility Criteria Matched']")private WebElement clickonGrantEligibility;
	@FindBy(xpath = "//button[@aria-label='Next Stage']")private WebElement clickonNext;

	

	public CRM_Prospect_3 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonFunddevelopment(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		clickFunddevelopment.click();
	}
	
	public void clickonprospect() 
	{
		clickonprospect.click();
	}
	
	public void clickonnew() 
	{
		clickonNew.click();
	}
	public void clickonpotentialType(WebDriver driver) 
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Potential Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);
	}
	public void clickonHousehold() 
	{
		clickonHousehold.click();
	}
	
	public void setCRMProspectpageEstimated(String est) throws InterruptedException
	{
		Thread.sleep(2000);
		estimated.clear();
		Thread.sleep(2000);
		estimated.sendKeys(est);
	}
	public void setCRMProspectpagedate(String username)
	{
		date.sendKeys("10/25/2022");
	}
	//NEW           -------Firstnate to mobile no block in test class
	public void clickonExistingContact()
	{
		clickonExistingContact.click();
	}
	public void clickonSelectContact(WebDriver driver)
	{
		WebElement contact = driver.findElement(By.xpath("//input[@aria-label='Select Contact, Lookup']"));
		Actions act=new Actions(driver);
		act.click(contact).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	//close
	public void clickonsource(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Prospect Source']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
//	public void setCRMProspectpagefname(String Fname) throws InterruptedException
//	{
//	//	FirstName.sendKeys("shohan");
//	//	Thread.sleep(2000);
//		FirstName.clear();
//	//	Thread.sleep(1000);
//		FirstName.sendKeys(Fname);
//		
//	}
//	public void setCRMProspectpagelname(String Lname) throws InterruptedException
//	{
//	//	LastName.sendKeys("Ramteke");
//	//	Thread.sleep(2000);
//		LastName.clear();
//	//	Thread.sleep(1000);
//		LastName.sendKeys(Lname);
//	}
//	
//	public void setCRMPositionTitle(String Ptitle) throws InterruptedException
//	{
//		PositionTitle.clear();
//	//	Thread.sleep(2000);
//		PositionTitle.sendKeys(Ptitle);
//	}
	
//	public void setCRMProspectpageEmailid(String EID) throws InterruptedException
//	{
//	//	EmailId.sendKeys("shohanramteke@gmail.com");
//	//	Thread.sleep(2000);
//		EmailId.clear();
//	//	Thread.sleep(2000);
//		EmailId.sendKeys(EID);
//	}
//	
//	public void setCRMProspectpageBusinessPhone(String BPhone) throws InterruptedException
//	{
//		BusinessPhone.clear();
//	//	Thread.sleep(2000);
//		BusinessPhone.sendKeys(BPhone);
//	}
//	
//	public void setCRMProspectpageBusinessPhoneeXT(String BPhoneExt) throws InterruptedException
//	{
//		BusinessPhoneExt.clear();
//	//	Thread.sleep(2000);
//		BusinessPhoneExt.sendKeys(BPhoneExt);
//	}
//	
//	public void setCRMProspectpageMobilephone(String Mphone) throws InterruptedException
//	{
//		Mobilephone.clear();
//	//	Thread.sleep(2000);
//		Mobilephone.sendKeys(Mphone);
//	}
	public void clickoncause(WebDriver driver)
	{
		WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Cause, Lookup']"));
		Actions act=new Actions(driver);
		act.click(cause).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonTimeframe(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Timeframe']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(4);
	}
	public void setCRMprospectGrantEligibilityCriteria(String Grantcriteria)
	{
		GrantEligibilityCriteria.clear();
		GrantEligibilityCriteria.sendKeys(Grantcriteria);
	}
	public void setCRMprospectDescription(String description)
	{
		Description.clear();
		Description.sendKeys(description);
	}
	//NEW
	public void clickonExistingOrganization()
	{
		clickonExistingOrganization.click();
	}
	public void clickonSelectOrganization(WebDriver driver)
	{
		WebElement select = driver.findElement(By.xpath("//input[@aria-label='Select Organization/ Household, Lookup']"));
		Actions act=new Actions(driver);
		act.click(select).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	//CLOSE
	//new
//	public void setCRMprospectNewOrganization(String org)
//	{
//		NewOrganization.sendKeys(org);
//	}
//	public void setCRMprospectOrganizationPhoneNumber(String orgno)
//	{
//		OrganizationPhoneNumber.sendKeys(orgno);
//	}
	public void clickonAccountType(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Account Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(2);
	}
//	public void setCRMopportunityEmail2(String email2)
//	{
//		Email2.sendKeys(email2);
//	}
//	public void setCRMopportunitySearchAddress(String sadress)
//	{
//		SearchAddress.sendKeys(sadress);
//	}
//	public void setCRMopportunityApartmentnumber(String ano)
//	{
//		Apartmentnumber.sendKeys(ano);
//	}
//	public void setCRMopportunityStreet(String street)
//	{
//		Street.sendKeys(street);
//	}
//	public void setCRMopportunityCity(String city)
//	{
//		City.sendKeys(city);
//	}
//	public void setCRMopportunityStateProvince(String stateProvince)
//	{
//		StateProvince.sendKeys(stateProvince);
//	}
//	public void setCRMopportunityZIpPostalCode(String zIpPostalCode)
//	{
//		ZIpPostalCode.sendKeys(zIpPostalCode);
//	}
//	public void setCRMopportunityCountry(String country)
//	{
//		Country.sendKeys(country);
//	}
//	public void setCRMopportunityWebsite(String website)
//	{
//		Website.sendKeys(website);
//	}
	
	public void clickonDetails()
	{
		clickonDetails.click();
	}
	public void clickonMarketingMaterials(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label=' Marketing Materials']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(2);
	}
	public void clickonStewardBy(WebDriver driver)
	{
		WebElement steward = driver.findElement(By.xpath("//input[@aria-label='Steward By, Lookup']"));
		Actions act=new Actions(driver);
		act.click(steward).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonPreferredContactmethod(WebDriver driver)					
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Preferred Contact method']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
	s.selectByIndex(4);
	}
	public void clickonemail()
	{
		clickonEmail.click();
	}
	public void clickonFollowEmailActivity()
	{
		clickonFollowEmailActivity.click();
	}
	public void clickonBulkEmail()
	{
		clickonBulkEmail.click();
	}
	public void clickonPhone()
	{
		clickonPhone.click();
	}
	public void clickonMail()
	{
		clickonMail.click();
	}
	
	public void clickonIndustry(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Industry']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void setCRMprospectAnnualRevenue(String Annual)
	{
		AnnualRevenue.clear();
		AnnualRevenue.sendKeys(Annual);
	}
	public void setCRMprospectEmployees(String employes)
	{
		Employees.sendKeys(employes);
	}
	public void clickonsave()
	{
		clickonsave.click();
	}
	public void clickonIdentifyQualify()
	{
		clickonIdentifyQualify.click();
	}
	public void clickonGrantEligibility(WebDriver driver) 
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Grant Eligibility Criteria Matched']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void clickonqualify()
	{
		clickonqualify.click();
	}
	public void clickonOK()
	{
		clickonOK.click();
	}
	
}
