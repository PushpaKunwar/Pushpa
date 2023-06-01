package GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeprogram {
public static void main(String[]args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		driver1.navigate().to("https://www.google.com/");
		By SignInLocator = By.linkText("Sign In");
		WebElement SignIn = driver1.findElement(SignInLocator);
		String SignInText = SignIn.getText();
		System.out.println("The text of the web Element sign in on the google homepage is:-"+"SignIntext");
		String AttributeValueofclass = SignIn.getAttribute("Class");
		System.out.println("The Attribute Value of SignIn Element class is:-"+" Attribute value of class");
		String AttributeValueofhref = SignIn.getAttribute("href");
		System.out.println("The Attribute Value of href Element class is:-"+" Attribute value of href");
		SignIn.click();
		driver1.quit();
		 
		
		
	

}
}