package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "http://www.flipkart.com";
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(35000);
		
		// "#" - id and "." - class
		// ^ - starting string
		// $ - ending string
		// * - contains text
		driver.findElement(By.cssSelector("input[id*=top-search]")).sendKeys("sony");

	}

}
