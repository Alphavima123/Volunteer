package CRM_Grant_Managment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class demo 
{

//	public static void main(String[] args) throws IOException, InterruptedException {
		@Test
public void RUNBrowser() throws IOException, InterruptedException {
	

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
			driver.findElement(By.xpath("(//div[@style='display: inline-block; vertical-align: top; float: left; position: relative;'])[13]")).click();
			
		FileInputStream file =new FileInputStream("C:\\Users\\MonishSahare\\Downloads\\Test data\\Eclipse Test File\\Test Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("grantsetupName");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow celldata = sheet.getRow(i);
			/////////////////////////////////////////
			String Name = celldata.getCell(0).getStringCellValue();
			
			//////////////////////////////////////////
//			String Email = celldata.getCell(0).getStringCellValue();
//			String Pwd = celldata.getCell(1).getStringCellValue();
//			String	orgnization_name=celldata.getCell(2).getStringCellValue();
//			String	telephone_number=celldata.getCell(3).getStringCellValue();
//			String	emailaddress1=celldata.getCell(4).getStringCellValue();
			//div[@title='Grants']
			
//			driver.switchTo().frame("AppLandingPage");
//			driver.findElement(By.xpath("(//div[@style='display: inline-block; vertical-align: top; float: left; position: relative;'])[13]")).click();
			
			 driver.findElement(By.xpath("//div[@title='Grants']")).click();
			  driver.findElement(By.xpath("//button[@aria-label='New']")).click();
			//   driver.findElement(By.xpath("//button[text()=' APPLY NOW']")).click();
//			   Thread.sleep(1500);
			   driver.findElement(By.xpath("//input[@aria-label='Name']")).clear();
			 driver.findElement(By.xpath("//input[@aria-label='Name']")).sendKeys(Name);
			 Thread.sleep(1500);
			 
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
			Thread.sleep(5500);
			
			 driver.findElement(By.xpath("//input[@aria-label='Date of Application Open Date']")).clear();
			 driver.findElement(By.xpath("//input[@aria-label='Date of Application Open Date']")).sendKeys("7/13/2022");
			 driver.findElement(By.xpath("//input[@aria-label='Date of Application Close Date']")).clear();
			 driver.findElement(By.xpath("//input[@aria-label='Date of Application Close Date']")).sendKeys("8/29/2023");
			 driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
//			 Thread.sleep(1500);
//			 driver.findElement(By.xpath("//input[@name='orgnization_name']")).clear();
//			 driver.findElement(By.xpath("//input[@name='orgnization_name']")).sendKeys(orgnization_name);
//			 Thread.sleep(1500);
//			 driver.findElement(By.xpath("//input[@name='telephone_number']")).clear();
//			 driver.findElement(By.xpath("//input[@name='telephone_number']")).sendKeys(telephone_number);
//			 Thread.sleep(1500);
//			 driver.findElement(By.xpath("//input[@name='emailaddress1']")).clear();
//			 driver.findElement(By.xpath("//input[@name='emailaddress1']")).sendKeys(emailaddress1);
//			 driver.findElement(By.xpath("//button[@class='btn btnSubmit']")).click();
			 
//			 WebElement type = driver.findElement(By.xpath("//select[@name='eligibilitycriteria[]']"));
//				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//			s.selectByIndex(1);
//			
//			driver.findElement(By.xpath("//button[@class='btn btnSubmit']")).click();
//			
//			driver.findElement(By.xpath("//button[@id='submit']")).click();
//			
//			driver.findElement(By.xpath("//a[text()='Back to Grant']")).click();
//			
//			WebElement cause = driver.findElement(By.xpath("//a[@title='Profile name']"));
//			Actions act=new Actions(driver);
//			act.click(cause).perform();
//			act.sendKeys(Keys.ARROW_DOWN).perform();
//			act.sendKeys(Keys.ARROW_DOWN).perform();
////			act.sendKeys(Keys.ARROW_DOWN).perform();
//			act.sendKeys(Keys.ENTER).perform();	
			
			 Thread.sleep(1000);
			// driver.close();
			
		}
		
	}
}
