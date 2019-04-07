package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

import AutoIT.AutoITDemo;

public class HeadlessBrowserTest {
	
	WebDriver driver;
	void headlessBrowser()
	{
		driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");					
        
		 // Locate the searchbox using its name		
        WebElement element = driver.findElement(By.name("q"));	
        
       // Enter a search query		
       element.sendKeys("Guru99");	
      
       // Submit the query. Webdriver searches for the form using the text input element automatically		
       // No need to locate/find the submit button		
       element.submit();	
       System.out.println("1231445");
       
		// This code will print the page title		
       System.out.println("Page title is: " + driver.getTitle());	
       
       driver.quit();			
	}
	
	public static void main(String ar[]) throws Exception
	{
		HeadlessBrowserTest headlessBrowserTest=new HeadlessBrowserTest();
		//autoITDemo.driver();
		//autoITDemo.fileUpload();
		headlessBrowserTest.headlessBrowser();
	}

}
