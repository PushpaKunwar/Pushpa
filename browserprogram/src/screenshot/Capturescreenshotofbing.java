package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreenshotofbing {
	public static void main(String[] args) throws IOException {


		WebDriver driver;
	String applicationUrlAddress="http://bing.com"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	// Maximizing the Browser
	driver.manage().window().maximize();
		
	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress
	
	File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(bingScreenShot, new File("./applicationSceenShots/bingHomePage.png"));
	
	// TakesScreenshot - is an interface of Selenium
	// OutputType -is an interface of Selenium
	// FileUtils - class from Apache - commons.io
	// ((TakesScreenshot)driver) - interface binded with Object of the class -is TypeCasting
	driver.quit();
			
	}
}





