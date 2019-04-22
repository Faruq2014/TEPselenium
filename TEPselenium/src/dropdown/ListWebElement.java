package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListWebElement {
	// to print all the value once----------by loop
	
		public static void main(String[] args) {
			//Select() + getOptions()+List<WebElement> method------------------------
					//with getOptions(),you only can work outside of the drop down box. to go inside you need List<WebElement> method and a loop
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.facebook.com/");
	        // Select month = new Select() is the formula to work with drop down.
	        // import Select package.
	        // we can nested the object inside the constructor to work with drop down.
			Select month = new Select(driver.findElement(By.id("month")));
		 //select method + driver method = month method.
	   
	     
	    List<WebElement> number=month.getOptions(); // building----> getOptions()+List()= number(reference name)
	  //month.getOptions() is a method, number is a reference object name and List<WebElements> is a data type and a method.
	    
	   int list = number.size();
	   System.out.println("total month number is"+"  "+list);
	   //i=0 and i<list, that means in between everythin is =i, for examle in this dropdown box list
	  // is from 0 to 12, thats means i= from 0 to 12.
	   
	   for (int i = 0; i < list; i++) {
		 String monthName = month.getOptions().get(i).getText();
		 System.out.println(monthName);
		
		 } 

}
}
