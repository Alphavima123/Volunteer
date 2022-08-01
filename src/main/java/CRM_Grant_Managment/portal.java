package CRM_Grant_Managment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class portal 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qaportal1.powerappsportals.com/");
		FileInputStream file =new FileInputStream("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Test Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Grantportal");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow celldata = sheet.getRow(i);
			String Email = celldata.getCell(0).getStringCellValue();
			String Pwd = celldata.getCell(1).getStringCellValue();
			String	orgnization_name=celldata.getCell(2).getStringCellValue();
			String	telephone_number=celldata.getCell(3).getStringCellValue();
			String	emailaddress1=celldata.getCell(4).getStringCellValue();
			
			 driver.findElement(By.xpath("//a[@aria-label='Grant']")).click();
			  driver.findElement(By.xpath("(//span[text()='Details'])[10]")).click();
			   driver.findElement(By.xpath("//button[text()=' APPLY NOW']")).click();
			   Thread.sleep(1500);
			   driver.findElement(By.xpath("//input[@name='Email Address']")).clear();
			 driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys(Email);
			 Thread.sleep(1500);
			 driver.findElement(By.xpath("//input[@name='Password']")).clear();
			 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Pwd);
			 driver.findElement(By.xpath("//button[@id='next']")).click();
			 Thread.sleep(1500);
			 driver.findElement(By.xpath("//input[@name='orgnization_name']")).clear();
			 driver.findElement(By.xpath("//input[@name='orgnization_name']")).sendKeys(orgnization_name);
			 Thread.sleep(1500);
			 driver.findElement(By.xpath("//input[@name='telephone_number']")).clear();
			 driver.findElement(By.xpath("//input[@name='telephone_number']")).sendKeys(telephone_number);
			 Thread.sleep(1500);
			 driver.findElement(By.xpath("//input[@name='emailaddress1']")).clear();
			 driver.findElement(By.xpath("//input[@name='emailaddress1']")).sendKeys(emailaddress1);
			 driver.findElement(By.xpath("//button[@class='btn btnSubmit']")).click();
			 
			 WebElement type = driver.findElement(By.xpath("//select[@name='eligibilitycriteria[]']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
			s.selectByIndex(1);
			
			driver.findElement(By.xpath("//button[@class='btn btnSubmit']")).click();
			
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			
			driver.findElement(By.xpath("//a[text()='Back to Grant']")).click();
			
			WebElement cause = driver.findElement(By.xpath("//a[@title='Profile name']"));
			Actions act=new Actions(driver);
			act.click(cause).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
//			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();	
			
			 Thread.sleep(10000);
		//	 driver.close();
			
		}
		
	
		
		
		
		
		
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
//		
//		 //Create an object of File class to open xls file
//        File file =    new File("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Test Data.xlsx");
//        
//////        //Create an object of FileInputStream class to read excel file
//        FileInputStream inputStream = new FileInputStream(file);
//        
//        //creating workbook instance that refers to .xls file
//        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
//        
//        //creating a Sheet object
//        XSSFSheet sheet=wb.getSheet("Grantportal");
//        
//        //get all rows in the sheet
//        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//        
//       //Creating an object of ChromeDriver
//        WebDriver driver=new ChromeDriver();
//    	driver.manage().window().maximize();
//    	Thread.sleep(2000);
//    	driver.get("https://qaportal1.powerappsportals.com/");
//    	Thread.sleep(2000);
//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//a[@aria-label='Grant']")).click();
//		driver.findElement(By.xpath("(//span[text()='Details'])[10]")).click();
//		driver.findElement(By.xpath("//button[text()=' APPLY NOW']")).click();
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
////		  WebElement Grant = driver.findElement(By.xpath("//a[@aria-label='Grant']"));
////		  WebElement Details = driver.findElement(By.xpath("(//span[text()='Details'])[10]"));
////		  WebElement APPLYNOW = driver.findElement(By.xpath("//button[text()=' APPLY NOW']"));
//		  WebElement EmailAddress = driver.findElement(By.xpath("//input[@name='Email Address']"));
//		  WebElement Password = driver.findElement(By.xpath("//input[@name='Password']"));
////		  WebElement Signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
//	//	driver.findElement(By.xpath("//a[@aria-label='Grant']")).click();
//
//		  //iterate over all the rows in Excel and put data in the form.
//	        for(int i=1;i<=rowCount;i++) 
//	        {
////	        	Grant.click();
////	        	Thread.sleep(2000);
////	        	Details.click();
////	        	Thread.sleep(2000);
////	        	APPLYNOW.click();
//	        	Thread.sleep(4000);
//	 //       	  firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
//	        	EmailAddress.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
//	        	Thread.sleep(2000);
//	        	Password.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
//	        	Thread.sleep(4000);
//	       // 	Signin.click();
//	        	driver.close();
//	        	 //create a new cell in the row at index 6
//	       //     XSSFCell cell = sheet.getRow(i).createCell(6);
//	            
//	        }
//		  FileInputStream file=new FileInputStream("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Test Data.xlsx");
//			Sheet sh = WorkbookFactory.create(file).getSheet("Grantportal");
//			int lasRowIndex = sh.getLastRowNum();
//			for(int i=1; i<=lasRowIndex; i++ )
//			{
//				int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
//				for(int j=0; j<=lastCellIndex; j++)
//				{
////					Grant.click();
////	        	Thread.sleep(2000);
////	        	Details.click();
////	        	Thread.sleep(2000);
////	        	APPLYNOW.click();
//	        	Thread.sleep(4000);
//	 //       	  firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
//	        	EmailAddress.sendKeys(sh.getRow(i).getCell(j).getStringCellValue());
//	        	Thread.sleep(2000);
//	        	Password.sendKeys(sh.getRow(i).getCell(j).getStringCellValue());
//	        	Thread.sleep(4000);
////	        	Signin.click();
//	        	driver.close();
//				}
//			}
////	        	
////    	
	}
}
