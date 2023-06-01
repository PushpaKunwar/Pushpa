package com.getTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_getTitle {
	public static void main(String[]args) {
		WebDriver driver;
		String applicationurladdress = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationurladdress);
		String Googlehomepagetitle = driver.getTitle();
		
		System.out.println("The Title of the GoogleHomepage is :-" + "GoogleHomepageTitle");
		
		driver.quit();
		
	}
}

