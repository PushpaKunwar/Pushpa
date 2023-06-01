package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		System.out.println(electronics.getSize());
		Actions action=new Actions(driver);
//action.contextClick(electronics).perform();//Right click using Actions class
action.moveToElement(electronics).perform();//MovetoElement by using Action class
action.click(electronics).perform();//Click By using Actions class
System.out.println("click electronics succes");
	}

}
