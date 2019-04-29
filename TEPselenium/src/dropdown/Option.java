package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Option {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        // Select month = new Select() is the formula to work with drop down.
        // import Select package.
        // we can nested the object inside the constructor to work with drop down.
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
	// how to clear selected option
	
	  month.getOptions().clear();
	 Thread.sleep(3000);
	month.selectByVisibleText("Feb"); 
	month.getOptions().clear();
	
	// how to get text from index 
	String monthName=month.getOptions().get(2).getText();

	System.out.println("index number 2 month name is"+" "+ monthName);
	
	// how to get total number of drop down options.
	int total =month.getOptions().size();
	System.out.println("Total number of month is"+" "+ total);
		//driver.quit();
		
	
		}



}
