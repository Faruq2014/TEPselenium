package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
      //driver.findElement(By.cssSelector("input[id=email]")).sendKeys("aaaa");
        driver.findElement(By.cssSelector("#email")).sendKeys("aaaa");
        driver.findElement(By.cssSelector("#email")).clear();
        
        driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");
        driver.findElement(By.cssSelector("#pass")).clear();
        
	}

}
