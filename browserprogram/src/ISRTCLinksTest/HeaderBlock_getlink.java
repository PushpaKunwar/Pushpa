package ISRTCLinksTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlock_getlink {
public static void main(String[] args) {
		

		WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	// Maximizing the Browser
	driver.manage().window().maximize();
		
	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress
	
	// Identifying the Header Block of The TSRTC Application HomePage
	// class="menu-wrap" - Property of Header Block of TSRTC Application HomePage
		By tsrctHomePageHeaderBlockLocator=By.className("menu-wrap");
	WebElement tsrctHomePageHeaderBlock=driver.findElement(tsrctHomePageHeaderBlockLocator);
		
	// Identify the properties of the elements of the Header Block
			
	// All the elements of the Header Block are of type Links
	
	// getting all the Elements which are of Type links of the Header Block 
		By headerBlockLinksLocator=By.tagName("a");
List<WebElement>tsrctHomePageHeaderBlockLinks=tsrctHomePageHeaderBlock.findElements
																(headerBlockLinksLocator);
	
// finding the number of element of the Header Block - of type links
int tsrctHomePageHeaderBlockLinksCount=tsrctHomePageHeaderBlockLinks.size();
	
System.out.println("The number of links in the header block of TSRTC Application Home Page are"
	                                     	+ ":- "+tsrctHomePageHeaderBlockLinksCount);
  // getting the names of all the links of the Header Block
	for(int tsrctHomePageHeaderBlockLinksIndex=0;
		tsrctHomePageHeaderBlockLinksIndex<tsrctHomePageHeaderBlockLinksCount;
		tsrctHomePageHeaderBlockLinksIndex++)
	{
	String tsrtcHeaderBlockLinkName=tsrctHomePageHeaderBlockLinks.get
											(tsrctHomePageHeaderBlockLinksIndex).getText();
	System.out.println(tsrctHomePageHeaderBlockLinksIndex+" - "+tsrtcHeaderBlockLinkName);
	}
	
		driver.quit();
	}
}



