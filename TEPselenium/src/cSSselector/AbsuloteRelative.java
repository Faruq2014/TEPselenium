package cSSselector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AbsuloteRelative {
	public static WebDriver driver;

	public static void main(String[] args) {
		AbsuloteRelative ab =new AbsuloteRelative();
		ab.setUpTest();
		ab.xpathFunction();
		ab.idFunction();
		ab.nameFunction();
		ab.twoFunction();
	}
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	public void xpathFunction() {
		driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']/div/div/a")).click();
	}


	public void idFunction() {
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Faruq");
		// driver.findElement(By.cssSelector("#username")).sendKeys("Faruq");
	}


	public void nameFunction() {
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("Faruq123");
		// driver.findElement(By.cssSelector(".pw")).sendKeys("Faruq123");
		// .pw is not working, even though it is perfectly valid.
	}


	public void twoFunction() {
		driver.findElement(By.cssSelector("input[id='Login'][name='Login']")).click();
		// driver.findElement(By.cssSelector(".pw")).sendKeys("Faruq123");
		// .pw is not working, even though it is perfectly valid.
	}
}
