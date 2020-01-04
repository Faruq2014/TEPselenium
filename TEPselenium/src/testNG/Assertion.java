package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	/*
	 *  
    regular Assert will fail you code and stop execution if it is does not match.
	soft assert will not fail your code and assert all will print 
	why it should fail.
	Assert.fail(); will directly fail your test case

	 */
	
	public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
    SoftAssert softassert = new SoftAssert();
   // Assert assert1 = new Assert();
    
    @BeforeTest
    public void launchBrowser() {
    	 System.out.println("launching chrome browser"); 
    	    System.setProperty("webdriver.chrome.driver", driverPath);
    	    driver= new ChromeDriver();
   driver.get(baseUrl);
    }

	@AfterTest
	public void aftertest(){
		
		 driver.quit();
		System.out.println("finished executing the test");
		
	}

@BeforeMethod
public void verifyHomepageTitle() {
System.out.println("start executing method");
String expectedTitle = "Facebook - Log In or Sign Up";  //Facebook - Log In or Sign Up
String actualTitle = driver.getTitle();
System.out.println("the current page title is"+" "+actualTitle);
 Assert.assertEquals(actualTitle, expectedTitle);
}
@AfterMethod
public void goBackToHomepage ( ) {
System.out.println("finish executing method");
//driver.findElement(By.linkText("Home")).click() ;
driver.navigate().back();
//driver.close();
System.out.println("************************************************");

}


@Test(priority=1)

public void login(){
	
      
       driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
       driver.findElement(By.id("pass")).sendKeys("abcd1234");
       driver.findElement(By.cssSelector("input[id^=u_0]")).click();
       String expectedTitle = "Log into Facebook | Facebook"; //wrong expected but test will execute
       String actualTitle = driver.getTitle();
       System.out.println("the hompage title is"+" "+actualTitle );
      // Assert.fail();// will directly fail your test case
       softassert.assertEquals(expectedTitle, actualTitle);
       softassert.assertAll();
      // Assert.assertNotEquals(expectedTitle, actualTitle);
       
}

@Test(priority=2)	

public void forgot(){
	
    // WebDriver   driver = new ChromeDriver();
     // driver.get("https://www.facebook.com/");
	
      driver.findElement(By.partialLinkText("Forgot")).click();
      System.out.println("the forgotpage title is "+" "+driver.getTitle());
      String expectedTitle = "Forgot Password | Can't Log In | Facebook";
      String actualTitle = driver.getTitle();
    softassert.assertEquals(actualTitle, expectedTitle);
    softassert.assertAll();
    
    
     
}


}
