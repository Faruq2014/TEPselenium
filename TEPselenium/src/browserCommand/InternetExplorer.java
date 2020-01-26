package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		InternetExplorer ie = new InternetExplorer();
		ie.InternetExplorer();
		

	}
	
	public void InternetExplorer() {
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumDriver\\IEDriverServer.exe");
		/*set property for InternetExplorer driver, and put the value from your local machine.
		 * shift and right click on the file and copy as a path. 
		 * 
		 */
		
		/*WebDriver is an interface and InternetExplorer driver is a class. 
		 * 
		 */		WebDriver driver = new InternetExplorerDriver();

		
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
