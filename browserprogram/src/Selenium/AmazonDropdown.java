package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropdown {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
		driver.get("http://jsbin.com/osebed/2");
		WebElement livetech=driver.findElement(By.id("fruits"));
		Select fruits = new Select(livetech);//select obj=new select(),select is method.
		System.out.println(fruits);
		 fruits.selectByVisibleText("Grape");
		fruits.selectByIndex(1);
		//select.selectbyVisibletext();
		//select.selectbyindex();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\vishn\\OneDrive\\Pictures\\Saved Pictures.png"));
		
}
}
