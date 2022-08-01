package CRM_Grant_Managment;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class CRM_GrantMgmtGrantApplications extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	GrantMgmt_GrantApplications Grant;
	
	@Test(priority = 1)
	public void OpentheBrowser() throws IOException
	{
		initilizeBrowser();
		
		login1= new CRM_login1_page(driver);
		login2= new CRM_login2_page(driver);
		Grant= new GrantMgmt_GrantApplications(driver);
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
		Grant.clickonGrantApplications();
		Thread.sleep(2500);
		Grant.clickonNew();
		Thread.sleep(2500);
		Grant.setCRMname(Utilityclass_CRM_page.getTD(26, 1));
		Thread.sleep(2500);
		Grant.clickonBeneficiary(driver);
//		Thread.sleep(1500);
//		Grant.clickonSave();
		Grant.clickonGrant(driver);
		Thread.sleep(2500);
		Grant.setCRMDueDate();
		Thread.sleep(2500);
		Grant.setCRMSubmittedon();
		Thread.sleep(2500);
		Grant.clickonReviewer(driver);
		Thread.sleep(3500);
	//	Grant.setCRMDescription(driver, Utilityclass_CRM_page.getTD(12, 3));
		Thread.sleep(2500);
		Grant.setCRMAmountAsked(Utilityclass_CRM_page.getTD(26, 2));
		Thread.sleep(2500);
		Grant.setCRMAmountAwarded(Utilityclass_CRM_page.getTD(26, 3));
		Thread.sleep(2500);
		
		Grant.clickonSave();
		Thread.sleep(3500);
		Grant.clickonAssign();
		Thread.sleep(2500);
		Grant.clickonNext();
		Thread.sleep(2500);
		Grant.clickonNeedRevision(driver);
		Thread.sleep(2500);
		Grant.setCRMRevisionReason(Utilityclass_CRM_page.getTD(26, 4));
		Thread.sleep(2500);
		Grant.clickonNext();
		Thread.sleep(2500);
		Grant.clickonRefresh();
		Thread.sleep(2500);
//		Grant.clickonSetActive();
//		
//		Thread.sleep(1500);
		Grant.clickonAssign();
		Thread.sleep(2500);
		Grant.clickonNext();
		Thread.sleep(2500);
		Grant.clickonNext();
		Thread.sleep(2500);
		Grant.clickonStatusReason(driver);
		Thread.sleep(2500);
		Grant.clickonNext();
		Thread.sleep(1500);
	//	Grant.clickonRefresh();
	//	Thread.sleep(1500);
	//	Grant.clickonApprove();
	//	Thread.sleep(1500);
	//	Grant.clickonNext();
		Thread.sleep(1500);
		Grant.clickonFinish();
		
		
//		Grant.clickonAssign();
//		Thread.sleep(2500);
//		Grant.clickonNext();
//		Thread.sleep(2500);
//		
//		Grant.clickonNext();
//		Thread.sleep(1500);
//		Grant.clickonRefresh();
//		Thread.sleep(1500);
//		Grant.clickonApprove();
//		Thread.sleep(1500);
//		Grant.clickonNext();
//		Thread.sleep(1500);
//		Grant.clickonFinish();
//		Thread.sleep(1500);
		Grant.clickonGrantApplicationEligibilityCriteria();
		Thread.sleep(1500);
		Grant.clickonNewGrantappli();
		Thread.sleep(1500);
		Grant.setCRMName1(Utilityclass_CRM_page.getTD(26, 5));
		Thread.sleep(1500);
		Grant.clickonGrantEligibilityCriteria(driver);
		Thread.sleep(1500);
		Grant.clickonApplicantAnswer(driver);	
		Grant.clickonSave();
		Thread.sleep(1500);
		Grant.clickonBackbutton();
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
