package page.classes;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGSuite {
	private WebDriver driver;
	private String baseUrl;
	//static Logger log = Logger.getLogger(TestNGSuite.class);
	
	@BeforeTest
	
	public void setUp() throws Exception {
		//PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();
		baseUrl = "https://pghvm-vr6-www1.omnyx.com/Omnyx.Web/login";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test1() {
		try {
			
			driver.get(baseUrl);
			Thread.sleep(10000);
			HomePage.typeUser(driver);
			HomePage.typePassword(driver);
			HomePage.clickLogin(driver);
			Thread.sleep(3000);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			
			HomePage.clickAllCases(driver);
			Thread.sleep(5000);
			HomePage.clickOlderCasesLink(driver);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		try {
			
			HomePage.clickOnSearchbox(driver);
			HomePage.typeCaseName(driver);
			Thread.sleep(2000);
			HomePage.clickOnCase(driver);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		try {
			
			CaseDetails.printCase(driver);
			CaseDetails.clickNotesTab(driver);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void test5() {
		try {
			
			CaseDetails.printClinicalHistory(driver);
			CaseDetails.printGrossingNotes(driver);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
  @AfterTest
  public void afterMethod() {
  }

}
