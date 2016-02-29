package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "http://dhtmlx.com";
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mainElement = driver.findElement(By.linkText("Support"));
		WebElement subElement = driver.findElement(By.linkText("Documentation"));
		Actions action = new Actions(driver);
		//action.moveToElement(mainElement).moveToElement(subElement).click().build().perform();
		
		action.moveToElement(mainElement).perform();
		Thread.sleep(3000);
		action.moveToElement(subElement).click().perform();
		
			 
	    
	  }
		
	}

