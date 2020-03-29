package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsAndText {

	public static void main(String[] args) {

		
	       //System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
	        /*
						Syntax
						
						//tagname[contains(@attribute,’value1’)][text()=' ']
						
						//input[contains(@id,'')][text()=' ']
						
						//input[contains(@name,'')][text()=' ']
						
						//a[contains(@class,'')][text()=' ']
						
						//img[contains(@href,'')][text()=' ']
						
						//div[contains(@id,'')][text()=' ']
						 * 
						 * it will not look for actual contain, 
						 * partial contain is good enough.
						 * this method is special for link or href. 
	         */
	       
	    driver.findElement(By.xpath("//a[contains(@href,'facebook')][text()='Forgot account?']")).click();

	    //driver.findElement(By.xpath("//a[contains(@href,'policies')][text()='Cookies Policy']")).click();
	   
	     driver.quit();
       
	

	}

}
