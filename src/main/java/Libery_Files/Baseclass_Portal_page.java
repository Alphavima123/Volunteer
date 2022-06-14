package Libery_Files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass_Portal_page 
{

	public	WebDriver driver;

	@SuppressWarnings("deprecation")
	public void initilizeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\eclipse-workspace\\Maven\\Browser\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gl3qa.powerappsportals.com/donate/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
}
