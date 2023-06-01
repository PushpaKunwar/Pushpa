package Mousehouroperation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousehour {
	public static void main(String args[]) 
	{

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		
	driver.get("http://amazon.in"); // passing the variableName - instead of urlAddress
	
	// id="nav-link-accountList" - Hello SignIn element Property
     driver.findElement(By.id("nav-link-accountList")).click();
	
	// Mouse Hover Operation should be performed on "Hello SignIn" Element
	Actions helloSingInAction = new Actions(driver);
	helloSingInAction.moveToElement((WebElement) driver).build().perform();

	
	
		// Your Orders is a hidden element
	// Your Orders element Test
	// locator - linkText
	// selector - Your Orders

	
	driver.findElement(By.linkText("Your Orders")).click();
	
	}

}
	
	
		
			
			
			