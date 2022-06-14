
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
import Module1_Donor_Management.DonorLoginPage3_11;

public class Donor_TESTCASE_page3_11 extends Baseclass_Portal_page3
{

	DonorLoginPage3_11 login;
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
	 login=new DonorLoginPage3_11(driver);										// right way
 
	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage3_11DMonthly();
		login.clickDonorLoginPage3_11DAmount();
		login.clickDonorLoginPage3_11Next();
		login.clickDonorLoginPage3_11fund();
		login.clickonfund(driver);
		login.clickDonorLoginPage3_11tgift();
		login.clickonTributegift(driver);
		login.setDonorLoginPage3_11Tname(UtilityclassPortalpage3.getTD(3, 17));
		login.clickDonorLoginPage3_11Next2();
		login.clickDonorLoginPage3_11Binfo();
		login.setDonorLoginPage3_11Bname(UtilityclassPortalpage3.getTD(3, 5));
		login.setDonorLoginPage3_11BPhoneno(UtilityclassPortalpage3.getTD(3, 6));
		login.setDonorLoginPage3_11Fname(UtilityclassPortalpage3.getTD(3, 0));
		login.setDonorLoginPage3_11Lname(UtilityclassPortalpage3.getTD(3, 1));
		login.setDonorLoginPage3_11Email(UtilityclassPortalpage3.getTD(3, 2));
		login.setDonorLoginPage3_11pNumber(UtilityclassPortalpage3.getTD(3, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage3_11Birthday();
		login.setDonorLoginPage3_11Address(UtilityclassPortalpage3.getTD(3, 8));
		login.setDonorLoginPage3_11Address1(UtilityclassPortalpage3.getTD(3, 9));
		login.setDonorLoginPage3_11Address2(UtilityclassPortalpage3.getTD(3, 10));
		login.setDonorLoginPage3_11City(UtilityclassPortalpage3.getTD(3, 11));
		login.setDonorLoginPage3_11country(UtilityclassPortalpage3.getTD(3, 12));
		login.setDonorLoginPage3_11State(UtilityclassPortalpage3.getTD(3, 13));
		login.setDonorLoginPage3_11code(UtilityclassPortalpage3.getTD(3, 14));
		login.setDonorLoginPage3_11card(UtilityclassPortalpage3.getTD(3, 15));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage3_11cvv(UtilityclassPortalpage3.getTD(3, 16));
		login.clickDonorLoginPage3_11publishNo();
		login.clickDonorLoginPage3_11Finish();
				
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
