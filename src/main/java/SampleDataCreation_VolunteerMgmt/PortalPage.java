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

public class PortalPage
{

	@Test
	public void RunPortalPage() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("https://integratedgl3qa.powerappsportals.com/");
	     
	//     driver.findElement(By.xpath("(//a[@aria-label='Features'])[1]")).click();
	        WebElement Volunteers = driver.findElement(By.xpath("(//a[@aria-label='Features'])[1]"));
			Actions act=new Actions(driver);
			
			act.click(Volunteers).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
	     
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
				
				driver.findElement(By.xpath("//a[text()='Register']")).click();
			     driver.findElement(By.xpath("//button[@value='100']")).click();
			     driver.findElement(By.xpath("//label[@for='cause']")).click();
				
			}
	}
}
