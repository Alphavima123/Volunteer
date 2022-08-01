package CRM_Volunteer_Mgmt;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.Test;

import Libery_Files.Utilityclass_CRM_page;
import Module1_Donor_Management.CRM_login1_page;
import Module1_Donor_Management.CRM_login2_page;

public class CRM_VOL_Volunteer_Details_Test extends Baseclass 
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_VOL_volunteer_Details volunteer;
	

@Test (priority = 1)

public void OpenTheBrowser() throws IOException
{
	initilizeBrowser();
	
	login1=new CRM_login1_page(driver);
	login2=new CRM_login2_page(driver);	
	volunteer= new CRM_VOL_volunteer_Details(driver);
}
@Test(priority = 2)
public void loginToApp() throws IOException, InterruptedException 
{
//	/////////////////////////////////////////////////////////////////////
//	int rows=sheet.getLastRowNum();
//	int cols=sheet.getRow(1).getLastCellNum();
//	
//	for(int r=0; r<=rows; r++)
//	{
//			XSSFRow row=sheet.getRow(r);
//				
//				for(int c=0;c<cols;c++)
//				{
//					XSSFCell cell=row.getCell(c);
//					switch(cell.getCellType())
//					{
//					case STRING: System.out.print(cell.getStringCellValue());break;
//					case NUMERIC: System.out.print(cell.getNumericCellValue());break;
//					case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
//					}
//					System.out.print(" ");
//				}
//				System.out.println();
//		}
	
	///////////////////////////////////////////////////////////////////////////////
	
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
	Thread.sleep(2500);
//	volunteer.setCRMvolunteerPositionTitle(Utilityclass.getTD(rowIndex, cellIndex));
	volunteer.setCRMvolunteerFirstName(Utilityclass.getTD(16, 0));
	Thread.sleep(1500);
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
	volunteer.clickonContactStewardedBy(driver);
//	volunteer.setCRMvolunteerContactStewardedBy(Utilityclass.getTD(16, 6));
//	volunteer.clickonclickonVolunteerNo();
	Thread.sleep(3000);
//	volunteer.clickonclickonSave();
	Thread.sleep(5000);
	volunteer.clickonDetails();
	volunteer.clickonpreferedcontactmethod(driver);
//	volunteer.clickonContactMethod();
	Thread.sleep(2000);
	volunteer.clickonPrimaryPhone(driver);
	volunteer.setCRMvolunteerHomePhone(Utilityclass.getTD(16, 7));
	volunteer.setCRMvolunteerSecondaryEmail1(Utilityclass.getTD(16, 8));
	volunteer.setCRMvolunteerSecondaryEmail2(Utilityclass.getTD(16, 9));
	volunteer.setCRMvolunteerFax(Utilityclass.getTD(16, 10));
	volunteer.clickonMarketingMaterials(driver);
	volunteer.clickonDonotallowPhoneCalls(driver);
	volunteer.clickonDonotallowEmails(driver);
	volunteer.clickonDonotallowBulkEmails(driver);
	volunteer.clickonDonotallowMails(driver);
	volunteer.setCRMvolunteerSearchAddress(Utilityclass.getTD(16, 11));
	volunteer.setCRMvolunteerAddressSuite_Apt(Utilityclass.getTD(16, 12));
	volunteer.setCRMvolunteerStreet(Utilityclass.getTD(16, 13));
	volunteer.setCRMvolunteerCity(Utilityclass.getTD(16, 14));
	volunteer.setCRMvolunteerState_Province(Utilityclass.getTD(16, 15));
	volunteer.setCRMvolunteerPostalCode(Utilityclass.getTD(16, 16));
	volunteer.setCRMvolunteerCountry(Utilityclass.getTD(16, 17));
	volunteer.setCRMvolunteerEmployeeID(Utilityclass.getTD(16, 18));
	volunteer.setCRMvolunteerAreaofExpertise(Utilityclass.getTD(16, 19));
	volunteer.setCRMvolunteerFocusSpecialty(Utilityclass.getTD(16, 20));
	volunteer.clickonLevelofEducation(driver);
	volunteer.setCRMvolunteerInternalNote(Utilityclass.getTD(16, 21));
	volunteer.clickoncalander(driver);
	Thread.sleep(2000);
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