package Module1_Donor_Management;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_login1_page
{
	 @FindBy (xpath="//input[@type='email']")private WebElement UserName;
	 @FindBy (xpath="//input[@type='submit']")private  WebElement clickonNextbtn;
	
	public CRM_login1_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCRMlogin1page(String UN)
	{
		UserName.sendKeys(UN);
	}
	
	public void clickCRMloginNextbtn()
	{
		clickonNextbtn.click();
	}

}



//public void setDonorLoginPagecard(String cardno) 
//{
//	CardDetails_cardno.sendKeys(cardno);
////}