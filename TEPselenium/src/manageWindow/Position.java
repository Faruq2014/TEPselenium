package manageWindow;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Point position= driver.manage().window().getPosition();
	     System.out.println("window position is "+" "+position);
	     Point p = new Point(-1, -2);
	     driver.manage().window().setPosition(p);
	    

	}

}
