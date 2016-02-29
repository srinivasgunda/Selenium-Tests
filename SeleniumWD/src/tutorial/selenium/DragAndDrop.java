package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new FirefoxDriver();
		/*String baseURL = "http://dhtmlx.com/docs/products/dhtmlxTree";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement fromElement1 = driver.findElement(By.xpath("//div[@id='treebox1']//span[text()='James Johns']"));
		WebElement toElement1 = driver.findElement(By.xpath("//div[@id='treebox2']//span[text()='Bestsellers']"));
		Actions action = new Actions(driver);
		//action.clickAndHold(fromElement1).moveToElement(toElement1).release(toElement1).build().perform();
		action.dragAndDrop(fromElement1, toElement1).build().perform();
		driver.close();*/
		
		
		//slider
		String baseURL2 = "http://dhtmlx.com/docs/products/dhtmlxSlider";
		driver.get(baseURL2);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[@id='sliderBox2']//div[@class='dhxsl_runner']"));
		
		//using the action class
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 100, 0).build().perform();
		Thread.sleep(3000);
		
		//using the text
		WebElement textBox = driver.findElement(By.xpath(".//*[@id='rate']"));
		textBox.clear();
		textBox.sendKeys("0");
		textBox.sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		textBox.clear();
		textBox.sendKeys("40");
		textBox.sendKeys(Keys.RETURN);	

	}

}
