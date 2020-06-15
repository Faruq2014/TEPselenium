package cSSselector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TwoAttributeTogether {
	public static WebDriver driver;

	@BeforeClass
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void classFunction() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe"); WebDriver driver
		 * = new ChromeDriver();
		 * 
		 * driver.get("https://www.salesforce.com/");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.manage().window().maximize();
		 */
		driver.findElement(By.cssSelector(".desktop-free-trial-container")).click();
	}

	@Test(priority = 1)
	public void idFunction() {

		driver.findElement(By.cssSelector("input[id^=UserFirstName]")).sendKeys("Faruq");
	}

}
