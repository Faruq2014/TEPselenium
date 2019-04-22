package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.cssSelector("input[id=email]")).sendKeys("aaaa");
	        //driver.findElement(By.cssSelector("#email")).sendKeys("aaaa");
	     
	        
	      /*  CSS formula= element_name[<attribute_name>='<value>']
	        		                   input[id=email]
                   

	        */
	        driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");
	        
	        driver.findElement(By.cssSelector("input[id^=u_0]")).click();
	       System.out.println( driver.findElement(By.cssSelector(".fsl")).getText());
     

	}
}
