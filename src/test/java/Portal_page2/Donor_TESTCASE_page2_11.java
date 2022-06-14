
package Portal_page2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libery_Files.Utilityclass;

public class Donor_TESTCASE_page2_11 extends Baseclass_Portal_page2
{

	DonorLoginPage2_11 login;
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
	 login=new DonorLoginPage2_11(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage2_11Dmonthly();
		login.clickDonorLoginPage2_11DAmount();
		login.clickDonorLoginPage2_11Next();
		login.clickDonorLoginPage2_11Fund();
		login.clickonfund(driver);
		login.clickDonorLoginPage2_11tgift();
		login.clickonTributegift(driver);
		login.setDonorLoginPage2_11Tname(UtilityclassPortalpage2.getTD(2, 17));
		login.clickDonorLoginPage2_11Next2();
		login.clickDonorLoginPage2_11Binfo();
		login.setDonorLoginPage2_11Bname(UtilityclassPortalpage2.getTD(2, 5));
		login.setDonorLoginPage2_11BPhoneno(UtilityclassPortalpage2.getTD(2, 6));
		login.setDonorLoginPage2_11Fname(UtilityclassPortalpage2.getTD(2, 0));
		login.setDonorLoginPage2_11Lname(UtilityclassPortalpage2.getTD(2, 1));
		login.setDonorLoginPage2_11Email(UtilityclassPortalpage2.getTD(2, 2));
		login.setDonorLoginPage2_11Number(UtilityclassPortalpage2.getTD(2, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage2_11Birthday();
		login.setDonorLoginPage2_11Address(UtilityclassPortalpage2.getTD(2, 8));
		login.setDonorLoginPage2_11Address1(UtilityclassPortalpage2.getTD(2, 9));
		login.setDonorLoginPage2_11Address2(UtilityclassPortalpage2.getTD(2, 10));
		login.setDonorLoginPage2_11City(UtilityclassPortalpage2.getTD(2, 11));
		login.setDonorLoginPage2_11country(UtilityclassPortalpage2.getTD(2, 12));
		login.setDonorLoginPage2_11State(UtilityclassPortalpage2.getTD(2, 13));
		login.setDonorLoginPage2_11code(UtilityclassPortalpage2.getTD(2, 14));
		login.setDonorLoginPage2_11card(UtilityclassPortalpage2.getTD(2, 15));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage2_11cvv(UtilityclassPortalpage2.getTD(2, 16));
		login.clickDonorLoginPage2_11publishno();
		login.clickDonorLoginPage2_11finish();
				
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
