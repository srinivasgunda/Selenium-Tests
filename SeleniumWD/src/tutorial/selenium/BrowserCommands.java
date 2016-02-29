package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		String URL = "http://www.flipkart.com";
		driver.get(URL); //Loads the URL
		driver.manage().window().maximize(); //Maximizes the window
		Thread.sleep(40000);
		String title = driver.getTitle(); //Title of the web page
		System.out.println(title);
		String getCurrentURL = driver.getCurrentUrl(); //Current URL loaded in the page
		System.out.println(getCurrentURL);
		String source = driver.getPageSource(); //Gets the page source
		//System.out.println(source);
		driver.navigate().refresh(); //Refresh the browser
		driver.navigate().to(driver.getCurrentUrl()); //Refresh the browser
		driver.get(driver.getCurrentUrl()); //Refresh the browser
		driver.findElement(By.xpath(".//*[@id='fk-top-search-box']")).sendKeys("sony");
		driver.findElement(By.cssSelector(".search-bar-submit.fk-font-13.fk-font-bold")).click();
		Thread.sleep(5000);
		driver.navigate().back(); //Navigate backward
		Thread.sleep(5000);
		driver.navigate().forward(); //Navigate forward
		Thread.sleep(5000);
		driver.close(); //Close the current browser window, it it is last, then quits
		driver.quit(); //Quits the browser
		

	}

}
