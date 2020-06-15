package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // "C:\SeleniumDriver\chromedriver_win32\chromedriver.exe"
		driver.get("https://www.facebook.com");

		String title = driver.getTitle();
		System.out.println("the Facebook title is " + " " + title);
		Thread.sleep(3000);
		driver.findElement(By.id("cookie-use-link")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
