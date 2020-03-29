package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsText {

	public static void main(String[] args) {

		
	       //System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
	        /*
						Syntax
						
						//tagname[contains(text(),' value')]
						
						 * it will not look for actual contain, 
						 * partial contain is good enough.
						 * this method is special for link or href specially to get some text from web page. 
	         */
	       
	   driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();

	   //WebElement text= driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world')]"));
	
	   //System.out.println(text);
	   
	     driver.quit();
       
	

	}

}
