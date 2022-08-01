package Portal_page2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass_Portal_page2 
{

	public	WebDriver driver;

	@SuppressWarnings("deprecation")
	public void initilizeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gl3dev.powerappsportals.com/donationpagetwo/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
}
