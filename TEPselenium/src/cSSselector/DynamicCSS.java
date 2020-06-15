package cSSselector;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCSS {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		TestPopUp();
	}
	
	public static void TestPopUp() throws InterruptedException {
		// Open browser

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".desktop-free-trial-container")).click();
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will return
		// Set of St//rings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child window then we
			//            will close

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				WebElement ele = driver.findElement(By.cssSelector("div[class='option-ui ']"));
				boolean display = ele.isDisplayed();

				if (display == true) {
					ele.click();
					System.out.println("company with 20 employee page open");
					driver.findElement(By.cssSelector("input[id^=CompanyName]")).sendKeys("Molla Company");
					driver.findElement(By.cssSelector("input[id^=UserTitle]")).sendKeys("Scram Master");
					// WebElement dropdown =
					// driver.findElement(By.cssSelector("#id^=CompanyCountry"));
					// Select select = new
					// Select(driver.findElement(By.cssSelector("#id^=CompanyCountry")));
					// select.selectByVisibleText("Afghanistan");
					driver.close();
				} else

				{
					System.out.println("directly registration page open");
					driver.findElement(By.cssSelector("input[id^=UserFirstName]")).sendKeys("faruq");

				}

				Thread.sleep(2000);
				// driver.findElement(By.cssSelector("input[id^=UserFirstName]")).sendKeys("faruq");
				// driver.close();
			}

		}
		// once child window close now switch to parent window
		driver.switchTo().window(parent);


	}
}
