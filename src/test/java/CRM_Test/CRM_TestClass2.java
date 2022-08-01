package CRM_Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CRM_Module.CRM_Opportunity_page2;
import CRM_Module.CRM_Prospect_Page2;
import Libery_Files.Baseclass;
import Libery_Files.Utilityclass;
import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;


public class CRM_TestClass2 extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_Prospect_Page2 Prospect;
	CRM_Opportunity_page2 Opportunity;
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
		Prospect= new CRM_Prospect_Page2(driver);
		Opportunity=new CRM_Opportunity_page2(driver);
				
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
		Prospect.clickonFunddevelopmentProspectpage2(driver);
		Prospect.clickonprospectpage2();
		Thread.sleep(1000);
		Prospect.clickonnewprospectpage2();
		Thread.sleep(1000);
		Prospect.clickonpotentialTypeProspectpage2(driver);
		Thread.sleep(1000);
		Prospect.clickonindividualprospectpage2();
	//	Thread.sleep(2000);
		Prospect.setCRMProspectpage2(Utilityclass_CRM_page.getTD(2, 2));
		Thread.sleep(1000);
		Prospect.setCRMProspectpage2date("date");
		Thread.sleep(1000);
		Prospect.clickonsourceprospectpage2(driver);
	//	Prospect.clickoncontact();
	//	Prospect.clickonselectcontact(driver);
		Thread.sleep(4000);
		Prospect.setCRMProspectpage2fname(Utilityclass_CRM_page.getTD(2, 3));
		Thread.sleep(4000);
		Prospect.setCRMProspectpage2lname(Utilityclass_CRM_page.getTD(2, 4));
		
		Prospect.setCRMPositionTitleprospectpage2(Utilityclass_CRM_page.getTD(2, 5));
		
		Thread.sleep(1000);
		Prospect.setCRMProspectpage2Emailid(Utilityclass_CRM_page.getTD(2, 6));
		Prospect.setCRMProspectpage2BusinessPhone(Utilityclass_CRM_page.getTD(2, 7));
		
		Prospect.setCRMProspectpage2BusinessPhoneeXT(Utilityclass_CRM_page.getTD(2, 8));
		Prospect.setCRMProspectpage2Mobilephone(Utilityclass_CRM_page.getTD(2, 9));
//		Prospect.setCRMprospectypage2cause("cause");
		Prospect.clickoncause(driver);
		Prospect.clickonTimeframe(driver);
		Prospect.setCRMpropspectDescription(CRM_Module.Utilityclass_CRM_page.getTD(2, 14));
	
		Thread.sleep(4000);
		Prospect.clickonsaveprospectpage2();
		Prospect.clickonqualifyprospectpage2();
		Prospect.clickonOK();
	//	Thread.sleep(2000);
	//	Opportunity.setCRMopportunitypagecause("cause");
		Thread.sleep(3000);
		Opportunity.clickondonationtypeOpportunitypage2();
		Thread.sleep(3000);
		Opportunity.clickoncloseWindowOpportunitypage2();
		Opportunity.clickondonationtypeInKindlyOpportunitypage2();
		Opportunity.clickonInKindTypeOpportunitypage2(driver);
		Opportunity.setCRMOpportunitypage2InkindFairMarketValue(Utilityclass_CRM_page.getTD(2, 10));
	//	Opportunity.clickondonationtypeQuaterlyOpportunitypage1();
	//	Thread.sleep(3000);
	//	Opportunity.clickonMultipletimesOpportunitypage1(driver);
	//	Opportunity.clickondonationtypeQuaterlysaveandcontinueOpportunitypage1();
		Thread.sleep(3000);
		Opportunity.clickonsavebuttonOpportunitypage2();
		
		Thread.sleep(3000);
		Opportunity.clickoncultivatebtnOpportunitypage2();
		Thread.sleep(1000);
		Opportunity.clickonnextstagebtnOpportunitypage2();
		Thread.sleep(3000);
		Opportunity.clickonRefreshbuttonOpportunitypage2();
		Thread.sleep(3000);
	//	Opportunity.setCRMopportunitypage2payment("Firstpaymentduedate");
		
		Opportunity.clickonsolicitbuttonOpportunitypage2();
		
		Opportunity.clickonRedinessOpportunitypage2(driver);
		Opportunity.clickonrequestfordonationOpportunitypage2(driver);
		Opportunity.clickonconcernOpportunitypage2(driver);
		Opportunity.clickonnextbtnOpportunitypage2();
		Opportunity.clickonMarketinglistOpportunitypage2(driver);
		Opportunity.clickonPaymentrecivedOpportunitypage2(driver);
	//	Opportunity.clickonThankyou(driver);
		Opportunity.clickonFinishOpportunitypage2();
		Opportunity.clickonTransionRefreshOpportunitypage2();
		
//		Opportunity.clickonTransion();
//		Opportunity.setCRMopportunitypageclickonReceivedDate("date");
//		Opportunity.clickonsavebuttonOpportunitypage2();
//		Opportunity.clickonMoreHeader();
//		Opportunity.clickonStatusReason(driver);
//		Opportunity.clickonsavebuttonOpportunitypage2();
//		Thread.sleep(3000);
//		Opportunity.clickonBack();
//		Opportunity.clickonOpportunity();
		
		
			
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
