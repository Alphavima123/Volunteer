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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VolunteerEdge

{
	@Test
	public void RunVolunteer() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MonishSahare\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("https://gl365demo.crm3.dynamics.com/");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("demouser@givelifedemonew.onmicrosoft.com");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Givelife@1234");
		 driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 
		     driver.switchTo().frame("AppLandingPage");
		   	driver.findElement(By.xpath("//div[@id='AppDetailsSec_1_Item_3']")).click();
			//Sheet loading
			FileInputStream file =new FileInputStream("C:\\Users\\MonishSahare\\git\\Maven\\TestData\\Sample creation data-Volunteer.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Volunteer Details");
			int rowcount = sheet.getLastRowNum();
			@SuppressWarnings("unused")
			int colcount = sheet.getRow(1).getLastCellNum();
			
			//DataLoad
			for(int i=300;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				String FirstName = celldata.getCell(0).getStringCellValue();
				String LastName = celldata.getCell(1).getStringCellValue();
				String Salutation = celldata.getCell(2).getStringCellValue();
				String PositionTitle = celldata.getCell(3).getStringCellValue();
				String EmailPrimary = celldata.getCell(4).getStringCellValue();
				String MobilePhone = celldata.getCell(5).getStringCellValue();
		//		String ContactStewardedBy = celldata.getCell(6).getStringCellValue();
		//		String HomePhone = celldata.getCell(6).getStringCellValue();
		//		String BusinessPhone = celldata.getCell(31).getStringCellValue();
				String SecondaryEmail1 = celldata.getCell(7).getStringCellValue();
				String SecondaryEmail2 = celldata.getCell(8).getStringCellValue();
				String Fax = celldata.getCell(9).getStringCellValue();
				String SearchAddress = celldata.getCell(10).getStringCellValue();
				String Address = celldata.getCell(11).getStringCellValue();
				String Street = celldata.getCell(12).getStringCellValue();
				String City = celldata.getCell(13).getStringCellValue();
				String State = celldata.getCell(14).getStringCellValue();
				String PostalCode = celldata.getCell(15).getStringCellValue();
				String Country = celldata.getCell(16).getStringCellValue();
				String EmployeeID = celldata.getCell(17).getStringCellValue();
				String AreaofExpertise = celldata.getCell(18).getStringCellValue();
		//		String Specialty = celldata.getCell(20).getStringCellValue();
			//	String InternalNote = celldata.getCell(21).getStringCellValue();
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
				
				driver.findElement(By.xpath("//span[text()='Volunteer']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Title']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(4);	
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@aria-label='First Name']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys(FirstName);
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@aria-label='Last Name']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys(LastName);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Salutation']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Salutation']")).sendKeys(Salutation);
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@aria-label='Position Title']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Position Title']")).sendKeys(PositionTitle);
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@aria-label='Email- Primary'])[1]")).clear();
				driver.findElement(By.xpath("(//input[@aria-label='Email- Primary'])[1]")).sendKeys(EmailPrimary);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@aria-label='Mobile Phone'])[1]")).clear();
				driver.findElement(By.xpath("(//input[@aria-label='Mobile Phone'])[1]")).sendKeys(MobilePhone);
				
				Thread.sleep(3000);
				WebElement type1 = driver.findElement(By.xpath("//select[@aria-label='Login Approval']"));
				org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(type1);
				s1.selectByIndex(2);
				
				Thread.sleep(3000);
				WebElement type2 = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
				org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(type2);
				s2.selectByIndex(2);
				
				Thread.sleep(3000);
				WebElement Time = driver.findElement(By.xpath("//input[@aria-label='Contact Stewarded By, Lookup']"));
				Actions act=new Actions(driver);
				act.click(Time).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();
				
				Thread.sleep(1500);
				driver.findElement(By.xpath("//button[@role='switch']")).click();
				Thread.sleep(2500);
				driver.findElement(By.xpath("//li[@aria-label='Details']")).click();
				
				
				WebElement ContactMethod = driver.findElement(By.xpath("//button[@aria-label='Toggle menu']"));
				Actions act1=new Actions(driver);
				act1.click(ContactMethod).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ENTER).perform();
				
				Thread.sleep(3000);
				WebElement type3 = driver.findElement(By.xpath("//select[@aria-label=' Primary Phone']"));
				org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type3);
				s3.selectByIndex(1);
				
//				Thread.sleep(3500);
//				driver.findElement(By.xpath("(//input[@aria-label='Home Phone'])[2]")).clear();	
//				driver.findElement(By.xpath("(//input[@aria-label='Home Phone'])[2]")).sendKeys(HomePhone);
				
//				driver.findElement(By.xpath("(//input[@aria-label='Business Phone'])[2]")).clear();
//				driver.findElement(By.xpath("(//input[@aria-label='Business Phone'])[2]")).sendKeys(BusinessPhone);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Secondary Email 1']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Secondary Email 1']")).sendKeys(SecondaryEmail1);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Secondary Email 2']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Secondary Email 2']")).sendKeys(SecondaryEmail2);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Fax']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Fax']")).sendKeys(Fax);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@class='addressAutocomplete']")).clear();
				driver.findElement(By.xpath("//input[@class='addressAutocomplete']")).sendKeys(SearchAddress);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Address (Suite/Apt.)']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Address (Suite/Apt.)']")).sendKeys(Address);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Street #']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Street #']")).sendKeys(Street);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='City']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='City']")).sendKeys(City);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='State/Province']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='State/Province']")).sendKeys(State);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Postal Code']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Postal Code']")).sendKeys(PostalCode);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Country']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Country']")).sendKeys(Country);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Employee ID']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Employee ID']")).sendKeys(EmployeeID);
				
				Thread.sleep(3000);
				WebElement cal = driver.findElement(By.xpath("(//i[@data-icon-name='Calendar'])[3]"));
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].click();", cal);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//textarea[@aria-label='Area of Expertise']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Area of Expertise']")).sendKeys(AreaofExpertise);
				
	//			driver.findElement(By.xpath("//textarea[@aria-label='Focus/Specialty']")).clear();
		//		driver.findElement(By.xpath("//textarea[@aria-label='Focus/Specialty']")).sendKeys(Specialty);
				
				Thread.sleep(3000);
				WebElement type4 = driver.findElement(By.xpath("//select[@aria-label='Level of Education']"));
				org.openqa.selenium.support.ui.Select s4=new org.openqa.selenium.support.ui.Select(type4);
				s4.selectByIndex(1);
				
	//			driver.findElement(By.xpath("//textarea[@aria-label='Internal Note']")).clear();
		//		driver.findElement(By.xpath("//textarea[@aria-label='Internal Note']")).sendKeys(InternalNote);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				
				
				
				Thread.sleep(3000);
			//	driver.findElement(By.xpath("//button[@aria-label='Save and continue']")).click();


				
			}
	}
}
