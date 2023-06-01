package applicationlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSignInclick {
public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
	
		
	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress

	// automate SignIn Element
	// Inspect the Sign in element
//<a  href="https://accounts.google.com/GAZAmgQ" >Sign in</a> - Sign in element properties

//<input name="Submit" class="button" id="btnLogin" value="LOGIN">-logIn button properties
		
	// <a - anchor tag
	// href - attribute
	// then the element is of Type - link
	
	// locator - linkText
	// Selector - Sign in
	
	//1. Identifying the element based on the Properties
	//2. Performing the Operation on the Element
	
	// driver.findElement(By.linkText("Sign in")).click();
	
				// OR
	
	//WebElement singIn=driver.findElement(By.linkText("Sign in"));
	// Identifying the Element based on the Property and saving it into a variable
// Declaring the variable as of type WebElement(because the element is found on the webPage)
	
	// singIn.click(); // Using the variable - performing the operation on the WebElement
	            
	            // OR
	
	//By singInLocator=By.linkText("Sign in");
By singInLocator=By.partialLinkText("Sign"); // considering a part of the text of the link
                                  // as Selector - instead of the complete text of the link
	// Identifying the property of an element and assigning it to a variable - declaring of 
	        // Type By
	WebElement signIn=driver.findElement(singInLocator);
	signIn.click();
	
	//driver.quit();
		
	}
}



