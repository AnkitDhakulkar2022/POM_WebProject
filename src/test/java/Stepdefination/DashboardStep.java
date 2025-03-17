package Stepdefination;

import com.factory.DriverFactory;
import com.pages.Dashboard;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStep {
	
	private Dashboard dashboard= new Dashboard(DriverFactory.getDriver());
	
	@Given("User select the product and click on add to cart button")
	public void user_select_the_product_and_click_on_add_to_cart_button() {
	    dashboard.Selectproduct1();
	    dashboard.Selectproduct2();
	}

	@When("User click on cart icon")
	public void user_click_on_cart_icon() {
	  dashboard.addtocart();
	}

	@Then("User redirect to the Checkout page")
	public void user_redirect_to_the_checkout_page() {
	   System.out.println("Redirect to the cart page");
	}

	

}
