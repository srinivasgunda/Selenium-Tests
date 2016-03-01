package page.classes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectModel {
	WebDriver driver;
	String baseURL;

	public void setUp() {
		driver = new FirefoxDriver();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		baseURL = "https://pghvm-vr6-www1.omnyx.com/Omnyx.Web/login";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	public void test() {
		try {
			setUp();
			driver.get(baseURL);
			HomePage.typeUser(driver);
			HomePage.typePassword(driver);
			HomePage.clickLogin(driver);
			HomePage.clickAllCases(driver);
			HomePage.clickOlderCasesLink(driver);
			HomePage.typeCaseName(driver);
			Thread.sleep(2000);
			HomePage.clickOnCase(driver);
			CaseDetails.printCase(driver);
			CaseDetails.clickNotesTab(driver);
			CaseDetails.printClinicalHistory(driver);
			CaseDetails.printGrossingNotes(driver);
			HomePage.clickOnLogout(driver);

		} catch (Throwable e) {

			e.printStackTrace();
		}
	}

	public static void main(String args[]) {

		new PageObjectModel().test();

	}

}
