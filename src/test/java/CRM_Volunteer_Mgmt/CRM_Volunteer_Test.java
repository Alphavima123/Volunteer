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
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Opportunity.setCRMvolunteerpageTitle(Utilityclass.getTD(1, 2));
	Opportunity.setCRMvolunteerpageGoal(Utilityclass.getTD(1, 3));
	Opportunity.setCRMvolunteerpageDescription(Utilityclass.getTD(1, 4));
	Opportunity.setCRMvolunteerpageCommitment(Utilityclass.getTD(1, 5));
	Opportunity.setCRMvolunteerpageRequirement(Utilityclass.getTD(1, 6));
	Opportunity.setCRMvolunteerpageBenefit(Utilityclass.getTD(1, 7));
	Opportunity.setCRMvolunteerpageTraining(Utilityclass.getTD(1, 8));
	Opportunity.clickonNotRequired();
	Opportunity.clickonAccounts();
	Opportunity.setCRMvolunteerpageStartdate("Start date");
	Opportunity.setCRMvolunteerpageEnddate("End date");
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpageFacebook(Utilityclass.getTD(1, 9));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpageTwitter(Utilityclass.getTD(1, 10));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpageLinkedin(Utilityclass.getTD(1, 11));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpagePhoto(Utilityclass.getTD(1, 12));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpageVideo(Utilityclass.getTD(1, 13));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpageBitly(Utilityclass.getTD(1, 14));
	Thread.sleep(2000);
	Opportunity.clickonLocationType();
	Thread.sleep(4000);
	Opportunity.setCRMvolunteerpageLocationName(Utilityclass.getTD(1, 15));
	Opportunity.setCRMvolunteerpageStreet1(Utilityclass.getTD(1, 16));
	Opportunity.setCRMvolunteerpageStreet2(Utilityclass.getTD(1, 17));
	Opportunity.setCRMvolunteerpageStreet3(Utilityclass.getTD(1, 18));
	Opportunity.setCRMvolunteerpageCity1(Utilityclass.getTD(1, 19));
	Opportunity.setCRMvolunteerpageState_Province(Utilityclass.getTD(1, 20));
	Opportunity.setCRMvolunteerpageZIP_PostalCode(Utilityclass.getTD(1, 21));
	Opportunity.setCRMvolunteerpageCountry(Utilityclass.getTD(1, 22));
	Opportunity.setCRMvolunteerpageAccountName(Utilityclass.getTD(1, 24));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpageContact(Utilityclass.getTD(1, 25));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpageEmail(Utilityclass.getTD(1, 26));
	Opportunity.setCRMvolunteerpagePhone(Utilityclass.getTD(1, 27));
	Opportunity.setCRMvolunteerpageExtension(Utilityclass.getTD(1, 28));
	Opportunity.setCRMvolunteerpageSuite(Utilityclass.getTD(1, 29));
	Opportunity.setCRMvolunteerpageStreet(Utilityclass.getTD(1, 30));
	Opportunity.setCRMvolunteerpageCity(Utilityclass.getTD(1, 31));
	Opportunity.setCRMvolunteerpagePostalCode(Utilityclass.getTD(1, 32));
	Opportunity.clickonOnSave();

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