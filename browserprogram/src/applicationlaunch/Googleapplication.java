package applicationlaunch;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googleapplication {
	public static void main(String[]args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	driver.navigate().to("https://www.facebook.com/");
		driver.close();
		
	}

}
