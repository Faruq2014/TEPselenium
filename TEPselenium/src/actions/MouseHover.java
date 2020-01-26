package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	 
	        driver.get("http://www.edureka.co/");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            
	        Actions act = new Actions(driver);
           WebElement element1=driver.findElement(By.id("header_topcat"));
	        act.moveToElement(element1).build().perform();
	        Thread.sleep(3000);
	        WebElement link =driver.findElement(By.cssSelector("#software-testing-certification-courses"));
	        act.moveToElement(link).build().perform();
	        Thread.sleep(3000);
           driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
	       Thread.sleep(3000); 
	       driver.quit();
	}
	


}
