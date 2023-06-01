package Orangehomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
public static void main(String[]args) {
		
		
		WebDriver driver;
		String applicationurladdress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
	    driver.get(applicationurladdress);
	    driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");

		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Pushp@87772");
         
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());
		
		
		
	    String Orangetitle = driver.getTitle();
		String Orangehomepageurladdress= driver.getCurrentUrl();
		
		By WelcomeAdminLocator = By.linkText("Welcome Admin");
		WebElement WelcomeAdmin = driver.findElement(WelcomeAdminLocator);
		String WelcomeAdmintext = WelcomeAdmin.getText();
	
		
	    System.out.println("The Title of the Orange Homepage is :-" + "Orange");
	    WelcomeAdmin.click();

		System.out.println("The url of the Orange Homepage  is :-" + "OrangeHomepageurladdress");
		
	
		System.out.println("The text of the web Element sign in on the Orange homepage is:-"+"WelcomeAdmin Panel");
	By LogoutL=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");
	
WebElement logout=driver.findElement(LogoutL);
logout.click();
		driver.close();

}
}
