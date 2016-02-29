package page.classes;

import org.junit.Assert;
import org.openqa.selenium.*;

public class CaseDetails {
	public static WebElement element = null;
	
	//Returns the Case Name web element
	public static WebElement caseName(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='W-Integration']"));
		return element;

	}
	
	//Printing the case name and validating
	public static void printCase(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='W-Integration']"));
		String actualCase = element.getText();
		System.out.println("Actual Case is " + actualCase);
		Assert.assertEquals("W-Integration", actualCase);
		
	}
	
	//Returns the Notes tab web element
	public static WebElement notesTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Notes (2)']"));
		return element;
	
	}
	
	//Returns the Clinical History text web element
		public static WebElement clinicalHistory(WebDriver driver) {
			element = driver.findElement(By.xpath("//div[text()='Clinical']"));
			return element;
		
		}
		
	//Returns the Grossing Notes text web element
		public static WebElement grossingNotes(WebDriver driver) {
			element = driver.findElement(By.xpath("//div[text()='Grossing']"));
			return element;
				
		}
	//Clicking on Notes tab
		public static void clickNotesTab(WebDriver driver) {
			element = notesTab(driver);
			element.click();
		}
		
	//Printing the clinical history and validating
		public static void printClinicalHistory(WebDriver driver) {
			element = driver.findElement(By.xpath("//div[text()='Clinical']"));
			String ch = element.getText();
			System.out.println("Clinical History is " + ch);
			Assert.assertEquals("Clinical", ch);
			
		}
		
	//Printing the grossing notes and validating
		public static void printGrossingNotes(WebDriver driver) {
			element = driver.findElement(By.xpath("//div[text()='Grossing']"));
			String gn = element.getText();
			System.out.println("Grossing Notes is " + gn);
			Assert.assertEquals("Grossing", gn);
					
				}


}
