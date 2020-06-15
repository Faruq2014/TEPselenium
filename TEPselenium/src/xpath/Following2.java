package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");

		/*
		 * regular Xpath//preceding::again-ur-regular-path
		 * 
		 * //input[@name='']/preceding::input[@id='']
		 * 
		 * //a[@href=' ']/preceding::input[@id=''] //a[@href='
		 * ']/preceding::*[@class=''] any type of match will work. / mean search every
		 * where // mean search sepecific dom.
		 * 
		 * 
		 */

		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]//preceding::input[3]")).sendKeys("abc");
		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]//preceding::input[2]")).sendKeys("xyz");
		// driver.quit();

	}

}
