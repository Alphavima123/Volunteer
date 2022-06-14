
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
import Module1_Donor_Management.DonorLoginPage3_2;

public class Donor_TESTCASE_page3_2 extends Baseclass_Portal_page3
{

	DonorLoginPage3_2 login;
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
	 login=new DonorLoginPage3_2(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage3_2DNow();
		login.clickDonorLoginPage3_2DAmount();
		login.clickDonorLoginPage3_2Next();
		login.clickDonorLoginPage3_2Cause();
		login.clickoncause(driver);
		login.clickDonorLoginPage3_2tgift();
		login.clickonTributegift(driver);
		login.setDonorLoginPage3_2Tname(UtilityclassPortalpage3.getTD(1, 17));
		login.clickDonorLoginPage3_2Next2();
		login.clickDonorLoginPage3_2Binfo();
		login.setDonorLoginPage3_2Bname(UtilityclassPortalpage3.getTD(1, 5));
		login.setDonorLoginPage3_2BPhoneno(UtilityclassPortalpage3.getTD(1, 6));
		login.setDonorLoginPage3_2Fname(UtilityclassPortalpage3.getTD(1, 0));
		login.setDonorLoginPage3_2Lname(UtilityclassPortalpage3.getTD(1, 1));
		login.setDonorLoginPage3_2Email(UtilityclassPortalpage3.getTD(1, 2));
		login.setDonorLoginPage3_2pNumber(UtilityclassPortalpage3.getTD(1, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage3_2Birthday();
		login.setDonorLoginPage3_2Address(UtilityclassPortalpage3.getTD(1, 8));
		login.setDonorLoginPage3_2Address1(UtilityclassPortalpage3.getTD(1, 9));
		login.setDonorLoginPage3_2Address2(UtilityclassPortalpage3.getTD(1, 10));
		login.setDonorLoginPage3_2City(UtilityclassPortalpage3.getTD(1, 11));
		login.setDonorLoginPage3_2country(UtilityclassPortalpage3.getTD(1, 12));
		login.setDonorLoginPage3_2State(UtilityclassPortalpage3.getTD(1, 13));
		login.setDonorLoginPage3_2code(UtilityclassPortalpage3.getTD(1, 14));
		login.setDonorLoginPage3_2card(UtilityclassPortalpage3.getTD(1, 15));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage3_2cvv(UtilityclassPortalpage3.getTD(1, 16));
		login.clickDonorLoginPage3_2publishNo();
		login.clickDonorLoginPage3_2Finish();
				
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
