package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.get("https://www.facebook.com/");
    driver.navigate().to("https://www.facebook.com/");
    
                  /*
							    Xpath/preceding::again-ur-regular-path

								//input[@id=��]/ preceding::input[1]
								
								//a[@href=��]/ preceding::a[1]
								
								//img[@src=��]/ preceding::img[1]
              */
	       
	    driver.findElement(By.xpath("//*[@id='u_0_13']/following::a[9]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='u_0_13']/following::a[8]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='u_0_13']/following::a[7]")).click();

	    
	   
	     driver.quit();
       
	

	}

}
