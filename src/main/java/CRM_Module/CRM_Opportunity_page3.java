package CRM_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Opportunity_page3 
{

//	@FindBy(xpath = "(//input[@role=\"combobox\"])[4]")private WebElement cause;
	@FindBy(xpath = "//label[text()='One-time']")private WebElement clickondonationtype;
	@FindBy(xpath = "//button[@aria-label='Save and continue']")private WebElement clickonsaveandcontinuebtn;

	@FindBy(xpath = "//button[@aria-label='Save (CTRL+S)']")private WebElement clickonsavebtn;
	

	
	@FindBy(xpath = "(//div[@title=\"Cultivate\"])[1]")private WebElement clickoncultivate;
	@FindBy(xpath = "(//div[@class='pa-a pa-bd pa-o pa-as flexbox'])[2]")private WebElement clickonnextstage;
	
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickonRefresh;
	
	@FindBy(xpath = "//input[@aria-label='Date of Payment Due Date']")private WebElement paymentduedate;
	
	@FindBy(xpath = "(//div[@title='Solicit'])[1]")private WebElement clickonsolicit;
	
	@FindBy(xpath = "//button[@aria-label='Next Stage']")private WebElement clicknextbtn;
	@FindBy(xpath = "//button[@aria-label='Finish']")private WebElement clickfinishbtn;
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickontransionRefresh;
	@FindBy(xpath = "//button[@aria-label='Close Opportunity']")private WebElement clickonOpportunity;

	
	public CRM_Opportunity_page3 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
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
	
	public void clickondonationtypeOpportunitypage3() throws InterruptedException
	{
		Thread.sleep(2000);
		clickondonationtype.click();
	}
	public void clickonsaveandcontinuebtn()
	{
		clickonsaveandcontinuebtn.click();
	}
	public void clickonsavebuttonOpportunitypage3() 
	{
		clickonsavebtn.click();
	}
	
	public void clickoncultivatebtnOpportunitypage3()
	{
		clickoncultivate.click();
	}
	public void clickonnextstagebtnOpportunitypage3()
	{
		clickonnextstage.click();
	}
	
	public void clickonRefreshbuttonOpportunitypage3()
	{
		clickonRefresh.click();
	}
	
	public void setCRMopportunitypage3payment(String username)
	{
		paymentduedate.sendKeys("10/25/2022");
	}
	
	public void clickonsolicitbuttonOpportunitypage3()
	{
		clickonsolicit.click();
	}
	
	
	public void clickonRedinessOpportunitypage3(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Ask Readiness']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonrequestfordonationOpportunitypage3(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Request for Donation']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonconcernOpportunitypage3(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Resolve Concerns']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonnextbtnOpportunitypage3()
	{
		clicknextbtn.click();
	}
	public void clickonMarketinglistOpportunitypage3(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Add to Marketing List']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonPaymentrecivedOpportunitypage3(WebDriver driver)
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
	public void clickonFinishOpportunitypage3()
	{
		clickfinishbtn.click();
	}
	public void clickonTransionRefreshOpportunitypage3()
	{
		clickontransionRefresh.click();
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
