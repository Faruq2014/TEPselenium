package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Description {
	
/*
 * Descriptions attributes are very helpful to tell what is the test about.
 */
	
	public String baseUrl = "https://www.facebook.com/";
	  String driverPath = "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe";
  public WebDriver driver; 
   

@BeforeSuite(alwaysRun = true)
public void setupSuite() {
	 System.out.println("launching chrome browser"); 
     System.setProperty("webdriver.chrome.driver", driverPath);
     driver= new ChromeDriver();
     driver.get(baseUrl);
}
@Test(description="functional test, to check log in for Facebook")
public void openFaceBook(){
	 driver.findElement(By.id("email")).sendKeys("abc@yahoo.com");
}
@AfterSuite(alwaysRun = true)
public void tearDown() {
driver.close();
}



}
