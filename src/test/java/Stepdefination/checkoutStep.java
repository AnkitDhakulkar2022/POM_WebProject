package Stepdefination;

import com.factory.DriverFactory;
import com.pages.checkout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkoutStep {
	
	private checkout check= new checkout(DriverFactory.getDriver());
	
	@Given("User click on checkout button")
	public void user_click_on_checkout_button() {
	    check.ckickcheckoutButton();
	}

	@Then("User redirect to the checkout information page")
	public void user_redirect_to_the_checkout_information_page() {
	   
	}

	@When("User enter firstName {string};")
	public void user_enter_first_name(String Firstname) {
	    check.enterfirstName(Firstname);
	}

	@When("User enter LastName {string}")
	public void user_enter_last_name(String LastName) {
	   check.enterlastName(LastName);
	}

	@When("USer enter ZipCode {string}")
	public void u_ser_enter_zip_code(String ZipCode) {
	    check.enterzipcode(ZipCode);
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button() {
	    check.clickcontinueButton();
	}

	@Then("User redirect to the overview page and click on finish button")
	public void user_redirect_to_the_overview_page_and_click_on_finish_button() {
	   check.clickfinishButton();
	}

}
