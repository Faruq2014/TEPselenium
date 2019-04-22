package radioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Value {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	List<WebElement> chkBx = driver.findElements(By.name("sex"));
         chkBx.get(0).click();
         Thread.sleep(1000);
         //chkBx.clear();

		
		int iSize = chkBx.size();
		System.out.println("total index is "+" "+iSize);
		/*
		 * int= data type
		 * iSize= object name
		 * 
		 */
		for(int i=0; i < iSize ; i++ ){
	
		String sValue = chkBx.get(i).getAttribute("id");
		
			System.out.println("value is"+" "+sValue);
			
			
		}
driver.close();
	}


}
