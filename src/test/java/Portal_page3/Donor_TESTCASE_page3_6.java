
package Portal_page3;

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
import Module1_Donor_Management.DonorLoginPage3_6;

public class Donor_TESTCASE_page3_6 extends Baseclass_Portal_page3
{

	DonorLoginPage3_6 login;
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
	 login=new DonorLoginPage3_6(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage3_6DMonthly();
		login.clickDonorLoginPage3_6DAmount();
		login.clickDonorLoginPage3_6Next();
		login.clickDonorLoginPage3_6Cause();
		login.clickoncause(driver);
		login.clickDonorLoginPage3_6Next2();
		login.setDonorLoginPage3_6Fname(UtilityclassPortalpage3.getTD(1, 0));
		login.setDonorLoginPage3_6Lname(UtilityclassPortalpage3.getTD(1, 1));
		login.setDonorLoginPage3_6Email(UtilityclassPortalpage3.getTD(1, 2));
		login.setDonorLoginPage3_6pNumber(UtilityclassPortalpage3.getTD(1, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage3_6Birthday();
		login.setDonorLoginPage3_6Address(UtilityclassPortalpage3.getTD(1, 8));
		login.setDonorLoginPage3_6Address1(UtilityclassPortalpage3.getTD(1, 9));
		login.setDonorLoginPage3_6Address2(UtilityclassPortalpage3.getTD(1, 10));
		login.setDonorLoginPage3_6City(UtilityclassPortalpage3.getTD(1, 11));
		login.setDonorLoginPage3_6country(UtilityclassPortalpage3.getTD(1, 12));
		login.setDonorLoginPage3_6State(UtilityclassPortalpage3.getTD(1, 13));
		login.setDonorLoginPage3_6code(UtilityclassPortalpage3.getTD(1, 14));
		login.setDonorLoginPage3_6card(UtilityclassPortalpage3.getTD(1, 15));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage3_6cvv(UtilityclassPortalpage3.getTD(1, 16));
		login.clickDonorLoginPage3_6Finish();
				
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
