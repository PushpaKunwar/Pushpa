package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlink {
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("div"));
		for(WebElement text:links)
		{
			System.out.println(text.getText());
		}
		
	}
}
