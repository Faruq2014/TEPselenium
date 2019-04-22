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
       /*
        * Radio button normally auto selected. so you want to make sure if by default 
        * one button is selected then you have to use boolean method with if else 
        * condition. 
        */
		List<WebElement>rbt = driver.findElements(By.name("sex"));
		boolean b =rbt.get(0).isSelected();
		/*boolean = data type
		 * b= reference object name
		 * rbt.get(0).isSelected();= is the value of b
		 * boolean b =rbt.get(0).isSelected();== true(by default)
		 */
		System.out.println(b);
		if(b=true) {rbt.get(0).click();
			Thread.sleep(3000);}
		else {rbt.get(1).click();}
		
		
		
		
		

	}

}
