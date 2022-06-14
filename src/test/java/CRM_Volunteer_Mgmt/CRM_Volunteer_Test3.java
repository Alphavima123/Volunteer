package CRM_Volunteer_Mgmt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_Volunteer_Test3 extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_Opportunity_page3 Opportunity;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	Opportunity= new CRM_VOL_Opportunity_page3(driver);
}
@SuppressWarnings("deprecation")
@Test(priority = 2)
public void loginToApp() throws IOException, InterruptedException 
{
//	TestcaseID=100;
	
	login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(1, 0));
	login1.clickCRMloginNextbtn();
	Thread.sleep(2000);
	login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(1, 1));
	login2.clickCRMloginSignbtn();
	login2.clickCRMonPopup();
	Opportunity.clickonVolunteerAap(driver);
	Opportunity.clickonOpprotunities();
	Opportunity.clickonNew();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Title(Utilityclass.getTD(1, 2));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Goal(Utilityclass.getTD(1, 3));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Description(Utilityclass.getTD(1, 4));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Commitment(Utilityclass.getTD(1, 5));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Requirement(Utilityclass.getTD(1, 6));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Benefit(Utilityclass.getTD(1, 7));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Training(Utilityclass.getTD(1, 8));
	Thread.sleep(2000);
	Opportunity.clickonNotRequired();
	Opportunity.clickonAccounts();
	Opportunity.setCRMvolunteerpage3Startdate("Start date");
	Opportunity.setCRMvolunteerpage3Enddate("End date");
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Facebook(Utilityclass.getTD(1, 9));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Twitter(Utilityclass.getTD(1, 10));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Linkedin(Utilityclass.getTD(1, 11));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Photo(Utilityclass.getTD(1, 12));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Video(Utilityclass.getTD(1, 13));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Bitly(Utilityclass.getTD(1, 14));
	Thread.sleep(3000);
	Opportunity.clickonLocationType();
	Thread.sleep(3000);
	Opportunity.setCRMvolunteerpage3LocationName(Utilityclass.getTD(1, 15));
	Opportunity.setCRMvolunteerpage3Street1(Utilityclass.getTD(1, 16));
	Opportunity.setCRMvolunteerpage3Street2(Utilityclass.getTD(1, 17));
	Opportunity.setCRMvolunteerpage3Street3(Utilityclass.getTD(1, 18));
	Opportunity.setCRMvolunteerpage3City1(Utilityclass.getTD(1, 19));
	Opportunity.setCRMvolunteerpage3State_Province(Utilityclass.getTD(1, 20));
	Opportunity.setCRMvolunteerpage3ZIP_PostalCode(Utilityclass.getTD(1, 21));
	Opportunity.setCRMvolunteerpage3Country(Utilityclass.getTD(1, 22));
	Opportunity.setCRMvolunteerpage3URL(Utilityclass.getTD(1, 23));
	Opportunity.setCRMvolunteerpage3AccountName(Utilityclass.getTD(1, 24));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Contact(Utilityclass.getTD(1, 25));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage3Email(Utilityclass.getTD(1, 26));
	Opportunity.setCRMvolunteerpage3Phone(Utilityclass.getTD(1, 27));
	Opportunity.setCRMvolunteerpage3Extension(Utilityclass.getTD(1, 28));
	Opportunity.setCRMvolunteerpage3Suite(Utilityclass.getTD(1, 29));
	Opportunity.setCRMvolunteerpage3Street(Utilityclass.getTD(1, 30));
	Opportunity.setCRMvolunteerpage3City(Utilityclass.getTD(1, 31));
	Opportunity.setCRMvolunteerpage3PostalCode(Utilityclass.getTD(1, 32));

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