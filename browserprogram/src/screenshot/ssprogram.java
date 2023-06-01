package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ssprogram {
public static void main(String[] args) throws IOException {
		

		WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
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
		 
	tsrtcHomePageHeaderBlockLinks.get(tsrctHomePageHeaderBlockLinksIndex).click();
	
	String tsrtcWebPageTitle=driver.getTitle(); // finding title of the navigated WebPage
	System.out.println(" The title of the Current WebPage is :- "+tsrtcWebPageTitle);
		
	String tsrtcWebPageCurrentUrlAddress=driver.getCurrentUrl();
	System.out.println(" The Current URl Address of the WebPage is :-"
														+tsrtcWebPageCurrentUrlAddress);
	File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // saving the sceenShot into the folder of the Project with the name of the link
	//    as the SceenShot Name and format of the image as .png
FileUtils.copyFile(screenShot, new File("./TSRTC_SceenShots/"+tsrtcHeaderBlockLinkName+".png"));
		
	driver.navigate().back();

	tsrctHomePageHeaderBlock=driver.findElement(tsrctHomePageHeaderBlockLocator);
	tsrtcHomePageHeaderBlockLinks=tsrctHomePageHeaderBlock.findElements
			(headerBlockLinksLocator);
		}

		driver.quit();
	}
}



