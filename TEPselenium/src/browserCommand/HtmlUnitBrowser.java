package browserCommand;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitBrowser  {
	


	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver(true);
		/*
		 * #1.-->by default it will not support java script, but if you put true in the argument
		 * than it will support java script.
		 * #2-->it will not suitable for  action class such as mouse hover, drag and drop, double click
		 * #3--> it is called headless browser or ghost browser.
		 * #4--> it is very fast, for small script it is better. 
		 * #5--> after selenium 3, jar file does not support html unit driver. either you have
		 * to download stand alone server or html jar file with dependency. for maven project 
		 * html dependency from the repository.
		 */
         driver.get("https://www.facebook.com");
		String title = driver.getTitle();
	
		System.out.println("the Facebook title is "+" "+ title);
		int length = driver.getTitle().length();
		System.out.println("Length of the title is "+" " +length);
		

	}
	

	

}
