package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SAmple {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	
	driver.get("https://duckduckgo.com/");

	WebElement searchTextBox= driver.findElement(By.name("q"));

	// retrieving html attribute value using getAttribute() method
	String typeValue=searchTextBox.getAttribute("type");
	System.out.println("Value of type attribute: "+typeValue);

	String autocompleteValue=searchTextBox.getAttribute("autocomplete");
	System.out.println("Value of autocomplete attribute: "+autocompleteValue);

	// Retrieving value of attribute which does not exist
	String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
	System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);

	}
	
	}

