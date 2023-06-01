package GetTextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextprogram {

	public static void main(String[]args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		driver1.navigate().to("https://www.google.com/");
		By SignInLocator = By.linkText("Sign In");
		WebElement SignIn = driver1.findElement(SignInLocator);
		String SignInText = SignIn.getText();
		System.out.println(SignIn.getText());
		System.out.println("The text of the web Element sign in on the google homepage is:-"+"SignIntext");
		SignIn.click();
	
	
		
		
		
}
}