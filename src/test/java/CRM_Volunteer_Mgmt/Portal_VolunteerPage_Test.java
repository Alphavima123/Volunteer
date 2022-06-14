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
		login.setVolunteerpageEmailAddress(Utilityclass.getTD(27, 0), driver);
		login.setVolunteerpagePassword(Utilityclass.getTD(27, 1));
		login.clickonSignin();
		login.setVolunteerpageFirstName(Utilityclass.getTD(27, 2));
		login.setVolunteerpageLastName(Utilityclass.getTD(27, 3));
		login.setVolunteerpageEmail(Utilityclass.getTD(27, 4));
		login.setVolunteerpageMobileNo(Utilityclass.getTD(27, 5));
		login.setVolunteerpageAddress(Utilityclass.getTD(27, 6));
		login.setVolunteerpageStreetAddress(Utilityclass.getTD(27, 7));
		login.setVolunteerpageLandmark(Utilityclass.getTD(27, 8));
		login.setVolunteerpageCity(Utilityclass.getTD(27, 9));
		login.setVolunteerpageProvince(Utilityclass.getTD(27, 10));
		login.setVolunteerpageCountry(Utilityclass.getTD(27, 11));
		login.setVolunteerpageZipcode(Utilityclass.getTD(27, 12));
		login.clickonAgerange(driver);
		login.setVolunteerpagevolunteer_experience(Utilityclass.getTD(27, 13));
		login.clickonwant_to_volunteer(driver);
		login.clickonAreaofIntrest(driver);
		login.setVolunteerpageFurther_information(Utilityclass.getTD(27, 14));
		Thread.sleep(3000);
		login.clickonsubmit();
		login.clickonDashboard();
		login.clickonViewDetails();
		Thread.sleep(2000);
		login.clickonApplyNow();
	}
}
