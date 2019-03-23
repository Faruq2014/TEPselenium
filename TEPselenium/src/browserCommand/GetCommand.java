package browserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {

	public static void main(String[] args) {
		GetCommand gc = new GetCommand();
		gc.Chrome();
		

	}
	
	public void Chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		/*set property for chrome driver, and put the value from your local machine.
		 * shift and right click on the file and copy as a path. 
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		/*WebDriver is an interface and chrome driver is a class. 
		 * 
		 */
		driver.get("https://www.facebook.com");
		/*
		 * get is the most popular method. 
		 * when we use get method driver wait until page load before it goes to next command. 
		 */
	}

}
