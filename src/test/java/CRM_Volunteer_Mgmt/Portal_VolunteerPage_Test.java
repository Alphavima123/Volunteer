package CRM_Volunteer_Mgmt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

public class Portal_VolunteerPage_Test extends Baseclass_Portal
{

	Portal_VolunteerPage login;
	Sheet sh;
	
	@Test (priority = 1)
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		 initilizeBrowser();
	 login=new Portal_VolunteerPage(driver);										

	}
	@Test (priority = 2)
	public void FillInfo() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		login.clickonVolunteers(driver);
		login.clickonRegister();
		Thread.sleep(3000);
	//	login.clickonSignupnow();
		login.setVolunteerpageEmailAddress(Utilityclass.getTD(22, 0), driver);
		login.setVolunteerpagePassword(Utilityclass.getTD(22, 1));
		login.clickonSignin();
		login.setVolunteerpageFirstName(Utilityclass.getTD(22, 2));
		login.setVolunteerpageLastName(Utilityclass.getTD(22, 3));
		login.setVolunteerpageEmail(Utilityclass.getTD(22, 4));
		login.setVolunteerpageMobileNo(Utilityclass.getTD(22, 5));
		login.setVolunteerpageAddress(Utilityclass.getTD(22, 6));
		login.setVolunteerpageStreetAddress(Utilityclass.getTD(22, 7));
		login.setVolunteerpageLandmark(Utilityclass.getTD(22, 8));
		login.setVolunteerpageCity(Utilityclass.getTD(22, 9));
		login.setVolunteerpageProvince(Utilityclass.getTD(22, 10));
		login.setVolunteerpageCountry(Utilityclass.getTD(22, 11));
		login.setVolunteerpageZipcode(Utilityclass.getTD(22, 12));
		login.clickonAgerange(driver);
		login.setVolunteerpagevolunteer_experience(Utilityclass.getTD(22, 13));
		login.clickonwant_to_volunteer(driver);
		login.clickonAreaofIntrest(driver);	
		login.setVolunteerpageFurther_information(Utilityclass.getTD(22, 14));
		Thread.sleep(3000);
		login.clickonsubmit();
		login.clickonDashboard();
		Thread.sleep(3000);
		login.clickonViewDetails();
		Thread.sleep(3000);
		login.clickonApplyNow();
		Thread.sleep(20000);
		login.clickonDashboard();
		login.clickonMyProfile();
		Thread.sleep(3000);
		login.clickonMYOPPORTUNITY();
		Thread.sleep(2000);
		login.clickonMYSCHEDULES();
	//	login.clickonResumeupload();
	}
}
