package radioButton;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("u_0_9")).click();
		//int age =20;
		List<WebElement> rdBtn = driver.findElements(By.name("sex"));
		//List<WebElement> rdBtn =driver.findElements(By.id("u_0_9"));
		/*
		 * List is a java class, import java.util.List;
		 * WebElement is selenium class,  import org.openqa.selenium.WebElement;
		 * List<WebElement>= data type
		 * rdBtn= reference object name
		 * driver.findElements(By.name("sex"));= value of rdBtn object.
		 */
		//rdBtn.get(0).click();
		rdBtn.get(0).click();
		Thread.sleep(3000);
		
		rdBtn.get(1).click();
		Thread.sleep(3000);
		
		//driver.quit();
				
				

	}

}
