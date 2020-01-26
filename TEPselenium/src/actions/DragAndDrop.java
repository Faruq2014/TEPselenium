package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	 
	        driver.get("http://jqueryui.com/droppable/");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.switchTo().frame(0);
            WebElement source=driver.findElement(By.id("draggable"));
            WebElement target =driver.findElement(By.id("droppable"));

	        Actions act = new Actions(driver);
	        Thread.sleep(3000);
	        act.dragAndDrop(source, target).build().perform();
	     Thread.sleep(3000); 
	       driver.quit();
	}
	
       //      http://swinsl.github.io/jQuery-contextMenu/demo.html
	//https://swisnl.github.io/jQuery-contextMenu/demo/callback.html

}
