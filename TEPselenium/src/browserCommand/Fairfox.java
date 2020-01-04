package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fairfox {

	public static void main(String[] args) {
		Fairfox ff = new Fairfox();
		ff.fairfox();
		

	}
	
	public void fairfox() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		/*set property for Fairfox driver, and put the value from your local machine.
		 * shift and right click on the file and copy as a path. 
		 * 
		 */
		
		/*WebDriver is an interface and Fairfox driver is a class. 
		 * 
		 */
		
		WebDriver driver = new FirefoxDriver();
		
		
	driver.get("https://www.facebook.com");
	
		// 2nd command
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		
		//driver.get("https://www.google.com");
		
		/*
		 * get is the most popular method. 
		 * when we use get method driver wait until page load before it goes to next command. 
		 */
	}

}
