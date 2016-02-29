package tutorial.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) {
		//http://selenium-release.storage.googleapis.com/index.html
		WebDriver driver;
		String baseURL = "http://google.com";
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(baseURL);

	}

}
