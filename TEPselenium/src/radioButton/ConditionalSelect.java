package radioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalSelect {

	public static void main(String[] args) {
		new ConditionalSelect().m1();
		
	}
		public void m1() {
		
			//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			List<WebElement> rdBtn = driver.findElements(By.name("sex"));
					boolean Value = false;
					Value = rdBtn.get(1).isSelected();
					System.out.println(Value);
					if(Value == true){
					rdBtn.get(0).click();
					}else{
						rdBtn.get(1).click();
					}
		}
		


	}


