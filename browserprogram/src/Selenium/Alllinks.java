package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alllinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement Electronic=driver.findElement(By.linkText("Electronics"));
			//System.out.println(Electronic.getSize());
			Actions action=new Actions(driver);
			//action.contextClick(Electronic).perform();
	     //  action.moveToElement(Electronic).perform();
	       Thread.sleep(3000);
	        action.click(Electronic).perform();
	        System.out.println("click on Electronics");
	        WebElement audio= driver.findElement(By.linkText("Audio"));
	        action.moveToElement(audio).perform();
	        List<WebElement>electronics=driver.findElements(By.tagName("h3"));
			for(WebElement text:electronics)
			{
				System.out.println(text.getText());
			}
	}

	
	}

		