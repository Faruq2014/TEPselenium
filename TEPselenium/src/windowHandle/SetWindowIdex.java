package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SetWindowIdex {
	public static WebDriver driver;

	@BeforeClass
	public void setUpClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/handle-multiple-windows-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void iterator() throws InterruptedException {

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		System.out.println("parent window id is " + parent);
		// driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		Set<String> AllWindow = driver.getWindowHandles();
		// ArrayList<String> arraylist = ArrayList(AllWindow);
		// driver.switchTo().window(arraylist.get(1));

	}

}
