package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      // WebDriver   driver = new FirefoxDriver();
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get("https://www.facebook.com/");
			 
			 /*
			 tagname[@attribute1=�value1� and attribute2=�value2�]

            a[@id='id1' and @name='namevalue1']
            
             img[@src=' ' and @href=' ']
			  */
	 
	       
	driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box' and @name='email']")).sendKeys("abc@yahoo.com");
    driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("abc4321");
	    //both xpath has to be accurate.
	        
	      driver.quit();

	}


}
