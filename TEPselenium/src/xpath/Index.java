package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");

		/*
		 * when same node match more than once in the dom then indexing is very useful.
		 * create a regular xpath, then wrap with (), then put the appropriate number
		 * inside []. syntex (regular xpth)[index] (tagname[@attribute='value'])[index]
		 * (//input[@id='email'])[1] (//input[@class='email'])[2] (//*[text()='Sign
		 * Up'])[4]
		 */

		System.out.println(driver.findElement(By.xpath("(//*[text()='Sign Up'])[1]")).getText());

		String text1 = driver.findElement(By.xpath("(//*[text()='Sign Up'])[4]")).getText();
		System.out.println(text1 + "2nd one");

		String text2 = driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]")).getText();
		System.out.println(text2 + " " + "3rd one"); // hiden element, it is in the dom.

		driver.findElement(By.xpath("(//*[text()='Sign Up'])[2]")).click();

		// driver.quit();

	}

}
