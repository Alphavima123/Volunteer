package CRM_Volunteer_Mgmt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CRM_VOL_Opportunity_page1 
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
	@FindBy(xpath="//label[text()='Self']")private WebElement clickonSelf;
	@FindBy(xpath="//input[@aria-label='Date of Opportunity Start']")private WebElement clickonOpportunityStart;
	@FindBy(xpath="//input[@aria-label='Date of Opportunity End']")private WebElement clickonOpportunityEnd;
	@FindBy(xpath="//input[@aria-label='Facebook']")private WebElement clickonFacebook;
	@FindBy(xpath="//input[@aria-label='Twitter']")private WebElement clickonTwitter;
	@FindBy(xpath="//input[@aria-label='Linkedin']")private WebElement clickonLinkedin;
	@FindBy(xpath="//input[@aria-label='Photo']")private WebElement clickonPhoto;
	@FindBy(xpath="//input[@aria-label='Video']")private WebElement clickonVideo;
	@FindBy(xpath="//input[@aria-label='Bitly']")private WebElement clickonBitly;
	@FindBy(xpath="//div[@aria-label='On Location']")private WebElement clickonLocation;
	@FindBy(xpath="//input[@class='addressAutocomplete']")private WebElement clickonOnLocationName;
	@FindBy(xpath="//input[@aria-label='Street 1']")private WebElement clickonStreet1;
	@FindBy(xpath="//input[@aria-label='Street 2']")private WebElement clickonStreet2;
	@FindBy(xpath="//input[@aria-label='Street 3']")private WebElement clickonStreet3;
	@FindBy(xpath="//input[@aria-label='City']")private WebElement clickonCity1;
	@FindBy(xpath="//input[@aria-label='State/Province']")private WebElement clickonState_Province;
	@FindBy(xpath="//input[@aria-label='ZIP/Postal Code']")private WebElement clickonZIP_PostalCode;
	@FindBy(xpath="//input[@aria-label='Country']")private WebElement clickonCountry;
//	@FindBy(xpath="//input[@aria-label='Account Name, Lookup']")private WebElement clickonAccountName;
//	@FindBy(xpath="//input[@aria-label='Contact, Lookup']")private WebElement clickonContact;
//	@FindBy(xpath="//input[@aria-label='Email']")private WebElement clickonEmail;
//	@FindBy(xpath="//input[@aria-label='Phone']")private WebElement clickonPhone;
//	@FindBy(xpath="//input[@aria-label='Extension']")private WebElement clickonExtension;
//	@FindBy(xpath="//textarea[@aria-label='Apt/Suite']")private WebElement clickonSuite;
//	@FindBy(xpath="//textarea[@aria-label='Street']")private WebElement clickonStreet;
//	@FindBy(xpath="//input[@aria-label='City']")private WebElement clickonCity;
//	@FindBy(xpath="//input[@aria-label='Postal Code']")private WebElement clickonOnPostalCode;
	

	

	public CRM_VOL_Opportunity_page1 (WebDriver driver)
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
	public void setCRMvolunteerpage1Title(String title)
	{
		//clickonTitle.clear();
		clickonTitle.sendKeys(title);
	}
	public void setCRMvolunteerpage1Goal(String goal)
	{
		clickonGoal.clear();
		clickonGoal.sendKeys(goal);
	}
	public void setCRMvolunteerpage1Description(String Description)
	{
		clickonDescription.clear();
		clickonDescription.sendKeys(Description);
	}
	public void setCRMvolunteerpage1Commitment(String Commitment)
	{
		clickonCommitment.clear();
		clickonCommitment.sendKeys(Commitment);
	}
	public void setCRMvolunteerpage1Requirement(String Requirement)
	{
		clickonRequirement.clear();
		clickonRequirement.sendKeys(Requirement);
	}
	public void setCRMvolunteerpage1Benefit(String Benefit)
	{
		clickonBenefit.clear();
		clickonBenefit.sendKeys(Benefit);
	}
	public void setCRMvolunteerpage1Training(String Training)
	{
		clickonTraining.clear();
		clickonTraining.sendKeys(Training);
	}
	public void clickonNotRequired()
	{
		
		clickonNotRequired.click();
	}
	public void clickonSelf()
	{
		
		clickonSelf.click();
	}
	public void setCRMvolunteerpage1Startdate(String username)
	{
		clickonOpportunityStart.sendKeys("6/29/2022");
	}
	public void setCRMvolunteerpage1Enddate(String username)
	{
		clickonOpportunityEnd.sendKeys("6/30/2022");
	}
	public void setCRMvolunteerpage1Facebook(String Facebook)
	{
		clickonFacebook.clear();
		clickonFacebook.sendKeys(Facebook);
	}
	public void setCRMvolunteerpage1Twitter(String Twitter)
	{
		clickonTwitter.clear();
		clickonTwitter.sendKeys(Twitter);
	}
	public void setCRMvolunteerpage1Linkedin(String Linkedin)
	{
		clickonLinkedin.clear();
		clickonLinkedin.sendKeys(Linkedin);
	}
	public void setCRMvolunteerpage1Video(String Video)
	{
		clickonVideo.clear();
		clickonVideo.sendKeys(Video);
	}
	public void setCRMvolunteerpage1Photo(String Photo)
	{
		clickonPhoto.clear();
		clickonPhoto.sendKeys(Photo);
	}
	public void setCRMvolunteerpage1Bitly(String Bitly)
	{
		clickonBitly.clear();
		clickonBitly.sendKeys(Bitly);
	}
	public void clickonLocationType()
	{
		clickonLocation.click();
	}
	public void setCRMvolunteerpage1LocationName(String LocationName)
	{
		clickonOnLocationName.clear();
		clickonOnLocationName.sendKeys(LocationName);
	}
	public void setCRMvolunteerpage1Street1(String Street1)
	{
		clickonStreet1.clear();
		clickonStreet1.sendKeys(Street1);
	}
	public void setCRMvolunteerpage1Street2(String Street2)
	{
		clickonStreet2.clear();
		clickonStreet2.sendKeys(Street2);
	}
	public void setCRMvolunteerpage1Street3(String Street3)
	{
		clickonStreet3.clear();
		clickonStreet3.sendKeys(Street3);
	}
	public void setCRMvolunteerpage1City1(String City1)
	{
		clickonCity1.clear();
		clickonCity1.sendKeys(City1);
	}
	public void setCRMvolunteerpage1State_Province(String State_Province)
	{
		clickonState_Province.clear();
		clickonState_Province.sendKeys(State_Province);
	}
	public void setCRMvolunteerpage1ZIP_PostalCode(String ZIP_PostalCode)
	{
		clickonZIP_PostalCode.clear();
		clickonZIP_PostalCode.sendKeys(ZIP_PostalCode);
	}
	public void setCRMvolunteerpage1Country(String Country)
	{
		clickonCountry.clear();
		clickonCountry.sendKeys(Country);
	}
	
	}