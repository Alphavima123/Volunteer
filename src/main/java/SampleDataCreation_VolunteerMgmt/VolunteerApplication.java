package SampleDataCreation_VolunteerMgmt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VolunteerApplication
{
	@Test
	public void RunVolunteerApplication() throws IOException
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
		 
		    driver.switchTo().frame("AppLandingPage");
			driver.findElement(By.xpath("(//div[@title='Volunteer Management'])[2]")).click();
			
			//Sheet loading
			FileInputStream file =new FileInputStream("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Test Data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Volunteer");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			
			//DataLoad
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
//				String FirstName = celldata.getCell(0).getStringCellValue();
//				String LastName = celldata.getCell(1).getStringCellValue();
//				String Salutation = celldata.getCell(2).getStringCellValue();
//				String PositionTitle = celldata.getCell(3).getStringCellValue();
//				String EmailPrimary = celldata.getCell(4).getStringCellValue();
//				String MobilePhone = celldata.getCell(5).getStringCellValue();
//		//		String ContactStewardedBy = celldata.getCell(6).getStringCellValue();
//				String HomePhone = celldata.getCell(7).getStringCellValue();
//				String BusinessPhone = celldata.getCell(31).getStringCellValue();
//				String SecondaryEmail1 = celldata.getCell(8).getStringCellValue();
//				String SecondaryEmail2 = celldata.getCell(9).getStringCellValue();
//				String Fax = celldata.getCell(10).getStringCellValue();
//				String SearchAddress = celldata.getCell(11).getStringCellValue();
//				String Address = celldata.getCell(12).getStringCellValue();
//				String Street = celldata.getCell(13).getStringCellValue();
//				String City = celldata.getCell(14).getStringCellValue();
//				String State = celldata.getCell(15).getStringCellValue();
//				String PostalCode = celldata.getCell(16).getStringCellValue();
//				String Country = celldata.getCell(17).getStringCellValue();
//				String EmployeeID = celldata.getCell(18).getStringCellValue();
//				String AreaofExpertise = celldata.getCell(19).getStringCellValue();
//				String Specialty = celldata.getCell(20).getStringCellValue();
//				String InternalNote = celldata.getCell(21).getStringCellValue();
		//		String AccountName = celldata.getCell(22).getStringCellValue();
		//		String Contact = celldata.getCell(23).getStringCellValue();
//				String Email = celldata.getCell(24).getStringCellValue();
//				String Phone = celldata.getCell(25).getStringCellValue();
//				String Extension = celldata.getCell(26).getStringCellValue();
//				String Suite = celldata.getCell(27).getStringCellValue();
//				String Street = celldata.getCell(28).getStringCellValue();
//				String City1 = celldata.getCell(29).getStringCellValue();
//				String PostalCode1 = celldata.getCell(30).getStringCellValue();
//				
				
				driver.findElement(By.xpath("//span[text()='Volunteer Applications']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
				WebElement Opportunity = driver.findElement(By.xpath("//input[@aria-label='Opportunity, Lookup']"));
				Actions act=new Actions(driver);
				act.click(Opportunity).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();
				
				WebElement Applicant = driver.findElement(By.xpath("//input[@aria-label='Applicant, Lookup']"));
				Actions act1=new Actions(driver);
				act1.click(Applicant).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				
				driver.findElement(By.xpath("//div[text()='Applicant Information']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
				
				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Application Status']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(2);
				
				WebElement type1 = driver.findElement(By.xpath("//select[@aria-label='Interview Scheduled']"));
				org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(type1);
				s1.selectByIndex(1);
				
				WebElement type2 = driver.findElement(By.xpath("//select[@aria-label='Interview Completed']"));
				org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(type2);
				s2.selectByIndex(1);	
				
				WebElement type3 = driver.findElement(By.xpath("//select[@aria-label='Candidate Status']"));
				org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type3);
				s3.selectByIndex(1);
				
				WebElement type4 = driver.findElement(By.xpath("//select[@aria-label='Offer Acceptance']"));
				org.openqa.selenium.support.ui.Select s4=new org.openqa.selenium.support.ui.Select(type4);
				s4.selectByIndex(1);
				
				WebElement type5 = driver.findElement(By.xpath("//select[@aria-label='Orientation Scheduled']"));
				org.openqa.selenium.support.ui.Select s5=new org.openqa.selenium.support.ui.Select(type5);
				s5.selectByIndex(1);
				
				WebElement type6 = driver.findElement(By.xpath("//select[@aria-label='First Shift Scheduled']"));
				org.openqa.selenium.support.ui.Select s6=new org.openqa.selenium.support.ui.Select(type6);
				s6.selectByIndex(1);	
				
				driver.findElement(By.xpath("//div[text()='Schedule Interview']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				WebElement type7 = driver.findElement(By.xpath("(//select[@aria-label='Candidate Status'])[2]"));
				org.openqa.selenium.support.ui.Select s7=new org.openqa.selenium.support.ui.Select(type7);
				s7.selectByIndex(1);
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();

				WebElement type8 = driver.findElement(By.xpath("//select[@aria-label='Certifications Completed']"));
				org.openqa.selenium.support.ui.Select s8=new org.openqa.selenium.support.ui.Select(type8);
				s8.selectByIndex(1);
				
				WebElement type9 = driver.findElement(By.xpath("//select[@aria-label='Trainings Completed']"));
				org.openqa.selenium.support.ui.Select s9=new org.openqa.selenium.support.ui.Select(type9);
				s9.selectByIndex(1);
				
				WebElement type10 = driver.findElement(By.xpath("//select[@aria-label='Reference Checks Completed']"));
				org.openqa.selenium.support.ui.Select s10=new org.openqa.selenium.support.ui.Select(type10);
				s10.selectByIndex(10);
				
				WebElement type11 = driver.findElement(By.xpath("//select[@aria-label='Police Record Check Seen']"));
				org.openqa.selenium.support.ui.Select s11=new org.openqa.selenium.support.ui.Select(type11);
				s11.selectByIndex(0);
				
				WebElement type12 = driver.findElement(By.xpath("//select[@aria-label='Reference Checks Completed']"));
				org.openqa.selenium.support.ui.Select s12=new org.openqa.selenium.support.ui.Select(type12);
				s12.selectByIndex(1);	
				
				WebElement type13 = driver.findElement(By.xpath("//select[@aria-label='Qualifications Verified']"));
				org.openqa.selenium.support.ui.Select s13=new org.openqa.selenium.support.ui.Select(type13);
				s13.selectByIndex(1);	
				
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				WebElement type14 = driver.findElement(By.xpath("//select[@aria-label='Volunteer Status']"));
				org.openqa.selenium.support.ui.Select s14=new org.openqa.selenium.support.ui.Select(type14);
				s14.selectByIndex(1);
				
				WebElement type15 = driver.findElement(By.xpath("//select[@aria-label='Temporary Break']"));
				org.openqa.selenium.support.ui.Select s15=new org.openqa.selenium.support.ui.Select(type15);
				s15.selectByIndex(1);	
				
				WebElement type16 = driver.findElement(By.xpath("//select[@aria-label='Term Concluded']"));
				org.openqa.selenium.support.ui.Select s16=new org.openqa.selenium.support.ui.Select(type16);
				s16.selectByIndex(1);
				
				
				driver.findElement(By.xpath("//button[@aria-label='Next Stage']")).click();
				
				WebElement type17 = driver.findElement(By.xpath("(//select[@aria-label='Offer Acceptance'])[2]"));
				org.openqa.selenium.support.ui.Select s17=new org.openqa.selenium.support.ui.Select(type17);
				s17.selectByIndex(1);
				
				driver.findElement(By.xpath("//button[@aria-label='Finish']")).click();
			}
	}
}
