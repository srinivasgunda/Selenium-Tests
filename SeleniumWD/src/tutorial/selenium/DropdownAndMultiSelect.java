package tutorial.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndMultiSelect {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "http://www.makemytrip.com/flights";
		driver.get(URL);
		driver.manage().window().maximize();
		Select s1 = new Select(driver.findElement(By.id("class_selector")));
		Select s2 = new Select(driver.findElement(By.id("prefferedAirline")));
		List<WebElement> options = s1.getOptions();
		for(int i = 0; i < options.size(); i++){
			String optionName = s1.getOptions().get(i).getText();
			System.out.println(optionName);
		}
		
		//By value
		s1.selectByValue("B");
		
		//By index
		s2.selectByIndex(2);
		Thread.sleep(2000);
		String URL2 = "http://www.htmlcodetutorial.com/forms/_SELECT_MULTIPLE.html";
		driver.get(URL2);
		driver.manage().window().maximize();
		Select s3 = new Select(driver.findElement(By.name("toppings")));
		s3.selectByValue("onions");
		Thread.sleep(2000);
		s3.selectByValue("tomatoes");
		Thread.sleep(2000);
		s3.selectByValue("olives");
		Thread.sleep(2000);
		s3.deselectByValue("onions");

	}

}
