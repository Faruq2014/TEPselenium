package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Helper {
	public WebDriver driver;

	public void switchWindow(int index) {
		String windowID = null;
		Set<String> childWinIDs = driver.getWindowHandles();

		Iterator<String> iter = childWinIDs.iterator();
		for (int i = 1; i <= index; i++) {
			windowID = iter.next();
		}
		driver.switchTo().window(windowID);
	}

	public boolean toIndex(int index) {

		String Parent_window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String winID : windows) {
			if (!winID.equals(Parent_window)) {
				driver.switchTo().window(winID);
				if (driver.switchTo().equals(index)) {
					return true;

				}

				driver.switchTo().window(Parent_window);
			}
		}
		return false;

	}
}
