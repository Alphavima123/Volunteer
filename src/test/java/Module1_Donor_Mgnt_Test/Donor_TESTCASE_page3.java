
package Module1_Donor_Mgnt_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libery_Files.Baseclass_Portal_page3;
import Libery_Files.Utilityclass;
import Libery_Files.UtilityclassPortalpage3;
import Module1_Donor_Management.DonorLoginPage3;

public class Donor_TESTCASE_page3 extends Baseclass_Portal_page3
{

	DonorLoginPage3 login;
	Sheet sh;
	int TestcaseID;
	
	@BeforeClass
	public void open()
	{
		
	}

	//	@Test(priority = 1)
	@BeforeMethod
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		 initilizeBrowser();
		
	//	DonorLoginPage login=new DonorLoginPage(driver);                  // Wrong way
	 login=new DonorLoginPage3(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage3DNow();
		login.clickDonorLoginPage3DAmount();
		login.clickDonorLoginPage3Next();
		login.clickDonorLoginPage3Cause();
		login.clickoncause(driver);
		login.clickDonorLoginPage3Next2();
		login.setDonorLoginPage3Fname(UtilityclassPortalpage3.getTD(1, 0));
		login.setDonorLoginPage3Lname(UtilityclassPortalpage3.getTD(1, 1));
		login.setDonorLoginPage3Email(UtilityclassPortalpage3.getTD(1, 2));
		login.setDonorLoginPage3pNumber(UtilityclassPortalpage3.getTD(1, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage3Birthday();
		login.setDonorLoginPage3Address(UtilityclassPortalpage3.getTD(1, 7));
		login.setDonorLoginPage3Address1(UtilityclassPortalpage3.getTD(1, 8));
		login.setDonorLoginPage3Address2(UtilityclassPortalpage3.getTD(1, 9));
		login.setDonorLoginPage3City(UtilityclassPortalpage3.getTD(1, 10));
		login.setDonorLoginPage3country(UtilityclassPortalpage3.getTD(1, 11));
		login.setDonorLoginPage3State(UtilityclassPortalpage3.getTD(1, 12));
		login.setDonorLoginPage3code(UtilityclassPortalpage3.getTD(1, 13));
		login.setDonorLoginPage3card(UtilityclassPortalpage3.getTD(1, 14));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage3cvv(UtilityclassPortalpage3.getTD(1, 15));
//		login.clickDonorLoginPage3Finish();
				
	}
	
	@AfterMethod
	public void logoutBrowser(ITestResult result) throws InterruptedException, IOException 
	{	
		if(result.getStatus()==ITestResult.FAILURE)					//code for the failed test cases
		{
			Utilityclass.CaptureScreenShot(driver, TestcaseID);
		}
	}

	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{	
		Thread.sleep(5000);
	//	driver.close();
		login=null;				//clear all global variable to null--> to clear the garbage collector
		sh=null;
		driver=null;		
		
	}
	
}
