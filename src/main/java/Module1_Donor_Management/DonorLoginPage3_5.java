package Module1_Donor_Management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DonorLoginPage3_5
{
	@FindBy(xpath="//a[@id='donate-now']") private WebElement DonateNow;
	@FindBy(xpath="//button[@value='75']") private WebElement DonateAmount;
	@FindBy(xpath="//a[@href='#next']") private WebElement Next;
	@FindBy(xpath="//label[@for='fund']") private WebElement Fund;
	@FindBy(xpath="(//label[@class='control'])[1]") private WebElement Tributegift;
	@FindBy(xpath="//input[@name='bs_honor']") private WebElement TributeName;
	@FindBy(xpath="//a[@href='#next']") private WebElement Next2;
	@FindBy(xpath="(//label[@class='control'])[2]") private WebElement Businessinfo;
	@FindBy(xpath="//input[@name='business_name']") private WebElement BusinessName;
	@FindBy(xpath="//input[@name='business_phone_number']") private WebElement BusinessPhoneno;
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
	@FindBy(xpath="//label[@for='nopublic']") private WebElement NO;
	@FindBy(xpath="//a[@href='#finish']") private WebElement Finish;
	
	
	public DonorLoginPage3_5 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickDonorLoginPage3_5DNow() {
		DonateNow.click();	
	}
	public void clickDonorLoginPage3_5DAmount() {
		DonateAmount.click();	
	}
	public void clickDonorLoginPage3_5Next() {
		Next.click();
	}
	public void clickDonorLoginPage3_5fund() {
		Fund.click();
	}
	
	public void clickonfund(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='sel_fund']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void clickDonorLoginPage3_5tgift() {
		Tributegift.click();
	}
	
	public void clickonTributegift(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='sel_city']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void setDonorLoginPage3_5Tname(String tname) {
		TributeName.sendKeys(tname);
	}
	public void clickDonorLoginPage3_5Next2() {
		Next2.click();
	}
	
	public void clickDonorLoginPage3_5Binfo() {
		Businessinfo.click();
	}
	public void setDonorLoginPage3_5Bname(String bname) {
		BusinessName.sendKeys(bname);
	}
	public void setDonorLoginPage3_5BPhoneno(String bphoneno) {
		BusinessPhoneno.sendKeys(bphoneno);
	}
	
	public void setDonorLoginPage3_5Fname(String fname) {
		Fname.sendKeys(fname);
	}
	public void setDonorLoginPage3_5Lname(String lname) {
		Lname.sendKeys(lname);
	}
	
	public void setDonorLoginPage3_5Email(String email) {
		Email.sendKeys(email);
	}
	
	public void setDonorLoginPage3_5pNumber(String phoneno) {
		Phoneno.sendKeys(phoneno);
	}
	public void setDonorLoginPage3_5Birthday() {
		Birthday.sendKeys("12/03/1984");
	}
	public void setDonorLoginPage3_5Address(String adress) {
		Adress.sendKeys(adress);
	}
	public void setDonorLoginPage3_5Address1(String Adress1) {
		Adressline1.sendKeys(Adress1);
	}
	public void setDonorLoginPage3_5Address2(String Adress2) {
		Adressline2.sendKeys(Adress2);
	}
	public void setDonorLoginPage3_5City(String city) {
		City.sendKeys(city);
	}
	public void setDonorLoginPage3_5country(String country) {
		Country.sendKeys(country);
	}
	public void setDonorLoginPage3_5State(String state) {
		State.sendKeys(state);
	}
	public void setDonorLoginPage3_5code(String postalcode) {
		Postalcode.sendKeys(postalcode);
	}
	public void setDonorLoginPage3_5card(String cardno) 
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
	
	public void setDonorLoginPage3_5cvv(String cvvNo)
	{
		CardCVV.sendKeys(cvvNo);
	}
	public void clickDonorLoginPage3_5publishNo() {
		NO.click();
	}
	public void clickDonorLoginPage3_5Finish() {
		Finish.click();
	}
	
}
