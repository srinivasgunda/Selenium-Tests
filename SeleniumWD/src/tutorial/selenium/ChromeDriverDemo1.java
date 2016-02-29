package tutorial.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo1 {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		WebDriver driver;
		
		String baseURL = "http://www.google.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);

	}

}
