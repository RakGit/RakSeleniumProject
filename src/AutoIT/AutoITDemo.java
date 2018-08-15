package AutoIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;
import java.io.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.security.RoleInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;


public class AutoITDemo {
	WebDriver driver;
	public void driver() throws InterruptedException, AWTException
	{
		String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Reporter.log("Invoke Driver");
		/*Actions actions=new Actions(driver);
		actions.doubleClick().build().perform();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);*/
		
	}
	
	public void fileUpload() throws Exception
	{
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Rakeshwaran");;
		 driver.findElement(By.xpath("//input[@type='file']")).click();
		 Thread.sleep(8000);
		 Runtime.getRuntime().exec("D:\\WorkSpace\\WorkSpace_Eclipse-Oxygen\\FITAAutomation\\Files\\FileUpload.exe");
		 Thread.sleep(8000);
		 Reporter.log("File Uploaded");
	}
	
	public void getScreenShot(){
		
		TakesScreenshot screenShot=(TakesScreenshot)(driver);
		File sourceFile=screenShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("D:\\error.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String ar[]) throws Exception
	{
		AutoITDemo autoITDemo=new AutoITDemo();
		autoITDemo.driver();
		autoITDemo.fileUpload();

	}
}
