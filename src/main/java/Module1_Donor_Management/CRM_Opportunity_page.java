package Module1_Donor_Management;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Opportunity_page 
{
	@FindBy(xpath = "(//input[@aria-label='Date of Introductory Meeting'])[1]")private WebElement IntroductoryMeeting;
	@FindBy(xpath = "//label[text()='Moderate']")private WebElement clickonModerate;
	@FindBy(xpath = "//button[@aria-label='Anonymity: No']")private WebElement clickonAnonymity;

	@FindBy(xpath = "//button[@aria-label='Save and continue']")private WebElement Clickonsaveandcontinue;
	@FindBy(xpath = "//label[text()='One-time']")private WebElement clickondonationtype;
	
	@FindBy(xpath = "//button[@aria-label='Save (CTRL+S)']")private WebElement clickonsavebtn;

	
	@FindBy(xpath = "(//div[@title=\"Cultivate\"])[1]")private WebElement clickoncultivate;
	@FindBy(xpath = "(//div[@class='pa-a pa-bd pa-o pa-as flexbox'])[2]")private WebElement clickonnextstage;
	
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickonRefresh;
	
	@FindBy(xpath = "//input[@aria-label='Date of Payment Due Date']")private WebElement paymentduedate;
	
	@FindBy(xpath = "(//div[@title='Solicit'])[1]")private WebElement clickonsolicit;
	
	@FindBy(xpath = "//button[@aria-label='Next Stage']")private WebElement clicknextbtn;
	@FindBy(xpath = "//button[@aria-label='Finish']")private WebElement clickfinishbtn;
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickontransionRefresh;
	@FindBy(xpath = "(//div[@role='gridcell'])[2]")private WebElement clickonTransion;
	@FindBy(xpath = "//input[@aria-label='Date of Received Date']")private WebElement clickonReceivedDate;
	@FindBy(xpath = "//button[@aria-label='More Header Fields']")private WebElement clickonMoreHeader;
	@FindBy(xpath = "//button[@aria-label='Press Enter to go back.']")private WebElement clickonBack;
	@FindBy(xpath = "//button[@aria-label='Close Opportunity']")private WebElement clickonOpportunity;
	
	
	public CRM_Opportunity_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setCRMopportunityIntroductoryMeeting(String Imeeting)
	{
		IntroductoryMeeting.sendKeys("10/20/2022");
	}
	public void clickonEngmentlavel()
	{
		clickonModerate.click();
	}
	public void clickonAnonymity()
	{
		clickonAnonymity.click();
	}
	public void Clickonsaveandcontinue()
	{
		Clickonsaveandcontinue.click();
	}
//	public void clickopportunityEngmentLavel(WebDriver driver)
//	{
//		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Engagement Level']"));
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//		s.selectByIndex(1);
//	}
//	public void setCRMopportunitypagecause(String username) throws InterruptedException
//	{
////		WebElement type = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[4]"));
////		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
////		s.selectByIndex(1);
//		
//		cause.clear();
//		Thread.sleep(2000);
//		cause.sendKeys("Environment");
//	}
//	
	
	public void clickondonationtype() throws InterruptedException
	{
		Thread.sleep(2000);
		clickondonationtype.click();
	}
	
	public void clickonsavebutton() 
	{
		clickonsavebtn.click();
	}
	
	public void clickoncultivatebtn()
	{
		clickoncultivate.click();
	}
	public void clickonnextstagebtn()
	{
		clickonnextstage.click();
	}
	
	public void clickonRefreshbutton()
	{
		clickonRefresh.click();
	}
	
	public void setCRMopportunitypagepayment(String username)
	{
		paymentduedate.clear();
		paymentduedate.sendKeys("10/24/2022");
	}
	
	public void clickonsolicitbutton()
	{
		clickonsolicit.click();
	}
	
	
	public void clickonRediness(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Ask Readiness']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonrequestfordonation(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Request for Donation']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonconcern(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Resolve Concerns']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonnextbtn()
	{
		clicknextbtn.click();
	}
	public void clickonMarketinglist(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Add to Marketing List']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonPaymentrecived(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='First Payment Received']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
//	public void clickonThankyou(WebDriver driver)
//	{
//		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Send - Thank You?']"));
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//		s.selectByIndex(1);	
//	}
	public void clickonFinish()
	{
		clickfinishbtn.click();
	}
	public void clickonTransionRefresh()
	{
		clickontransionRefresh.click();
	}
	public void clickonTransion()
	{
		clickonTransion.click();
	}
	public void setCRMopportunitypageclickonReceivedDate(String username)
	{
		//paymentduedate.clear();
		clickonReceivedDate.sendKeys("10/28/2022");
	}
	public void clickonMoreHeader()
	{
		clickonMoreHeader.click();
	}
	public void clickonStatusReason(WebDriver driver)
	{
		WebElement cause = driver.findElement(By.xpath("(//div[@aria-label='Status Reason'])[1]"));
		Actions act=new Actions(driver);
		act.click(cause).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();		
	}
	public void clickonBack()
	{
		clickonBack.click();
	}
	public void clickonOpportunity()
	{
		clickonOpportunity.click();
	}
//	public void clickonTtansionRefresh(WebDriver driver)
//	{
//		WebElement type = driver.findElement(By.xpath("//button[@aria-label='More commands for Transaction']"));
//		
//		Actions act= new Actions(driver);
//		act
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//		s.selectByIndex(2);	
//	}
	
}
