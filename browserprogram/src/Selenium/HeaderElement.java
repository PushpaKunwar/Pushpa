package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeaderElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement>HeaderLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']"));
		for(WebElement ele:HeaderLinks) {
		System.out.println(ele.getText());
		}

	}
}





