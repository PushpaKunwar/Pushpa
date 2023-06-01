package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownprogram {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://application.iilm.edu/");
		driver.manage().window().maximize();
		WebElement Dropdown=driver.findElement(By.name("state_id"));
	    Select SelectState = new Select(Dropdown);
	    System.out.println("SelectState");
	  SelectState.selectByVisibleText("Andhra Pradesh");
	  Thread.sleep(3000);
	    SelectState.selectByIndex(1);
	    
	    
	    
		
	}

}
