package CRM_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRM_Account 
{
	@FindBy(xpath="//div[@id='AppDetailsSec_1_Item_10']")private WebElement clickFunddevelopment;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement clickonAccounts;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;
	@FindBy(xpath="//input[@aria-label='Account Name']")private WebElement AccountName;
	@FindBy(xpath ="//input[@aria-label='Phone']") private WebElement Phone;
	@FindBy(xpath="//input[@aria-label='Fax']")private WebElement Fax;

    @FindBy(xpath = "//input[@aria-label='Website']") private WebElement Website;
    @FindBy(xpath = "//input[@aria-label='Address 1: Street 1']") private WebElement Address1;
    @FindBy(xpath = "//input[@aria-label='Address 1: Street 2']") private WebElement Address2;
    @FindBy(xpath = "//input[@aria-label='Address 1: Street 3']") private WebElement Address3;
    @FindBy(xpath = "//input[@aria-label='Address 1: City']") private WebElement City;
    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;

    @FindBy(xpath = "//input[@aria-label='Address 1: Country/Region']") private WebElement Country;
    @FindBy(xpath = "//input[@aria-label='Address 1: ZIP/Postal Code']") private WebElement PostalCode;
    @FindBy(xpath="//li[@aria-label='Details']")private WebElement clickonDetails;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement Save;


//    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;
//    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;
//    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;
//    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;
//    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;
//    @FindBy(xpath = "//input[@aria-label='Address 1: State/Province']") private WebElement State;

    
    
    public void clickonDonor(WebDriver driver) 
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Donor']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);

	}
    public void clickonAccountType(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Account Type']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonAcquisitionSource(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Acquisition Source']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryConstituentType(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Primary Constituent Type']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryPreferredMethodofContact(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryDonotallowBulkEmails(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Bulk Emails']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryDonotallowEmails(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Emails']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryDonotallowBulkMails(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("Do not allow Bulk Mails"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryDonotallowFaxes(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Faxes']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryDonotallowMails(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Mails']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
    public void clickonPrimaryDonotallowPhoneCalls(WebDriver driver) 
   	{
   		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Do not allow Phone Calls']"));
   		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
   		s.selectByIndex(1);

   	}
   
}
