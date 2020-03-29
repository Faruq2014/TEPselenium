package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding2 {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.get("https://www.facebook.com/");
    driver.navigate().to("https://www.facebook.com/");
    
                  /*
							     regular Xpath/preceding::again-ur-regular-path
							
							     //input[@id='']/preceding::input[1]
							
							   //a[@href=' ']/preceding::a[1]
							
							    //img[@src=' ']/preceding::img[1]
              */
	       
	    driver.findElement(By.xpath("//*[@name='websubmit']/ preceding::a[3]")).click();
	    driver.switchTo().defaultContent();
	   // driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='u_0_13']/ preceding::a[2]")).click();
	   // driver.navigate().back();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//*[@id='u_0_13']/ preceding::a[1]")).click();

	    
	   
	     driver.quit();
       
	

	}

}
