package CRM_Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CRM_Module.CRM_Opportunity_page1;
import CRM_Module.CRM_Prospect_Page1;
import Libery_Files.Baseclass;
import Libery_Files.Utilityclass;
import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;


public class CRM_TestClass1 extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_Prospect_Page1 Prospect;
	CRM_Opportunity_page1 Opportunity;
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
		Prospect= new CRM_Prospect_Page1(driver);
		Opportunity=new CRM_Opportunity_page1(driver);
				
	}
	
	@Test
	public void loginToApp() throws IOException, InterruptedException 
	{
		TestcaseID=100;
		
		login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(2, 0));
		login1.clickCRMloginNextbtn();
		login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(2, 1));
		login2.clickCRMloginSignbtn();
		login2.clickCRMonPopup();
		//Thread.sleep(2000);
		Prospect.clickonFunddevelopmentProspectpage1(driver);
		Prospect.clickonprospectpage1();
		Thread.sleep(1000);
		Prospect.clickonnewprospectpage1();
		Thread.sleep(1000);
		Prospect.clickonpotentialTypeProspectpage1(driver);
		Thread.sleep(1000);
		Prospect.clickonindividualprospectpage1();
	//	Thread.sleep(2000);
		Prospect.setCRMProspectpage1(Utilityclass_CRM_page.getTD(2, 2));
		Thread.sleep(1000);
		Prospect.setCRMProspectpage1date("date");
		Thread.sleep(3000);
		Prospect.clickonsourceprospectpage1(driver);
	//	Prospect.clickoncontact();
	//	Prospect.clickonselectcontact(driver);
		Thread.sleep(4000);
		Prospect.setCRMProspectpage1fname(Utilityclass_CRM_page.getTD(2, 3));
		Thread.sleep(4000);
		Prospect.setCRMProspectpage1lname(Utilityclass_CRM_page.getTD(2, 4));
		
		Prospect.setCRMPositionTitleprospectpage1(Utilityclass_CRM_page.getTD(2, 5));
		
		Thread.sleep(1000);
		Prospect.setCRMProspectpage1Emailid(Utilityclass_CRM_page.getTD(2, 6));
		Prospect.setCRMProspectpage1BusinessPhone(Utilityclass_CRM_page.getTD(2, 7));
		
		Prospect.setCRMProspectpage1BusinessPhoneeXT(Utilityclass_CRM_page.getTD(2, 8));
		Prospect.setCRMProspectpage1Mobilephone(Utilityclass_CRM_page.getTD(2, 9));
	//	Prospect.setCRMprospectypage1cause("cause");
		Prospect.clickoncause(driver);
		Prospect.clickonTimeframe(driver);
		Prospect.setCRMpropspectDescription(CRM_Module.Utilityclass_CRM_page.getTD(2, 14));
		Thread.sleep(4000);
		Prospect.clickonsaveprospectpage1();
		Prospect.clickonqualifyprospectpage1();
	//	Prospect.clickonpopupprospectpage1();
		Prospect.clickonOK();
	//	Thread.sleep(2000);
	//	Opportunity.setCRMopportunitypagecause("cause");
		Thread.sleep(3000);
		Opportunity.clickondonationtypeOpportunitypage1();
		Thread.sleep(3000);
		Opportunity.clickoncloseWindowOpportunitypage1();
		Opportunity.clickondonationtypeQuaterlyOpportunitypage1();
	//	Thread.sleep(3000);
		Opportunity.clickonMultipletimesOpportunitypage1(driver);
	//	Opportunity.clickondonationtypeQuaterlysaveandcontinueOpportunitypage1();
		Thread.sleep(3000);
		Opportunity.clickonsavebuttonOpportunitypage1();
		
		Thread.sleep(3000);
		Opportunity.clickoncultivatebtnOpportunitypage1();
		Thread.sleep(1000);
		Opportunity.clickonnextstagebtnOpportunitypage1();
		Thread.sleep(5000);
		Opportunity.clickonRefreshbuttonOpportunitypage1();
		Thread.sleep(5000);
	//	Opportunity.setCRMopportunitypage1payment("Firstpaymentduedate");
		
		Opportunity.clickonsolicitbuttonOpportunitypage1();
		
		Opportunity.clickonRedinessOpportunitypage1(driver);
		Opportunity.clickonrequestfordonationOpportunitypage1(driver);
		Opportunity.clickonconcernOpportunitypage1(driver);
		Opportunity.clickonnextbtnOpportunitypage1();
		Opportunity.clickonMarketinglistOpportunitypage1(driver);
		Opportunity.clickonPaymentrecivedOpportunitypage1(driver);
	//	Opportunity.clickonThankyou(driver);
		Opportunity.clickonFinishOpportunitypage1();
		Opportunity.clickonTransionRefreshOpportunitypage1();
		
		Opportunity.clickonTransion();
		Opportunity.setCRMopportunitypageclickonReceivedDate("date");
		Opportunity.clickonsavebuttonOpportunitypage1();
		Opportunity.clickonMoreHeader();
		Opportunity.clickonStatusReason(driver);
		Opportunity.clickonsavebuttonOpportunitypage1();
		Thread.sleep(3000);
		Opportunity.clickonBack();
		Opportunity.clickonOpportunity();
		
		
			
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
