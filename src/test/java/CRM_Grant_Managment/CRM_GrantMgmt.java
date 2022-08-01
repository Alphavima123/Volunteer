package CRM_Grant_Managment;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class CRM_GrantMgmt extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	GrantMgmt_Grants Grant;
	
	@Test(priority = 1)
	public void OpentheBrowser() throws IOException
	{
		initilizeBrowser();
		
		login1= new CRM_login1_page(driver);
		login2= new CRM_login2_page(driver);
		Grant= new GrantMgmt_Grants(driver);
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
		Grant.clickonGrantMgmt(driver);
		Thread.sleep(2500);
		Grant.clickonGrants();
		Thread.sleep(1500);
		Grant.clickonNew();
		Thread.sleep(1500);
		Grant.clickonMoreHeaderFields();
		Thread.sleep(1500);
		Grant.clickonStatusReason(driver);
//		Thread.sleep(1500);
//		Grant.clickonSave();
		Grant.setCRMname(Utilityclass_CRM_page.getTD(12, 1));
		Thread.sleep(1500);
		Grant.clickonAgency(driver);
		Thread.sleep(1500);
		Grant.clickonCategory(driver);
		Thread.sleep(1500);
		Grant.setCRMVersion(Utilityclass_CRM_page.getTD(12, 2));
		Thread.sleep(3500);
	//	Grant.setCRMDescription(driver, Utilityclass_CRM_page.getTD(12, 3));
		Thread.sleep(1500);
		Grant.setCRMTotalProgramFunding(Utilityclass_CRM_page.getTD(12, 4));
		Thread.sleep(1500);
		Grant.setCRMExpectedNumberofAwards(Utilityclass_CRM_page.getTD(12, 5));
		Thread.sleep(1500);
//		Grant.setCRMExpectedNumberofAwards(Utilityclass_CRM_page.getTD(12, cellIndex));
		Grant.setCRMAwardCeiling(Utilityclass_CRM_page.getTD(12, 6));
		Thread.sleep(1500);
		Grant.setCRMAwardFloor(Utilityclass_CRM_page.getTD(12, 7));
		Thread.sleep(1500);
		Grant.setCRMFiscalYear(Utilityclass_CRM_page.getTD(12, 8));
		Thread.sleep(1500);
		Grant.clickonReviewer(driver);
		Thread.sleep(1500);
		Grant.setCRMApplicationOpenDate();
		Thread.sleep(1500);
		Grant.setCRMApplicationCloseDate();
		Thread.sleep(1500);
		Grant.setCRMAwardStartDate("StartDate");
		Thread.sleep(1500);
//		Grant.clickonSave();
//		Thread.sleep(1500);
//		Grant.clickonGrantEligibilityCriteria();
//		Thread.sleep(1500);
//		Grant.clickonNewGantEligibilityCriteria();
	//	Thread.sleep(1500);
//		Grant.setCRMName1(Utilityclass_CRM_page.getTD(12, 9));
//		Thread.sleep(1500);
//		Grant.clickonEligibilityCriteria(driver);
//		Thread.sleep(1500);
//		Grant.clickonDisplayinPortal(driver);
//		Thread.sleep(1500);
//		Grant.clickonCriteriaRequirement(driver);
		Thread.sleep(1500);
		Grant.clickonSave();	
//		Grant.clickonGrantApplications();
//		Thread.sleep(1500);
//		Grant.clickonNewGrantApplication();
	}
	@Test
	public void closebrowser() throws InterruptedException 
	{
		login1=null;
		login2=null;
		Grant=null;
		Thread.sleep(3000);
	//	driver.close();
		driver=null;	
					
	}
}
