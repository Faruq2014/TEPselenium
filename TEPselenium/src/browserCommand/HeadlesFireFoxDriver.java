package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlesFireFoxDriver {

	public static void main(String[] args) {

	FirefoxBinary ff = new FirefoxBinary();	
	ff.addCommandLineOptions("--headless");
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
	FirefoxOptions options= new FirefoxOptions();
	options.setBinary(ff);
	
	WebDriver driver = new FirefoxDriver(options);
		
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
