package CRM_Grant_Managment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;


public class CRM_Test_Class_2 extends Baseclass
{
	CRM_login1_page login1;
	CRM_login2_page login2;
	CRM_Prospect_2 prospect;
	CRM_Opportunity_2 Opportunity;
	
	@org.testng.annotations.Test(priority = 1)
	public void OpentheBrowser() throws IOException
	{
		initilizeBrowser();
		
		login1= new CRM_login1_page(driver);
		login2= new CRM_login2_page(driver);
		prospect=new CRM_Prospect_2(driver);
		Opportunity=new CRM_Opportunity_2(driver);
		
		
	}
	@org.testng.annotations.Test(priority = 2)
	public void LoginToAap() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login1.setCRMlogin1page(Utilityclass_CRM_page.getTD(1, 0));
		login1.clickCRMloginNextbtn();
		Thread.sleep(1500);
		login2.setCRMlogin2page(Utilityclass_CRM_page.getTD(1, 1));
		login2.clickCRMloginSignbtn();
		login2.clickCRMonPopup();
		Thread.sleep(1500);
		prospect.clickonFunddevelopment(driver);
		Thread.sleep(1500);
		prospect.clickonprospect();
		Thread.sleep(1500);
		prospect.clickonnew();
		Thread.sleep(1500);
		prospect.clickonpotentialType(driver);
		Thread.sleep(1500);
		prospect.clickonOrganization();
		Thread.sleep(1500);
		prospect.setCRMProspectpageEstimated(Utilityclass_CRM_page.getTD(1, 2));
		Thread.sleep(1500);
		prospect.setCRMProspectpagedate("date");
		Thread.sleep(1500);
		prospect.clickonsource(driver);
		Thread.sleep(1500);
		prospect.setCRMProspectpagefname(Utilityclass_CRM_page.getTD(1, 3));
		Thread.sleep(1500);
		prospect.setCRMProspectpagelname(Utilityclass_CRM_page.getTD(1, 4));
		Thread.sleep(1500);
		prospect.setCRMPositionTitle(Utilityclass_CRM_page.getTD(1, 5));
		Thread.sleep(1500);
		prospect.setCRMProspectpageEmailid(Utilityclass_CRM_page.getTD(1, 6));
		Thread.sleep(1500);
		prospect.setCRMProspectpageBusinessPhone(Utilityclass_CRM_page.getTD(1, 7));
		Thread.sleep(1500);
		prospect.setCRMProspectpageBusinessPhoneeXT(Utilityclass_CRM_page.getTD(1, 8));
		Thread.sleep(1500);
		prospect.setCRMProspectpageMobilephone(Utilityclass_CRM_page.getTD(1, 9));
		Thread.sleep(1500);
		prospect.clickoncause(driver);
		Thread.sleep(2500);
		prospect.clickonTimeframe(driver);
		Thread.sleep(1500);
		prospect.setCRMprospectGrantEligibilityCriteria(Utilityclass_CRM_page.getTD(1, 10));
		Thread.sleep(1500);
		prospect.setCRMprospectDescription(Utilityclass_CRM_page.getTD(1, 11));
		Thread.sleep(1500);
		prospect.setCRMprospectNewOrganization(Utilityclass_CRM_page.getTD(1, 25));
		Thread.sleep(1500);
		prospect.setCRMprospectOrganizationPhoneNumber(Utilityclass_CRM_page.getTD(1, 26));
		Thread.sleep(1500);
		prospect.clickonAccountType(driver);
		Thread.sleep(1500);
		prospect.setCRMopportunityEmail2(Utilityclass_CRM_page.getTD(1, 27));
		Thread.sleep(1500);
		prospect.setCRMopportunitySearchAddress(Utilityclass_CRM_page.getTD(1, 28));
		Thread.sleep(1500);
		prospect.setCRMopportunityApartmentnumber(Utilityclass_CRM_page.getTD(1, 29));
		Thread.sleep(1500);
		prospect.setCRMopportunityStreet(Utilityclass_CRM_page.getTD(1, 30));
		Thread.sleep(1500);
		prospect.setCRMopportunityCity(Utilityclass_CRM_page.getTD(1, 31));
		Thread.sleep(1500);
		prospect.setCRMopportunityStateProvince(Utilityclass_CRM_page.getTD(1, 32));
		Thread.sleep(1500);
		prospect.setCRMopportunityZIpPostalCode(Utilityclass_CRM_page.getTD(1, 33));
		Thread.sleep(1500);
		prospect.setCRMopportunityCountry(Utilityclass_CRM_page.getTD(1, 34));
		Thread.sleep(1500);
		prospect.setCRMopportunityWebsite(Utilityclass_CRM_page.getTD(1, 35));
		Thread.sleep(1500);
		prospect.clickonDetails();
		Thread.sleep(1500);
		prospect.clickonMarketingMaterials(driver);
		Thread.sleep(1500);
		prospect.clickonStewardBy(driver);
		Thread.sleep(1500);
		prospect.clickonPreferredContactmethod(driver);
		Thread.sleep(1500);
		prospect.clickonemail();
		Thread.sleep(1500);
		prospect.clickonFollowEmailActivity();
		Thread.sleep(1500);
		prospect.clickonBulkEmail();
		Thread.sleep(1500);
		prospect.clickonPhone();
		Thread.sleep(1500);
		prospect.clickonMail();
		Thread.sleep(1500);
		prospect.clickonIndustry(driver);
		Thread.sleep(1500);
		prospect.setCRMprospectAnnualRevenue(Utilityclass_CRM_page.getTD(1, 12));
		Thread.sleep(1500);
		prospect.setCRMprospectEmployees(Utilityclass_CRM_page.getTD(1, 13));
		Thread.sleep(2500);
		prospect.clickonsave();
		Thread.sleep(4500);
		prospect.clickonIdentifyQualify();
		Thread.sleep(1500);
		prospect.clickonGrantEligibility(driver);
		Thread.sleep(1500);
		prospect.clickonqualify();
		Thread.sleep(2500);
		prospect.clickonOK();
		Thread.sleep(2500);
	//	Opportunity.clickonAccount(driver);
		Thread.sleep(2500);
		Opportunity.setCRMopportunityDescription2(Utilityclass_CRM_page.getTD(1, 14));
		Thread.sleep(2500);
		Opportunity.clickonEngagementLevel(driver);
		Thread.sleep(2500);
		Opportunity.clickonGrantApplicationAttachmentData(driver);
		Thread.sleep(2500);
		Opportunity.clickonGrantDetails();
		Thread.sleep(2500);
		Opportunity.setCRMopportunityTitleofGrant(Utilityclass_CRM_page.getTD(1, 15));
		Thread.sleep(2500);
		Opportunity.setCRMopportunityApplicationReference(Utilityclass_CRM_page.getTD(1, 16));
		Thread.sleep(2500);
		Opportunity.clickonFiscalSponsor(driver);
		Thread.sleep(2500);
		Opportunity.clickonsetCRMopportunityDueDate("date");
		Thread.sleep(2500);
		Opportunity.clickonGrantPeriod(driver);
		Thread.sleep(2500);
		Opportunity.setCRMopportunityNotes(Utilityclass_CRM_page.getTD(1, 17));
		Thread.sleep(2500);
		Opportunity.setCRMopportunityMinimumFunding(Utilityclass_CRM_page.getTD(1, 18));
		Thread.sleep(2500);
		Opportunity.setCRMopportunityMaximumFunding(Utilityclass_CRM_page.getTD(1, 19));
		Thread.sleep(3500);
		Opportunity.setCRMopportunityActualRevenue(Utilityclass_CRM_page.getTD(1, 20));
		Thread.sleep(2500);
		Opportunity.clickonType(driver);
		Thread.sleep(2500);
		Opportunity.clickonProject(driver);
		Thread.sleep(2500);
		Opportunity.clickonInternalContact(driver);
		Thread.sleep(1500);
		Opportunity.clickonSave();
		Thread.sleep(1500);
		Opportunity.clickonCultivate();
		Thread.sleep(1500);
		Opportunity.setCRMopportunityDateofIntroductory("date");
		Thread.sleep(1500);
		Opportunity.clickonGrantType(driver);
		Thread.sleep(1500);
		Opportunity.clickonFrequency(driver);
		Thread.sleep(1500);
		Opportunity.setCRmInterval(Utilityclass_CRM_page.getTD(1, 36));
		Thread.sleep(1500);
		Opportunity.clickonNext();
		Thread.sleep(1500);
		Opportunity.clickonGrantApplication();
		Thread.sleep(3500);
		Opportunity.setCRMopportunityDueDate2("date");
		Thread.sleep(3500);
		Opportunity.setCRMDateofSubmitted("date");
		Thread.sleep(1500);
		Opportunity.clickonReviewer(driver);
		Thread.sleep(1500);
		Opportunity.clickonNeedRevision(driver);
		Thread.sleep(1500);
	//	Opportunity.setCRMopportunityReason(Utilityclass_CRM_page.getTD(1, 21));
		Thread.sleep(1500);
		Opportunity.clickonDocuments();
		Thread.sleep(2500);
		Opportunity.clickonUpload();
		Thread.sleep(10500);
		Opportunity.clickonOverwriteexisting(driver);
		Thread.sleep(1500);
		Opportunity.clickonOK2();
		Thread.sleep(1500);
		Opportunity.clickonSave();
		Thread.sleep(1500);
		Opportunity.clickonDraftApplication();
		Thread.sleep(1500);
		Opportunity.clickonNext();
		Thread.sleep(1500);
		Opportunity.clickonNext();
		Thread.sleep(1500);
		Opportunity.clickonNext();
		
		Thread.sleep(3500);
		Opportunity.clickonGrantApplicationStatus(driver);
		Thread.sleep(3500);
		Opportunity.setCRMopportunityAwardedAmount(Utilityclass_CRM_page.getTD(1, 22));
		Thread.sleep(3500);
		
		Opportunity.clickonNext();
		Thread.sleep(1500);
	//	Opportunity.setCRMopportunityRevisionReason(Utilityclass_CRM_page.getTD(1, 23));
		Thread.sleep(1500);
	//	Opportunity.clickonNext();
		Thread.sleep(1500);
		Opportunity.setCRMopportunityDescription3(Utilityclass_CRM_page.getTD(1, 24));
		Thread.sleep(2500);
		Opportunity.clickonFinish();
		Thread.sleep(1500);
	}
	@org.testng.annotations.Test(priority = 3)
	public void closebrowser() throws InterruptedException 
	{
		login1=null;
		login2=null;
		prospect=null;
		Opportunity=null;
		Thread.sleep(3000);
//		driver.close();
		driver=null;	
					
	}
}
