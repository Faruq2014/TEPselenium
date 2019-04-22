package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com");
	//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click(); 

	}
	//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a
	//#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a


}
