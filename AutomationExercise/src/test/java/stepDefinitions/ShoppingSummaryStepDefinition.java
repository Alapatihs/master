package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pages.ShoppingSummaryPage;

public class ShoppingSummaryStepDefinition {
	
	WebDriver driver;
	ShoppingSummaryPage ssp=new ShoppingSummaryPage();

	@Then("User purchaed the T-shirt")
	public void user_purchaed_the_T_shirt() {
	    ssp.clickSummaryProceedToCheckOutBtn();
	    ssp.clickAddressProceedToCheckOutBtn();
	    ssp.clickTermsOfServiceCheckBox();
	    ssp.clickShippingProceedToCheckOutBtn();
	    ssp.selectPaymentMethod();
	    ssp.clickConfirmOrderBtn();
	    ssp.getTotalPrice();
	    ssp.getOrderDetails();
	    
	}
	
	@Then("User clicks on Back to orderson the payment page")
	public void user_clicks_on_Back_to_orderson_the_payment_page() {
		ssp.clickBackToORdersBtn();
	}

}
