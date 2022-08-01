package CRM_Volunteer_Mgmt;

import java.io.IOException;
import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_Volunteer_Test1 extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_Opportunity_page1 Opportunity;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	Opportunity= new CRM_VOL_Opportunity_page1(driver);
}
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
	Opportunity.ClickonMoreHeaderFields();
	Opportunity.clickonStatusReason(driver);
	Thread.sleep(3000);
	Opportunity.setCRMvolunteerpage1Title(Utilityclass.getTD(1, 2));
	Opportunity.setCRMvolunteerpage1Goal(Utilityclass.getTD(1, 3));
	Opportunity.setCRMvolunteerpage1Description(Utilityclass.getTD(1, 4));
	Opportunity.setCRMvolunteerpage1Commitment(Utilityclass.getTD(1, 5));
	Opportunity.setCRMvolunteerpage1Requirement(Utilityclass.getTD(1, 6));
	Opportunity.setCRMvolunteerpage1Benefit(Utilityclass.getTD(1, 7));
	Opportunity.setCRMvolunteerpage1Training(Utilityclass.getTD(1, 8));
	Opportunity.clickonSelf();
	Opportunity.setCRMvolunteerpage1Startdate("Start date");
	Opportunity.setCRMvolunteerpage1Enddate("End date");
	Thread.sleep(1500);
	Opportunity.setCRMvolunteerpage1Facebook(Utilityclass.getTD(1, 9));
	Thread.sleep(1000);
	Opportunity.setCRMvolunteerpage1Twitter(Utilityclass.getTD(1, 10));
	Thread.sleep(1500);
	Opportunity.setCRMvolunteerpage1Linkedin(Utilityclass.getTD(1, 11));
	Thread.sleep(1500);
	Opportunity.setCRMvolunteerpage1Photo(Utilityclass.getTD(1, 12));
	Thread.sleep(1500);
	Opportunity.setCRMvolunteerpage1Video(Utilityclass.getTD(1, 13));
	Thread.sleep(1500);
	Opportunity.setCRMvolunteerpage1Bitly(Utilityclass.getTD(1, 14));
	Thread.sleep(1500);
	Opportunity.clickonsave();
	Thread.sleep(5000);
	Opportunity.clickonRefresh();
	Thread.sleep(1500);
	Opportunity.clickonLocationType();
	Thread.sleep(3000);
	Opportunity.setCRMvolunteerpage1LocationName(Utilityclass.getTD(1, 15));
	Opportunity.setCRMvolunteerpage1Street1(Utilityclass.getTD(1, 16));
	Opportunity.setCRMvolunteerpage1Street2(Utilityclass.getTD(1, 17));
	Opportunity.setCRMvolunteerpage1Street3(Utilityclass.getTD(1, 18));
	Opportunity.setCRMvolunteerpage1City1(Utilityclass.getTD(1, 19));
	Opportunity.setCRMvolunteerpage1State_Province(Utilityclass.getTD(1, 20));
	Opportunity.setCRMvolunteerpage1ZIP_PostalCode(Utilityclass.getTD(1, 21));
	Opportunity.setCRMvolunteerpage1Country(Utilityclass.getTD(1, 22));
	
	Opportunity.clickonsave();
	Thread.sleep(1000);
	Opportunity.clickonRequired();
//	Thread.sleep(3000);
//	Opportunity.clickonfile();
	Thread.sleep(10000);
	Opportunity.clickonsave();
//	Opportunity.setCRMvolunteerpageAccountName(Utilityclass.getTD(1, 24));
//	Thread.sleep(2000);
//	Opportunity.setCRMvolunteerpageContact(Utilityclass.getTD(1, 25));
//	Thread.sleep(2000);
//	Opportunity.setCRMvolunteerpageEmail(Utilityclass.getTD(1, 26));
//	Opportunity.setCRMvolunteerpagePhone(Utilityclass.getTD(1, 27));
//	Opportunity.setCRMvolunteerpageExtension(Utilityclass.getTD(1, 28));
//	Opportunity.setCRMvolunteerpageSuite(Utilityclass.getTD(1, 29));
//	Opportunity.setCRMvolunteerpageStreet(Utilityclass.getTD(1, 30));
//	Opportunity.setCRMvolunteerpageCity(Utilityclass.getTD(1, 31));
//	Opportunity.setCRMvolunteerpagePostalCode(Utilityclass.getTD(1, 32));

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