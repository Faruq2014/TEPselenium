package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	 
	        driver.navigate().to("https://www.facebook.com/");
	        //driver.findElement(By.cssSelector("input[id^=u_0]")).submit();
	       WebElement element= driver.findElement(By.cssSelector("input[id^=u_0]"));
	       element.submit();


	

	}

}
