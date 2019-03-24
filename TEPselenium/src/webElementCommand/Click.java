package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	 
	        driver.navigate().to("https://www.facebook.com/");
	        driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2)")).click();
	        driver.navigate().back();
	        driver.findElement(By.cssSelector("#reg_pages_msg > a:nth-child(1)")).click();
	        driver.navigate().back();
	        
	        driver.findElement(By.cssSelector("input[id^=u_0]")).click();


	}

}
