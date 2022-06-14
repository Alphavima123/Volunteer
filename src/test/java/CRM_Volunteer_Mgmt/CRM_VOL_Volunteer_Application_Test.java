package CRM_Volunteer_Mgmt;

import java.io.IOException;
import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_VOL_Volunteer_Application_Test extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_volunteer_Applications volunteer;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	volunteer= new CRM_VOL_volunteer_Applications(driver);
}
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
	volunteer.clickonVolunteerAap(driver);
	volunteer.clickonVolunteerApplication();
	volunteer.clickonNew();
	volunteer.clickonOpportunity(driver);
	Thread.sleep(10000);
	volunteer.clickonApplicant(driver);
	Thread.sleep(6500);
	volunteer.clickonSave();
	Thread.sleep(6500);
	volunteer.clickonApplicantInformation();
	volunteer.clickonNext();
	Thread.sleep(1500);
	volunteer.clickonclose();
	volunteer.clickonInterviewScheduled(driver);
	Thread.sleep(4500);
	volunteer.clickonInterviewCompleted(driver);
	volunteer.clickonApplicationStatus(driver);
	volunteer.clickonOrientationScheduled(driver);
	Thread.sleep(10000);
	volunteer.clickonInterviewCompleted(driver);
	volunteer.clickonCandidateStatus(driver);
	volunteer.clickonOfferAcceptance(driver);
	volunteer.clickonOrientationScheduled(driver);
	Thread.sleep(10000);
	volunteer.clickonFirstShiftScheduled(driver);
	volunteer.clickonScheduleInterview();
	volunteer.clickonNext1();
	volunteer.clickonCandidateStatus1(driver);
	volunteer.clickonNext2();
	volunteer.clickonCertificationsCompleted(driver);
	volunteer.clickonTrainingsCompleted(driver);
	volunteer.clickonReferenceChecksCompleted(driver);
	volunteer.clickonPoliceRecordCheckSeen(driver);
	volunteer.clickonDriverAbstractAvailable(driver);
	volunteer.clickonQualificationsVerified(driver);
	volunteer.clickonNext3();
	volunteer.clickonVolunteerStatus(driver);
	volunteer.clickonTemporaryBreak(driver);
	volunteer.clickonTermConcluded(driver);
	volunteer.clickonNext4();
	volunteer.clickonOfferAcceptance1(driver);
	volunteer.clickoFinish();
	

	
}
	@Test (priority = 3)
	public void closebrowser() throws InterruptedException 
	{
	login1=null;
	login2=null;
	volunteer=null;
	Thread.sleep(3000);
//	driver.close();
	driver=null;	
				
}
}