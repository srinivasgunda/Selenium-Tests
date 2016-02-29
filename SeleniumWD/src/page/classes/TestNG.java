package page.classes;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import page.classes.HomePage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(UsingTestNG.class);

	public void testMethod() {
		try {
			beforeMethod();
			driver.get(baseUrl);
			Thread.sleep(10000);
			HomePage.typeUser(driver);
			HomePage.typePassword(driver);
			HomePage.clickLogin(driver);
			Thread.sleep(3000);
			HomePage.clickAllCases(driver);
			Thread.sleep(10000);
			HomePage.clickOlderCasesLink(driver);
		} catch (Throwable e) {

			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		
		
		 /* System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe"
		 * );
		 */
		baseUrl = "https://pghvm-vr2-www1.omnyx.com/Omnyx.Web/login";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	public static void main(String args[]) {

		new TestNG().testMethod();

	}

	@AfterMethod
	public void afterMethod() {
	}

}
