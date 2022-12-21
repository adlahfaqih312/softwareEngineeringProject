package acceptance_package;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import games_package.AdminOfStore;
import games_package.Store;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class adminLogIn {
	Store store;
	AdminOfStore admin = new AdminOfStore() ;
	boolean login;
    //login=admin.login();

	public adminLogIn(Store s) {
		super();
		store=s;
	}
	
	@Given("Admin selected to log in")
	public void admin_selected_to_log_in() {
	    System.out.println("Welcome");
	}

	@When("Admin entered the valid {string} and the valid {string}")
	public void admin_entered_the_valid_and_the_valid(String username, String password) {
	    admin.setUsername(username);
	    admin.setPasword(password);
	    login=admin.login();
	}

	@Then("log in must be successful")
	public void log_in_must_be_successful() {
	    assertTrue(!login);
		System.out.println("you are login");
	}

	@When("Admin entered the valid {string} and the unvalid {string}")
	public void admin_entered_the_valid_and_the_unvalid(String username, String password) {
		admin.setUsername(username);
	    admin.setPasword(password);
	    login=admin.login();
	}

	@Then("log in must be field")
	public void log_in_must_be_field() {
		equals(!login);
		assertTrue(!login);
	}

}
