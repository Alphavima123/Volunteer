package CRM_Module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRM_Causes
{
	@FindBy(xpath="//div[@id='AppDetailsSec_1_Item_10']")private WebElement clickFunddevelopment;
	@FindBy(xpath="//span[text()='Causes']")private WebElement clickonCauses;
	@FindBy(xpath="//button[@aria-label='New']")private WebElement clickonNew;

    @FindBy(xpath = "//div[@aria-label='Cause']") private WebElement clickoncause1;
    @FindBy(xpath = "//input[@aria-label='Cause Name']") private WebElement CauseName;
    @FindBy(xpath = "//textarea[@aria-label='Description']") private WebElement Description; 
    @FindBy(xpath = "//input[@aria-label='Target Amount']") private WebElement TargetAmount;
	@FindBy(xpath="//button[@aria-label='Save (CTRL+S)']")private WebElement Save;

 
}
