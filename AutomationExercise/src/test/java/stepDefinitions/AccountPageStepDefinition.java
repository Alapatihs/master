package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AccountPageStepDefinition {
	
	AccountPage ap=new AccountPage();
	
	@Given("User navigates to personal infomration on My account page")
	public void user_navigates_to_personal_infomration_on_My_account_page() {
	    
	    ap.clickPersonalInfomration();
	}

	@When("User updates the first name in the personal information")
	public void user_updates_the_first_name_in_the_personal_information() {
	    ap.enterFisrtname();
	    ap.enterCurrentPsw();
	    ap.clickSaveBtn();
	}

	@Then("Validate the success message {string}")
	public void validate_the_success_message(String message) {
		 assertThat(ap.getSuccessMessage(), equalTo(message));
	}

}
