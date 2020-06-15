package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeAbsolute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.com/");

		/*
		 * this xpath is very useful for rows,fields,columns and links relative x path
		 * work as a starting node then follow absolute xpath with / example: relative
		 * xpath //*[@id='nav-xshop-container'] absolute xpath /div/a[7]
		 */

		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-xshop-container']/div/a[7]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();

		driver.quit();

	}

}
