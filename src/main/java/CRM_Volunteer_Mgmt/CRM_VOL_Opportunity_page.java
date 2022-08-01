package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

	public class CRM_VOL_Opportunity_page 
	{

	@FindBy(xpath="(//div[@title='Volunteer Management'])[2]")private WebElement clickonVolunteerMgmt;
	@FindBy(xpath="(//div[@class='pa-bj pa-e pa-o pa-ck flexbox'])[5]")private WebElement clickonOpportunities;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
	@FindBy(xpath="//button[@aria-label='More Header Fields']")private WebElement ClickonMoreHeaderFields;
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
	
	@FindBy(xpath="//label[text()='On Location']")private WebElement clickonLocation;
	
	
	@FindBy(xpath="//input[@class='addressAutocomplete']")private WebElement clickonOnLocationName;
	@FindBy(xpath="//input[@aria-label='Street 1']")private WebElement clickonStreet1;
	@FindBy(xpath="//input[@aria-label='Street 2']")private WebElement clickonStreet2;
	@FindBy(xpath="//input[@aria-label='Street 3']")private WebElement clickonStreet3;
	@FindBy(xpath="(//input[@aria-label='City'])[2]")private WebElement clickonCity1;
	@FindBy(xpath="//input[@aria-label='State/Province']")private WebElement clickonState_Province;
	@FindBy(xpath="//input[@aria-label='ZIP/Postal Code']")private WebElement clickonZIP_PostalCode;
	@FindBy(xpath="//input[@aria-label='Country']")private WebElement clickonCountry;
	
//	@FindBy(xpath="//input[@aria-label='Account Name, Lookup']")private WebElement clickonAccountName;
//	@FindBy(xpath="//input[@aria-label='Contact, Lookup']")private WebElement clickonContact;
	
	@FindBy(xpath="//input[@aria-label='Email']")private WebElement clickonEmail;
	@FindBy(xpath="//input[@aria-label='Phone']")private WebElement clickonPhone;
	@FindBy(xpath="//input[@aria-label='Extension']")private WebElement clickonExtension;
	@FindBy(xpath="//textarea[@aria-label='Apt/Suite']")private WebElement clickonSuite;
	@FindBy(xpath="//textarea[@aria-label='Street']")private WebElement clickonStreet;
	@FindBy(xpath="//input[@aria-label='City']")private WebElement clickonCity;
	@FindBy(xpath="//input[@aria-label='Postal Code']")private WebElement clickonOnPostalCode;
	@FindBy(xpath="//span[text()='Save']")private WebElement clickonOnSave;
	@FindBy(xpath="//input[@aria-label='Volunteer Opportunity Search this view']")private WebElement clickonOnSerch;
	@FindBy(xpath="//button[@aria-label='Start search']")private WebElement clickonOnsearch;
	@FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[2]")private WebElement clickonCircleCheckmark;
	@FindBy(xpath="//button[@aria-label='Activate']")private WebElement clickonOnActivate;

	public CRM_VOL_Opportunity_page (WebDriver driver)
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
	public void ClickonMoreHeaderFields()
	{
		ClickonMoreHeaderFields.click();
	}
	public void clickonStatusReason(WebDriver driver)
	{
		WebElement Time = driver.findElement(By.xpath("(//div[@aria-label='Status Reason'])[2]"));
		Actions act=new Actions(driver);
		act.click(Time).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	public void setCRMvolunteerpageTitle(String title)
	{
		clickonTitle.clear();
		clickonTitle.sendKeys(title);
	}
	public void setCRMvolunteerpageGoal(String goal)
	{
		clickonGoal.clear();
		clickonGoal.sendKeys(goal);
	}
	public void setCRMvolunteerpageDescription(String Description)
	{
		clickonDescription.clear();
		clickonDescription.sendKeys(Description);
	}
	public void setCRMvolunteerpageCommitment(String Commitment)
	{
		clickonCommitment.clear();
		clickonCommitment.sendKeys(Commitment);
	}
	public void setCRMvolunteerpageRequirement(String Requirement)
	{
		clickonRequirement.clear();
		clickonRequirement.sendKeys(Requirement);
	}
	public void setCRMvolunteerpageBenefit(String Benefit)
	{
		clickonBenefit.clear();
		clickonBenefit.sendKeys(Benefit);
	}
	public void setCRMvolunteerpageTraining(String Training)
	{
		clickonTraining.clear();
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
	public void setCRMvolunteerpageStartdate(String username)
	{
		clickonOpportunityStart.sendKeys("9/28/2022");
	}
	public void setCRMvolunteerpageEnddate(String username)
	{
		clickonOpportunityEnd.sendKeys("9/30/2022");
	}
	public void setCRMvolunteerpageFacebook(String Facebook)
	{
		clickonFacebook.clear();
		clickonFacebook.sendKeys(Facebook);
	}
	public void setCRMvolunteerpageTwitter(String Twitter)
	{
		clickonTwitter.clear();
		clickonTwitter.sendKeys(Twitter);
	}
	public void setCRMvolunteerpageLinkedin(String Linkedin)
	{
		clickonLinkedin.clear();
		clickonLinkedin.sendKeys(Linkedin);
	}
	public void setCRMvolunteerpageVideo(String Video)
	{
		clickonVideo.clear();
		clickonVideo.sendKeys(Video);
	}
	public void setCRMvolunteerpagePhoto(String Photo)
	{
		clickonPhoto.clear();
		clickonPhoto.sendKeys(Photo);
	}
	public void setCRMvolunteerpageBitly(String Bitly)
	{
		clickonBitly.clear();
		clickonBitly.sendKeys(Bitly);
	}
//	public void clickonLocation(WebDriver driver) 
//	{
//		WebElement cal = driver.findElement(By.xpath("//div[@aria-label='On Location']"));
//		JavascriptExecutor js= ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", cal);
//	}
	
	
	
	
	public void clickonLocationType(WebDriver driver)
	{
		
		clickonLocation.click();
	}
	public void setCRMvolunteerpageLocationName(String LocationName)
	{
		clickonOnLocationName.clear();
		clickonOnLocationName.sendKeys(LocationName);
	}
	public void setCRMvolunteerpageStreet1(String Street1)
	{
		clickonStreet1.clear();
		clickonStreet1.sendKeys(Street1);
	}
	public void setCRMvolunteerpageStreet2(String Street2)
	{
		clickonStreet2.clear();
		clickonStreet2.sendKeys(Street2);
	}
	public void setCRMvolunteerpageStreet3(String Street3)
	{
		clickonStreet3.clear();
		clickonStreet3.sendKeys(Street3);
	}
	public void setCRMvolunteerpageCity1(String City1)
	{
		clickonCity1.clear();
		clickonCity1.sendKeys(City1);
	}
	public void setCRMvolunteerpageState_Province(String State_Province)
	{
		clickonState_Province.clear();
		clickonState_Province.sendKeys(State_Province);
	}
	public void setCRMvolunteerpageZIP_PostalCode(String ZIP_PostalCode)
	{
		clickonZIP_PostalCode.clear();
		clickonZIP_PostalCode.sendKeys(ZIP_PostalCode);
	}
	public void setCRMvolunteerpageCountry(String Country)
	{
		clickonCountry.clear();
		clickonCountry.sendKeys(Country);
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
	public void setCRMvolunteerpageEmail(String Email)
	{
		clickonEmail.clear();
		clickonEmail.sendKeys(Email);
	}
	public void setCRMvolunteerpagePhone(String Phone)
	{
		clickonPhone.clear();
		clickonPhone.sendKeys(Phone);
	}
	public void setCRMvolunteerpageExtension(String Extension)
	{
		clickonExtension.clear();
		clickonExtension.sendKeys(Extension);
	}
	public void setCRMvolunteerpageSuite(String Suite)
	{
		clickonSuite.clear();
		clickonSuite.sendKeys(Suite);
	}
	public void setCRMvolunteerpageStreet(String Street)
	{
		clickonStreet.clear();
		clickonStreet.sendKeys(Street);
	}
	public void setCRMvolunteerpageCity(String City)
	{
		clickonCity.clear();
		clickonCity.sendKeys(City);
	}
	public void setCRMvolunteerpagePostalCode(String PostalCode)
	{
		clickonOnPostalCode.clear();
		clickonOnPostalCode.sendKeys(PostalCode);
	}
	public void clickonOnSave() 
	{
		clickonOnSave.click();
	}
	public void clickonCRMActiveVolunteerOpportunities(WebDriver driver)
	{
		WebElement Contact = driver.findElement(By.xpath("//span[text()='Open popup to change view.']"));
		Actions act=new Actions(driver);
		act.click(Contact).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}
	public void setCRMvolunteerpageclickonOnSerch(String Serch)
	{
		clickonOnSerch.clear();
		clickonOnSerch.sendKeys(Serch);
	}
	public void clickonOnsearch()
	{
		clickonOnsearch.click();
	}
	public void clickonCircleCheckmark()
	{
		clickonCircleCheckmark.click();
	}
	public void clickonOnActivate()
	{
		clickonOnActivate.click();
	}
	
	}