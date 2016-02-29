package tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		/*String FBURL = "http://www.facebook.com";
		driver.get(FBURL);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("nivasg@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.id("u_0_l")).click();*/
		
	}

}
