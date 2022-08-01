package SampleDataCreation;

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

public class Contact
{
	@Test
	public void RunContact() throws IOException, InterruptedException
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
			XSSFSheet sheet = workbook.getSheet("Contact");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			
			//DataLoad
			for(int i=1;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				
				String FirstName = celldata.getCell(0).getStringCellValue();
				String LastName = celldata.getCell(1).getStringCellValue();
				String Salutation = celldata.getCell(2).getStringCellValue();
				String PositionTitle = celldata.getCell(3).getStringCellValue();
				String EmailPrimary = celldata.getCell(4).getStringCellValue();
				String MobilePhone = celldata.getCell(5).getStringCellValue();
				String HomePhone = celldata.getCell(6).getStringCellValue();
				String BusinessPhone = celldata.getCell(7).getStringCellValue();
				String SecondaryEmail1 = celldata.getCell(8).getStringCellValue();
				String SecondaryEmail2 = celldata.getCell(9).getStringCellValue();
				String Fax = celldata.getCell(10).getStringCellValue();	
				String SearchAddress = celldata.getCell(11).getStringCellValue();	
				String Street = celldata.getCell(12).getStringCellValue();	
				String Address  = celldata.getCell(13).getStringCellValue();	
				String City = celldata.getCell(14).getStringCellValue();	
				String State = celldata.getCell(15).getStringCellValue();	
				String PostalCode = celldata.getCell(16).getStringCellValue();	
				String Country = celldata.getCell(17).getStringCellValue();	
				String AreaofExpertise = celldata.getCell(18).getStringCellValue();	
				String Focus = celldata.getCell(19).getStringCellValue();
				String InternalNote = celldata.getCell(20).getStringCellValue();
				
				driver.findElement(By.xpath("//span[text()='Contacts']")).click();
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys(FirstName);
				driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys(LastName);
				driver.findElement(By.xpath("//input[@aria-label='Salutation']")).sendKeys(Salutation);
				driver.findElement(By.xpath("//input[@aria-label='Position Title']")).sendKeys(PositionTitle);
				driver.findElement(By.xpath("//input[@aria-label='Email- Primary']")).sendKeys(EmailPrimary);
				driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).sendKeys(MobilePhone);
				
				WebElement type = driver.findElement(By.xpath("//select[@aria-label='Login Approval']"));
				org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				WebElement cause = driver.findElement(By.xpath("//input[@aria-label='Account, Lookup']"));
				Actions act=new Actions(driver);
				act.click(cause).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();	
				
				WebElement type1 = driver.findElement(By.xpath("//select[@aria-label='Preferred Method of Contact']"));
				org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				WebElement cause1 = driver.findElement(By.xpath("//input[@aria-label='Contact Stewarded By, Lookup']"));
				Actions act1=new Actions(driver);
				act.click(cause).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();	
				
				driver.findElement(By.xpath("//li[@aria-label='Details']")).click();
				
				WebElement ContactMethod = driver.findElement(By.xpath("//button[@aria-label='Toggle menu']"));
				Actions act2=new Actions(driver);
				act.click(ContactMethod).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();
				
				WebElement type2 = driver.findElement(By.xpath("//select[@aria-label=' Primary Phone']"));
				org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				
				
				driver.findElement(By.xpath("(//input[@aria-label='Home Phone'])[2]")).sendKeys(HomePhone);
				driver.findElement(By.xpath("(//input[@aria-label='Business Phone'])[2]")).sendKeys(BusinessPhone);
				driver.findElement(By.xpath("//input[@aria-label='Secondary Email 1']")).sendKeys(SecondaryEmail1);
				driver.findElement(By.xpath("//input[@aria-label='Secondary Email 2']")).sendKeys(SecondaryEmail2);
				driver.findElement(By.xpath("//input[@aria-label='Fax']")).sendKeys(Fax);
				
				WebElement type3 = driver.findElement(By.xpath("//select[@aria-label='Marketing Materials']"));
				org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				WebElement type4 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Phone Calls']"));
				org.openqa.selenium.support.ui.Select s4=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				WebElement type5 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Emails']"));
				org.openqa.selenium.support.ui.Select s5=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				WebElement type6 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Bulk Emails']"));
				org.openqa.selenium.support.ui.Select s6=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				WebElement type7 = driver.findElement(By.xpath("//select[@aria-label='Do not allow Mails']"));
				org.openqa.selenium.support.ui.Select s7=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				driver.findElement(By.xpath("//input[@class='addressAutocomplete']")).sendKeys(SearchAddress);
				driver.findElement(By.xpath("//input[@aria-label='Street #']")).sendKeys(Street);
				driver.findElement(By.xpath("//input[@aria-label='Address (Suite/Apt.)']")).sendKeys(Address);
				driver.findElement(By.xpath("//input[@aria-label='City']")).sendKeys(City);
				driver.findElement(By.xpath("//input[@aria-label='State/Province']")).sendKeys(State);
				driver.findElement(By.xpath("//input[@aria-label='Postal Code']")).sendKeys(PostalCode);
				driver.findElement(By.xpath("//input[@aria-label='Country']")).sendKeys(Country);
				
				WebElement cal = driver.findElement(By.xpath("(//i[@data-icon-name='Calendar'])[3]"));
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].click();", cal);
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Area of Expertise']")).sendKeys(AreaofExpertise);
				driver.findElement(By.xpath("//textarea[@aria-label='Focus/Specialty']")).sendKeys(Focus);
				
				WebElement type8 = driver.findElement(By.xpath("//select[@aria-label='Level of Education']"));
				org.openqa.selenium.support.ui.Select s8=new org.openqa.selenium.support.ui.Select(type);
				s.selectByIndex(1);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Internal Note']")).sendKeys(InternalNote);
				driver.findElement(By.xpath("//button[@aria-label='Save (CTRL+S)']")).click();
		
				
				
			}
		
		
	}
}
