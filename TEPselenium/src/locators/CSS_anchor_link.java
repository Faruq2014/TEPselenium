package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_anchor_link {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\SeleniumDriver\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://www.facebook.com/");
		// driver.findElement(By.cssSelector("#privacy-link")).click();

		// driver.findElement(By.cssSelector("a[id=privacy-link]")).click();
		// two lines are same with id
		// driver.findElement(By.cssSelector("a[id=terms-link]")).click();
		// anchor link working with regular syntax because they are regular link with
		// attribute value.

		// anchor link working with child nth because they are child link
		driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2)")).click();
		driver.navigate().back();

		driver.findElement(By.cssSelector("#reg_pages_msg > a:nth-child(1)")).click();

	}

}
