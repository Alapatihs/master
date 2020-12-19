package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pages.OrderHistoryPage;

public class OrderHistoryStepDefinition {
	
	WebDriver driver;
 OrderHistoryPage oHP=new OrderHistoryPage(driver);
	
	@Then("Validate the order details in the order History page")
 public void validate_the_order_details_in_the_order_history_page() throws Throwable {
          oHP.validateOrderHistory();

	}


}
