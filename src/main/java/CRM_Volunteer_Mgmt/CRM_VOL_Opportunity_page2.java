package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_Opportunity_page2 
	{

	@FindBy(xpath="(//div[@title='Volunteer Management'])[2]")private WebElement clickonVolunteerMgmt;
	@FindBy(xpath="(//div[@class='pa-bj pa-e pa-o pa-ck flexbox'])[5]")private WebElement clickonOpportunities;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
	@FindBy(xpath="//input[@aria-label='Opportunity Title']")private WebElement clickonTitle;
	@FindBy(xpath="//textarea[@aria-label='Opportunity Goal']")private WebElement clickonGoal;
	@FindBy(xpath="//textarea[@aria-label='Opportunity Description']")private WebElement clickonDescription;
	@FindBy(xpath="//textarea[@aria-label='Opportunity Time Commitment']")private WebElement clickonCommitment;
	@FindBy(xpath="//textarea[@aria-label='Opportunity Requirement']")private WebElement clickonRequirement;
	@FindBy(xpath="//textarea[@aria-label='Opportunity Benefit']")private WebElement clickonBenefit;
	@FindBy(xpath="//textarea[@aria-label='Opportunity Training']")private WebElement clickonTraining;
	@FindBy(xpath="//label[text()='Not Required']")private WebElement clickonNotRequired;
	@FindBy(xpath="//label[text()='Accounts']")private WebElement clickonAccounts;
	@FindBy(xpath="//input[@aria-label='Date of Opportunity Start']")private WebElement clickonOpportunityStart;
	@FindBy(xpath="//input[@aria-label='Date of Opportunity End']")private WebElement clickonOpportunityEnd;
	@FindBy(xpath="//input[@aria-label='Facebook']")private WebElement clickonFacebook;
	@FindBy(xpath="//input[@aria-label='Twitter']")private WebElement clickonTwitter;
	@FindBy(xpath="//input[@aria-label='Linkedin']")private WebElement clickonLinkedin;
	@FindBy(xpath="//input[@aria-label='Photo']")private WebElement clickonPhoto;
	@FindBy(xpath="//input[@aria-label='Video']")private WebElement clickonVideo;
	@FindBy(xpath="//input[@aria-label='Bitly']")private WebElement clickonBitly;
	@FindBy(xpath="//div[@aria-label='Virtual']")private WebElement clickonVirtual;
	@FindBy(xpath="//input[@aria-label='URL']")private WebElement clickonURL;
//	@FindBy(xpath="//input[@class='addressAutocomplete']")private WebElement clickonOnLocationName;
//	@FindBy(xpath="//input[@aria-label='Street 1']")private WebElement clickonStreet1;
//	@FindBy(xpath="//input[@aria-label='Street 2']")private WebElement clickonStreet2;
//	@FindBy(xpath="//input[@aria-label='Street 3']")private WebElement clickonStreet3;
//	@FindBy(xpath="(//input[@aria-label='City'])[2]")private WebElement clickonCity1;
//	@FindBy(xpath="//input[@aria-label='State/Province']")private WebElement clickonState_Province;
//	@FindBy(xpath="//input[@aria-label='ZIP/Postal Code']")private WebElement clickonZIP_PostalCode;
//	@FindBy(xpath="//input[@aria-label='Country']")private WebElement clickonCountry;
	
//	@FindBy(xpath="//input[@aria-label='Account Name, Lookup']")private WebElement clickonAccountName;
//	@FindBy(xpath="//input[@aria-label='Contact, Lookup']")private WebElement clickonContact;
	
	@FindBy(xpath="//input[@aria-label='Email']")private WebElement clickonEmail;
	@FindBy(xpath="//input[@aria-label='Phone']")private WebElement clickonPhone;
	@FindBy(xpath="//input[@aria-label='Extension']")private WebElement clickonExtension;
	@FindBy(xpath="//textarea[@aria-label='Apt/Suite']")private WebElement clickonSuite;
	@FindBy(xpath="//textarea[@aria-label='Street']")private WebElement clickonStreet;
	@FindBy(xpath="//input[@aria-label='City']")private WebElement clickonCity;
	@FindBy(xpath="//input[@aria-label='Postal Code']")private WebElement clickonOnPostalCode;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement Save;
	

	

	public CRM_VOL_Opportunity_page2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonVolunteerAap(WebDriver driver)
	{
		driver.switchTo().frame("AppLandingPage");
		clickonVolunteerMgmt.click();
	}
	public void clickonOpprotunities()
	{
		clickonOpportunities.click();
	}
	public void clickonNew()
	{
		clickonNew.click();
	}
	public void setCRMvolunteerpage2Title(String title)
	{
	//	estimated.clear();
		clickonTitle.sendKeys(title);
	}
	public void setCRMvolunteerpage2Goal(String goal)
	{
		clickonGoal.sendKeys(goal);
	}
	public void setCRMvolunteerpage2Description(String Description)
	{
		clickonDescription.sendKeys(Description);
	}
	public void setCRMvolunteerpage2Commitment(String Commitment)
	{
		clickonCommitment.sendKeys(Commitment);
	}
	public void setCRMvolunteerpage2Requirement(String Requirement)
	{
		clickonRequirement.sendKeys(Requirement);
	}
	public void setCRMvolunteerpage2Benefit(String Benefit)
	{
		clickonBenefit.sendKeys(Benefit);
	}
	public void setCRMvolunteerpage2Training(String Training)
	{
		clickonTraining.sendKeys(Training);
	}
	public void clickonNotRequired()
	{
		clickonNotRequired.click();
	}
	public void clickonAccounts()
	{
	clickonAccounts.click();
	}
	public void setCRMvolunteerpage2Startdate(String username)
	{
		clickonOpportunityStart.sendKeys("11/29/2022");
	}
	public void setCRMvolunteerpage2Enddate(String username)
	{
		clickonOpportunityEnd.sendKeys("11/30/2022");
	}
	public void setCRMvolunteerpage2Facebook(String Facebook)
	{
		clickonFacebook.sendKeys(Facebook);
	}
	public void setCRMvolunteerpage2Twitter(String Twitter)
	{
		clickonTwitter.sendKeys(Twitter);
	}
	public void setCRMvolunteerpage2Linkedin(String Linkedin)
	{
		clickonLinkedin.sendKeys(Linkedin);
	}
	public void setCRMvolunteerpage2Video(String Video)
	{
		clickonVideo.sendKeys(Video);
	}
	public void setCRMvolunteerpage2Photo(String Photo)
	{
		clickonPhoto.sendKeys(Photo);
	}
	public void setCRMvolunteerpage2Bitly(String Bitly)
	{
		clickonBitly.sendKeys(Bitly);
	}
	public void clickonLocationType()
	{
		clickonVirtual.click();
	}
	public void setCRMvolunteerpage2URL(String URL)
	{
	//	clickonURL.clear();
		clickonURL.sendKeys(URL);
	}
	public void clickonCRMvolunteerpage3AccountName(WebDriver driver)
	{
		WebElement AccountName = driver.findElement(By.xpath("//input[@aria-label='Account Name, Lookup']"));
		Actions act=new Actions(driver);
		act.click(AccountName).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}

	public void clickonCRMvolunteerpage3Contact(WebDriver driver)
	{
		WebElement Contact = driver.findElement(By.xpath("//input[@aria-label='Contact, Lookup']"));
		Actions act=new Actions(driver);
		act.click(Contact).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}
//	public void setCRMvolunteerpage2AccountName(String AccountName)
//	{
//		clickonAccountName.clear();
//		clickonAccountName.sendKeys(AccountName);
//	}
//	public void setCRMvolunteerpage2Contact(String Contact)
//	{
//		clickonContact.clear();
//		clickonContact.sendKeys(Contact);
//	}
	public void setCRMvolunteerpage2Email(String Email)
	{
		clickonEmail.sendKeys(Email);
	}
	public void setCRMvolunteerpage2Phone(String Phone)
	{
		clickonPhone.sendKeys(Phone);
	}
	public void setCRMvolunteerpage2Extension(String Extension)
	{
		clickonExtension.sendKeys(Extension);
	}
	public void setCRMvolunteerpage2Suite(String Suite)
	{
		clickonSuite.sendKeys(Suite);
	}
	public void setCRMvolunteerpage2Street(String Street)
	{
		clickonStreet.sendKeys(Street);
	}
	public void setCRMvolunteerpage2City(String City)
	{
		clickonCity.sendKeys(City);
	}
	public void setCRMvolunteerpage2PostalCode(String PostalCode)
	{
		clickonOnPostalCode.sendKeys(PostalCode);
	}
	public void clickonsave()
	{
		Save.click();
	}
	
	}