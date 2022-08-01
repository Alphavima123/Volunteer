package SampleDataCreation_DonorMgmt;

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

public class Donor4
{

	@Test
	public void RunDonor4() throws IOException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
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
			XSSFSheet sheet = workbook.getSheet("Donor");
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
				String Description = celldata.getCell(8).getStringCellValue();
				String ActualRevenue = celldata.getCell(9).getStringCellValue();
				String FairMarketValue = celldata.getCell(10).getStringCellValue();
				String NewOrganization = celldata.getCell(11).getStringCellValue();
				String OrganizationPhoneNumber = celldata.getCell(12).getStringCellValue();
				String NeworgaizationEmail = celldata.getCell(13).getStringCellValue();
				
				driver.findElement(By.xpath("//div[@title='Prospects']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Potential Type']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				
				driver.findElement(By.xpath("//label[text()='Organization']")).click();
				
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
			    
			    driver.findElement(By.xpath("//input[@aria-label='New Organization']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='New Organization']")).sendKeys(NewOrganization);
			    
			    driver.findElement(By.xpath("//input[@aria-label='Organization Phone Number']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Organization Phone Number']")).sendKeys(OrganizationPhoneNumber);
			    
			    WebElement type3 = driver.findElement(By.xpath("//select[@aria-label='Account Type']"));
				org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type3);
				s3.selectByIndex(1);
			    

			    driver.findElement(By.xpath("(//input[@aria-label='Email'])[2]")).clear();
				driver.findElement(By.xpath("(//input[@aria-label='Email'])[2]")).sendKeys(NeworgaizationEmail);
				
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
				driver.findElement(By.xpath("//button[@title='Qualify']")).click();
				driver.findElement(By.xpath("//button[@aria-label='OK']")).click();
				
				driver.findElement(By.xpath("//label[text()='Moderate']")).click();
				driver.findElement(By.xpath("//label[text()='One-time']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Save and continue']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
				
				driver.findElement(By.xpath("(//div[@title=\\\"Cultivate\\\"])[1]")).click();
				
				driver.findElement(By.xpath("(//div[@class='pa-a pa-bd pa-o pa-as flexbox'])[2]")).click();
	
				
				driver.findElement(By.xpath("//button[@aria-label='Refresh']")).click();
				driver.findElement(By.xpath("(//div[@title='Solicit'])[1]")).click();
				
				WebElement type8 = driver.findElement(By.xpath("//select[@aria-label='Ask Readiness']"));
				org.openqa.selenium.support.ui.Select s8=new org.openqa.selenium.support.ui.Select(type8);
				s8.selectByIndex(2);
				
				WebElement type4 = driver.findElement(By.xpath("//select[@aria-label='Request for Donation']"));
				org.openqa.selenium.support.ui.Select s4=new org.openqa.selenium.support.ui.Select(type4);
				s4.selectByIndex(1);
				
				WebElement type5 = driver.findElement(By.xpath("//select[@aria-label='Resolve Concerns']"));
				org.openqa.selenium.support.ui.Select s5=new org.openqa.selenium.support.ui.Select(type5);
				s5.selectByIndex(1);
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				WebElement type6 = driver.findElement(By.xpath("//select[@aria-label='Add to Marketing List']"));
				org.openqa.selenium.support.ui.Select s6=new org.openqa.selenium.support.ui.Select(type6);
				s6.selectByIndex(1);
				
				WebElement type7 = driver.findElement(By.xpath("//select[@aria-label='First Payment Received']"));
				org.openqa.selenium.support.ui.Select s7=new org.openqa.selenium.support.ui.Select(type7);
				s7.selectByIndex(2);

				
				driver.findElement(By.xpath("//button[@aria-label='Finish']")).click();

				driver.findElement(By.xpath("//button[@aria-label='Refresh']")).click();
				driver.findElement(By.xpath("(//div[@role='gridcell'])[2]")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Received Date']")).sendKeys("10/28/2022");
				

				
				driver.findElement(By.xpath("//button[@aria-label='More Header Fields']")).click();
				
				WebElement cause1 = driver.findElement(By.xpath("(//div[@aria-label='Status Reason'])[1]"));
				Actions act1=new Actions(driver);
				act1.click(cause1).perform();
				act1.sendKeys(Keys.ARROW_UP).perform();
				act1.sendKeys(Keys.ARROW_UP).perform();
				act1.sendKeys(Keys.ENTER).perform();	
				
				driver.findElement(By.xpath("//button[@aria-label='Press Enter to go back.']")).click();
				driver.findElement(By.xpath("//button[@aria-label='Close Opportunity']")).click();
				
				driver.findElement(By.xpath("//input[@id='txtDescription']")).clear();
				driver.findElement(By.xpath("//input[@id='txtDescription']")).sendKeys(Description);
				
				
				driver.findElement(By.xpath("//input[@id='txtActualRevenue']")).clear();
				driver.findElement(By.xpath("//input[@id='txtActualRevenue']")).sendKeys(ActualRevenue);
				
				
				WebElement type9 = driver.findElement(By.xpath("//select[@id='optionsetStatusReason']"));
				org.openqa.selenium.support.ui.Select s9=new org.openqa.selenium.support.ui.Select(type9);
				s9.selectByIndex(2);
				
				driver.findElement(By.xpath("//input[@value='Ok']")).click();
				
				
			}
	}
}
