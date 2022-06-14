package CRM_Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CRM_Module.CRM_Opportunity_page3;
import CRM_Module.CRM_Prospect_Page3;
import Libery_Files.Baseclass;
import Libery_Files.Utilityclass;
import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;


public class CRM_TestClass3 extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_Prospect_Page3 Prospect;
	CRM_Opportunity_page3 Opportunity;
	int TestcaseID;
	
	@BeforeClass
	public void m1()
	{
		
	}
	
	@BeforeMethod
	public void OpenTheBrowser() throws IOException
	{
		initilizeBrowser();
		
		login1=new CRM_login1_page(driver);
		login2=new CRM_login2_page(driver);
		Prospect= new CRM_Prospect_Page3(driver);
		Opportunity=new CRM_Opportunity_page3(driver);
				
	}
	
	@Test
	public void loginToApp() throws IOException, InterruptedException 
	{
		TestcaseID=100;
		
		login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(1, 0));
		login1.clickCRMloginNextbtn();
		Thread.sleep(1000);
		login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(1, 1));
		login2.clickCRMloginSignbtn();
		login2.clickCRMonPopup();
		//Thread.sleep(2000);
		Prospect.clickonFunddevelopment(driver);
		Prospect.clickonprospect();
		Thread.sleep(1000);
		Prospect.clickonnew();
		Thread.sleep(1000);
		Prospect.clickonpotentialTypeProspectPage3(driver);
		Thread.sleep(1000);
		Prospect.clickonORGANIZATIONProspectPage3();
	//	Thread.sleep(2000);
		Prospect.setCRMProspectpage3(Utilityclass_CRM_page.getTD(1, 2));
		Thread.sleep(1000);
		Prospect.setCRMProspectpage3date("date");
		Thread.sleep(1000);
		Prospect.clickonsourceProspectpage3(driver);
	//	Prospect.clickoncontact();
	//	Prospect.clickonselectcontact(driver);
		Thread.sleep(4000);
		Prospect.setCRMProspectpage3fname(Utilityclass_CRM_page.getTD(1, 3));
		Thread.sleep(4000);
		Prospect.setCRMProspectpage3lname(Utilityclass_CRM_page.getTD(1, 4));
		
		Prospect.setCRMPositionTitleProspectpage3(Utilityclass_CRM_page.getTD(1, 5));
		
		Thread.sleep(1000);
		Prospect.setCRMProspectpage3Emailid(Utilityclass_CRM_page.getTD(1, 6));
		Prospect.setCRMProspectpage3BusinessPhone(Utilityclass_CRM_page.getTD(1, 7));
		
		Prospect.setCRMProspectpage3BusinessPhoneeXT(Utilityclass_CRM_page.getTD(1, 8));
		Prospect.setCRMProspectpage3Mobilephone(Utilityclass_CRM_page.getTD(1, 9));
		Prospect.setCRMProspectpage3cause("cause");
		Thread.sleep(3000);
		Prospect.setNeworgaizationProspectpage3(Utilityclass_CRM_page.getTD(1, 11));
		Prospect.setNeworgaizationphonenoProspectpage3(Utilityclass_CRM_page.getTD(1, 12));
		Prospect.setNeworgaizationEmailProspectpage3(Utilityclass_CRM_page.getTD(1, 13));
		Thread.sleep(4000);
		Prospect.clickonsaveProspectpage3();
		Prospect.clickonqualifyProspectpage3();
		Prospect.clickonpopupProspectpage3();
	//	Thread.sleep(2000);
	//	Opportunity.setCRMopportunitypagecause("cause");
		Thread.sleep(3000);
		Opportunity.clickondonationtypeOpportunitypage3();
		
		Opportunity.clickonsavebuttonOpportunitypage3();
		
		Thread.sleep(3000);
		Opportunity.clickoncultivatebtnOpportunitypage3();
		Thread.sleep(1000);
		Opportunity.clickonnextstagebtnOpportunitypage3();
		Thread.sleep(3000);
		Opportunity.clickonRefreshbuttonOpportunitypage3();
		Thread.sleep(3000);
		Opportunity.setCRMopportunitypage3payment("Paymentduedate");
		
		Opportunity.clickonsolicitbuttonOpportunitypage3();
		
		Opportunity.clickonRedinessOpportunitypage3(driver);
		Opportunity.clickonrequestfordonationOpportunitypage3(driver);
		Opportunity.clickonconcernOpportunitypage3(driver);
		Opportunity.clickonnextbtnOpportunitypage3();
		Opportunity.clickonMarketinglistOpportunitypage3(driver);
		Opportunity.clickonPaymentrecivedOpportunitypage3(driver);
	//	Opportunity.clickonThankyou(driver);
		Opportunity.clickonFinishOpportunitypage3();
		Opportunity.clickonTransionRefreshOpportunitypage3();
		
		
			
	}
	
	@AfterMethod
	public void logoutBrowser(ITestResult result) throws InterruptedException, IOException 
	{	
		if(result.getStatus()==ITestResult.FAILURE)					//code for the failed test cases
		{
			Utilityclass.CaptureScreenShot(driver, TestcaseID);
		}
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
		login1=null;
		login2=null;
		Prospect=null;
		Opportunity=null;
		Thread.sleep(3000);
//		driver.close();
		driver=null;	
					
	}

}
