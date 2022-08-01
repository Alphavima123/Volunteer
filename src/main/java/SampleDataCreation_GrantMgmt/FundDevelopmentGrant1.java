package SampleDataCreation_GrantMgmt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FundDevelopmentGrant1 
{

	@Test
	public void RunFundDevelopmentGrant1 () throws IOException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\Downloads\\Test data\\New folder\\Test Data.xlsx");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("https://gl3qa2.crm3.dynamics.com/");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gluser@givelifeqa.onmicrosoft.com");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("gltesting@123");
		 driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 
			driver.findElement(By.xpath("//div[@id='AppDetailsSec_1_Item_10']")).click();
			
			//Sheet loading
			FileInputStream file =new FileInputStream("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Test Data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Grant");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			
			//DataLoad
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				String Estimate = celldata.getCell(0).getStringCellValue();
				String Firstname = celldata.getCell(1).getStringCellValue();
				String Lastname = celldata.getCell(2).getStringCellValue();
				String PositionTitle = celldata.getCell(3).getStringCellValue();
				String Email = celldata.getCell(4).getStringCellValue();
				String BusinessPhone = celldata.getCell(5).getStringCellValue();
				String BusinessPhoneExt = celldata.getCell(6).getStringCellValue();
				String MobilePhone = celldata.getCell(7).getStringCellValue();
				String GrantEligibilityCriteria = celldata.getCell(8).getStringCellValue();
				String Description = celldata.getCell(9).getStringCellValue();
				String AnnualRevenue = celldata.getCell(10).getStringCellValue();
				String NoofEmployees = celldata.getCell(11).getStringCellValue();
				String Description1 = celldata.getCell(12).getStringCellValue();
				String TitleofGrant = celldata.getCell(13).getStringCellValue();
				String ApplicationReferenceID = celldata.getCell(14).getStringCellValue();
				String Notes = celldata.getCell(15).getStringCellValue();
				String MinimumFunding = celldata.getCell(16).getStringCellValue();
				String MaximumFunding = celldata.getCell(17).getStringCellValue();
				String ActualRevenue = celldata.getCell(18).getStringCellValue();
				String AwardedAmount = celldata.getCell(19).getStringCellValue();
				
				
				driver.findElement(By.xpath("//div[@title='Prospects']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Potential Type']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(2);
				
				
				driver.findElement(By.xpath("//label[text()='Individual']")).click();
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Estimate);
				
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/25/2022");
				
				WebElement type1 = driver.findElement(By.xpath("//select[@aria-label='Prospect Source']"));
				org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(type1);
				s1.selectByIndex(1);
				
				driver.findElement(By.xpath("//input[@aria-label='First Name']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys(Firstname);
				
				driver.findElement(By.xpath("//input[@aria-label='Last Name']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys(Lastname);
				
				driver.findElement(By.xpath("//input[@aria-label='Position Title']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Position Title']")).sendKeys(PositionTitle);
				
				
				driver.findElement(By.xpath("//input[@placeholder='Provide an email']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Provide an email']")).sendKeys(Email);
				
				
				driver.findElement(By.xpath("//input[@aria-label='Business Phone']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Business Phone']")).sendKeys(BusinessPhone);
				
				
				driver.findElement(By.xpath("//input[@aria-label='Business Phone Ext.']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Business Phone Ext.']")).sendKeys(BusinessPhoneExt);
				
				
				driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).sendKeys(MobilePhone);
				
				WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Cause, Lookup']"));
				Actions act=new Actions(driver);
				act.click(cause).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();
				
				WebElement type2 = driver.findElement(By.xpath("//select[@aria-label='Timeframe']"));
				org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(type2);
			    s2.selectByIndex(4);
				

				driver.findElement(By.xpath("//textarea[@aria-label='Grant Eligibility Criteria']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Grant Eligibility Criteria']")).sendKeys(GrantEligibilityCriteria);
				

				driver.findElement(By.xpath("//input[@aria-label='Description']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Description']")).sendKeys(Description);
				
				driver.findElement(By.xpath("//li[@aria-label='Details']")).click();
				
				WebElement type3 = driver.findElement(By.xpath("//select[@aria-label=' Marketing Materials']"));
				org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type3);
		    	s3.selectByIndex(2);
			
				WebElement steward = driver.findElement(By.xpath("//input[@aria-label='Steward By, Lookup']"));
				Actions act1=new Actions(driver);
				act1.click(steward).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ENTER).perform();		
			
				WebElement type4 = driver.findElement(By.xpath("//select[@aria-label='Preferred Contact method']"));
				org.openqa.selenium.support.ui.Select s4=new org.openqa.selenium.support.ui.Select(type4);
		    	s4.selectByIndex(4);
		    	
		    	driver.findElement(By.xpath("(//input[@aria-label='Email'])[2]")).click();
		    	driver.findElement(By.xpath("//input[@aria-label='Follow Email Activity']")).click();
		    	driver.findElement(By.xpath("//input[@aria-label='Bulk Email']")).click();
		    	driver.findElement(By.xpath("//input[@aria-label='Phone']")).click();
		    	driver.findElement(By.xpath("//input[@aria-label='Mail']")).click();
		    	
		    	WebElement type5 = driver.findElement(By.xpath("//select[@aria-label='Industry']"));
				org.openqa.selenium.support.ui.Select s5=new org.openqa.selenium.support.ui.Select(type5);
				s5.selectByIndex(1);
			    
				driver.findElement(By.xpath("//input[@aria-label='Annual Revenue']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Annual Revenue']")).sendKeys(AnnualRevenue);
				
				driver.findElement(By.xpath("//input[@aria-label='No. of Employees']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='No. of Employees']")).sendKeys(NoofEmployees);
				
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
				
				driver.findElement(By.xpath("//div[text()='Identify & Qualify']")).click();
				
				WebElement type6 = driver.findElement(By.xpath("//select[@aria-label='Grant Eligibility Criteria Matched']"));
				org.openqa.selenium.support.ui.Select s6=new org.openqa.selenium.support.ui.Select(type6);
				s6.selectByIndex(1);
				
				driver.findElement(By.xpath("//button[@title='Qualify']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='OK']")).click();
				
				WebElement Account = driver.findElement(By.xpath("//input[@aria-label='Account, Lookup']"));
				Actions act2=new Actions(driver);
				act2.click(Account).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ENTER).perform();
				
			    
				driver.findElement(By.xpath("//textarea[@aria-label='Description']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Description']")).sendKeys(Description1);
				
				WebElement type7 = driver.findElement(By.xpath("//select[@aria-label='Engagement Level']"));
				org.openqa.selenium.support.ui.Select s7=new org.openqa.selenium.support.ui.Select(type7);
		    	s7.selectByIndex(2);
			
				WebElement type8 = driver.findElement(By.xpath("//select[@aria-label='Grant Application Attachment Data']"));
				org.openqa.selenium.support.ui.Select s8=new org.openqa.selenium.support.ui.Select(type8);
		    	s8.selectByIndex(1);
				
				driver.findElement(By.xpath("//li[@aria-label='Grant Details']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Title of Grant']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Title of Grant']")).sendKeys(TitleofGrant);
				
				driver.findElement(By.xpath("//input[@aria-label='Application Reference ID']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Application Reference ID']")).sendKeys(ApplicationReferenceID);
				
				WebElement cause1 = driver.findElement(By.xpath("//input[@aria-label='Fiscal Sponsor, Lookup']"));
				Actions act3=new Actions(driver);
				act3.click(cause1).perform();
				act3.sendKeys(Keys.ARROW_DOWN).perform();
				act3.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Due Date']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Due Date']")).sendKeys("10/22/2022");
				
				WebElement type9 = driver.findElement(By.xpath("//select[@aria-label='Grant Period']"));
				org.openqa.selenium.support.ui.Select s9=new org.openqa.selenium.support.ui.Select(type9);
		    	s9.selectByIndex(2);
				
		    	driver.findElement(By.xpath("//textarea[@aria-label='Notes']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Notes']")).sendKeys(Notes);
				
				driver.findElement(By.xpath("//input[@aria-label='Minimum Funding']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Minimum Funding']")).sendKeys(MinimumFunding);
				
				driver.findElement(By.xpath("//input[@aria-label='Maximum Funding']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Maximum Funding']")).sendKeys(MaximumFunding);
				
				driver.findElement(By.xpath("//input[@aria-label='Actual Revenue']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Actual Revenue']")).sendKeys(ActualRevenue);
				
				WebElement type10 = driver.findElement(By.xpath("//select[@aria-label='Type']"));
				org.openqa.selenium.support.ui.Select s10=new org.openqa.selenium.support.ui.Select(type10);
		    	s10.selectByIndex(2);
			
				WebElement cause2 = driver.findElement(By.xpath("//input[@aria-label='Project, Lookup']"));
				Actions act4=new Actions(driver);
				act4.click(cause2).perform();
				act4.sendKeys(Keys.ARROW_DOWN).perform();
				act4.sendKeys(Keys.ENTER).perform();		
			
				WebElement cause3 = driver.findElement(By.xpath("//input[@aria-label='Internal Contact, Lookup']"));
				Actions act5=new Actions(driver);
				act5.click(cause3).perform();
				act5.sendKeys(Keys.ARROW_DOWN).perform();
				act5.sendKeys(Keys.ENTER).perform();	
				
				
				driver.findElement(By.xpath("//div[text()='Cultivate']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Introductory Meeting']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Introductory Meeting']")).sendKeys("10/20/2022");
				
				WebElement type11 = driver.findElement(By.xpath("//select[@aria-label='Grant Type']"));
				org.openqa.selenium.support.ui.Select s11=new org.openqa.selenium.support.ui.Select(type11);
			    s11.selectByIndex(1);
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				driver.findElement(By.xpath("//span[text()='OK']")).click();
				
				driver.findElement(By.xpath("//span[text()='Create Grant Application']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Due Date']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Due Date']")).sendKeys("10/23/2022");
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Submitted on']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Submitted on']")).sendKeys("10/24/2022");
				
				WebElement cause4 = driver.findElement(By.xpath("//input[@aria-label='Reviewer, Lookup']"));
				Actions act6=new Actions(driver);
				act6.click(cause4).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act6.sendKeys(Keys.ENTER).perform();
				
				WebElement type12 = driver.findElement(By.xpath("//select[@aria-label='Need Revision']"));
				org.openqa.selenium.support.ui.Select s12=new org.openqa.selenium.support.ui.Select(type12);
		    	s12.selectByIndex(0);
				
				driver.findElement(By.xpath("//li[@aria-label='Documents']")).click();
				driver.findElement(By.xpath("//button[@aria-label='Upload']")).click();
				
				WebElement type13 = driver.findElement(By.xpath("//select[@aria-label='Overwrite existing files']"));
				org.openqa.selenium.support.ui.Select s13=new org.openqa.selenium.support.ui.Select(type13);
			    s13.selectByIndex(1);
				
				driver.findElement(By.xpath("//button[@aria-label='OK']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
				
				driver.findElement(By.xpath("//div[text()='Draft Application']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				

				WebElement type14 = driver.findElement(By.xpath("//select[@aria-label='Grant Application Status']"));
				org.openqa.selenium.support.ui.Select s14=new org.openqa.selenium.support.ui.Select(type14);
		    	s14.selectByIndex(1);
				
				driver.findElement(By.xpath("//input[@aria-label='Awarded Amount']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Awarded Amount']")).sendKeys(AwardedAmount);
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Finish']")).click();
				
				
			}
	}
}

