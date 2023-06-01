package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeprogram {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();

		// WebDriver - is an interface in Selenium

		WebDriver driver = new ChromeDriver();

		/*
		System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/

		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");


		//<input name="txtUsername" id="txtUsername" type="text"> - properties of the userName Element

		/*
		// name="txtUsername"

		name - attribute
		value - txtUsername

		// id="txtUsername"

		id(locator) - attribute
		value(selector) - txtUsername
		*/

		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// <input name="txtPassword" autocomplete="off" type="password">

		driver.findElement(By.id("txtPassword")).sendKeys("Pushp@87772");

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());

}

		}


