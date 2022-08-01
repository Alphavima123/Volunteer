package CRM_Grant_Managment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class CRM_Gant_Eligibility_Criteria extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	GrantSetup_Gant_Eligibility_Criteria Grant;
	
	@Test(priority = 1)
	public void OpentheBrowser() throws IOException
	{
		initilizeBrowser();
		
		login1= new CRM_login1_page(driver);
		login2= new CRM_login2_page(driver);
		Grant= new GrantSetup_Gant_Eligibility_Criteria(driver);
	}
	@Test(priority = 2)
	public void LoginToAap() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(1, 0));
		login1.clickCRMloginNextbtn();
		Thread.sleep(1500);
		login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(1, 1));
		login2.clickCRMloginSignbtn();
		login2.clickCRMonPopup();
		Thread.sleep(2500);
		Grant.clickonGrantSetup(driver);
		Thread.sleep(2500);
		Grant.clickonGrantEligibilityCriteria();
		Thread.sleep(1500);
		Grant.clickonNew();
		Thread.sleep(1500);
		Grant.setCRMName1(Utilityclass_CRM_page.getTD(12, 9));
		Thread.sleep(1500);
		Grant.clickonEligibilityCriteria(driver);
		Thread.sleep(1500);
		Grant.clickonGrant(driver);
		Thread.sleep(1500);
		Grant.clickonDisplayinPortal(driver);
		Thread.sleep(1500);
		Grant.clickonCriteriaRequirement(driver);
		Thread.sleep(1500);
		Grant.clickonSave();
	
	}
	@Test
	public void closebrowser() throws InterruptedException 
	{
		login1=null;
		login2=null;
		Grant=null;
		Thread.sleep(3000);
//		driver.close();
		driver=null;	
					
	}
}
