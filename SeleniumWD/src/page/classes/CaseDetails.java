package page.classes;

import org.openqa.selenium.*;
import org.testng.Assert;

public class CaseDetails {
	public static WebElement element = null;

	// Returns the Case Name web element
	public static WebElement caseName(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='W-Integration changed']"));
		return element;

	}

	// Printing the case name and validating
	public static void printCase(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='W-Integration Changed']"));
		String actualCase = element.getText();
		System.out.println("Actual Case is " + actualCase);
		Assert.assertEquals("W-Integration Changed", actualCase);

	}

	// Returns the Notes tab web element
	public static WebElement notesTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Notes (2)']"));
		return element;

	}

	// Returns the Clinical History text web element
	public static WebElement clinicalHistory(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Clinical History - Changed']"));
		return element;

	}

	// Returns the Grossing Notes text web element
	public static WebElement grossingNotes(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Grossing Notes - Changed']"));
		return element;

	}

	// Clicking on Notes tab
	public static void clickNotesTab(WebDriver driver) {
		element = notesTab(driver);
		element.click();
	}

	// Printing the clinical history and validating
	public static void printClinicalHistory(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Clinical History - Changed']"));
		String ch = element.getText();
		System.out.println("Clinical History is " + ch);
		Assert.assertEquals("Clinical History - Changed", ch);

	}

	// Printing the grossing notes and validating
	public static void printGrossingNotes(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Grossing Notes - Changed']"));
		String gn = element.getText();
		System.out.println("Grossing Notes is " + gn);
		Assert.assertEquals("Grossing Notes - Changed", gn);

	}

}
