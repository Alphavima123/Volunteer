package CRM_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Prospect_Page3
{
	@FindBy(xpath="//div[@id='AppDetailsSec_1_Item_10']")private WebElement clickFunddevelopment;
	@FindBy(xpath="//div[@title='Prospects']")private WebElement clickonprospect;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
	@FindBy(xpath="//select[@aria-label='Potential Type']")private WebElement clickonpotentialType;
	@FindBy(xpath = "//label[text()='Organization']") private WebElement clickonORGANIZATION;
	@FindBy(xpath = "//input[@type='text']") private WebElement estimated;
	@FindBy(xpath ="(//input[@type='text'])[2]") private WebElement date;
//  @FindBy(xpath ="(//button[@role='switch'])[1]") private WebElement clickonContact;
	@FindBy(xpath ="//input[@aria-label='First Name']") private WebElement FirstName;
    @FindBy(xpath = "//input[@aria-label='Last Name']") private WebElement LastName;
    @FindBy(xpath = "//input[@aria-label='Position Title']") private WebElement PositionTitle; 
    @FindBy(xpath ="//input[@placeholder='Provide an email']") private WebElement EmailId;	
    @FindBy(xpath ="//input[@aria-label='Business Phone']") private WebElement BusinessPhone;	 
    @FindBy(xpath ="//input[@aria-label='Business Phone Ext.']") private WebElement BusinessPhoneExt; 
    @FindBy(xpath ="//input[@aria-label='Mobile Phone']") private WebElement Mobilephone; 
    
    @FindBy(xpath = "//input[@aria-label='Cause, Lookup']")private WebElement cause;
    @FindBy(xpath = "//input[@aria-label='New Organization']")private WebElement Neworgaization;
    @FindBy(xpath = "//input[@aria-label='Organization Phone Number']")private WebElement Neworgaizationphoneno;
    @FindBy(xpath = "(//input[@aria-label='Email'])[2]")private WebElement NeworgaizationEmail;
//    @FindBy(xpath = "//input[@aria-label='Cause, Lookup']")private WebElement cause;
//    @FindBy(xpath = "//input[@aria-label='Cause, Lookup']")private WebElement cause;
//    @FindBy(xpath = "//input[@aria-label='Cause, Lookup']")private WebElement cause;
//    @FindBy(xpath = "//input[@aria-label='Cause, Lookup']")private WebElement cause;
    
    
	@FindBy(xpath = "//button[@aria-label='Save (CTRL+S)']")private WebElement clickonsave;
	@FindBy(xpath = "//button[@title='Qualify']")private WebElement clickonqualify;
	@FindBy(xpath = "//button[@id='confirmButton']")private WebElement clickonpopup;
	
	public CRM_Prospect_Page3 (WebDriver driver)
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
	public void clickonpotentialTypeProspectPage3(WebDriver driver) 
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Potential Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//		s.selectByIndex(1);
	//	clickonpotentialType.click();
	}
	public void clickonORGANIZATIONProspectPage3() 
	{
		clickonORGANIZATION.click();
	}
	
	public void setCRMProspectpage3(String est)
	{
		estimated.clear();
		estimated.sendKeys(est);
	}
	public void setCRMProspectpage3date(String username)
	{
		date.sendKeys("10/25/2022");
	}
	public void clickonsourceProspectpage3(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Prospect Source']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
//	public void clickoncontact()  // Automation is done but next step is not doing by automation is done by manually
//	{
//		clickonContact.click();
//	}
//	public void clickonselectcontact(WebDriver driver)					//do the manual
//	{
//		WebElement type = driver.findElement(By.xpath("//input[@data-pa-landmark-active-element='true']"));
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//	s.selectByIndex(2);
//	}
	public void setCRMProspectpage3fname(String Fname) throws InterruptedException
	{
	//	FirstName.sendKeys("shohan");
	//	Thread.sleep(2000);
		FirstName.clear();
		FirstName.sendKeys(Fname);
		
	}
	public void setCRMProspectpage3lname(String Lname) throws InterruptedException
	{
	//	LastName.sendKeys("Ramteke");
	//	Thread.sleep(2000);
		LastName.clear();
		LastName.sendKeys(Lname);
	}
	
	public void setCRMPositionTitleProspectpage3(String Ptitle)
	{
		PositionTitle.clear();
		PositionTitle.sendKeys(Ptitle);
	}
	
	public void setCRMProspectpage3Emailid(String EID) throws InterruptedException
	{
	//	EmailId.sendKeys("shohanramteke@gmail.com");
	//	Thread.sleep(2000);
		EmailId.clear();
		EmailId.sendKeys(EID);
	}
	
	public void setCRMProspectpage3BusinessPhone(String BPhone)
	{
		BusinessPhone.clear();
		BusinessPhone.sendKeys(BPhone);
	}
	
	public void setCRMProspectpage3BusinessPhoneeXT(String BPhoneExt)
	{
		BusinessPhoneExt.clear();
		BusinessPhoneExt.sendKeys(BPhoneExt);
	}
	
	public void setCRMProspectpage3Mobilephone(String Mphone)
	{
		Mobilephone.clear();
		Mobilephone.sendKeys(Mphone);
	}
	
	public void setCRMProspectpage3cause(String username) throws InterruptedException
	{
//		WebElement type = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[4]"));
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//		s.selectByIndex(1);
		
		cause.clear();
		Thread.sleep(2000);
		cause.sendKeys("Environment");
	}
	public void setNeworgaizationProspectpage3(String neworg)
	{
		Neworgaization.sendKeys(neworg);
	}
	public void setNeworgaizationphonenoProspectpage3(String neworgphone)
	{
		Neworgaizationphoneno.sendKeys(neworgphone);
	}
	public void clickonAcountTypeProspectpage3(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Account Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void setNeworgaizationEmailProspectpage3(String neworgEmail)
	{
		NeworgaizationEmail.sendKeys(neworgEmail);
	}
	public void clickonsaveProspectpage3()
	{
		clickonsave.click();
	}
	public void clickonqualifyProspectpage3()
	{
		clickonqualify.click();
	}
	public void clickonpopupProspectpage3()
	{
		clickonpopup.click();
	}

	
}
