package Module1_Donor_Management;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_login2_page
{
	 @FindBy (xpath="//input[@name='passwd']")private WebElement Password;
	 @FindBy (xpath="//input[@value='Sign in']")private  WebElement clickonSignbtn;
	 @FindBy (xpath="//input[@type='button']")private  WebElement clickonPopup;
	
	public CRM_login2_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCRMlogin2page(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickCRMloginSignbtn()
	{
		clickonSignbtn.click();
	}
	
	public void clickCRMonPopup()
	{
	  	clickonPopup.click();
	}


}
