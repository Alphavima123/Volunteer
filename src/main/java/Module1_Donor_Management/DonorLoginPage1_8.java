package Module1_Donor_Management;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
public class DonorLoginPage1_8 
{
//1
	@FindBy(xpath="//a[text()='Donate']") private WebElement Donate;

	@FindBy(xpath="//label[@for='donatemonthly']") private WebElement Donatemonthly;
    @FindBy(xpath="//button[@value='100']") private WebElement DonationAmount;
	@FindBy(xpath="//label[@for='fund']") private WebElement Fund;
	@FindBy(xpath="//input[@name='first_name']") private WebElement ContactInfo_Fname;
	@FindBy(xpath="//input[@name='last_name']") private WebElement ContactInfo_lname;
	@FindBy(xpath="//input[@name='email']") private WebElement ContactInfo_Email;
	@FindBy(xpath="//input[@name='phone_number']") private WebElement ContactInfo_phoneno;
	@FindBy(xpath="//input[@name='address']") private WebElement Address_Eadd;
	@FindBy(xpath="//input[@id='street']") private WebElement Address1_Eadd1;
	@FindBy(xpath="//input[@name='city']") private WebElement Address_Ecity;
	@FindBy(xpath="//input[@name='country']") private WebElement Address_Ecountry;
	@FindBy(xpath="//input[@name='state']") private WebElement Address_Estate;
	@FindBy(xpath="//input[@name='zip']") private WebElement Address_postalcode;
	@FindBy(xpath="//input[@name='cardnumber']") private WebElement CardDetails_cardno;
//	@FindBy(xpath="//select[@id='cardexpireyear']") private WebElement CardDetails_Eyear;
//	@FindBy(xpath="//select[@id='cardexpiremonth']") private WebElement CardDetails_Emonth;
	@FindBy(xpath="//input[@name='cardcvc']") private WebElement CardDetails_cardcvv;
	@FindBy(xpath="//button[@id='sumbitbtn']") private WebElement submitbtn;
//2	
	public DonorLoginPage1_8 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	3
	public void clickonDonate()
	{
		Donate.click();
	}
	public void clickDonorLoginPageDmonthly() {
		Donatemonthly.click();	
	}
	public void clickDonorLoginPageDAmount() {
		DonationAmount.click();	
	}
	public void clickDonorLoginPageFund() {
		Fund.click();
	}
	
	public void clickoncause(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='sel-fund']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);
	}
	
	public void setDonorLoginPageFname(String Fname) {
		ContactInfo_Fname.sendKeys(Fname);
	}
	public void setDonorLoginPageLname(String Lname) {
		ContactInfo_lname.sendKeys(Lname);
	}
	
	public void setDonorLoginPageEmail(String Email) {
		ContactInfo_Email.sendKeys(Email);
	}
	public void setDonorLoginPageNumber(String MobileNo) {
		ContactInfo_phoneno.sendKeys(MobileNo);
	}
	public void setDonorLoginPageAddress(String Adress) {
		Address_Eadd.sendKeys(Adress);
	}
	public void setDonorLoginPageAddress1(String Adress1) {
		Address1_Eadd1.sendKeys(Adress1);
	}
	public void setDonorLoginPageCity(String City) {
		Address_Ecity.sendKeys(City);
	}
	public void setDonorLoginPagecountry(String Country) {
		Address_Ecountry.sendKeys(Country);
	}
	public void setDonorLoginPageState(String State) {
		Address_Estate.sendKeys(State);
	}
	public void setDonorLoginPagecode(String Postalcode) {
		Address_postalcode.sendKeys(Postalcode);
	}
	public void setDonorLoginPagecard(String cardno) 
	{
		CardDetails_cardno.sendKeys(cardno);
	}
	
	public void clickonyear(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@id='cardexpireyear']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void clickonmonth(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@id='cardexpiremonth']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	
	public void setDonorLoginPagecvv(String cvvNo)
	{
		CardDetails_cardcvv.sendKeys(cvvNo);
	}
	public void clickDonorLoginPageSubmit() {
		submitbtn.click();
	}
	
}
