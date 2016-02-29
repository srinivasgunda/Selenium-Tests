package page.classes;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseUrl = "https://pghvm-vr6-www1.omnyx.com/Omnyx.Web/login";
		driver.get(baseUrl);
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Type user name
		driver.findElement(By.id("username")).sendKeys("srinivas.gunda");
			
		//Type password
		driver.findElement(By.id("password")).sendKeys("test");
		
		//Click on login button
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(5000);
					
		//Click on All Cases
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[1]/span/span[4]")).click();
		Thread.sleep(5000);	
		
		//Click on link to load older cases
		driver.findElement(By.xpath(".//*[@id='scrollDivId']/div[2]")).click();
		
		Thread.sleep(6000);
		
		//Search for a case
		driver.findElement(By.className("search-textbox")).sendKeys("W-Integration");
		driver.findElement(By.className("search-textbox")).sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
			
		//driver.findElement(By.id("caseListSearchButton")).click();
		
							
		//Click on the Case name
		driver.findElement(By.xpath(".//*[@id='anchor-case-id-1888']")).click();
		
		//Verification for case name
		WebElement element = driver.findElement(By.xpath("//div[text()='W-Integration']"));
		String actualCase = element.getText();
		System.out.println(actualCase);
	
		Assert.assertEquals("W-Integration", actualCase);
		
		//Clicking on Notes tab
		driver.findElement(By.xpath("//div[text()='Notes (2)']")).click();
		
		//Verification for Clinical History text
		WebElement element2 = driver.findElement(By.xpath("//div[text()='Clinical']"));
		String ch = element2.getText();
		System.out.println(ch);
		Assert.assertEquals("Clinical", ch);
		
		//Verification for Grossing Notes text
		WebElement element3 = driver.findElement(By.xpath("//div[text()='Grossing']"));
		String gn = element3.getText();
		System.out.println(gn);
		Assert.assertEquals("Grossing", gn);
		
		
	}

}
