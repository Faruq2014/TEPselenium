package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) {

		
	       //System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
	        /*
						Syntax
						
						//tagname[contains(@attribute,’value1’)]
						
						//input[contains(@id,’’)]
						
						//input[contains(@name,’’)]
						
						//a[contains(@href,’’)]
						
						//img[contains(@src,’’)]
						
						//div[contains(@id,’’)]
						 * 
						 * it will not look for actual contain, 
						 * partial contain is good enough. 
	         */
	       
	    driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Shamin");

	    driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Khan");
	   
	     driver.quit();
       
	

	}

}
