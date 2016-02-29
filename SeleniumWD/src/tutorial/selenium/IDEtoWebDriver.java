package tutorial.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IDEtoWebDriver {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.google.co.in/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSeleniumDemo() throws Exception {
		// open | /?gws_rd=ssl |
		driver.get(baseUrl);
		// type | id=lst-ib | seleniumhq
		driver.findElement(By.id("lst-ib")).clear();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("lst-ib")).sendKeys("seleniumhq");
		// click | name=btnG |
		driver.findElement(By.name("btnG")).click();
		// click | link=Selenium - Web Browser Automation |
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();;
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}

/*
 * private boolean isElementPresent(By by) { try { driver.findElement(by);
 * return true; } catch (NoSuchElementException e) { return false; } }
 * 
 * private boolean isAlertPresent() { try { driver.switchTo().alert(); return
 * true; } catch (NoAlertPresentException e) { return false; } }
 * 
 * private String closeAlertAndGetItsText() { try { Alert alert =
 * driver.switchTo().alert(); String alertText = alert.getText(); if
 * (acceptNextAlert) { alert.accept(); } else { alert.dismiss(); } return
 * alertText; } finally { acceptNextAlert = true; } } }
 */
