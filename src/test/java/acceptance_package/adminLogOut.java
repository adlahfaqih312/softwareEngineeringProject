package acceptance_package;

import static org.junit.Assert.assertTrue;

import games_package.Store;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminLogOut {
	Store store;
	boolean a;
	
	public adminLogOut(Store s) {
		super();
	    store=s;
	}
	
	@Given("Admin already log in")
	public void admin_already_log_in() {
		System.out.println("Out Store");
	}

	@When("she {string} select to log out")
	public void he_select_to_log_out(String username) {
	    a=Store.admin1.logout(username);
	}

	@Then("log out done")
	public void log_out_done() {
		equals(!a);
	}

}
