package manageWindow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Dimension size= driver.manage().window().getSize();
	    System.out.println("window size is "+" "+ size);
	    Dimension dimension = new Dimension(800, 400);
	    driver.manage().window().setSize(dimension);
	   // driver.manage().window().maximize();

	}

}
