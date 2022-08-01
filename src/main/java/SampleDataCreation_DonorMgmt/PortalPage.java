package SampleDataCreation_DonorMgmt;

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

public class PortalPage
{

	@SuppressWarnings("unused")
	@Test
	public void PortalPage() throws IOException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("https://integratedgl3qa.powerappsportals.com/");
	     
	     driver.findElement(By.xpath("(//a[@title='Donate'])[1]")).click();
	     
	     FileInputStream file =new FileInputStream("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Test Data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Donor");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			
			//DataLoad
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				String TributeName = celldata.getCell(0).getStringCellValue();
				String Companyname = celldata.getCell(1).getStringCellValue();
				String BusinessPhoneNumber = celldata.getCell(2).getStringCellValue();
				String first_name = celldata.getCell(3).getStringCellValue();
				String last_name = celldata.getCell(4).getStringCellValue();
				String email = celldata.getCell(5).getStringCellValue();
				String phone_number = celldata.getCell(6).getStringCellValue();
				String address = celldata.getCell(7).getStringCellValue();
				String street = celldata.getCell(8).getStringCellValue();
				String city = celldata.getCell(9).getStringCellValue();
				String Provience = celldata.getCell(10).getStringCellValue();
				String country = celldata.getCell(11).getStringCellValue();
				String zip = celldata.getCell(12).getStringCellValue();
				String cardnumber = celldata.getCell(13).getStringCellValue();
				String cardcvc = celldata.getCell(13).getStringCellValue();
	     
	     
	     driver.findElement(By.xpath("//label[@for='donatenow']")).click();
	     driver.findElement(By.xpath("//button[@value='100']")).click();
	     driver.findElement(By.xpath("//label[@for='cause']")).click();
	     
	     WebElement type = driver.findElement(By.xpath("//select[@name='sel-cause']"));
			org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
			s.selectByIndex(4);
	     
	     driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
	     
	     WebElement type1 = driver.findElement(By.xpath("//select[@name='honor']"));
			org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(type1);
			s1.selectByIndex(1);
	     
		 driver.findElement(By.xpath("//input[@placeholder='Tribute Name']")).clear();
	     driver.findElement(By.xpath("//input[@placeholder='Tribute Name']")).sendKeys("TributeName");
	     
	     driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	     
	     driver.findElement(By.xpath("//input[@placeholder='Company name']")).clear();
	     driver.findElement(By.xpath("//input[@placeholder='Company name']")).sendKeys("Companyname");
	     
	     driver.findElement(By.xpath("//input[@placeholder='Business Phone Number']")).clear();
	     driver.findElement(By.xpath("//input[@placeholder='Business Phone Number']")).sendKeys("BusinessPhoneNumber");
	     
	     driver.findElement(By.xpath("//input[@name='first_name']")).clear();
	     driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("first_name");
	     
	     driver.findElement(By.xpath("//input[@name='last_name']")).clear();
	     driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("last_name");
	     
	     driver.findElement(By.xpath("//input[@name='email']")).clear();
	     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email");
	     
	     driver.findElement(By.xpath("//input[@name='phone_number']")).clear();
	     driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("phone_number");
	     
	     driver.findElement(By.xpath("//input[@name='address']")).clear();
	     driver.findElement(By.xpath("//input[@name='address']")).sendKeys("address");
	     
	     driver.findElement(By.xpath("//input[@id='street']")).clear();
	     driver.findElement(By.xpath("//input[@id='street']")).sendKeys("street");
	     
	     driver.findElement(By.xpath("//input[@name='city']")).clear();
	     driver.findElement(By.xpath("//input[@name='city']")).sendKeys("city");
	     
	     driver.findElement(By.xpath("//input[@name='state']")).clear();
	     driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Provience");
	     
	     driver.findElement(By.xpath("//input[@name='country']")).clear();
	     driver.findElement(By.xpath("//input[@name='country']")).sendKeys("country");
	     
	     driver.findElement(By.xpath("//input[@name='zip']")).clear();
	     driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("zip");
	     
	     driver.findElement(By.xpath("//input[@name='cardnumber']")).clear();
	     driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys("cardnumber");
	     
	     WebElement type2 = driver.findElement(By.xpath("//select[@id='cardexpireyear']"));
			org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(type2);
			s2.selectByIndex(1);
		
		
		
			WebElement type3 = driver.findElement(By.xpath("//select[@id='cardexpiremonth']"));
			org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type3);
			s3.selectByIndex(1);
			
	     driver.findElement(By.xpath("//input[@name='cardcvc']")).clear();
	     driver.findElement(By.xpath("//input[@name='cardcvc']")).sendKeys("cardcvc");
	     
	     driver.findElement(By.xpath("//button[@id='sumbitbtn']")).click();
	   
			}     
	     
	}
}
