package browserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		
		System.out.println("the Facebook title is "+" "+ title);
		int length = driver.getTitle().length();
		System.out.println("Length of the title is "+" " +length);
		

	}

}
