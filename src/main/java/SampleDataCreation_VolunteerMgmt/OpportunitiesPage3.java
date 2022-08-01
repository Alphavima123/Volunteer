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
import org.testng.annotations.Test;

public class OpportunitiesPage3
{
	@Test
	public void RunOpportunity() throws IOException
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
				String OpportunityTitle = celldata.getCell(0).getStringCellValue();
				String OpportunityGoal = celldata.getCell(1).getStringCellValue();
				String OpportunityDescription = celldata.getCell(2).getStringCellValue();
				String OpportunityTimeCommitment = celldata.getCell(3).getStringCellValue();
				String OpportunityRequirement = celldata.getCell(4).getStringCellValue();
				String OpportunityBenefit = celldata.getCell(5).getStringCellValue();
				String OpportunityTraining = celldata.getCell(6).getStringCellValue();
				String Facebook = celldata.getCell(7).getStringCellValue();
				String Twitter = celldata.getCell(8).getStringCellValue();
				String Linkedin = celldata.getCell(9).getStringCellValue();
				String Photo = celldata.getCell(10).getStringCellValue();
				String Video = celldata.getCell(11).getStringCellValue();
				String Bitly = celldata.getCell(12).getStringCellValue();
				String LocationName = celldata.getCell(13).getStringCellValue();
				String Street1 = celldata.getCell(14).getStringCellValue();
				String Street2 = celldata.getCell(15).getStringCellValue();
				String Street3 = celldata.getCell(16).getStringCellValue();
				String City = celldata.getCell(17).getStringCellValue();
				String State = celldata.getCell(18).getStringCellValue();
				String PostalCode = celldata.getCell(19).getStringCellValue();
				String Country = celldata.getCell(20).getStringCellValue();
				String URL = celldata.getCell(21).getStringCellValue();
		//		String AccountName = celldata.getCell(22).getStringCellValue();
		//		String Contact = celldata.getCell(23).getStringCellValue();
				String Email = celldata.getCell(24).getStringCellValue();
				String Phone = celldata.getCell(25).getStringCellValue();
				String Extension = celldata.getCell(26).getStringCellValue();
				String Suite = celldata.getCell(27).getStringCellValue();
				String Street = celldata.getCell(28).getStringCellValue();
				String City1 = celldata.getCell(29).getStringCellValue();
				String PostalCode1 = celldata.getCell(30).getStringCellValue();
				String Serch = celldata.getCell(31).getStringCellValue();
				
				driver.findElement(By.xpath("(//div[@class='pa-bj pa-e pa-o pa-ck flexbox'])[5]")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='New']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='More Header Fields']")).click();
				
				WebElement Time = driver.findElement(By.xpath("(//div[@aria-label='Status Reason'])[2]"));
				Actions act=new Actions(driver);
				act.click(Time).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//input[@aria-label='Opportunity Title']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Opportunity Title']")).sendKeys(OpportunityTitle);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Goal']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Goal']")).sendKeys(OpportunityGoal);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Description']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Description']")).sendKeys(OpportunityDescription);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Time Commitment']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Time Commitment']")).sendKeys(OpportunityTimeCommitment);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Requirement']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Requirement']")).sendKeys(OpportunityRequirement);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Benefit']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Benefit']")).sendKeys(OpportunityBenefit);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Training']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Opportunity Training']")).sendKeys(OpportunityTraining);
				
				driver.findElement(By.xpath("//label[text()='Not Required']")).click();
				
				driver.findElement(By.xpath("//label[text()='Accounts']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Opportunity Start']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Opportunity Start']")).sendKeys("9/28/2022");
				
				driver.findElement(By.xpath("//input[@aria-label='Date of Opportunity End']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Date of Opportunity End']")).sendKeys("9/30/2022");
				
				driver.findElement(By.xpath("//input[@aria-label='Facebook']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Facebook']")).sendKeys(Facebook);
				
				driver.findElement(By.xpath("//input[@aria-label='Twitter']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Twitter']")).sendKeys(Twitter);
				
				driver.findElement(By.xpath("//input[@aria-label='Linkedin']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Linkedin']")).sendKeys(Linkedin);
				
				driver.findElement(By.xpath("//input[@aria-label='Photo']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Photo']")).sendKeys(Photo);
				
				driver.findElement(By.xpath("//input[@aria-label='Video']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Video']")).sendKeys(Video);
				
				driver.findElement(By.xpath("//input[@aria-label='Bitly']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Bitly']")).sendKeys(Bitly);
				
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				
				driver.findElement(By.xpath("//span[text()='Refresh']")).click();
				
				driver.findElement(By.xpath("//div[@aria-label=\\\"Both\\\"]//label[text()='Both']")).click();
				
				driver.findElement(By.xpath("//input[@class='addressAutocomplete']")).clear();
				driver.findElement(By.xpath("//input[@class='addressAutocomplete']")).sendKeys(LocationName);
				
				driver.findElement(By.xpath("//input[@aria-label='Street 1']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Street 1']")).sendKeys(Street1);
				
				driver.findElement(By.xpath("//input[@aria-label='Street 2']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Street 2']")).sendKeys(Street2);
				
				driver.findElement(By.xpath("//input[@aria-label='Street 3']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Street 3']")).sendKeys(Street3);
				
				driver.findElement(By.xpath("(//input[@aria-label='City'])[2]")).clear();
				driver.findElement(By.xpath("(//input[@aria-label='City'])[2]")).sendKeys(City);
				
				driver.findElement(By.xpath("//input[@aria-label='State/Province']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='State/Province']")).sendKeys(State);
				
				driver.findElement(By.xpath("//input[@aria-label='ZIP/Postal Code']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='ZIP/Postal Code']")).sendKeys(PostalCode);
				
				driver.findElement(By.xpath("//input[@aria-label='Country']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Country']")).sendKeys(Country);
				
				driver.findElement(By.xpath("//input[@aria-label='URL']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='URL']")).sendKeys(URL);
				
				WebElement AccountName0 = driver.findElement(By.xpath("//input[@aria-label='Account Name, Lookup']"));
				Actions act0=new Actions(driver);
				act0.click(AccountName0).perform();
				act0.sendKeys(Keys.ARROW_DOWN).perform();
				act0.sendKeys(Keys.ARROW_DOWN).perform();
				act0.sendKeys(Keys.ENTER).perform();
				
				WebElement Contact = driver.findElement(By.xpath("//input[@aria-label='Contact, Lookup']"));
				Actions act1=new Actions(driver);
				act1.click(Contact).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ARROW_DOWN).perform();
				act1.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//input[@aria-label='Email']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys(Email);
				
				driver.findElement(By.xpath("//input[@aria-label='Phone']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Phone']")).sendKeys(Phone);
				
				driver.findElement(By.xpath("//input[@aria-label='Extension']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Extension']")).sendKeys(Extension);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Apt/Suite']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Apt/Suite']")).sendKeys(Suite);
				
				driver.findElement(By.xpath("//textarea[@aria-label='Street']")).clear();
				driver.findElement(By.xpath("//textarea[@aria-label='Street']")).sendKeys(Street);
				
				driver.findElement(By.xpath("//input[@aria-label='City']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='City']")).sendKeys(City1);
				
				driver.findElement(By.xpath("//input[@aria-label='Postal Code']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Postal Code']")).sendKeys(PostalCode1);
				
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				
				WebElement Contact1 = driver.findElement(By.xpath("//span[text()='Open popup to change view.']"));
				Actions act2=new Actions(driver);
				act2.click(Contact1).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ARROW_DOWN).perform();
				act2.sendKeys(Keys.ENTER).perform();
				
				driver.findElement(By.xpath("//input[@aria-label='Volunteer Opportunity Search this view']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Volunteer Opportunity Search this view']")).sendKeys(Serch);
				
				driver.findElement(By.xpath("//button[@aria-label='Start search']")).click();
				
				driver.findElement(By.xpath("(//i[@data-icon-name='StatusCircleCheckmark'])[2]")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Activate']")).click();

				
			}
	}
}
