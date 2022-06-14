
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

public class Donor_TESTCASE_page2_4 extends Baseclass_Portal_page2
{

	DonorLoginPage2_4 login;
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
	 login=new DonorLoginPage2_4(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPage2_4DNow();
		login.clickDonorLoginPage2_4DAmount();
		login.clickDonorLoginPage2_4Next();
		login.clickDonorLoginPage2_4Fund();
		login.clickoncause(driver);
		login.clickDonorLoginPage2_4tgift();
		login.clickonTributegift(driver);
		login.setDonorLoginPage2_4Tname(UtilityclassPortalpage2.getTD(1, 17));
		login.clickDonorLoginPage2_4Next2();
		login.setDonorLoginPage2_4Fname(UtilityclassPortalpage2.getTD(1, 0));
		login.setDonorLoginPage2_4Lname(UtilityclassPortalpage2.getTD(1, 1));
		login.setDonorLoginPage2_4Email(UtilityclassPortalpage2.getTD(1, 2));
		login.setDonorLoginPage2_4Number(UtilityclassPortalpage2.getTD(1, 3));
//		login.setDonorLoginPage3Birthday(UtilityclassPortalpage3.getTD(1, 4));
		login.setDonorLoginPage2_4Birthday();
		login.setDonorLoginPage2_4Address(UtilityclassPortalpage2.getTD(1, 8));
		login.setDonorLoginPage2_4Address1(UtilityclassPortalpage2.getTD(1, 9));
		login.setDonorLoginPage2_4Address2(UtilityclassPortalpage2.getTD(1, 10));
		login.setDonorLoginPage2_4City(UtilityclassPortalpage2.getTD(1, 11));
		login.setDonorLoginPage2_4country(UtilityclassPortalpage2.getTD(1, 12));
		login.setDonorLoginPage2_4State(UtilityclassPortalpage2.getTD(1, 13));
		login.setDonorLoginPage2_4code(UtilityclassPortalpage2.getTD(1, 14));
		login.setDonorLoginPage2_4card(UtilityclassPortalpage2.getTD(1, 15));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPage2_4cvv(UtilityclassPortalpage2.getTD(1, 16));
		login.clickDonorLoginPage2_4publishno();
		login.clickDonorLoginPage2_4finish();
				
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
