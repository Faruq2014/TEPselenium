package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	 
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.partialLinkText("Forgot")).click();
	        //full link is = Forgot account?
	       // System.out.println( driver.findElement(By.partialLinkText("Forgot")).getText());
           WebElement text= driver.findElement(By.partialLinkText("Forgot"));
           System.out.println(" the partial text is"+" "+ text.getText());
	        driver.quit();

	}

	
}
