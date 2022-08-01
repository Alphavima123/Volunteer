package CRM_Volunteer_Mgmt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_Volunteer_Test2 extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_Opportunity_page2 Opportunity;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	Opportunity= new CRM_VOL_Opportunity_page2(driver);
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
	Thread.sleep(2000);
	Opportunity.clickonOpprotunities();
	Thread.sleep(1000);
	Opportunity.clickonNew();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Title(Utilityclass.getTD(1, 2));
	Opportunity.setCRMvolunteerpage2Goal(Utilityclass.getTD(1, 3));
	Opportunity.setCRMvolunteerpage2Description(Utilityclass.getTD(1, 4));
	Opportunity.setCRMvolunteerpage2Commitment(Utilityclass.getTD(1, 5));
	Opportunity.setCRMvolunteerpage2Requirement(Utilityclass.getTD(1, 6));
	Opportunity.setCRMvolunteerpage2Benefit(Utilityclass.getTD(1, 7));
	Opportunity.setCRMvolunteerpage2Training(Utilityclass.getTD(1, 8));
	Opportunity.clickonNotRequired();
	Opportunity.clickonAccounts();
	Opportunity.setCRMvolunteerpage2Startdate("Start date");
	Opportunity.setCRMvolunteerpage2Enddate("End date");
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Facebook(Utilityclass.getTD(1, 9));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Twitter(Utilityclass.getTD(1, 10));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Linkedin(Utilityclass.getTD(1, 11));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Photo(Utilityclass.getTD(1, 12));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Video(Utilityclass.getTD(1, 13));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage2Bitly(Utilityclass.getTD(1, 14));
	Thread.sleep(5000);
//	Opportunity.clickonLocationType();
//	Thread.sleep(3000);
//	Opportunity.setCRMvolunteerpage2URL(Utilityclass.getTD(1, 23));
//	Thread.sleep(3000);
//	Opportunity.setCRMvolunteerpageLocationName(Utilityclass.getTD(1, 15));
//	Opportunity.setCRMvolunteerpageStreet1(Utilityclass.getTD(1, 16));
//	Opportunity.setCRMvolunteerpageStreet2(Utilityclass.getTD(1, 17));
//	Opportunity.setCRMvolunteerpageStreet3(Utilityclass.getTD(1, 18));
//	Opportunity.setCRMvolunteerpageCity1(Utilityclass.getTD(1, 19));
//	Opportunity.setCRMvolunteerpageState_Province(Utilityclass.getTD(1, 20));
//	Opportunity.setCRMvolunteerpageZIP_PostalCode(Utilityclass.getTD(1, 21));
//	Opportunity.setCRMvolunteerpageCountry(Utilityclass.getTD(1, 22));
	
	Opportunity.clickonCRMvolunteerpage3AccountName(driver);
	Thread.sleep(3000);
	Opportunity.clickonCRMvolunteerpage3Contact(driver);
	//	Opportunity.setCRMvolunteerpage2AccountName(Utilityclass.getTD(1, 24));
//	Thread.sleep(2000);
//	Opportunity.setCRMvolunteerpage2Contact(Utilityclass.getTD(1, 25));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2Email(Utilityclass.getTD(1, 26));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2Phone(Utilityclass.getTD(1, 27));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2Extension(Utilityclass.getTD(1, 28));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2Suite(Utilityclass.getTD(1, 29));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2Street(Utilityclass.getTD(1, 30));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2City(Utilityclass.getTD(1, 31));
	Thread.sleep(2000);
	Opportunity.setCRMvolunteerpage2PostalCode(Utilityclass.getTD(1, 32));
	Opportunity.clickonsave();

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