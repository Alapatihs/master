package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;
import utility.BrowserUtility;

public class HomePageStepDefinition {
	 WebDriver driver;
	
	HomePage homepage= new HomePage();
	
	 	
	@Given("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() throws Throwable {
		
		homepage.clickOnSignInBtn();
	}

	@When("User provide username  and password and clicks on Submit button")
	public void user_provide_username_and_password_and_clicks_on_Submit_button() throws Exception {
	    homepage.loginToApplication();
	}

	@And("User sucessfully logged into Application")
	public void user_sucessfully_logged_into_Application() {
	    homepage.returnTitleText();
	}


}
