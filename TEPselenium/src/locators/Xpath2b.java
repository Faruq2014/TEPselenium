package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2b {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     
	        driver.navigate().to("https://www.google.com/");
	        driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	        Thread.sleep(4000);
	        driver.navigate().back();
	       driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
	      
	       
	        //driver.quit();

	}
	//*[@id="gbw"]/div/div/div[1]/div[1]/a
}
