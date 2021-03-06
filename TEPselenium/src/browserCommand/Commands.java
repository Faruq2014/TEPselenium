package browserCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		   

		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://www.bbc.com/");

		// Storing Title name in String variable so that we can get the title name
		String btitle = driver.getTitle();

		// Printing the Title name in 2 ways
		// 1st way
		System.out.println(btitle);
		// 2nd way
		System.out.println("Title is : " + btitle);

		// Storing Title length in Int variable because we are dealing with Integers that's why int is used.
		int bTitleLength = driver.getTitle().length();

		// Printing Title l0ength
		System.out.println("Length of the Title is : " + bTitleLength);
		// Storing URL in String variable
		String b1 = driver.getCurrentUrl();

		// Printing URL on Console Window

		System.out.println("URL is : " + b1);

		// Storing URL length
		int b2 = driver.getCurrentUrl().length();

		// Printing URL length on console Window

		System.out.println("URL length is : " + b2);

		// COMMAND FOR NAVIGATION THROUGH PAGES.

		//Open the NEWS Page.
		String b3 = driver.findElement(By.xpath("//*[@id='blq-nav-news']/a")).getText();

		// Print the Tab name which is being clicked.
		System.out.println("Name of the Tab which is being clicked is : " + b3);

		// Click on the Tab
		driver.findElement(By.xpath("//*[@id='blq-nav-news']/a")).click();

		//Get the text where Xpath is pointing.
		String b4 = driver.findElement(By.xpath("//*[@id='header']")).getText();

		// Print the text of the current page
		System.out.println("Text of current page is : " + b4);

		//Navigate to previous Page.

		driver.navigate().back();
		Thread.sleep(1000);
		String b5 = driver.getTitle();

		// Print the text of the previous page
		System.out.println("Text of the previous page is : " + b5);

		//Navigate to Next page.
		driver.navigate().forward();
		Thread.sleep(1000);
		// Print the text of the NEXT page
		String b6 = driver.getTitle();
		System.out.println("Text of the NEXT page is : " + b6);
		// COMMAND FOR REFRESHING THE CURRENT PAGE

		// driver.get(driver.getCurrentUrl());
		driver.navigate().refresh();

		// PAGE SOURCE COMMAND
		// Storing Page Source in String variable.
		String b7 = driver.getPageSource();
		Thread.sleep(1000);

		// Printing the Page Source
		System.out.println("Page source : " + b7);

		// Storing Page Source length in Int variable
		int b8 = driver.getPageSource().length();

		// Printing the Page Source length
		System.out.println("Length of the page source is : " + b8);

		//close the browser or page currently which is having the focus.
		driver.close();

		//Close all the windows.
		//driver.quit();
		}
}
