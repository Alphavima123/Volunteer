package Module1_Donor_Management;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Donor_Login_Page2
{

	 public	WebDriver driver;	
	@SuppressWarnings("deprecation")
	@Test
	public void OpenTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\eclipse-workspace\\Donor_Management\\Browser\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gl3dev.powerappsportals.com/donationpagetwo/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	@Test
	public void Login_Page_GiveNow()
	{
		driver.findElement(By.xpath("//label[@for=\'dntnow\']")).click();
		driver.findElement(By.xpath("(//button[@class='freAmount'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='#next']")).click();
	}
}
