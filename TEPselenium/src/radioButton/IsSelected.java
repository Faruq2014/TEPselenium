package radioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
 
       driver.get("http://facebook.com");
		List<WebElement>rbt = driver.findElements(By.name("sex"));
		boolean b =rbt.get(0).isSelected();
		System.out.println(b);
		if(b=false) {rbt.get(0).click();
			Thread.sleep(3000);}
		else {rbt.get(1).click();}
		
		
		
		//rbt.get(0).click();
		//Thread.sleep(3000);
		//rbt.get(1).click();
		

	}

}
