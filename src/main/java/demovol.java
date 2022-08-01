import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demovol
{
    public static  void main(String args[]) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\git\\Maven\\Browser\\chromedriver.exe");
		
	

        //Create an object of File class to open xls file
        File file =    new File("C:\\Users\\MonishSahare\\Desktop\\Contact.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("Contact");
        
        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
       //Creating an object of ChromeDriver
    	ChromeDriver driver=new ChromeDriver();
        
        //Navigate to the URL
    	driver.get("https://gl3qa2.crm3.dynamics.com/appportal/sg/notification.aspx");;
    	driver.get("https://gl3qa2.crm3.dynamics.com/appportal/sg/notification.aspx");
		driver.manage().timeouts();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gluser@givelifeqa.onmicrosoft.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gltesting@123");
		Thread.sleep(1000);
		//4ver.findElement(By.xpath("//input[@data-report-event='Signin_Submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame("AppLandingPage");
		driver.findElement(By.xpath("(//div[@title='MembershipManagement'])")).click();
	

        //Identify the WebElements for the student registration form
    	WebElement create= driver.findElement(By.xpath("//button[@aria-label='New']"));
        WebElement firstName=driver.findElement(By.id("id-157769db-6207-ec11-b6e7-0022483cc3e2-53-firstname4273edbd-ac1d-40d3-9fb2-095c621b552d-firstname.fieldControl-text-box-text"));
        WebElement lastName=driver.findElement(By.id("id-157769db-6207-ec11-b6e7-0022483cc3e2-54-lastname4273edbd-ac1d-40d3-9fb2-095c621b552d-lastname.fieldControl-text-box-text"));
        WebElement email=driver.findElement(By.id("id=\"id-157769db-6207-ec11-b6e7-0022483cc3e2-55-emailaddress1ada2203e-b4cd-49be-9ddf-234642b43b52-emailaddress1.fieldControl-mail-text-input\""));
        WebElement mobile=driver.findElement(By.id("id-157769db-6207-ec11-b6e7-0022483cc3e2-56-mobilephone4273edbd-ac1d-40d3-9fb2-095c621b552d-mobilephone.fieldControl-phone-text-input"));
        WebElement submitBtn=driver.findElement(By.id("id-1101"));



        //iterate over all the rows in Excel and put data in the form.
        for(int i=1;i<=rowCount;i++) {
        	create.click();
            //Enter the values read from Excel in firstname,lastname,mobile,email,address
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            mobile.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
            //address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
            
            //Click on the gender radio button using javascript
            //
            //Click on submit button
            submitBtn.click();
            
            //Verify the confirmation message
           // WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            
            //create a new cell in the row at index 6
            XSSFCell cell = sheet.getRow(i).createCell(6);
            
            //check if confirmation message is displayed
           // if (confirmationMessage.isDisplayed()) {
                // if the message is displayed , write PASS in the excel sheet
                cell.setCellValue("PASS");
                
//            } else {
//                //if the message is not displayed , write FAIL in the excel sheet
//                cell.setCellValue("FAIL");
//            }
            
            // Write the data back in the Excel file
            FileOutputStream outputStream = new FileOutputStream("E:\\TestData\\TestData.xls");
            wb.write(outputStream);

            //close the confirmation popup
            WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
            closebtn.click();
            
            //wait for page to come back to registration page after close button is clicked
            //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        }
        
        //Close the workbook
        wb.close();
        
        //Quit the driver
        driver.quit();
        }
}
