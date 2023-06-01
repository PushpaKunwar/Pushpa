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

import io.github.bonigarcia.wdm.WebDriverManager;

public class screensshotexmapleprog {
	public static void main(String[]args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		//WebElement screen = driver.findElement(By.id("content"));
		TakesScreenshot Picture= (TakesScreenshot) driver;
		File f= Picture.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\vishn\\OneDrive\\Pictures\\Saved Pictures.png "));
		
		
		
	}

}
