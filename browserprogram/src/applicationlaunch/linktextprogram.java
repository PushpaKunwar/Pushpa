package applicationlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextprogram {
	public static void main(String[]args) {
		WebDriver driver;
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				ChromeDriver driver1 = new ChromeDriver();
				driver1.get("https://www.google.com/");
				driver1.navigate().to("https://www.google.com/");
				driver1.findElement(By.linkText("Sign In")).click();
				driver1.quit();

}
}
