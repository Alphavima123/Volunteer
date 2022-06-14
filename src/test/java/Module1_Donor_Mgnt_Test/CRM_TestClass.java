package Module1_Donor_Mgnt_Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libery_Files.Baseclass;
import Libery_Files.Utilityclass;
import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_Opportunity_page;
import Module1_Donor_Management.CRM_Prospect_Page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;


public class CRM_TestClass extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_Prospect_Page Prospect;
	CRM_Opportunity_page Opportunity;
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
		Prospect= new CRM_Prospect_Page(driver);
		Opportunity=new CRM_Opportunity_page(driver);
				
	}
	
	@Test
	public void loginToApp() throws IOException, InterruptedException 
	{
		TestcaseID=100;
		
		login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(1, 0));
		login1.clickCRMloginNextbtn();
		login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(1, 1));
		login2.clickCRMloginSignbtn();
		login2.clickCRMonPopup();
		//Thread.sleep(2000);
		Prospect.clickonFunddevelopment(driver);
		Prospect.clickonprospect();
		Thread.sleep(1000);
		Prospect.clickonnew();
		Thread.sleep(1000);
		Prospect.clickonpotentialType(driver);
		Thread.sleep(1000);
		Prospect.clickonindividual();
	//	Thread.sleep(2000);
		Prospect.setCRMProspectpage(Utilityclass_CRM_page.getTD(1, 2));
		Thread.sleep(1000);
		Prospect.setCRMProspectpagedate("date");
		Thread.sleep(1000);
		Prospect.clickonsource(driver);
	//	Prospect.clickoncontact();
	//	Prospect.clickonselectcontact(driver);
		Thread.sleep(4000);
		Prospect.setCRMProspectpagefname(Utilityclass_CRM_page.getTD(1, 3));
		Thread.sleep(4000);
		Prospect.setCRMProspectpagelname(Utilityclass_CRM_page.getTD(1, 4));
		
		Prospect.setCRMPositionTitle(Utilityclass_CRM_page.getTD(1, 5));
		
		Thread.sleep(1000);
		Prospect.setCRMProspectpageEmailid(Utilityclass_CRM_page.getTD(1, 6));
		Prospect.setCRMProspectpageBusinessPhone(Utilityclass_CRM_page.getTD(1, 7));
		
		Prospect.setCRMProspectpageBusinessPhoneeXT(Utilityclass_CRM_page.getTD(1, 8));
		Prospect.setCRMProspectpageMobilephone(Utilityclass_CRM_page.getTD(1, 9));
		Prospect.setCRMopportunitypagecause("cause");
		Thread.sleep(4000);
		Prospect.clickonsave();
		Prospect.clickonqualify();
		Prospect.clickonpopup();
	//	Thread.sleep(2000);
	//	Opportunity.setCRMopportunitypagecause("cause");
		Thread.sleep(3000);
		Opportunity.clickondonationtype();
		
		Opportunity.clickonsavebutton();
		
		Thread.sleep(3000);
		Opportunity.clickoncultivatebtn();
		Thread.sleep(1000);
		Opportunity.clickonnextstagebtn();
		Thread.sleep(3000);
		Opportunity.clickonRefreshbutton();
		Thread.sleep(3000);
		Opportunity.setCRMopportunitypagepayment("Paymentduedate");
		
		Opportunity.clickonsolicitbutton();
		
		Opportunity.clickonRediness(driver);
		Opportunity.clickonrequestfordonation(driver);
		Opportunity.clickonconcern(driver);
		Opportunity.clickonnextbtn();
		Opportunity.clickonMarketinglist(driver);
		Opportunity.clickonPaymentrecived(driver);
	//	Opportunity.clickonThankyou(driver);
		Opportunity.clickonFinish();
		Opportunity.clickonTransionRefresh();
		
		
			
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
