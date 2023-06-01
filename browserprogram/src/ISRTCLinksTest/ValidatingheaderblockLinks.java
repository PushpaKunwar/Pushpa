package ISRTCLinksTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingheaderblockLinks {
public static void main(String[] args) {
		

		WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	// Maximizing the Browser
	//driver.manage().window().maximize();
		
	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress
	
	// Identifying the Header Block of The TSRTC Application HomePage
	// class="menu-wrap" - Property of Header Block of TSRTC Application HomePage
		By tsrctHomePageHeaderBlockLocator=By.className("menu-wrap");
	WebElement tsrctHomePageHeaderBlock=driver.findElement(tsrctHomePageHeaderBlockLocator);
		
	// Identify the properties of the elements of the Header Block
			
	// All the elements of the Header Block are of type Links
	
	// getting all the Elements which are of Type links of the Header Block 
		By headerBlockLinksLocator=By.tagName("a");
List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrctHomePageHeaderBlock.findElements
																(headerBlockLinksLocator);
	
// finding the number of element of the Header Block - of type links
int tsrtcHomePageHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();
	
System.out.println("The number of links in the header block of TSRTC Application Home Page are"
	                                     	+ ":- "+tsrtcHomePageHeaderBlockLinksCount);
  // getting the names of all the links of the Header Block
	for(int tsrctHomePageHeaderBlockLinksIndex=0;
		tsrctHomePageHeaderBlockLinksIndex<tsrtcHomePageHeaderBlockLinksCount;
		tsrctHomePageHeaderBlockLinksIndex++)
	{
	String tsrtcHeaderBlockLinkName=tsrtcHomePageHeaderBlockLinks.get
											(tsrctHomePageHeaderBlockLinksIndex).getText();
	System.out.println(tsrctHomePageHeaderBlockLinksIndex+" - "+tsrtcHeaderBlockLinkName);
	
	// Performing click operation on each element of the Header Block 
	tsrtcHomePageHeaderBlockLinks.get(tsrctHomePageHeaderBlockLinksIndex).click();
	
	String tsrtcWebPageTitle=driver.getTitle(); // finding title of the navigated WebPage
	System.out.println(" The title of the Current WebPage is :- "+tsrtcWebPageTitle);
	
	// finding the current Url address of the navigated WebPage
	String tsrtcWebPageCurrentUrlAddress=driver.getCurrentUrl();
	System.out.println(" The Current URl Address of the WebPage is :-"
														+tsrtcWebPageCurrentUrlAddress);
	
	driver.navigate().back(); // navigating back to the previous WebPage
	
	// Re-creating the array List again
	// When the driver moves to the next WebPage - the identified information of the driver 
	//   of the previous webPage saved into the variables/arrayList will be cleared off - so
	//   we need to identify the header block again and get the element of the header block
	// Identifying the Header Block
	 tsrctHomePageHeaderBlock=driver.findElement(tsrctHomePageHeaderBlockLocator);
	// Finding the elements of the Header Block and saving in back to the arrayList
	tsrtcHomePageHeaderBlockLinks=tsrctHomePageHeaderBlock.findElements
			(headerBlockLinksLocator);
		}
	}

}



