package browserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String URL = driver.getCurrentUrl();
		System.out.println("the Facebook URL is "+" "+ URL);
		
		System.out.println(driver.getCurrentUrl());

		

	}

}
