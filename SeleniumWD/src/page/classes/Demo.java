package page.classes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.classes.HomePage;

public class Demo {
	WebDriver driver;
	String baseURL;
	
	public static void main(String args[]){
		new Demo();
	}
	public void setUp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212452813\\workspace\\SeleniumWDTutorial\\chromedriver.exe");
		baseURL= "https://pghvm-vr2-www1.omnyx.com/Omnyx.Web/login";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	//public void setUp() throws Exception{
		
	public void test() throws Throwable{
		driver.get(baseURL);
		HomePage.typeUser(driver);
		HomePage.typePassword(driver);
		HomePage.clickLogin(driver);
		Thread.sleep(3000);
		HomePage.clickAllCases(driver);
	}
	
			
	}

