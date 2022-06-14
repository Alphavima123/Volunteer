package Module1_Donor_Management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DonorLoginPage3_6
{
	@FindBy(xpath="//a[@id='donate-monthly']") private WebElement DonateMonthly;
	@FindBy(xpath="//button[@value='75']") private WebElement DonateAmount;
	@FindBy(xpath="//a[@href='#next']") private WebElement Next;
	@FindBy(xpath="//label[@for=\"cause\"]") private WebElement Cause;
	@FindBy(xpath="//a[@href='#next']") private WebElement Next2;
	@FindBy(xpath="//input[@name='first_name']") private WebElement Fname;
	@FindBy(xpath="//input[@name='last_name']") private WebElement Lname;
	@FindBy(xpath="//input[@name='email']") private WebElement Email;
	@FindBy(xpath="//input[@name='phone']") private WebElement Phoneno;
	@FindBy(xpath="//input[@name='birthdate']") private WebElement Birthday;
	@FindBy(xpath="//input[@name='address']") private WebElement Adress;
	@FindBy(xpath="//input[@name='addressline1']") private WebElement Adressline1;
	@FindBy(xpath="//input[@name='addressltwo']") private WebElement Adressline2;
	@FindBy(xpath="//input[@name='city']") private WebElement City;
	@FindBy(xpath="//input[@name='country']") private WebElement Country;
	@FindBy(xpath="//input[@name='state']") private WebElement State;
	@FindBy(xpath="//input[@name='postcode']") private WebElement Postalcode;
	@FindBy(xpath="//input[@name='cardnumber']") private WebElement Cardno;
	@FindBy(xpath="//input[@name='cardcvc']") private WebElement CardCVV;
	@FindBy(xpath="//a[@href='#finish']") private WebElement Finish;
	
	public DonorLoginPage3_6 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickDonorLoginPage3_6DMonthly() {
		DonateMonthly.click();	
	}
	public void clickDonorLoginPage3_6DAmount() {
		DonateAmount.click();	
	}
	public void clickDonorLoginPage3_6Next() {
		Next.click();
	}
	public void clickDonorLoginPage3_6Cause() {
		Cause.click();
	}
	
	public void clickoncause(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='sel_cause']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);
	}
	
	public void clickDonorLoginPage3_6Next2() {
		Next2.click();
	}
	public void setDonorLoginPage3_6Fname(String fname) {
		Fname.sendKeys(fname);
	}
	public void setDonorLoginPage3_6Lname(String lname) {
		Lname.sendKeys(lname);
	}
	
	public void setDonorLoginPage3_6Email(String email) {
		Email.sendKeys(email);
	}
	
	public void setDonorLoginPage3_6pNumber(String phoneno) {
		Phoneno.sendKeys(phoneno);
	}
	public void setDonorLoginPage3_6Birthday() {
		Birthday.sendKeys("12/03/1984");
	}
	public void setDonorLoginPage3_6Address(String adress) {
		Adress.sendKeys(adress);
	}
	public void setDonorLoginPage3_6Address1(String Adress1) {
		Adressline1.sendKeys(Adress1);
	}
	public void setDonorLoginPage3_6Address2(String Adress2) {
		Adressline2.sendKeys(Adress2);
	}
	public void setDonorLoginPage3_6City(String city) {
		City.sendKeys(city);
	}
	public void setDonorLoginPage3_6country(String country) {
		Country.sendKeys(country);
	}
	public void setDonorLoginPage3_6State(String state) {
		State.sendKeys(state);
	}
	public void setDonorLoginPage3_6code(String postalcode) {
		Postalcode.sendKeys(postalcode);
	}
	public void setDonorLoginPage3_6card(String cardno) 
	{
		Cardno.sendKeys(cardno);
	}
	
	public void clickonyear(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='cardexpireyear']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void clickonmonth(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='cardexpiremonth']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	
	public void setDonorLoginPage3_6cvv(String cvvNo)
	{
		CardCVV.sendKeys(cvvNo);
	}
	public void clickDonorLoginPage3_6Finish() {
		Finish.click();
	}
}
