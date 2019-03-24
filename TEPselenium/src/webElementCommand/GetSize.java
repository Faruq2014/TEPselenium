package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {

		 
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com/");
	       WebElement element=  driver.findElement(By.id("email"));
	      Dimension dimension= element.getSize();
	      System.out.println(dimension);
	        //driver.findElement(By.id("pass")).sendKeys("abcd1234");
	        //driver.findElement(By.id("u_0_2")).click();


		

	}

}
