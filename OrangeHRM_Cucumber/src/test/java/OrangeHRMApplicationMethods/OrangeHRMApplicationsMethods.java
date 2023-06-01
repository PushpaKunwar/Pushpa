package OrangeHRMApplicationMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationsMethods {
	
	@Given("^user should launch Chrome Browser\\.$")
	public void user_should_launch_Chrome_Browser() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OrangeHRM_Cucumber\\driverFiles\\chromedriver.exe");
	}

	@When("^user should enter valid OrangeHRM Application Url address\\.$")
	public void user_should_enter_valid_OrangeHRM_Application_Url_address() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OrangeHRM_Cucumber\\driverFiles\\chromedriver.exe");
	}
	

	@Then("^user should be navigated to OrangeHRM Application LogIn Page\\.$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_Page() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OrangeHRM_Cucumber\\driverFiles\\chromedriver.exe");
	}
	
	@Then("^user should close the Browser along with the Application\\.$")
	public void user_should_close_the_Browser_along_with_the_Application() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\pushpa1\\OrangeHRM_Cucumber\\driverFiles\\chromedriver.exe");
	}
	}




