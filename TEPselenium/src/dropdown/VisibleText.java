package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VisibleText {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        // Select month = new Select() is the formula to work with drop down.
        // import Select package.
        // we can nested the object inside the constructor to work with drop down.
		//Select month = new Select(driver.findElement(By.id("month")));
       
        WebElement element = driver.findElement(By.id("month"));
       Select month = new Select(element);
       
		//month.selectByVisibleText("Jan");
	
	    month.selectByVisibleText("Feb");
	    
	
		//driver.quit();
		
	
		}

}
