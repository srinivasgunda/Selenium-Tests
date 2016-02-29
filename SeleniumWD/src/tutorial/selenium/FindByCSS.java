package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByCSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseURL = "http://www.flipkart.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(40000);
		
		// "# for id" and ". for class"
		
		
		//driver.findElement(By.cssSelector("#fk-top-search-box")).sendKeys("sony");
					
		// to restrict the type to particular tag, prepend it before #
		//driver.findElement(By.cssSelector("input#fk-top-search-box")).sendKeys("sony");
		
		// to limit the type to tag and attribute
		driver.findElement(By.cssSelector("input[id=fk-top-search-box]")).sendKeys("sony");
		
		// finding by CSS class
		//driver.findElement(By.cssSelector(".search-bar-submit")).click();
		
		//driver.findElement(By.cssSelector("input.search-bar-submit")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("input[className=search-bar-submit]")).click();
		
		driver.findElement(By.className("search-bar-submit")).click();
		
		

	}

}
