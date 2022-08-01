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

public class GrantMgmt_Grants 
{

	@Test
	public void RunDonor1() throws IOException, InterruptedException
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
		 
		    driver.switchTo().frame("AppLandingPage");
			driver.findElement(By.xpath("//div[@id='AppDetailsSec_1_Item_12']")).click();
			
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
				
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
//				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Potential Type']"));
//				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//				s.selectByIndex(2);
//				
//				
//				driver.findElement(By.xpath("//div[@aria-label='Organization']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Name']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Name']")).sendKeys(Name);
				
				WebElement Agency = driver.findElement(By.xpath("//button[@aria-label='Search records for Agency, Lookup field']"));
				Actions act=new Actions(driver);
				act.click(Agency).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();		
			
				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Category']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
			    s.selectByIndex(4);
				
				driver.findElement(By.xpath("//input[@aria-label='Version']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Version']")).sendKeys(Version);
				
				// Add more time for discription
				
				driver.findElement(By.xpath("//input[@aria-label='Total Program Funding']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Total Program Funding']")).sendKeys(TotalProgramFunding);
				
				driver.findElement(By.xpath("//input[@aria-label='Expected Number of Awards']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Expected Number of Awards']")).sendKeys(ExpectedNumberofAwards);
				
				driver.findElement(By.xpath("//input[@aria-label='Award Ceiling']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Award Ceiling']")).sendKeys(AwardCeiling);
				
				driver.findElement(By.xpath("//input[@aria-label='Award Floor']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Award Floor']")).sendKeys(AwardFloor);
				
				driver.findElement(By.xpath("//input[@aria-label='Fiscal Year']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Fiscal Year']")).sendKeys(FiscalYear);
				
				WebElement Reviewer = driver.findElement(By.xpath("//input[@aria-label='Reviewer, Lookup']"));
				Actions act1=new Actions(driver);
				act1.click(Reviewer).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Application Open Date']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Application Open Date']")).sendKeys("9/25/2022");
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Application Close Date']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Application Close Date']")).sendKeys("9/29/2022");
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Award Start Date']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Award Start Date']")).sendKeys("9/26/2022");
				
				driver.findElement(By.xpath("//div[@aria-label='Organization']")).click();
				
				driver.findElement(By.xpath("//div[@aria-label='Organization']")).click();
				
				driver.findElement(By.xpath("//div[@aria-label='Organization']")).click();
				
				driver.findElement(By.xpath("//div[@aria-label='Organization']")).click();
			
				
			}
	}
}
