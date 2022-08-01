package SampleDataCreation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Account 
{
	@Test
	public void RunAccount() throws IOException, InterruptedException
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
			XSSFSheet sheet = workbook.getSheet("Account");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			
			//DataLoad
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				String AccountName = celldata.getCell(0).getStringCellValue();
				String Phone = celldata.getCell(1).getStringCellValue();
				String Fax = celldata.getCell(2).getStringCellValue();
				String Website = celldata.getCell(3).getStringCellValue();
				String Address1 = celldata.getCell(4).getStringCellValue();
				String Address2 = celldata.getCell(5).getStringCellValue();
				String Address3 = celldata.getCell(6).getStringCellValue();
				String City = celldata.getCell(7).getStringCellValue();
				String StateProvince = celldata.getCell(8).getStringCellValue();
				String Country = celldata.getCell(9).getStringCellValue();
				String ZIPPostalCode = celldata.getCell(10).getStringCellValue();
				
				driver.findElement(By.xpath("//span[text()='Accounts']")).click();
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				driver.findElement(By.xpath("//input[@aria-label='Account Name']")).sendKeys(AccountName);
				driver.findElement(By.xpath("//input[@aria-label='Phone']")).sendKeys(Phone);
				
						WebElement type = driver.findElement(By.xpath("//select[@aria-label='Donor']"));
						org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
						s.selectByIndex(1);

				driver.findElement(By.xpath("//input[@aria-label='Fax']")).sendKeys(Fax);
				driver.findElement(By.xpath("//input[@aria-label='Website']")).sendKeys(Website);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: Street 1']")).sendKeys(Address1);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: Street 2']")).sendKeys(Address2);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: Street 3']")).sendKeys(Address3);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: City']")).sendKeys(City);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: State/Province']")).sendKeys(Country);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: Country/Region']")).sendKeys(StateProvince);
				driver.findElement(By.xpath("//input[@aria-label='Address 1: ZIP/Postal Code']")).sendKeys(ZIPPostalCode);
				
				driver.findElement(By.xpath("//li[@aria-label='Details']")).click();
				
				WebElement type1 = driver.findElement(By.xpath("//select[@aria-label='Account Type']"));
		   		org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		Thread.sleep(4000);
		   		
		   		WebElement type2 = driver.findElement(By.xpath("//select[@aria-label='Acquisition Source']"));
		   		org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type3 = driver.findElement(By.xpath("//select[@aria-label='Primary Constituent Type']"));
		   		org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);

		   		WebElement type4 = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
		   		org.openqa.selenium.support.ui.Select s4=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type5 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Bulk Emails']"));
		   		org.openqa.selenium.support.ui.Select s5=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type6 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Emails']"));
		   		org.openqa.selenium.support.ui.Select s6=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type7 = driver.findElement(By.xpath("Do not allow Bulk Mails"));
		   		org.openqa.selenium.support.ui.Select s7=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type8 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Faxes']"));
		   		org.openqa.selenium.support.ui.Select s8=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type9 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Mails']"));
		   		org.openqa.selenium.support.ui.Select s9=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
		   		WebElement type10 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Phone Calls']"));
		   		org.openqa.selenium.support.ui.Select s10=new org.openqa.selenium.support.ui.Select(type);
		   		s.selectByIndex(1);
		   		
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
								
			
			}
	}
}
