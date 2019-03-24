package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		        driver.get("https://www.facebook.com/");
		        driver.findElement(By.name("email")).sendKeys("molla@yahoo.com");
		        driver.findElement(By.name("pass")).sendKeys("abcd1234");
		        driver.findElement(By.id("u_0_2")).click();
		        System.out.println( driver.findElement(By.id("u_0_2")).getText());


	}

}
