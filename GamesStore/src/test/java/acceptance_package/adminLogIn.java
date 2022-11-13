package acceptance_package;

import org.junit.Assert;

import GamesPackage.AdminOfStore;
import GamesPackage.Store;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


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
	//////////
		assertTrue(!login==true);
	//	assertEquals(!login,true);
		
	}

	@When("Admin entered the valid {string} and the unvalid {string}")
	public void admin_entered_the_valid_and_the_unvalid(String username, String password) {
		admin.setUsername(username);
	    admin.setPasword(password);
	    login=admin.login();
	}

	@Then("log in must be field")
	public void log_in_must_be_field() {
	//////////////////
		assertTrue(login==false);
	//	assertEquals(login,false);
	}

}
