package CRM_Volunteer_Mgmt;

import java.io.IOException;
import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_VOL_Volunteer_Test extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_volunteer volunteer;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	volunteer= new CRM_VOL_volunteer(driver);
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
	volunteer.clickonVolunteer();
	volunteer.clickonNew();
	volunteer.clickonTitle(driver);
	Thread.sleep(2000);
//	volunteer.setCRMvolunteerPositionTitle(Utilityclass.getTD(rowIndex, cellIndex));
	volunteer.setCRMvolunteerFirstName(Utilityclass.getTD(16, 0));
	Thread.sleep(2500);
	volunteer.setCRMvolunteerLastName(Utilityclass.getTD(16, 1));
	Thread.sleep(1500);
	volunteer.setCRMvolunteerSalutation(Utilityclass.getTD(16, 2));
	Thread.sleep(1500);
	volunteer.setCRMvolunteerPositionTitle(Utilityclass.getTD(16, 3));
	Thread.sleep(1500);
	volunteer.setCRMvolunteerEmailPrimary(Utilityclass.getTD(16, 4));
	Thread.sleep(1500);
	volunteer.setCRMvolunteerMobilePhone(Utilityclass.getTD(16, 5));
	Thread.sleep(1500);
	volunteer.clickonPreferredMethodOfContact(driver);
	Thread.sleep(3000);
	volunteer.setCRMvolunteerContactStewardedBy(Utilityclass.getTD(16, 6));
//	volunteer.clickonclickonVolunteerNo();
	Thread.sleep(3000);
	volunteer.clickonDetails();
	volunteer.clickoncalander(driver);
	Thread.sleep(3000);
	volunteer.clickonclickonSave();
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