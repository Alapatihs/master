package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.OrderHistoryPage;

public class OrderHistoryStepDefinition {
	
	
 OrderHistoryPage oHP=new OrderHistoryPage();
	
	@And("Validate the order details in the order History page")
 public void validate_the_order_details_in_the_order_history_page() throws Throwable {
          oHP.validateOrderHistory();
          
          Assert.assertEquals(true,oHP.validateOrderHistory());
}


}
