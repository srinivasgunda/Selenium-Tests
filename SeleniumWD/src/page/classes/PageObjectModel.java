package page.classes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectModel {
	WebDriver driver;
	String baseURL;

	public void setUp() {
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		baseURL = "https://pghvm-vr6-www1.omnyx.com/Omnyx.Web/login";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void test() {
		try {
			setUp();
			driver.get(baseURL);
			Thread.sleep(10000);
			HomePage.typeUser(driver);
			HomePage.typePassword(driver);
			HomePage.clickLogin(driver);
			Thread.sleep(3000);
			HomePage.clickAllCases(driver);
			Thread.sleep(5000);
			HomePage.clickOlderCasesLink(driver);
			HomePage.typeCaseName(driver);
			HomePage.clickOnCase(driver);
			CaseDetails.printCase(driver);
			CaseDetails.clickNotesTab(driver);
			CaseDetails.printClinicalHistory(driver);
			CaseDetails.printGrossingNotes(driver);
			
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {

		new PageObjectModel().test();

	}

}
