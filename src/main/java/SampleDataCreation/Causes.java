package SampleDataCreation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Causes 
{
	@Test
	public void RunCause() throws IOException
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
			XSSFSheet sheet = workbook.getSheet("Causes");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			

			//DataLoad
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				
				String CauseName = celldata.getCell(0).getStringCellValue();
				String Description = celldata.getCell(1).getStringCellValue();
				String TargetAmount = celldata.getCell(2).getStringCellValue();
				
				driver.findElement(By.xpath("//span[text()='Causes']")).click();
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				driver.findElement(By.xpath("//div[@aria-label='Cause']")).click();
				driver.findElement(By.xpath("//input[@aria-label='Cause Name']")).sendKeys(CauseName);
				driver.findElement(By.xpath("//textarea[@aria-label='Description']")).sendKeys(Description);
				driver.findElement(By.xpath("//input[@aria-label='Target Amount']")).sendKeys(TargetAmount);
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();

			}
	}
}
