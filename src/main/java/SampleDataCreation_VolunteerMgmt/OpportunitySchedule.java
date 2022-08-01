package SampleDataCreation_VolunteerMgmt;

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

public class OpportunitySchedule 
{

	public void Run_OpportunitySchedule() throws IOException
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
				String JobTitle = celldata.getCell(0).getStringCellValue();
				String VolunteerOpportunity = celldata.getCell(1).getStringCellValue();
				String ExpectedHoursPerDay = celldata.getCell(2).getStringCellValue();
				
				driver.findElement(By.xpath("//span[text()='Opportunity Schedules']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Job Title']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Job Title']")).sendKeys(JobTitle);
				
				WebElement volopp = driver.findElement(By.xpath("//input[@aria-label='Volunteer Opportunity, Lookup']"));
				Actions act=new Actions(driver);
				act.click(volopp).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();
				
				
				driver.findElement(By.xpath("(//i[@data-icon-name='Calendar'])[1]")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='September']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='29, September, 2022']")).click();
				
				WebElement Time = driver.findElement(By.xpath("//i[@data-icon-name='Clock']"));
				Actions act1=new Actions(driver);
				act1.click(Time).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("(//i[@data-icon-name='Calendar'])[2]")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='September']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='30, September, 2022']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
				
				WebElement Time2 = driver.findElement(By.xpath("(//i[@data-icon-name='Clock'])[2]"));
				Actions act2=new Actions(driver);
				act2.click(Time2).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//input[@aria-label='Expected Hours Per Day']")).clear();
				
				driver.findElement(By.xpath("//input[@aria-label='Expected Hours Per Day']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Expected Hours Per Day']")).sendKeys(ExpectedHoursPerDay);
				
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				
			}
	}
}
