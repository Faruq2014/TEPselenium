package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
 
        driver.get("https://www.facebook.com/");
       // driver.findElement(By.cssSelector("input[class=inputtext]")).sendKeys("aaaa");
        //driver.findElement(By.cssSelector(".inputtext")).sendKeys("aaaaa");
        driver.findElement(By.id("email")).sendKeys("abc@ymail.com");
        //combination of 2css because inputtext
        //driver.findElement(By.cssSelector("input[class=inputtext][id=pass]")).sendKeys("bbbb");
        driver.findElement(By.name("pass")).sendKeys("pass123");
       

	}

}
