
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

import Libery_Files.Baseclass_Portal_page;
import Libery_Files.Utilityclass;
import Module1_Donor_Management.DonorLoginPage1_5;

public class Donor_TESTCASE1_5 extends Baseclass_Portal_page
{

	DonorLoginPage1_5 login;
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
	 login=new DonorLoginPage1_5(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPageDmonthly();
		login.clickDonorLoginPageDAmount();
    	login.clickDonorLoginPageCFund(); 
    	login.clickoncause(driver);
		login.setDonorLoginPageFname(Utilityclass.getTD(1, 0));
		login.setDonorLoginPageLname(Utilityclass.getTD(1, 1));
		login.setDonorLoginPageEmail(Utilityclass.getTD(1, 2));						// set-->input enter, click-->for click to perform action
		login.setDonorLoginPageNumber(Utilityclass.getTD(1, 3));
		login.setDonorLoginPageAddress(Utilityclass.getTD(1, 7));
		login.setDonorLoginPageAddress1(Utilityclass.getTD(1, 8));
		login.setDonorLoginPageCity(Utilityclass.getTD(1, 10));
		login.setDonorLoginPagecountry(Utilityclass.getTD(1, 11));
		login.setDonorLoginPageState(Utilityclass.getTD(1, 12));
		login.setDonorLoginPagecode(Utilityclass.getTD(1, 13));
		
		login.setDonorLoginPagecard(Utilityclass.getTD(1, 14));
		login.clickonyear(driver);
		login.clickonmonth(driver);
		login.setDonorLoginPagecvv(Utilityclass.getTD(1, 15));
		
		login.clickDonorLoginPageSubmit();
				
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
