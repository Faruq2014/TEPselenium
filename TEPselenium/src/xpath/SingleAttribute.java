package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleAttribute {
	public static void main(String[] args) {
		
	       //System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
	        /*

						 tagname[@attribute-name=’value1’]
						 
						 
						 
						Example
						 
						 a [@href=’http://www.google.com’]
						 
						 
						input[@id=’name’]
						 
						 
						input[@name=’username’]
						 
						 
						img[@alt=’sometext’]
	         */
	       
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@yahoo.com");
	     // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@yahoo.com");
	    //driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']")).sendKeys("abc@yahoo.com");
	   
	    // driver.quit();
          
	}

}
