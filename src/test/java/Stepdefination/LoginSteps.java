package Stepdefination;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private LoginPage loginpage= new LoginPage(DriverFactory.getDriver());
	
	@Given("User launch the browser and enter the saucedemo website")
	public void user_launch_the_browser_and_enter_the_saucedemo_website() {
		
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
		
	}

	@When("User enter the Username {string}")
	public void user_enter_the_username(String Username) {
		loginpage.enterUserName(Username);	
	}

	@When("User enter the Password  {string}")
	public void user_enter_the_password(String Password) {
	    loginpage.password(Password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	   loginpage.LoginButton();
	}

	@Then("User redirect to the dashboard")
	public void user_redirect_to_the_dashboard() {
	    System.out.println("Pass");
	}

}
