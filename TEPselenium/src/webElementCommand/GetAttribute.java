package webElementCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	 
	       driver.navigate().to("https://www.facebook.com/");
	       WebElement element=  driver.findElement(By.id("email"));
	      String s= element.getAttribute("class");
	       System.out.println(element.getAttribute("id"));
	     // String S = element.getAttribute("id");
	       System.out.println(s);
	       driver.quit();
	      


	

	
		// TODO Auto-generated method stub

	}

}
