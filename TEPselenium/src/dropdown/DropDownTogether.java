package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTogether {
	
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
       
        WebElement element1 = driver.findElement(By.id("month"));

        WebElement element2 = driver.findElement(By.id("day"));

        WebElement element3 = driver.findElement(By.id("year"));
        
       Select month = new Select(element1);
       Select day = new Select(element2);
       Select year = new Select(element3);
        /*
         * we can click drop down by three ways
         * index number, index number is integer value
         * visible tex is string value
         * value is string value.
         */
       
       month.selectByVisibleText("Jan");
	    day.selectByIndex(24);
	    year.selectByValue("2018");
	    
	
		//driver.quit();
		
	
		}

}
