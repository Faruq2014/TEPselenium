package cSSselector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ID {
	public static void main(String[] args) throws Throwable {
		id();
		idfunction();
	}
	public static void id() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("aaaa");
		// driver.findElement(By.cssSelector("#email")).sendKeys("aaaa");

		/*
		 * CSS formula= element_name[<attribute_name>='<value>'] input[id=email]
		 * 
		 * 
		 */
		driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");

		driver.findElement(By.cssSelector("input[id^=u_0]")).click();
		System.out.println(driver.findElement(By.cssSelector(".fsl")).getText());
		driver.quit();

	}

	
	public static void idfunction() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement element1 = driver.findElement(By.cssSelector("[id='products_menu_item']"));
		act.moveToElement(element1).build().perform();
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("li.nav-item:nth-child(3)")).click();
		WebElement link = driver.findElement(By.cssSelector("li.nav-item:nth-child(3)"));
		link.click();
		driver.quit();
		/*
		 * act.moveToElement(link).build().perform(); Thread.sleep(3000);
		 * driver.findElement(By.
		 * xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).
		 * click(); Thread.sleep(3000); driver.quit();
		 */
	}

}
