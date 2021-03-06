package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import pages.TshirtShoppingPage;

public class TshirtShoppingStepDefinition {
	
	public WebDriver driver;
	TshirtShoppingPage tshirtShpPage= new TshirtShoppingPage();
	
	@Given("User clicks on T-shirt section and selects the first item")
	public void user_clicks_on_T_shirt_section_and_selects_the_first_item() throws Throwable {
	   tshirtShpPage.clickTshirt(); 
	   tshirtShpPage.selectTshirt();
	   tshirtShpPage.clickProceedToCheckOutOnPopUp();
	}


	
}
