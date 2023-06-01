package PartialLinkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinkprog {
public static void main(String[]args) {
		
		
		WebDriver driver;
		String applicationurladdress = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		By SignInLocator = By.partialLinkText("Sign");
		WebElement SignIn = driver.findElement(SignInLocator);
		SignIn.click();
		
		

}
}
