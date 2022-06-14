package CRM_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Opportunity_page1 
{

//	@FindBy(xpath = "(//input[@role=\"combobox\"])[4]")private WebElement cause;
	
	@FindBy(xpath = "//label[text()='Recurring']")private WebElement clickondonationtype;
	
	@FindBy(xpath = "//button[@title='Close']")private WebElement clickonclosewindow;
//	@FindBy(xpath = "//span[text()='Save and continue']")private WebElement clickondonationtypeSave;

	
	@FindBy(xpath = "//button[@aria-label='Save (CTRL+S)']")private WebElement clickonsavebtn;
	@FindBy(xpath = "//label[text()='Quaterly']")private WebElement clickondonationtypeQuaterly;

//	@FindBy(xpath = "//button[@aria-label=\"Increment value\"]")private WebElement clickonMultipletime;
	
	@FindBy(xpath = "(//div[@title=\"Cultivate\"])[1]")private WebElement clickoncultivate;
	@FindBy(xpath = "(//div[@class='pa-a pa-bd pa-o pa-as flexbox'])[2]")private WebElement clickonnextstage;
	
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickonRefresh;
	
	@FindBy(xpath = "//input[@aria-label='Date of First Payment Date']")private WebElement Firstpaymentduedate;
	
	@FindBy(xpath = "(//div[@title='Solicit'])[1]")private WebElement clickonsolicit;
	
	@FindBy(xpath = "//button[@aria-label='Next Stage']")private WebElement clicknextbtn;
	@FindBy(xpath = "//button[@aria-label='Finish']")private WebElement clickfinishbtn;
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickontransionRefresh;
	
	public CRM_Opportunity_page1 (WebDriver driver)
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
	
	public void clickondonationtypeOpportunitypage1() throws InterruptedException
	{
		Thread.sleep(2000);
		clickondonationtype.click();
	}
	public void clickoncloseWindowOpportunitypage1() throws InterruptedException
	{
	//	Thread.sleep(2000);
		clickonclosewindow.click();
	}
	
	public void clickondonationtypeQuaterlyOpportunitypage1() throws InterruptedException
	{
		Thread.sleep(2000);
		clickondonationtypeQuaterly.click();
	}
	public void clickonMultipletimesOpportunitypage1(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement buttonelement = driver.findElement(By.xpath("//button[@aria-label=\"Increment value\"]"));
		@SuppressWarnings("unused")
		int i;
		for(int i1=0; i1<=7; i1++)
		{
			buttonelement.click();
		}
		
//		clickonMultipletime.click();
		
	}
	
	public void clickonsavebuttonOpportunitypage1() 
	{
		clickonsavebtn.click();
	}
	
	public void clickoncultivatebtnOpportunitypage1()
	{
		clickoncultivate.click();
	}
	public void clickonnextstagebtnOpportunitypage1()
	{
		clickonnextstage.click();
	}
	
	public void clickonRefreshbuttonOpportunitypage1()
	{
		clickonRefresh.click();
	}
	
	public void setCRMopportunitypage1payment(String username)
	{
		Firstpaymentduedate.sendKeys("10/25/2022");
	}
	
	public void clickonsolicitbuttonOpportunitypage1()
	{
		clickonsolicit.click();
	}
	
	
	public void clickonRedinessOpportunitypage1(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Ask Readiness']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonrequestfordonationOpportunitypage1(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Request for Donation']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonconcernOpportunitypage1(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Resolve Concerns']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonnextbtnOpportunitypage1()
	{
		clicknextbtn.click();
	}
	public void clickonMarketinglistOpportunitypage1(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Add to Marketing List']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonPaymentrecivedOpportunitypage1(WebDriver driver)
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
	public void clickonFinishOpportunitypage1()
	{
		clickfinishbtn.click();
	}
	public void clickonTransionRefreshOpportunitypage1()
	{
		clickontransionRefresh.click();
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
