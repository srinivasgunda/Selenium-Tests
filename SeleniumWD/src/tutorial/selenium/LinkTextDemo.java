package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.flipkart.com";
		driver.get(baseURL);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Cameras")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Foods")).click();
		driver.findElement(By.id("fk-top-search-box")).sendKeys("motog3");
		driver.findElement(By.className("search-bar-submit")).click();
		//id, name, classname, xpath, linktext, partial link text, tagname, css selector

	}

}
