package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	 
	        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/callback.html");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            
            WebElement RightClickButton=driver.findElement(By.cssSelector(".context-menu-one"));
           Actions act = new Actions(driver);
	        act.contextClick(RightClickButton).build().perform();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector(".context-menu-icon-copy")).click();
	     
	}
	
           

}
