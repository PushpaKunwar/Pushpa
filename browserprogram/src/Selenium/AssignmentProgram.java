package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentProgram {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*List<WebElement>name=driver.findElements(By.tagName("div"));
		for(WebElement text:name)
		{
			System.out.println(text.getText());
		}*/
	
		  Thread.sleep(3000);
		  
		  //formousehour
		WebElement Electronic=driver.findElement(By.linkText("Electronics"));
			//System.out.println(Electronic.getSize());
			Actions action=new Actions(driver);
			//action.contextClick(Electronic).perform();
	     //  action.moveToElement(Electronic).perform();
	       Thread.sleep(3000);
	        action.click(Electronic).perform();
	        System.out.println("click About US success");
	        WebElement audio= driver.findElement(By.linkText("Audio"));
	        action.moveToElement(audio).perform();
	        List<WebElement>electronics=driver.findElements(By.tagName("h3"));
			for(WebElement text:electronics)
			{
				System.out.println(text.getText());
			}
	        
		//for dropdown
		/*  WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		   dropdown.click();
		   Select SelectService = new Select(dropdown);
	       System.out.println("SelectService");
	      // SelectService.selectByVisibleText("Alexa Skills");
	       Thread.sleep(3000);
	      SelectService.selectByIndex(1);*/
	    
	    	
	}

}
