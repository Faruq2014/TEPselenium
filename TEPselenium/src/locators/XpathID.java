package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathID {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://www.seleniumhq.org");
	        driver.findElement(By.xpath("//*[@id='gsc-i-id1']")).sendKeys("ide");
	        driver.findElement(By.xpath("//img[@class='search-icon']")).click();
	        // DEAD elements, so link is not working.
	        Actions act = new Actions(driver);
	        act.sendKeys(Keys.ENTER).perform();
	}
	


}
