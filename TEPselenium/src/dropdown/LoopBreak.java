package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoopBreak {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		// Select month = new Select() is the formula to work with drop down.
		// import Select package.
		// we can nested the object inside the constructor to work with drop down.
		Select year = new Select(driver.findElement(By.id("year")));

		List<WebElement> number = year.getOptions(); // year+getOptions()+List<WebElement>=number()
		int list = number.size(); // to print all the value you have to use loop.

		for (int i = 0; i < list; i++) {
			String yearName = year.getOptions().get(i).getText(); // building yearName method=that means get all the
																	// value from drop down box.
			System.out.println(yearName);

			if (yearName.equals("2012")) {
				// that means you want to stop the loop in this particular value.
				year.selectByIndex(i);
				break; // nested for loop method.

			}

		} // loop ends here

		driver.quit();
	}

}
