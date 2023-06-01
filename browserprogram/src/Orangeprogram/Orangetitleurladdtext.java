package Orangeprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangetitleurladdtext {
	public static void main(String[]args) {
		
		
		WebDriver driver;
		String applicationurladdress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	    driver.get(applicationurladdress);
		
		
		
		String Orangetitle = driver.getTitle();
		String Orangehomepageurladdress= driver.getCurrentUrl();
		
		By LOGINPanelLocator = By.linkText("LOGIN Panel");
		WebElement LOGINPanel = driver.findElement(LOGINPanelLocator);
		String loginPaneltext = LOGINPanel.getText();
		
	
		
	    System.out.println("The Title of the Orange homepage is :-" + "LOGINPanel");
	    LOGINPanel.click();

		System.out.println("The url of the Orange Homepage  is :-" + "OrangeHomepageurladdress");
		
	
		System.out.println("The text of the web Element sign in on the Orange homepage is:-"+"Login Panel");
	
	
		
		driver.quit();
		
	}
}
