package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Parenttitle = driver.getTitle();
		System.out.println("parent title is " + Parenttitle);

		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		Set<String> AllWindow = driver.getWindowHandles();

		int count = AllWindow.size();
		System.out.println("how many window we have " + count);
		SwitchWindow switchW = new SwitchWindow(driver);
		switchW.toTitle("Cookies Policy");
		Thread.sleep(3000);
		String childTitle = driver.getTitle();
		System.out.println("Child title is " + childTitle);
		driver.close();
		Thread.sleep(2000);
		// String parentWindow = driver.getWindowHandle();
		// driver.switchTo().window(parentWindow);
		switchW.toTitle("Facebook - Log In or Sign Up");
		String ParenURL = driver.getCurrentUrl();
		System.out.println("parent url is " + ParenURL);
		driver.close();
	}

}
