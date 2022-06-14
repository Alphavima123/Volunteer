
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
import Module1_Donor_Management.DonorLoginPage3_8;

public class Donor_TESTCASE_page3_8 extends Baseclass_Portal_page3
{

	DonorLoginPage3_8 login;
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
	 login=new DonorLoginPage3_8(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage3_8DMonthly();
		login.clickDonorLoginPage3_8DAmount();
		login.clickDonorLoginPage3_8Next();
		login.clickDonorLoginPage3_8Cause();
		login.clickoncause(driver);
		login.clickDonorLoginPage3_8tgift();
		login.clickonTributegift(driver);
		login.setDonorLoginPage3_8Tname(UtilityclassPortalpage3.getTD(1, 16));
		login.clickDonorLoginPage3_8Next2();
		login.clickDonorLoginPage3_8Binfo();
		login.setDonorLoginPage3_8Bname(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage3_8BPhoneno(UtilityclassPortalpage3.getTD(1, 5));
		login.setDonorLoginPage3_8Fname(UtilityclassPortalpage3.getTD(1, 0));
		login.setDonorLoginPage3_8Lname(UtilityclassPortalpage3.getTD(1, 1));
		login.setDonorLoginPage3_8Email(UtilityclassPortalpage3.getTD(1, 2));
		login.setDonorLoginPage3_8pNumber(UtilityclassPortalpage3.getTD(1, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage3_8Birthday();
		login.setDonorLoginPage3_8Address(UtilityclassPortalpage3.getTD(1, 7));
		login.setDonorLoginPage3_8Address1(UtilityclassPortalpage3.getTD(1, 8));
		login.setDonorLoginPage3_8Address2(UtilityclassPortalpage3.getTD(1, 9));
		login.setDonorLoginPage3_8City(UtilityclassPortalpage3.getTD(1, 10));
		login.setDonorLoginPage3_8country(UtilityclassPortalpage3.getTD(1, 11));
		login.setDonorLoginPage3_8State(UtilityclassPortalpage3.getTD(1, 12));
		login.setDonorLoginPage3_8code(UtilityclassPortalpage3.getTD(1, 13));
		login.setDonorLoginPage3_8card(UtilityclassPortalpage3.getTD(1, 14));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage3_8cvv(UtilityclassPortalpage3.getTD(1, 15));
		login.clickDonorLoginPage3_8publishNo();
//		login.clickDonorLoginPage3_8Finish();
				
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
