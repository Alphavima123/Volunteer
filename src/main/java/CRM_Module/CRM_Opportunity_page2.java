package CRM_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Opportunity_page2 
{

//	@FindBy(xpath = "(//input[@role=\"combobox\"])[4]")private WebElement cause;
	
	@FindBy(xpath = "//label[text()='Recurring']")private WebElement clickondonationtype;
	
	@FindBy(xpath = "//button[@title='Close']")private WebElement clickonclosewindow;
//	@FindBy(xpath = "//span[text()='Save and continue']")private WebElement clickondonationtypeSave;

	
	@FindBy(xpath = "//button[@aria-label='Save (CTRL+S)']")private WebElement clickonsavebtn;
	@FindBy(xpath = "//label[text()='In Kind']")private WebElement clickondonationtypeInKind;

	@FindBy(xpath = "//input[@aria-label='Fair Market Value']")private WebElement InKindFairMarketvalueDonationType;
	
	@FindBy(xpath = "(//div[@title=\"Cultivate\"])[1]")private WebElement clickoncultivate;
	@FindBy(xpath = "(//div[@class='pa-a pa-bd pa-o pa-as flexbox'])[2]")private WebElement clickonnextstage;
	
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickonRefresh;
	
	@FindBy(xpath = "//input[@aria-label='Date of First Payment Date']")private WebElement Firstpaymentduedate;
	
	@FindBy(xpath = "(//div[@title='Solicit'])[1]")private WebElement clickonsolicit;
	
	@FindBy(xpath = "//button[@aria-label='Next Stage']")private WebElement clicknextbtn;
	@FindBy(xpath = "//button[@aria-label='Finish']")private WebElement clickfinishbtn;
	@FindBy(xpath = "//button[@aria-label='Refresh']")private WebElement clickontransionRefresh;
	@FindBy(xpath = "(//div[@role='gridcell'])[2]")private WebElement clickonTransion;
	@FindBy(xpath = "//input[@aria-label='Date of Received Date']")private WebElement clickonReceivedDate;
	@FindBy(xpath = "//button[@aria-label='More Header Fields']")private WebElement clickonMoreHeader;
	@FindBy(xpath = "//button[@aria-label='Press Enter to go back.']")private WebElement clickonBack;
	@FindBy(xpath = "//button[@aria-label='Close Opportunity']")private WebElement clickonOpportunity;
	
	public CRM_Opportunity_page2 (WebDriver driver)
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
	
	public void clickondonationtypeOpportunitypage2() throws InterruptedException
	{
		Thread.sleep(2000);
		clickondonationtype.click();
	}
	public void clickoncloseWindowOpportunitypage2() throws InterruptedException
	{
	//	Thread.sleep(2000);
		clickonclosewindow.click();
	}
	
	public void clickondonationtypeInKindlyOpportunitypage2() throws InterruptedException
	{
		Thread.sleep(2000);
		clickondonationtypeInKind.click();
	}
	
	public void clickonInKindTypeOpportunitypage2(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='In-Kind Donation Type']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	
	public void setCRMOpportunitypage2InkindFairMarketValue(String FairMarketvalue)
	{
		InKindFairMarketvalueDonationType.sendKeys(FairMarketvalue);
	}
	
//	public void clickonMultipletimesOpportunitypage2(WebDriver driver) throws InterruptedException
//	{
//		Thread.sleep(2000);
//		WebElement buttonelement = driver.findElement(By.xpath("//button[@aria-label=\"Increment value\"]"));
//		@SuppressWarnings("unused")
//		int i;
//		for(int i1=0; i1<=7; i1++)
//		{
//			buttonelement.click();
//		}
//		
////		clickonMultipletime.click();
//		
//	}
	
	public void clickonsavebuttonOpportunitypage2() 
	{
		clickonsavebtn.click();
	}
	
	public void clickoncultivatebtnOpportunitypage2()
	{
		clickoncultivate.click();
	}
	public void clickonnextstagebtnOpportunitypage2()
	{
		clickonnextstage.click();
	}
	
	public void clickonRefreshbuttonOpportunitypage2()
	{
		clickonRefresh.click();
	}
	
//	public void setCRMopportunitypage2payment(String username)
//	{
//		Firstpaymentduedate.sendKeys("05/30/2022");
//	}
	
	public void clickonsolicitbuttonOpportunitypage2()
	{
		clickonsolicit.click();
	}
	
	
	public void clickonRedinessOpportunitypage2(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Ask Readiness']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonrequestfordonationOpportunitypage2(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Request for Donation']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonconcernOpportunitypage2(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Resolve Concerns']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonnextbtnOpportunitypage2()
	{
		clicknextbtn.click();
	}
	public void clickonMarketinglistOpportunitypage2(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Add to Marketing List']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonPaymentrecivedOpportunitypage2(WebDriver driver)
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
	public void clickonFinishOpportunitypage2()
	{
		clickfinishbtn.click();
	}
	public void clickonTransionRefreshOpportunitypage2()
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
}
