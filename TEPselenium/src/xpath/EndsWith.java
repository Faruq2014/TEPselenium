package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndsWith {

	public static void main(String[] args) {

		
	       //System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.salesforce.com/");
	        
	        /*
						//tagname[starts-with(@attribute-name,’’)]
							
							//input[starts-with(@id,’’)]
							
							//a[starts-with(@href=’’)]
							
							//img[starts-with(@src=’’)]
							
							//div[starts-with(@id=’’)]
							
							//input[starts-with(@id=’’)]
							
							//button[starts-with(@id,’’)]
							
							And so on.
	         */
	       
	    driver.findElement(By.xpath("(//div[@class='dropdown'])[2]/a")).click();
	    driver.findElement(By.xpath("//*[starts-with(@name,'username')]")).sendKeys("asdf");
	    driver.findElement(By.xpath("//*[starts-with(@name,'pw')]")).sendKeys("asdf");

	    
	   
	    // driver.quit();
       
	

	}

}
