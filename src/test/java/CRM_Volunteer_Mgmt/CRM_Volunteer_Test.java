package CRM_Volunteer_Mgmt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_Volunteer_Test extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_Opportunity_page Opportunity;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	Opportunity= new CRM_VOL_Opportunity_page(driver);
}
@SuppressWarnings("deprecation")
@Test(priority = 2)
public void loginToApp() throws IOException, InterruptedException 
{
//	TestcaseID=100;
	
	login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(1, 0));
	login1.clickCRMloginNextbtn();
	Thread.sleep(1500);
	login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(1, 1));
	login2.clickCRMloginSignbtn();
	login2.clickCRMonPopup();
	Opportunity.clickonVolunteerAap(driver);
	Opportunity.clickonOpprotunities();
	Opportunity.clickonNew();
	Opportunity.ClickonMoreHeaderFields();
	Opportunity.clickonStatusReason(driver);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1500);
	Opportunity.setCRMvolunteerpageTitle(Utilityclass.getTD(2, 2));
	Opportunity.setCRMvolunteerpageGoal(Utilityclass.getTD(2, 3));
	Opportunity.setCRMvolunteerpageDescription(Utilityclass.getTD(2, 4));
	Opportunity.setCRMvolunteerpageCommitment(Utilityclass.getTD(2, 5));
	Opportunity.setCRMvolunteerpageRequirement(Utilityclass.getTD(2, 6));
	Opportunity.setCRMvolunteerpageBenefit(Utilityclass.getTD(2, 7));
	Opportunity.setCRMvolunteerpageTraining(Utilityclass.getTD(2, 8));
	Opportunity.clickonNotRequired();
	Opportunity.clickonAccounts();
	Opportunity.setCRMvolunteerpageStartdate("Start date");
	Opportunity.setCRMvolunteerpageEnddate("End date");
	Thread.sleep(3500);
	Opportunity.setCRMvolunteerpageFacebook(Utilityclass.getTD(2, 9));
	Thread.sleep(2500);
	Opportunity.setCRMvolunteerpageTwitter(Utilityclass.getTD(2, 10));
	Thread.sleep(2500);
	Opportunity.setCRMvolunteerpageLinkedin(Utilityclass.getTD(2, 11));
	Thread.sleep(2500);
	Opportunity.setCRMvolunteerpagePhoto(Utilityclass.getTD(2, 12));
	Thread.sleep(2500);
	Opportunity.setCRMvolunteerpageVideo(Utilityclass.getTD(2, 13));
	Thread.sleep(2500);
	Opportunity.setCRMvolunteerpageBitly(Utilityclass.getTD(2, 14));
//	Thread.sleep(5000);
	
    Opportunity.clickonLocationType(driver);
//	Thread.sleep(5000);
//	Opportunity.setCRMvolunteerpageLocationName(Utilityclass.getTD(2, 15));
//	Opportunity.setCRMvolunteerpageStreet1(Utilityclass.getTD(2, 16));
//	Opportunity.setCRMvolunteerpageStreet2(Utilityclass.getTD(2, 17));
//	Opportunity.setCRMvolunteerpageStreet3(Utilityclass.getTD(2, 18));
//	Opportunity.setCRMvolunteerpageCity1(Utilityclass.getTD(2, 19));
//	Opportunity.setCRMvolunteerpageState_Province(Utilityclass.getTD(2, 20));
//	Opportunity.setCRMvolunteerpageZIP_PostalCode(Utilityclass.getTD(2, 21));
//	Opportunity.setCRMvolunteerpageCountry(Utilityclass.getTD(2, 22));
	Thread.sleep(2000);
	Opportunity.clickonCRMvolunteerpage3AccountName(driver);
	Thread.sleep(4000);
	Opportunity.clickonCRMvolunteerpage3Contact(driver);
//	Opportunity.setCRMvolunteerpageAccountName(Utilityclass.getTD(1, 24));
//	
//	Opportunity.setCRMvolunteerpageContact(Utilityclass.getTD(2, 25));
	Thread.sleep(5000);
	Opportunity.setCRMvolunteerpageEmail(Utilityclass.getTD(2, 26));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpagePhone(Utilityclass.getTD(2, 27));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpageExtension(Utilityclass.getTD(2, 28));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpageSuite(Utilityclass.getTD(2, 29));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpageStreet(Utilityclass.getTD(2, 30));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpageCity(Utilityclass.getTD(2, 31));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpagePostalCode(Utilityclass.getTD(2, 32));
	Opportunity.clickonOnSave();
	Thread.sleep(7000);
	Opportunity.clickonOpprotunities();
	Thread.sleep(7000);
//	Opportunity.clickonCRMActiveVolunteerOpportunities(driver);
//	Thread.sleep(3000);
	Opportunity.setCRMvolunteerpageclickonOnSerch(Utilityclass.getTD(2, 33));
	Opportunity.clickonOnsearch();
	Thread.sleep(3000);
	Opportunity.clickonCircleCheckmark();
	Thread.sleep(3000);
	Opportunity.clickonOnActivate();
	Thread.sleep(5000);
	
}
	@Test (priority = 3)
	public void closebrowser() throws InterruptedException 
	{
	login1=null;
	login2=null;
	Opportunity=null;
	Thread.sleep(3000);
//	driver.close();
	driver=null;	
				
}
}