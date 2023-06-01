package ISRTCLinksTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
public static void main(String[] args) {
		
		WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	// Maximizing the Browser
	driver.manage().window().maximize();
		
	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress
	
// <input type="text" name="fromPlaceName" size="22" value="test" ">	
// <a href="/oprs-web" target="_top" title="Home">Home</a>
// <a  href="/oprs-web/" target="_top" title="Enquiry">Enquiry</a>

	/*
	  // Working only with a single element of the webPage
	By tsrtc_HomePageLinkLocator=By.linkText("Home");
	WebElement tsrtc_HomePageLink=driver.findElement(tsrtc_HomePageLinkLocator);
	String tsrtc_HomePageLinkText=tsrtc_HomePageLink.getText();
	System.out.println(tsrtc_HomePageLinkText);
	
	//tsrtc_HomePageLink.click();
*/
	// working with multiple elements on the WebPage
	By linksLocator=By.tagName("a");
	List<WebElement>tsrtcHomePagelinks=driver.findElements(linksLocator);
	
	int tsrtcHomePageLinksCount=tsrtcHomePagelinks.size();
	System.out.println(" The number of links on the Tsrtc Application Home Page are :- "
																+tsrtcHomePageLinksCount);
	driver.quit();
	}

}



