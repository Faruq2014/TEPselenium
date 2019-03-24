package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
 
        driver.get("https://www.facebook.com/");
        boolean b=  driver.findElement(By.cssSelector(".inputtext")).isEnabled();
        System.out.println(b);
        if(b=true) {
        	driver.findElement(By.cssSelector(".inputtext")).sendKeys("aaaaa");	
        }



	}

}
