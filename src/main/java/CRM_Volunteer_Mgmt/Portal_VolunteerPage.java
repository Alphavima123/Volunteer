package CRM_Volunteer_Mgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portal_VolunteerPage
{
	@FindBy(xpath="//a[text()='Register']")private WebElement clickonRegister;
	@FindBy(xpath="//a[text()='Sign up now']")private WebElement clickonSignupnow;
	@FindBy(xpath="//input[@name='Email Address']")private WebElement EmailAddress;
	@FindBy(xpath="//input[@name='Password']")private WebElement Password;
	@FindBy(xpath="//button[text()='Sign in']")private WebElement clickonSignin;
	@FindBy(xpath="//input[@name='first_name']")private WebElement first_name;
	@FindBy(xpath="//input[@name='last_name']")private WebElement last_name;
	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//input[@name='mobile_number']")private WebElement mobile_number;
	@FindBy(xpath="//input[@name='address']")private WebElement address;
	@FindBy(xpath="//input[@name='street_address']")private WebElement street_address;
	@FindBy(xpath="//input[@name='land_mark']")private WebElement land_mark;
	@FindBy(xpath="//input[@name='city']")private WebElement city;
	@FindBy(xpath="//input[@name='province']")private WebElement province;
	@FindBy(xpath="//input[@name='country']")private WebElement country;
	@FindBy(xpath="//input[@name='zipcode']")private WebElement zipcode;
	
	@FindBy(xpath="//input[@name='volunteer_experience']")private WebElement volunteer_experience;
	
//	@FindBy(xpath="//input[@class='select2-input select2-default']")private WebElement AreaofIntrest;
	@FindBy(xpath="//textarea[@name='further_information']")private WebElement further_information;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement clickonsubmit;
	@FindBy(xpath="//a[text()='Back to My Dashboard']")private WebElement clickonDashboard;
	@FindBy(xpath="(//span[@class='active-para'])[5]")private WebElement clickonViewDetails;
	@FindBy(xpath="(//button[@data-target='#applyNow'])[2]")private WebElement clickonApplyNow;

	
	
	public Portal_VolunteerPage  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonVolunteers(WebDriver driver)
	{
		WebElement Volunteers = driver.findElement(By.xpath("(//a[@aria-label='Volunteers'])[1]"));
		Actions act=new Actions(driver);
		act.click(Volunteers).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	public void clickonRegister()
	{
		clickonRegister.click();
	}
	public void clickonSignupnow()
	{
		clickonSignupnow.click();
	}
	public void setVolunteerpageEmailAddress(String email, WebDriver driver)
	{
		EmailAddress.sendKeys(email);		
	}
//	public void getdata(WebDriver driver)
//	{
//		String Email = driver.findElement(By.xpath("//input[@name='Email Address']")).getText();
//		System.out.println(Email);
//		Reporter.log(Email, true);
//	}
	public void setVolunteerpagePassword(String email)
	{
		Password.sendKeys(email);
	}
	public void clickonSignin()
	{
		clickonSignin.click();
	}
	public void setVolunteerpageFirstName(String fname)
	{
		first_name.clear();
		first_name.sendKeys(fname);
	}
	public void setVolunteerpageLastName(String Lname)
	{
		last_name.clear();
		last_name.sendKeys(Lname);
	}
	public void setVolunteerpageEmail(String Email)
	{
		email.clear();
		email.sendKeys(Email);
	}
	public void setVolunteerpageMobileNo(String mobile)
	{
		mobile_number.clear();
		mobile_number.sendKeys(mobile);
	}
	public void setVolunteerpageAddress(String Address)
	{
		address.clear();
		address.sendKeys(Address);
	}
	public void setVolunteerpageStreetAddress(String sAddress)
	{
		street_address.clear();
		street_address.sendKeys(sAddress);
	}
	public void setVolunteerpageLandmark(String Lmark)
	{
		land_mark.clear();
		land_mark.sendKeys(Lmark);
	}
	public void setVolunteerpageCity(String City)
	{
		city.clear();
		city.sendKeys(City);
	}
	public void setVolunteerpageProvince(String Province)
	{
		province.clear();
		province.sendKeys(Province);
	}
	public void setVolunteerpageCountry(String Country)
	{
		country.clear();
		country.sendKeys(Country);
	}
	public void setVolunteerpageZipcode(String Zipcode)
	{
		zipcode.clear();
		zipcode.sendKeys(Zipcode);
	}
	public void clickonAgerange(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='age_range']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(3);
	}
	
	public void setVolunteerpagevolunteer_experience(String vexperience)
	{
		volunteer_experience.clear();
		volunteer_experience.sendKeys(vexperience);
	}
	public void clickonwant_to_volunteer(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='want_to_volunteer']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);
	}
	public void clickonAreaofIntrest(WebDriver driver)
	{
		WebElement Area = driver.findElement(By.xpath("//input[@class='select2-input select2-default']"));
		Actions act=new Actions(driver);
		act.click(Area).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	public void setVolunteerpageFurther_information(String finformation)
	{
		further_information.clear();
		further_information.sendKeys(finformation);
	}
	public void clickonsubmit()
	{
		clickonsubmit.click();
	}
	public void clickonDashboard()
	{
		clickonDashboard.click();
	}
	public void clickonViewDetails()
	{
		clickonViewDetails.click();
	}
	public void clickonApplyNow()
	{
		clickonApplyNow.click();
	}
	
}
