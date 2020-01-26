package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlesCromeBrowser {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options= new ChromeOptions();
	options.addArguments("headless");
	options.addArguments("window-size-:1400,800");
	// optional arguments. because sometime window default size is mobile. so if you don't 
	// put this arguments, than you might have "elements not found exceptions."
	
	WebDriver driver = new ChromeDriver(options);
		
		String URL="https://www.facebook.com"; // create a variable for url
		driver.navigate().to(URL);
		
	 String text=driver.findElement(By.xpath("//*[text()='Sign Up']")).getText();
      System.out.println("the text is "+" "+text);
      String title = driver.getTitle();
  	
		System.out.println("the Facebook title is "+" "+ title);
		int length = driver.getTitle().length();
		System.out.println("Length of the title is "+" " +length);
		

      
      	
	}

}
