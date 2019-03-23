package browserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL="https://www.facebook.com"; // create a variable for url
		driver.navigate().to(URL);
		
	String text=driver.findElement(By.xpath("//*[text()='Sign Up']")).getText();
      System.out.println("the text is "+" "+text);
      
      String text1=driver.findElement(By.xpath("//*[text()=' Connect with friends and the']")).getText();
      System.out.println("the text is "+" "+text1);
      
	}

}
