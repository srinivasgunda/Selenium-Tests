package tutorial.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "http://www.hdfcbank.com";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		Thread.sleep(2000);
		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String handle:handles){
			if(!handle.equals(mainHandle)){
				driver.switchTo().window(handle);
				driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a/img")).click();
				driver.switchTo().window(mainHandle);
				driver.close();
			}
				
		}
		
	}
	
}