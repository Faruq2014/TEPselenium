package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		/*
		 * //tagname[starts-with(@attribute,'name')]
		 * 
		 * //input[starts-with(@id,'u_0_')]
		 * 
		 * //a[starts-with(@href=’’)]
		 * 
		 * //img[starts-with(@src=’’)]
		 * 
		 * //div[starts-with(@id=’’)]
		 * 
		 * //input[starts-with(@id=’’)]
		 * 
		 * //button[starts-with(@id,’’)] / from sales froce app contains the next few
		 * lines of code it dynamic and indexing xpath. And so on.
		 * (//*[starts-with(@id,'CompanyEmployees')][1])
		 * 
		 * //tagname[starts-with(@attribute-name,'')]
		 * 
		 * //*[starts-with(@id,'CompanyEmployees')]
		 * (//*[starts-with(@id,'CompanyEmployees')])[1]
		 */

		driver.findElement(By.xpath("//*[starts-with(@class,'login_form_login_button')]")).click();

		// driver.quit();

	}

}
