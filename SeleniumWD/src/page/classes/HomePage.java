package page.classes;

import org.openqa.selenium.*;

public class HomePage {

	public static WebElement element = null;
	public static String user = "srinivas.gunda";
	public static String pwd = "test";
	
	/* Returns the User name element*/
	public static WebElement userName(WebDriver driver) {
		element = driver.findElement(By.id("username"));
		return element;

	}
	
	/* Returns the Password element*/
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("password"));
		return element;

	}
	
	/* Returns the Login element*/
	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.id("login"));
		return element;

	}
	
	/* Returns the All Cases element*/
	public static WebElement allCases(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[1]/span/span[4]"));
		return element;
	
	}
	
	/*Returns the element to click the link for older cases*/
	public static WebElement olderCasesLink(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='scrollDivId']/div[2]"));
		return element;
	}
	
	/* Returns the Search box element*/
	public static WebElement searchBox(WebDriver driver) {
		element = driver.findElement(By.className("search-textbox"));
		return element;

	}
	
	/* Returns the Search button element*/
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("caseListSearchButton"));
		return element;

	}
	
	/* Returns the Case element*/
	public static WebElement caseName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='anchor-case-id-1888']"));
		return element;

	}
	
	/* Enter the user name*/
	public static void typeUser(WebDriver driver) {
		
		element = userName(driver);
		element.sendKeys(user);

	}
	
	/* Enter the password*/
	public static void typePassword(WebDriver driver) {
		
		element = password(driver);
		element.sendKeys(pwd);

	}
	
	/* Click on Login button*/
	public static void clickLogin(WebDriver driver) {
		element = loginButton(driver);
		element.click();
	}
	
	/* Click on All Cases button */
	public static void clickAllCases(WebDriver driver) {
		element = allCases(driver);
		element.click();
	}
	
	/*Click on Old Cases link */
	public static void clickOlderCasesLink(WebDriver driver){
		element = olderCasesLink(driver);
		element.click();
	}
	
	/*Click on Search box */
	public static void clickOnSearchbox(WebDriver driver){
		element = searchBox(driver);
		element.click();
	}
	
	/*Type Case name in Search box */
	public static void typeCaseName(WebDriver driver){
		element = searchBox(driver);
		element.sendKeys("W-Integration");
		element.sendKeys(Keys.RETURN);
	}
	
	/*Click on Case List Search Button */
	public static void clickSearchButton(WebDriver driver){
		element = searchButton(driver);
		element.click();
	}
	
	/*Click on Case in case list */
	public static void clickOnCase(WebDriver driver){
		element = caseName(driver);
		element.click();
	}

}
