package facebookfinction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookhomepage {
	public static void main(String[]args) {
		
			
				WebDriver driver;
				String applicationurladdress = "https://www.facebook.com/login/";
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.navigate().to("https://www.facebook.com/");
			    driver.get(applicationurladdress);
				
				
				
				String facebooktitle = driver.getTitle();
				String facebookhomepageurladdress= driver.getCurrentUrl();
				
				
				System.out.println("The Title of the Facebookhomepage is :-" + "Facebook ");

				System.out.println("The url of the FacebookHomepage  is :-" + "FacebookHomepageurladdress");
				
				driver.quit();
				
	}
	

}
