package CRM_Volunteer_Mgmt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_Opportunity_page3 
	{

	@FindBy(xpath="//div[@id='AppDetailsSec_1_Item_21']")private WebElement clickonVolunteerMgmt;
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
	@FindBy(xpath="//div[@aria-label='Both']")private WebElement clickonBoth;
	@FindBy(xpath="//input[@class='addressAutocomplete']")private WebElement clickonOnLocationName;
	@FindBy(xpath="//input[@aria-label='Street 1']")private WebElement clickonStreet1;
	@FindBy(xpath="//input[@aria-label='Street 2']")private WebElement clickonStreet2;
	@FindBy(xpath="//input[@aria-label='Street 3']")private WebElement clickonStreet3;
	@FindBy(xpath="(//input[@aria-label='City'])[2]")private WebElement clickonCity1;
	@FindBy(xpath="//input[@aria-label='State/Province']")private WebElement clickonState_Province;
	@FindBy(xpath="//input[@aria-label='ZIP/Postal Code']")private WebElement clickonZIP_PostalCode;
	@FindBy(xpath="//input[@aria-label='Country']")private WebElement clickonCountry;
	@FindBy(xpath="//input[@aria-label='URL']")private WebElement clickonURL;
	@FindBy(xpath="//input[@aria-label='Account Name, Lookup']")private WebElement clickonAccountName;
	@FindBy(xpath="//input[@aria-label='Contact, Lookup']")private WebElement clickonContact;
	@FindBy(xpath="//input[@aria-label='Email']")private WebElement clickonEmail;
	@FindBy(xpath="//input[@aria-label='Phone']")private WebElement clickonPhone;
	@FindBy(xpath="//input[@aria-label='Extension']")private WebElement clickonExtension;
	@FindBy(xpath="//textarea[@aria-label='Apt/Suite']")private WebElement clickonSuite;
	@FindBy(xpath="//textarea[@aria-label='Street']")private WebElement clickonStreet;
	@FindBy(xpath="//input[@aria-label='City']")private WebElement clickonCity;
	@FindBy(xpath="//input[@aria-label='Postal Code']")private WebElement clickonOnPostalCode;
	

	

	public CRM_VOL_Opportunity_page3 (WebDriver driver)
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
	public void setCRMvolunteerpage3Title(String title)
	{
	//	estimated.clear();
		clickonTitle.sendKeys(title);
	}
	public void setCRMvolunteerpage3Goal(String goal)
	{
		clickonGoal.sendKeys(goal);
	}
	public void setCRMvolunteerpage3Description(String Description)
	{
		clickonDescription.sendKeys(Description);
	}
	public void setCRMvolunteerpage3Commitment(String Commitment)
	{
		clickonCommitment.sendKeys(Commitment);
	}
	public void setCRMvolunteerpage3Requirement(String Requirement)
	{
		clickonRequirement.sendKeys(Requirement);
	}
	public void setCRMvolunteerpage3Benefit(String Benefit)
	{
		clickonBenefit.sendKeys(Benefit);
	}
	public void setCRMvolunteerpage3Training(String Training)
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
	public void setCRMvolunteerpage3Startdate(String username)
	{
		clickonOpportunityStart.sendKeys("6/29/2022");
	}
	public void setCRMvolunteerpage3Enddate(String username)
	{
		clickonOpportunityEnd.sendKeys("6/30/2022");
	}
	public void setCRMvolunteerpage3Facebook(String Facebook)
	{
		clickonFacebook.sendKeys(Facebook);
	}
	public void setCRMvolunteerpage3Twitter(String Twitter)
	{
		clickonTwitter.sendKeys(Twitter);
	}
	public void setCRMvolunteerpage3Linkedin(String Linkedin)
	{
		clickonLinkedin.sendKeys(Linkedin);
	}
	public void setCRMvolunteerpage3Video(String Video)
	{
		clickonVideo.sendKeys(Video);
	}
	public void setCRMvolunteerpage3Photo(String Photo)
	{
		clickonPhoto.sendKeys(Photo);
	}
	public void setCRMvolunteerpage3Bitly(String Bitly)
	{
		clickonBitly.sendKeys(Bitly);
	}
	public void clickonLocationType()
	{
		clickonBoth.click();
	}
	public void setCRMvolunteerpage3LocationName(String LocationName)
	{
		clickonOnLocationName.sendKeys(LocationName);
	}
	public void setCRMvolunteerpage3Street1(String Street1)
	{
		clickonStreet1.sendKeys(Street1);
	}
	public void setCRMvolunteerpage3Street2(String Street2)
	{
		clickonStreet2.sendKeys(Street2);
	}
	public void setCRMvolunteerpage3Street3(String Street3)
	{
		clickonStreet3.sendKeys(Street3);
	}
	public void setCRMvolunteerpage3City1(String City1)
	{
		clickonCity1.sendKeys(City1);
	}
	public void setCRMvolunteerpage3State_Province(String State_Province)
	{
		clickonState_Province.sendKeys(State_Province);
	}
	public void setCRMvolunteerpage3ZIP_PostalCode(String ZIP_PostalCode)
	{
		clickonZIP_PostalCode.sendKeys(ZIP_PostalCode);
	}
	public void setCRMvolunteerpage3Country(String Country)
	{
		clickonCountry.sendKeys(Country);
	}
	public void setCRMvolunteerpage3URL(String URL)
	{
		clickonURL.clear();
		clickonURL.sendKeys(URL);
	}
	
	public void setCRMvolunteerpage3AccountName(String AccountName)
	{
		clickonAccountName.sendKeys(AccountName);
	}
	public void setCRMvolunteerpage3Contact(String Contact)
	{
		clickonContact.sendKeys(Contact);
	}
	public void setCRMvolunteerpage3Email(String Email)
	{
		clickonEmail.sendKeys(Email);
	}
	public void setCRMvolunteerpage3Phone(String Phone)
	{
		clickonPhone.sendKeys(Phone);
	}
	public void setCRMvolunteerpage3Extension(String Extension)
	{
		clickonExtension.clear();
		clickonExtension.sendKeys(Extension);
	}
	public void setCRMvolunteerpage3Suite(String Suite)
	{
		clickonSuite.sendKeys(Suite);
	}
	public void setCRMvolunteerpage3Street(String Street)
	{
		clickonStreet.sendKeys(Street);
	}
	public void setCRMvolunteerpage3City(String City)
	{
		clickonCity.sendKeys(City);
	}
	public void setCRMvolunteerpage3PostalCode(String PostalCode)
	{
		clickonOnPostalCode.sendKeys(PostalCode);
	}
	
	}