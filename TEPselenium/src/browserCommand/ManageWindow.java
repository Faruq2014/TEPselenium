package browserCommand;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
     Point position= driver.manage().window().getPosition();
     System.out.println("window position is "+" "+position);
     Point p = new Point(-7, -7);
     driver.manage().window().setPosition(p);
     driver.manage().window().maximize();
    // driver.manage().window().fullscreen();
     
    Dimension size= driver.manage().window().getSize();
    System.out.println("window size is "+" "+ size);
    Dimension dimension = new Dimension(800, 600);
    driver.manage().window().setSize(dimension);
    driver.manage().window().maximize();
 
    
	}

}
