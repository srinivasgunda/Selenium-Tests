package tutorial.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://www.expedia.co.in/";
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		//WebElement textBox = driver.findElement(By.id("hotel-destination"));
		//String actualText = "Pittsburgh (and vicinity), Pennsylvania, United States of America";
		
		driver.findElement(By.id("hotel-destination")).clear();
	    driver.findElement(By.id("hotel-destination")).sendKeys("Pittsburgh (and vicinity), Pennsylvania, United States of America");
		
		/*String partialText = "Pitts";
		WebElement element = driver.findElement(By.xpath("//div[@class='display-group-results']"));
		List<WebElement> results = driver.findElements(By.tagName("li"));
		
		for(int i=0; i<results.size();i++){
			System.out.println(results.get(i).getText());
			
		}
		Thread.sleep(3000);
		for (WebElement result: results){
			if(result.getText().equals(actualText)){
				result.click();
			}
		}*/
		
		

	}

}
