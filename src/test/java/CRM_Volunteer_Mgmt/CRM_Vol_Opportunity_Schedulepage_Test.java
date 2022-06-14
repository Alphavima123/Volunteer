package CRM_Volunteer_Mgmt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_Vol_Opportunity_Schedulepage_Test extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_Opportunity_Schedule_page Opportunity;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	Opportunity= new CRM_VOL_Opportunity_Schedule_page(driver);
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
	Opportunity.clickonOpprotunitiesSchedule();
	Opportunity.clickonNew();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	Opportunity.setCRMvolunteerpageJobTitle(Utilityclass.getTD(8, 0));
	Thread.sleep(3000);
	
	Opportunity.setCRMvolunteerOpportunity(Utilityclass.getTD(8, 1));
	Thread.sleep(3000);
	
	Opportunity.clickonStartdate();
	Opportunity.clickonMonth();
	Opportunity.clickonDate();
	Opportunity.clickonStartTime(driver);
	
//	Opportunity.setCRMvolunteerSchedulepageStartdate("Start date");
	Thread.sleep(3000);
//	Opportunity.setCRMvolunteerOpportunityStartTime(Utilityclass.getTD(8, 3));
	Thread.sleep(3000);
	Opportunity.clickonEndDate();
	Opportunity.clickonMonth1();
	Opportunity.clickonDate1();
	Thread.sleep(3000);
//	Opportunity.clickonClose();
	Thread.sleep(1000);
	Opportunity.clickonOK();
	Opportunity.clickonEndTime(driver);
//	Opportunity.setCRMvolunteerSchedulepageEnddate("End date");
//	Thread.sleep(3000);
//	Opportunity.setCRMvolunteerOpportunityEndTime(Utilityclass.getTD(8, 5));
	Thread.sleep(3000);
	Opportunity.setCRMvolunteerpageExpectedHours(Utilityclass.getTD(8, 6));
	
	Opportunity.clickonWorkingDay();
	Thread.sleep(3000);
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