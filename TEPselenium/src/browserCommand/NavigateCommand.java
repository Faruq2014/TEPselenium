package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String URL="https://www.facebook.com"; // create a variable for url
		
		//driver.navigate().to(URL);
		//driver.navigate().to(arg0);
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		/*
		 * clicking on a webelement.
		 */
		driver.navigate().back();

		/*
		 * with the navigate command we have option to navigate backward and forward. 
		 */
		driver.navigate().forward();
	
		driver.navigate().refresh();
		/*
		 * get and navigate command does same thing.
		 * with help of navigate command, we can go backward and forward, but get command does not have that option.
		 * get command wait until page load but navigate command does not wait for page load. As soon as it find the url
		 * it goes for next command. as a result more chance to fail the execution. if you use navigate command, make sure to 
		 * use wait command with it.
		 * get command is more popular and stable and prefer. 
		 */
		

	}
}
