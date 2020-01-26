package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.navigate().to("http://www.seleniumhq.org");
	     // when id is not available, we can use class 
		    driver.findElement(By.xpath("//*[@class='download-button webdriver']")).click();
		    Thread.sleep(2000);
		    driver.navigate().back();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@class='download-button ide']")).click();
		    Thread.sleep(3000);
		    driver.navigate().back();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@class='download-button grid']")).click();
            driver.navigate().back();
            System.out.println("done clicking each link");
		    driver.quit();

		    

	      
	        

	   

	        
	     
	       // driver.quit();


	      
	}

}
//<li id="menu_download"><a href="/download/" title="Get Selenium">Download</a></li>
//<a href="/download/" title="Get Selenium">Download</a>
//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a


