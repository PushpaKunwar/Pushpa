package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	public WebDriver driver;
	
@BeforeTest
public void Setup() {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OHRM_DDT\\driverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
}

@AfterTest
public void TaarDown() {
	driver.close();
}
@Test(priority=1)
public void livetech() throws InterruptedException {

	driver.findElement(By.linkText("Selenium")).click();
	Thread.sleep(3000);
}
@Test(priority=2)
public void livetech1() throws InterruptedException {
	
	driver.findElement(By.linkText("Testing")).click();
	Thread.sleep(3000);
}
@Test(priority=4)
public void venni() {
	System.out.println("bsdbjhgiuefjije");
}
@Test(priority=6)
public void pushpa() {
	System.out.println("iuefjije");
}
@Test(priority=5)
public void venni2() {
	System.out.println("bsdbjhgiuefjije");
}
}
